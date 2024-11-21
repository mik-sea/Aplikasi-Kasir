package Controller;

import Model.*;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class KasirController {
    public void addTransaksi(Transaksi transaksi) {
        Transaction tx = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.save(transaksi);
            tx.commit();
        }catch (Exception e) {
            if(tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
    }

    public void updateTransaksi(Transaksi transaksi) {
        Transaction tx = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            tx = session.beginTransaction();
            session.update(transaksi);
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
            Transaksi mhs = session.get(Transaksi.class,id);
            if(mhs != null){
                session.delete(mhs);
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

    public List<Transaksi> getAllTransaksi(){
        Transaction tx = null;
        List<Transaksi> listTrans = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            tx = session.beginTransaction();
            Query<Transaksi> query = session.createQuery("from Transaksi ", Transaksi.class);
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
}
