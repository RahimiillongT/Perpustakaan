/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

public class Buku {

    public String judul;
    public int lamaPeminjaman;

    public Buku(String judul) {
        this.judul = judul;
    }

    public Buku(String judul, int lamaPeminjaman) {
        this.judul = judul;
        this.lamaPeminjaman = lamaPeminjaman;
    }

    public String getJudul() {
        return judul;
    }

    public void setLamaPeminjaman(int lamaPeminjaman) {
        this.lamaPeminjaman = lamaPeminjaman;
    }

    public int getLamaPeminjaman() {
        return lamaPeminjaman;
    }
}
