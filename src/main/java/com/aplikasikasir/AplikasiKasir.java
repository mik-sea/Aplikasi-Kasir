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
        UUID uuid = UUID.randomUUID();
        System.out.println("UUID: " + uuid.toString().length());
    }

    public void testAddKeranjang(){
        Keranjang keranjang = new Keranjang();
        keranjang.setId_barang(1);
        keranjang.setTotal(2);
        keranjang.setStatus("waiting");
        keranjang.setId_pembayaran(1);
    }
}