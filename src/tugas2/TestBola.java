/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;
public class TestBola {
    
    public static void main(String[] args) {
        
        double Jarijari = 14;//membuat variabel
        Bola obj = new Bola(7);//objek
        obj.showDiameter();
        obj.showLuasPermukaan();
        obj.showVolume();
        System.out.println("========================");
        obj.setJarijari(Jarijari);//pengubahan nilai dari jari-jari
        obj.showDiameter();
        obj.showLuasPermukaan();
        obj.showVolume();
    }
    
}
