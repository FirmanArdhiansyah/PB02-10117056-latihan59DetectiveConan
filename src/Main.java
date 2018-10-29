/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Firman
 */
public class Main {
    public static void main(String[] args) {
        Tokoh conan = new Tokoh ("Conan Edogawa", "Detektif", "Seorang detektif sma dari tokyo yang tubuhnya \n"+
                                "\t\t  menyusut akibat racun yang diberikan oleh organidasi hitam", "Detektif Cilik");
        conan.tampil();
        
        Tokoh ran = new Tokoh ("Ran Mouri", "Ahli Karate", "Seorang wanita remaja dan juga teman masa kecil Kudo Shinichi\n"+
                                "\t\t  selain itu ia jago karate", "Siswi SMA");
        ran.tampil();
        
        Tokoh kogoro = new Tokoh("Kogoro Mouri", "Detektif Swasta", "Seorang mantan anggota polisi yang kemudian beralih menjadi detektif \n"+
                                "\t\t  swasta,namun kurang dilirik karena media cenderung melirik Shinichi,setelah \n"+
                                "\t\t  shinichi menyusut,kogoro menjadi terkenal dengan sebutan \"kogoro tidur\" dengan shinichi(conan) dibaliknya", "Detektif Swasta");
        kogoro.tampil();
        Tokoh ProfesorAgasa = new Tokoh("Profesor Agasa", "Ilmuwan", "Seorang ilmuwan yang tinggal disamping rumah Shinichi Ia sering gagal \n"+
                                        "\t\t  dalam eksperimennya,namun entah kenapa dia selalu berhasil \n"+
                                         "\t\t  menciptakan berbagai alat detektif untuk Shinichi(conan)", "Detektif");
        ProfesorAgasa.tampil();
        Tokoh2 TrioDetective = new Tokoh2("Ayumi,Genta,Mitsuhiko", "Detective", "Tiga sekawan yang menjadi temannya shinichi ketika menyusut menjadi conan.\n"+
                                          "\t\t  Mereka menjadi terobsesi karena ulah conan yang pintar dengan sering melakukan \n"+
                                          "\t\t  analisis dan deduksi.\n" +
                                          "\t\t  Genta anak gendut yang hobi makan,ayumi cewek kecil yang ceria namun cengeng \n"+
                                          "\t\t  mitsuhiko suka berpikir dan mencoba menjiwai peran detektif");
        TrioDetective.tampil();
        
        Tokoh2 heiji = new Tokoh2("Heiji Hattori", "Detektif SMA", "Seorang detektif terkenal sma dari barat,Kansai.Rival sekaligus teman dari \n"+
                                  "\t\t  Shinichi Kudou.Dan ia mengetahui identitas conan adalah shinichi.");
        heiji.tampil();
        
        Tokoh2 kazuha = new Tokoh2("Kazuha Tayoma", "Ahli Aikido", "Temannya Ran");
        kazuha.tampil();
    }
    
}
