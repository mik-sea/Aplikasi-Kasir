package Model;

import jakarta.persistence.*;

@Entity
@Table(name = "keranjang")
public class Keranjang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_keranjang")
    private int id_keranjang;

    @Column(name = "id_transaksi", nullable = false)
    private int id_transaksi;

    @Column(name = "id_barang", nullable = false)
    private int id_barang;

    @Column(name = "total", nullable = false, length = 10)
    private int total;
}
