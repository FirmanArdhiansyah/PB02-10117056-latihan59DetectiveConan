/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author  Nama : Firman Ardhiansyah
 *          Kelas : IF-2 (PB02)
 *          NIM : 10117056
 * Deskripsi Program : Program untuk mendefinikan tokoh anime Detective Conan
 */
public class Conan {
    protected String name;
    protected String from;
    protected boolean eyeglasses;
    
    public Conan(String name, String from, boolean eyeglasses) {
        this.name = name;
        this.from = from;
        this.eyeglasses = eyeglasses;
    }

    public String getName() {
        return name;
    }

    public String getFrom() {
        return from;
    }
}

