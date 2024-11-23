package Model;

import jakarta.persistence.*;

@Entity
@Table(name = "barang")
public class Barang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_barang",length = 36)
    private int id_barang;

    @Column(name = "nama_barang", nullable = false, length = 50)
    private String nama_barang;

    @Column(name = "merk_barang", nullable = false, length = 50)
    private String merk_barang;

    @Column(name = "total_barang", nullable = false, length = 10)
    private int total_barang;

    @Column(name = "harga", nullable = false, length = 10)
    private int harga;

//    @ManyToOne
//    @JoinColumn(name = "id_barang")
//    private Keranjang keranjang;

    public int getId_barang() {
        return id_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getMerk_barang() {
        return merk_barang;
    }

    public void setMerk_barang(String merk_barang) {
        this.merk_barang = merk_barang;
    }

    public int getTotal_barang() {
        return total_barang;
    }

    public void setTotal_barang(int total_barang) {
        this.total_barang = total_barang;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
