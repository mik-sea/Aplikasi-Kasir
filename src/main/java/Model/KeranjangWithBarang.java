package Model;

import jakarta.persistence.*;

public class KeranjangWithBarang {
    private String nama_barang;
    private int harga;
    private int total;
    private String status;

    public KeranjangWithBarang(String nama_barang, int harga, int total, String status) {
        this.nama_barang = nama_barang;
        this.harga = harga;
        this.total = total;
        this.status = status;
    }
    public String getNamaBarang() {
        return nama_barang;
    }

    public void setNamaBarang(String namaBarang) {
        this.nama_barang = namaBarang;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
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
