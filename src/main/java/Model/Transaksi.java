package Model;

import jakarta.persistence.*;

@Entity
@Table(name = "transaksi")
public class Transaksi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transaksi")
    private int id_transaksi;

    public Transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public Transaksi() {

    }
}
