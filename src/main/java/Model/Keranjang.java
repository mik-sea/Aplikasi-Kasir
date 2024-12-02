package Model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "keranjang")
public class Keranjang {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_keranjang",length = 36)
    private int id_keranjang;

    @Column(name = "nama_barang", nullable = false)
    private String nama_barang;

    @Column(name = "total_barang", nullable = false, length = 10)
    private int total_barang;

    @Column(name = "total_harga", nullable = false, length = 10)
    private int total_harga;

    @Column(name = "status", nullable = false, length = 50)
    private String status;

    @OneToMany(mappedBy = "id_barang")
    private List<Barang> barang;

    public Keranjang(String nama_barang,int total_harga,int total_barang, String status) {
        this.nama_barang = nama_barang;
        this.total_harga = total_harga;
        this.total_barang = total_barang;
        this.status = status;
    }
    public Keranjang() {}
    public int getId_keranjang() {
        return id_keranjang;
    }

    public void setId_keranjang(int id_keranjang) {
        this.id_keranjang = id_keranjang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String id_barang) {
        this.nama_barang = id_barang;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotal_barang() {
        return total_barang;
    }

    public void setTotal_barang(int total_barang) {
        this.total_barang = total_barang;
    }

    public int getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(int total_harga) {
        this.total_harga = total_harga;
    }
}
