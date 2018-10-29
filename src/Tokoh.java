/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Firman
 */
public class Tokoh extends Utama{
    private String DeskripsiTokoh;
    private String tim;
    public Tokoh(String nama, String peran,String Deskripsi, String tim ) {
        super(nama, peran);
        this.DeskripsiTokoh=Deskripsi;
        this.tim=tim;
    }

    public String getDeskripsiTokoh() {
        return DeskripsiTokoh;
    }

    public String getTim() {
        return tim;
    }
    
    public void tampil(){
        System.out.println("Nama\t        : "+getNama());
        System.out.println("Peran\t        : "+getPeran());
        System.out.println("Tim \t        : "+getTim());
        System.out.println("Deskripsi Tokoh : "+getDeskripsiTokoh());
        System.out.println("");
    }
}
