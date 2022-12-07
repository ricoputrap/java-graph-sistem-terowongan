package graph;

import java.util.ArrayList;

/**
 * Representasi kelas untuk pos
 */
public class Vertex {
  private int nomorPos;
  private ArrayList<Edge> daftarTerowongan;
  private boolean hasPenjaga;

  public Vertex(int nomorPos, boolean hasPenjaga) {
    this.nomorPos = nomorPos;
    this.daftarTerowongan = new ArrayList<Edge>();
    this.hasPenjaga = hasPenjaga;
  }

  public int getNomorPos() {
    return this.nomorPos;
  }

  public boolean getHasPenjaga() {
    return this.hasPenjaga;
  }

  public void addTerowongan(Edge terowongan) {
    this.daftarTerowongan.add(terowongan);
  }

  @Override
  public String toString() {
    int jumlahTerowongan = this.daftarTerowongan.size();
    String penjagaStr = this.hasPenjaga
      ? " berpenjaga "
      : " tanpa penjaga ";

    return "Pos " + String.valueOf(this.nomorPos)
      + penjagaStr
      + " memiliki " + String.valueOf(jumlahTerowongan)
      + " terowongan.";
  }
}