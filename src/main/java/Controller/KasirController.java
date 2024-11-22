package Controller;

import Model.*;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class KasirController {
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

    public void updateTransaksi(Keranjang keranjang) {
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

    public void deleteTransaksi(int id) {
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

    public void bayar(int id) {
        Transaction tx = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){

        }
    }
}
