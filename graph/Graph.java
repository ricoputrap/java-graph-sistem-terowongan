package graph;

import java.util.ArrayList;

/**
 * Representasi sistem terowongan bawah tanah
 */
public class Graph {
  private ArrayList<Vertex> daftarPos;

  public Graph() {
    this.daftarPos = new ArrayList<Vertex>();
  }

  /**
   * Method untuk menambahkan sebuah pos
   * ke dalam sistem terowongan bawah tanah.
   * @param nomorPos nomor pos baru yang akan ditambahkan
   * @param hasPenjaga menentukan apakah pos baru tersebut punya seorang penjaga
   */
  public void addPos(int nomorPos, boolean hasPenjaga) {
    Vertex posBaru = new Vertex(nomorPos, hasPenjaga);
    this.daftarPos.add(posBaru);
  }

  /**
   * Membuat sebuah terowongan untuk menghubungkan dua pos
   * @param nomorPosAsal nomor pos asal
   * @param nomorPosTujuan nomor pos tujuan
   * @param panjangTerowongan panjang terowongan
   * @param luasTerowongan luas terowongan
   */
  public void addTerowongan(int nomorPosAsal, int nomorPosTujuan, int panjangTerowongan, int luasTerowongan) {
    Vertex posAsal = this.getPosByNomor(nomorPosAsal);
    Vertex posTujuan = this.getPosByNomor(nomorPosTujuan);

    Edge terowonganKePosTujuan = new Edge(posTujuan, panjangTerowongan, luasTerowongan);
    Edge terowonganKePosAsal = new Edge(posAsal, panjangTerowongan, luasTerowongan);

    // sambungkan terowongan ke pos asal dan tujuan
    posAsal.addTerowongan(terowonganKePosTujuan);
    posTujuan.addTerowongan(terowonganKePosAsal);

    // perbarui posAsal dan posTujuan ke dalam `daftarPos`
    this.daftarPos.set(nomorPosAsal - 1, posAsal);
    this.daftarPos.set(nomorPosTujuan - 1, posTujuan);
  }

  /**
   * Method untuk mendapatkan sebuah objek pos (Vertex)
   * yang telah terdaftar dalam sistem terowongan bawah tanah (Graph)
   * berdasarkan nomornya
   * @param nomorPos nomor pos
   * @return objek pos
   */
  public Vertex getPosByNomor(int nomorPos) {
    // TODO tambahkan kode utk handle error jika pos yang dicari tidak ada
    return this.daftarPos.get(nomorPos - 1);
  }

  public void cetakDaftarPos() {
    for (int i = 0; i < this.daftarPos.size(); i++) {
      System.out.println(this.daftarPos.get(i));
    }
  }

  /**
   * KABUR F E
   * 1. Cari seluruh jalur yang tersedia dari pos F ke pos E -> daftarJalur
   * 2. Dapatkan ukuran terowongan terkecil di setiap jalur -> daftarUkuranTerkecil
   * 3. Dapatkan ukuran terowongan terbesar di dalam `daftarUkuranTerkecil` -> ukuranTerowonganTerbesar
   * 4. Return `ukuranTerowonganTerbesar` sebagai nilai untuk jumlah logistik terbanyak
   *    yang dapat dibawa kabur dari pos F ke pos E
   */
}
