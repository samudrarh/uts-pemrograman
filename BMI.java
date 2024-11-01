/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KalkulatorBMI;

/**
 *
 * @author chels
 */
public class BMI {
    double hasil;
    
    void kalkulatorBMI(double tinggi, double berat){
        hasil = berat / (tinggi * tinggi);
        
        System.out.println("Hasil BMI samudra adalah " + hasil);
        String category = getBMICategory(hasil);
        System.out.println("Kategori BMI: " + category);
        System.out.println("berat badan samudra" + berat);
        System.out.println("tinggi samudra" + tinggi);
    }    
    
    public String getBMICategory (double hasil){
        if (hasil < 18.5) {
            return "Under weight";
        } else if (hasil >= 18.5 && hasil < 24.9) {
            return "Normal weight";
        } else if (hasil >= 25 && hasil < 29.9) {
            return "Over weight";
        } else if (hasil >= 30 && hasil >35) {
            return "Obesity";
        } else {
            return "Over obesity";  
        }
    }
}
