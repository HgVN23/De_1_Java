/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package de_1_java;

import java.util.ArrayList;

public class De_1_Java {
    
    public static ArrayList<CungHD> CreListCHD() {
        ArrayList<CungHD> ListCHD = new ArrayList<CungHD>();
        ListCHD.add(new CungHD(0,  "Bạch Dương", 21, 3, 19, 4));
        ListCHD.add(new CungHD(1,  "Kim Ngưu",	20, 4, 20, 5));
        ListCHD.add(new CungHD(2,  "Song Tử",	21, 5, 21, 6));
        ListCHD.add(new CungHD(3,  "Cự Giải",	22, 6, 22, 7));
        ListCHD.add(new CungHD(4,  "Sư Tử",	23, 7, 22, 8));
        ListCHD.add(new CungHD(5,  "Xử Nữ",	23, 8, 22, 9));
        ListCHD.add(new CungHD(6,  "Thiên Bình", 23, 9, 23, 10));
        ListCHD.add(new CungHD(7,  "Thiên Yết",	24, 10, 22, 11));
        ListCHD.add(new CungHD(8,  "Nhân Mã",	23, 11, 21, 12));
        ListCHD.add(new CungHD(9,  "Ma Kết",	22, 12, 19, 1));
        ListCHD.add(new CungHD(10, "Bảo Bình",	20, 1, 18, 2));
        ListCHD.add(new CungHD(11, "Song Ngư",	19, 2, 20, 3));
        return ListCHD;
    }

    public static void main(String args[]){
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}
