/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphism;

/**
 *
 * @author muhammadalifmakkasau
 */
public class Main {
    public static void main(String[] args) {
        Pesawat pesawat1 = new PesawatPenumpang("Garuda", 150);
        Pesawat pesawat2 = new PesawatKargo("Hercules", 10.5);

        pesawat1.terbang();  // Memanggil metode terbang() dari PesawatPenumpang
        pesawat2.terbang();  // Memanggil metode terbang() dari PesawatKargo
    }
}

