/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.aplikasikasir;

import Controller.KasirController;
import Model.*;
import View.FormKasir;

import java.util.List;
import java.util.UUID;
/**
 *
 * @author miksea
 */
public class AplikasiKasir {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        KasirController controller;
        //testing
        //input
        HibernateUtil.testConnection();
//        testAddKeranjang();
//        testRemoveKeranjang();
//        testAddBayar();
//        testListBarang();
        FormKasir form = new FormKasir();
        form.setVisible(true);
        
    }

    static void testAddKeranjang(){
        UUID uuid = UUID.randomUUID();
        Keranjang keranjang = new Keranjang();
        keranjang.setId_barang(4);
        keranjang.setTotal(2);
        keranjang.setStatus("waiting");
        keranjang.setId_keranjang(uuid.toString());
        keranjang.setId_pembayaran(uuid.toString());
        KasirController controller = new KasirController();
        controller.addKeranjang(keranjang);
    }

    static void testRemoveKeranjang(){
        String uid = "2a5a5f5c-a1d8-4fdb-9a15-4a488bdecf84";
        Keranjang keranjang = new Keranjang();
        keranjang.setId_barang(4);
        keranjang.setTotal(20);
        keranjang.setStatus("done");
        keranjang.setId_keranjang(uid);
        keranjang.setId_pembayaran(uid);
        KasirController controller = new KasirController();
        controller.updateKeranjang(keranjang);
    }

    static void testAddBayar(){
        Pembayaran pembayaran = new Pembayaran();
        pembayaran.setId_pembayaran("2a5a5f5c-a1d8-4fdb-9a15-4a488bdecf84");
        pembayaran.setStatus("done");
        pembayaran.setTotal(20);
        KasirController controller = new KasirController();
        controller.bayar(pembayaran);
    }

    static void testListBarang(){
        KasirController controller = new KasirController();
//        controller.getAllBarang();
        List<KeranjangWithBarang> listbarang = controller.getAllKeranjangBarang();
        for(KeranjangWithBarang barang : listbarang){
            System.out.println(barang.getStatus());
        }
    }
}