/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.aplikasikasir;

import Controller.KasirController;
import Model.HibernateUtil;
import Model.Transaksi;

/**
 *
 * @author miksea
 */
public class AplikasiKasir {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        KasirController controller;
        //testing
        //input
        Transaksi transaksi = new Transaksi(1);
        controller = new KasirController();
        controller.addTransaksi(transaksi);
    }
}
