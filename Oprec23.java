/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Oprec23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("===== Selamat Datang Di Ayam Geprek Kamal! =====");
        do{
            TampilMenu a = new TampilMenu();
            a.MenuAwal();
            Scanner input = new Scanner(System.in);
            System.out.print("Pilih Menu (1-3) : ");
            int pilih = input.nextInt();
            if (pilih == 1){
               do {                
                a.MenuPaket();
                int pilih = input.nextInt();
                System.out.print("Apakah tambah nasi (ya/tidak)?");
                String pilih2 = input.next();
                System.out.println("Apakah ingin memesan lagi (ya/tidak)?");
                String pilih3 =input.next();
                } while (pilih3 ==1);
            }
            
            
            
        }while (true);
    }
}



abstract class Menu{
    int harga;
    
    
}

class Biasa extends Menu{
    int harga = 5000;
}
class Double extends Menu{
    int harga = 7000;
}
class Special extends Menu{
    int harga = 9000;
}

class TampilMenu{
    public void MenuAwal{
        System.out.println("======== MENU =======");
        System.out.println("1. Pesan Menu");
        System.out.println("2. Lihat Pesanan");
        System.out.println("3. Selesaikan Pesanan");
        System.out.println("=====================");
    }
    public void MenuPaket{
        System.out.println("======== Paket Menu Yang Tersedia ========");
        System.out.println("1. Biasa (Rp. 5000)");
        System.out.println("2. Double (Rp. 7000)");
        System.out.println("3. Special (Rp. 9000)");
        System.out.println("=====================");
    }
}
