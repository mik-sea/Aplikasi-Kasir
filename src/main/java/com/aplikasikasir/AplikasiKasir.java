/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.aplikasikasir;

import Controller.KasirController;
import Model.HibernateUtil;
import Model.Keranjang;
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
        testRemoveKeranjang();
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
}