/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch.pkgcase;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Menu;
        String Pembeli;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan nama pembeli :");
        Pembeli= scan.nextLine();
        
        System.out.print("Silahkan Masukkan Pilihan Anda :");
        Menu = scan.nextLine();
        
        switch (Menu) {
            case "1":
                System.out.println("Menu yang anda pesan adalah Soft Drinks\nPesanan akan segera kami antar\nTerimakasih telah berkunjung di cafe ceria");
                break;
            case "2":
                System.out.println("Menu yang anda pesan adalah Mix Juice\nPesanan akan segera kami antar\nTerimakasih telah berkunjung di cafe ceria");
                break;
            case "3":
                System.out.println("Menu yang anda pesan adalah Nescafe\nPesanan akan segera kami antar\nTerimakasih telah berkunjung di cafe ceria");
                break;
            case "4":
                System.out.println("Menu yang anda pesan adalah Soda Milk\nPesanan akan segera kami antar\nTerimakasih telah berkunjung di cafe ceria");
                break;
            case "5":
                System.out.println("Menu yang anda pesan adalah Tea \nPesanan akan segera kami antar\nTerimakasih telah berkunjung di cafe ceria");
                break;
            default:
                System.out.println("Menu tidak tersedia");
                
        }
    }
    
}
