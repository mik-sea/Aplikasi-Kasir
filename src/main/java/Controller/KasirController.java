package Controller;

import Model.*;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class KasirController {
    //untuk menambahkan data ke keranjang dari pembelian pembeli
    public void addKeranjang(Keranjang keranjang) {
        Transaction tx = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.save(keranjang);
            tx.commit();
        }catch (Exception e) {
            if(tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
    }

    //update table apabila terjadi kesalahan mengetik atau menambah jumlah pembelian
    public void updateKeranjang(Keranjang keranjang) {
        Transaction tx = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            tx = session.beginTransaction();
            session.update(keranjang);
            tx.commit();
        }catch(Exception e){
            if(tx != null){
                tx.rollback();
            }
            e.printStackTrace();
        }
    }

    //menghapus transaksi yang belum melakukan pembayaran atau tidak jadi bayarnya
    public void deleteKeranjang(int id) {
        Transaction tx = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            tx = session.beginTransaction();
            Keranjang keranjang = session.get(Keranjang.class,id);
            if(keranjang != null){
                session.delete(keranjang);
                System.out.println("Berhasil Dihapus!");
            }
            tx.commit();

        }catch (Exception e){
            if(tx != null){
                tx.rollback();
            }
            e.printStackTrace();
        }
    }

    // menampilkan semua list dari keranjang
    public List<Keranjang> getAllKeranjang(){
        Transaction tx = null;
        List<Keranjang> listTrans = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            tx = session.beginTransaction();
            Query<Keranjang> query = session.createQuery("from Keranjang", Keranjang.class);
            listTrans = query.list();
            tx.commit();
        }catch (Exception e){
            if(tx != null){
                tx.rollback();
            }
            e.printStackTrace();
        }
        return listTrans;
    }

    public List<Barang> getAllBarang(){
        Transaction tx = null;
        List<Barang> listTrans = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            tx = session.beginTransaction();
            Query<Barang> query = session.createQuery("from Barang ", Barang.class);
            listTrans = query.list();
            tx.commit();
        }catch (Exception e){
            if(tx != null){
                tx.rollback();
            }
            e.printStackTrace();
        }
        return listTrans;
    }

    public List<KeranjangWithBarang> getAllKeranjangBarang() {
        Transaction tx = null;
        List<KeranjangWithBarang> listTrans = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();

            // Query HQL untuk memetakan hasil ke DTO
            String hql = "SELECT new Model.KeranjangWithBarang(b.nama_barang, b.harga, k.total, k.status) " +
                    "FROM Keranjang k " +
                    "JOIN k.barang b";

            Query<KeranjangWithBarang> query = session.createQuery(hql, KeranjangWithBarang.class);
            listTrans = query.getResultList();

            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }

        return listTrans;
    }


    //digunakan untuk membayar
    public void bayar(Pembayaran pembayaran) {
        Transaction tx = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.save(pembayaran);
            tx.commit();
        }catch (Exception e) {
            if(tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
    }
}
