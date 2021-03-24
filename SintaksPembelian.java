/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaks.pembelian;

import java.util.Scanner;



/**
 *
 * @author User
 */
public class SintaksPembelian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Kharisma Agung Plaza (KAP)\nPromo Belanja Berhadiah\nKhusus Pembelian 5 Barang Pertama"
                + "\nDengan Harga Minimum Rp 10000,00\n----------------------------");
        String harga;
        String harga2;
        String harga3;
        String harga4;
        String harga5;
        String Pembeli;
        
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print(" Masukkan nama pembeli :");
        Pembeli= scan.nextLine();
        
        System.out.print("Masukkan Harga barang 1:");
        harga = scan.nextLine();
        System.out.print("Masukkan Harga barang 2:");
        harga2 = scan.nextLine();
        System.out.print("Masukkan Harga barang 3:");
        harga3 = scan.nextLine();
        System.out.print("Masukkan Harga barang 4:");
        harga4 = scan.nextLine();
        System.out.print("Masukkan Harga barang 5:");
        harga5 = scan.nextLine();
        
        System.out.print("Total harga pembelian adalah Rp 100000\n\nSelamat....\nAnda mendapat hadiah 1 buah mug cantik\n\n----------------------------------------\nTerimakasih\nAnda sudah berbelanja di Kharisma Agung Plaza");
        
        
    }
    
}
