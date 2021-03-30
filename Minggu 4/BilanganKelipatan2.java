/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilangan.kelipatan.pkg2;

/**
 *
 * @author User
 */
public class BilanganKelipatan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1;
        System.out.print("        Do_While\n" + "Bilangan Kelipatan 2 (1-100)\n" +"============================\n");
        
        do {
            System.out.print(i + "   ");
            i = i*2;
        }while (i < 100);
        
    }
    
}
