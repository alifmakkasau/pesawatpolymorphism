/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author muhammadalifmakkasau
 */
public class PesawatPenumpang extends Pesawat {
    private int jumlahPenumpang;

    public PesawatPenumpang(String nama, int jumlahPenumpang) {
        super(nama);
        this.jumlahPenumpang = jumlahPenumpang;
    }

    @Override
    public void terbang() {
        System.out.println("Pesawat penumpang " + super.nama + " sedang terbang dengan " + jumlahPenumpang + " penumpang.");
    }
}

