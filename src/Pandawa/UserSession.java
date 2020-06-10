/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pandawa;

/**
 *
 * @author Sendy
 */
public class UserSession {

    private static int stok;
    private static String nama;

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        UserSession.nama = nama;
    }

    public static int getStok() {
        return stok;
    }

    public static void setStok(int stok) {
        UserSession.stok = stok;
    }
}
