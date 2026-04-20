package latihan_pbo.tugas_polymorphism;

public class Main {
    
    public static void main(String[] args) {

        //Menggunakan satu tipe variabel, disini saya menggunakan variabel dengan nama bdatar
        BangunDatar bdatar;

        //Objek BangunDatar
        bdatar = new BangunDatar(3.0, 4.0);
        bdatar.tampilkan();
        System.out.println();

        //Objek Persegi
        bdatar = new Persegi(5.0);
        bdatar.tampilkan();
        System.out.println();

        //Objek PersegiPanjang
        bdatar = new PersegiPanjang(6.0, 5.0);
        bdatar.tampilkan();
        System.out.println();

        //Objek Segitiga
        bdatar = new Segitiga(8.0, 6.0);
        bdatar.tampilkan();
        System.out.println();
    }
}
