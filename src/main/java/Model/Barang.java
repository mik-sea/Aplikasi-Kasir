package Model;

import jakarta.persistence.*;

@Entity
@Table(name = "barang")
public class Barang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_barang")
    private int id_barang;

    @Column(name = "nama_barang", nullable = false, length = 50)
    private String nama_barang;

    @Column(name = "merk_barang", nullable = false, length = 50)
    private String merk_barang;

    @Column(name = "total", nullable = false, length = 10)
    private int total;
}
