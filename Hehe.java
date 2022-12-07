import graph.Graph;

// import java.util.Scanner;

class Hehe {
  public static void main(String[] args) {
    // System.out.println("HAHAHAHA");

    // Scanner sc = new Scanner(System.in);

    // System.out.println("Please enter your name:");
    // String name = sc.next();

    // System.out.println("Hello " + name);
    // sc.close();

    Graph sistemTerowongan = new Graph();

    // inisiasi vertex
    sistemTerowongan.addPos(1, false);
    sistemTerowongan.addPos(2, false);
    sistemTerowongan.addPos(3, false);
    sistemTerowongan.addPos(4, false);

    // bangun terowongan antar pos
    sistemTerowongan.addTerowongan(1, 2, 10, 30);
    sistemTerowongan.addTerowongan(1, 3, 10, 18);
    sistemTerowongan.addTerowongan(1, 4, 14, 26);
    sistemTerowongan.addTerowongan(2, 4, 10, 17);
    sistemTerowongan.addTerowongan(3, 4, 10, 32);

    // cetak daftar pos
    sistemTerowongan.cetakDaftarPos();
  }
}