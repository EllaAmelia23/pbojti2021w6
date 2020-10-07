/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class Dosen extends Pegawai {
      int jumlahSKS;
     final int TARIF_SKS = 100000;
    
    public Dosen(){
        
    }
 
    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }
    
    public void setSKS(int SKS){
        this.jumlahSKS = SKS;
    }
    
    
    public int getGaji(){
        int total_gaji = jumlahSKS*TARIF_SKS;
        return total_gaji+super.getGaji();
    }
}
