package Model;

import jakarta.persistence.*;

@Entity
@Table(name = "pembayaran")
public class Pembayaran {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pembayaran",length = 36)
    private String id_pembayaran;

    @Column(name = "id_keranjang", nullable = false)
    private int id_keranjang;

    @Column(name = "status", nullable = false, length = 50)
    private String status;
}
