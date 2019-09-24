/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan4.kambing;

/**
 * @author 
 * NAMA      : Bagus Syibro Malisi
 * KELAS     : PBO2
 * NIM       : 10118052
 * Deskripsi Program : Latihan ini bertujuan untuk membuat fungsi pada java
 */
public class PBO210118052Latihan4Kambing {

    public void tambahKambing() {
        // Deklarsi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + 
                        jumlahKambing);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PBO210118052Latihan4Kambing kambingJantan = 
                new PBO210118052Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
    
}
