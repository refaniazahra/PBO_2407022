package latihan_pbo.tugas_inheritance;

public class Main {

    public static void main(String[] args) {
        
        BangunRuang bRuang = new BangunRuang(10,5,4);

        bRuang.tampilkanInfoRuang();

        System.out.println("Luas Alas = " + bRuang.hitungLuas());
        System.out.println("Volume dari class parent = " + bRuang.hitungVolume());
        System.out.println("Valome dari class child = " + bRuang.hitungVolume2());
    } 
}