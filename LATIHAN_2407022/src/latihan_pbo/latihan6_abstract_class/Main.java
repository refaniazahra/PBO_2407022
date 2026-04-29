package latihan_pbo.latihan6_abstract_class;


public class Main {
    public static void main(String[] args) {
        BangunDatar[] bd = {
            new Persegi(4),
            new Segitiga(4, 5, 6, 7, 8)
        };

        for (BangunDatar b : bd) {
            b.Display();
            System.out.println("Luas: " + b.hitungLuas());
            System.out.println("Keliling: " + b.hitungKeliling());
            System.out.println("--------------------");
        }
    }
}
