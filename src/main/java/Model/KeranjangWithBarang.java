package Model;

import jakarta.persistence.*;

public class KeranjangWithBarang {
    private String nama_barang;
    private int harga;
    private int total_barang;
    private int total_harga;
    private String status;


    public KeranjangWithBarang(String nama_barang, int harga, int total_barang, int total_harga, String status) {
        this.nama_barang = nama_barang;
        this.harga = harga;
        this.total_barang = total_barang;
        this.total_harga = total_harga;
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
