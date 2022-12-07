package graph;

/**
 * Representasi kelas untuk terowongan antarpos
 */
public class Edge {
  private Vertex posTujuan;
  private int panjang;
  private int luas;

  public Edge(Vertex posTujuan, int panjang, int luas) {
    this.posTujuan = posTujuan;
    this.panjang = panjang;
    this.luas = luas;
  }

  @Override
  public String toString() {
    int nomorPosTujuan = this.posTujuan.getNomorPos();
    return "Terowongan " + String.valueOf(nomorPosTujuan)
      + " memiliki luas " + String.valueOf(this.luas) + " m2"
      + " dan panjang " + String.valueOf(this.panjang) + " m";
  }
}
