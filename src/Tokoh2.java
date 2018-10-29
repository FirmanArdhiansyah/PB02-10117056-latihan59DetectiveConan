/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Firman
 */
public class Tokoh2 extends Utama{
    private String Deskripsi;
    
    public Tokoh2(String nama, String peran, String Deskripsi) {
        super(nama, peran);
        this.Deskripsi=Deskripsi;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }
    
    public void tampil(){
        System.out.println("Nama\t        : "+getNama());
        System.out.println("Peran\t        : "+getPeran());
        System.out.println("keterangan      : "+getDeskripsi());
        System.out.println("");
    }
    
}
