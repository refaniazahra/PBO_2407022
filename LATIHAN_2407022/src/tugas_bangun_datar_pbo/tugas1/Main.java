package tugas_bangun_datar_pbo.tugas1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BangunDatar bDatar = new BangunDatar();

        System.out.println(" -KALKULATOR BANGUN DATAR (PBO)- ");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Belah Ketupat");
        System.out.print("Silakan pilih menu (1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan) {

            case 1:
                System.out.print("Masukkan sisi: ");
                bDatar.setSisi(input.nextDouble());
                System.out.println("Luas = " + bDatar.hitungLuasPersegi());
                System.out.println("Keliling = " + bDatar.hitungKelilingPersegi());
                break;

            case 2:
                System.out.print("Masukkan panjang: ");
                bDatar.setPanjang(input.nextDouble());
                System.out.print("Masukkan lebar: ");
                bDatar.setLebar(input.nextDouble());
                System.out.println("Luas = " + bDatar.hitungLuasPersegiPanjang());
                System.out.println("Keliling = " + bDatar.hitungKelilingPersegiPanjang());
                break;

            case 3:
                System.out.print("Masukkan alas: ");
                bDatar.setAlas(input.nextDouble());
                System.out.print("Masukkan tinggi: ");
                bDatar.setTinggi(input.nextDouble());

                System.out.print("Masukkan sisi a: ");
                double a = input.nextDouble();
                System.out.print("Masukkan sisi b: ");
                double b = input.nextDouble();
                System.out.print("Masukkan sisi c: ");
                double c = input.nextDouble();

                System.out.println("Luas = " + bDatar.hitungLuasSegitiga());
                System.out.println("Keliling = " + bDatar.hitungKelilingSegitiga(a, b, c));
                break;

            case 4:
                System.out.print("Masukkan diagonal 1: ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan diagonal 2: ");
                double d2 = input.nextDouble();
                bDatar.setDiagonal(d1, d2);

                System.out.print("Masukkan sisi: ");
                double sisi = input.nextDouble();

                System.out.println("Luas = " + bDatar.hitungLuasBelahKetupat());
                System.out.println("Keliling = " + bDatar.hitungKelilingBelahKetupat(sisi));
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}