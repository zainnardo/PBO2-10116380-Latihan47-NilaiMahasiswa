/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan47.nilaimahasiswa;

/**
 * @author 
 * Nama  : Zain Achmad Rizqullah
 * Nim   : 10116380
 * Kelas : PBO2
 * Deskripsi Program : program ini tentang menghitung nilai mahasiswa
 */
public class PBO210116380Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NilaiMhs nima = new NilaiMhs(60,80,75);
        
        System.out.println("QUIZ \t = "+nima.getQuiz());
        System.out.println("UTS \t = "+nima.getUts());
        System.out.println("UAS \t = "+nima.getUas());
        System.out.println("\nNilai Akhir = "+ nima.nilaiAkhir());
        System.out.println("\nIndex = "+ nima.indexNilai());
        System.out.println("Keterangan = "+ nima.ketereangan());
        
    }
    
}
