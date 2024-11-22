package Model;

import jakarta.persistence.*;

@Entity
@Table(name = "pembayaran")
public class Pembayaran {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pembayaran",length = 36)
    private String id_pembayaran;

    @Column(name = "status", nullable = false, length = 50)
    private String status;

    @Column(name = "total", nullable = false, length = 50)
    private int total;


    public String getId_pembayaran() {
        return id_pembayaran;
    }

    public void setId_pembayaran(String id_pembayaran) {
        this.id_pembayaran = id_pembayaran;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
