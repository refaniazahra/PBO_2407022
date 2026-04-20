package latihan_pbo.latihan4_inheritance;

public class Main {
    public static void main(String[] args) {
        BangunRuang balok = new BangunRuang(10, 5, 4);

        balok.tampilkanInfoRuang();

        System.out.println("Luas Alas = " + balok.hitungLuas());
        System.out.println("Volume dari class parent = " + balok.hitungVolume());
        System.out.println("Valome dari class child = " + balok.hitungVolume2());
    }
}
