/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author muhammadalifmakkasau
 */
public class PesawatKargo extends Pesawat {
    private double kapasitasKargo;

    public PesawatKargo(String nama, double kapasitasKargo) {
        super(nama);
        this.kapasitasKargo = kapasitasKargo;
    }

    @Override
    public void terbang() {
        System.out.println("Pesawat kargo " + super.nama + " sedang terbang dengan kapasitas kargo " + kapasitasKargo + " ton.");
    }
}

