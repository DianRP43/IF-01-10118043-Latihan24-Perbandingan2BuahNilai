/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg01.pkg10118043.latihan24.perbandingan2buahnilai;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class IF0110118043Latihan24Perbandingan2BuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2;
        String hasil,perulangan;
        
        do {            
            System.out.println("");
            System.out.println("Program perbandingan nilai");
        System.out.println("__________________________");
        System.out.print("Masukan Nilai ke 1 :");
        Scanner scanner = new Scanner(System.in);
        n1 = scanner.nextInt();
        System.out.print("Masukan Nilai ke 2 :");
        n2 = scanner.nextInt();
        
        if (n1 > n2) {
                hasil = "Lebih Besar";
            } else if (n1 < n2){
                hasil = "Lebih Kecil";
            } else{
                hasil = "Sama dengan";
            }
                
                
        System.out.println("Hasil : "+n1+" "+hasil+" "+n2);
        System.out.println("");
        System.out.println("Ulangi Aktifitas ? (Ya/Tidak)");
        perulangan = scanner.next();
        
        
        } while (perulangan.toUpperCase().equals("YA"));
        
        
    }
    
}
