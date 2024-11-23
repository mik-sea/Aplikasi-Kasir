package Model;

import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name = "keranjang")
public class Keranjang {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_keranjang",length = 36)
    private String id_keranjang;

    @Column(name = "id_pembayaran", nullable = false,length = 36)
    private String id_pembayaran;

    @Column(name = "id_barang", nullable = false)
    private int id_barang;

    @Column(name = "total", nullable = false, length = 10)
    private int total;

    @Column(name = "status", nullable = false, length = 50)
    private String status;

    @OneToMany(mappedBy = "id_barang")
    private List<Barang> barang;

    public String getId_keranjang() {
        return id_keranjang;
    }

    public void setId_keranjang(String id_keranjang) {
        this.id_keranjang = id_keranjang;
    }

    public String getId_pembayaran() {
        return id_pembayaran;
    }

    public void setId_pembayaran(String id_pembayaran) {
        this.id_pembayaran = id_pembayaran;
    }

    public int getId_barang() {
        return id_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
