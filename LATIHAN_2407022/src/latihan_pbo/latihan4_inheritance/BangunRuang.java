package latihan_pbo.latihan4_inheritance;

public class BangunRuang extends BangunDatar {
    private double tinggi;

    //construtor
    public BangunRuang(double panjang, double lebar, double tinggi){
        super(panjang, lebar); // memanggil constructor BangunDatar
        this.tinggi = tinggi;
    }

    //method hitungLuas
    @Override
    public double hitungLuas(){
        return panjang * lebar;
    }

    //method hitungVolume dari class parent
    public double hitungVolume() {
        return super.hitungLuas() * tinggi; 
    }

    //method hitungVolume dari class child
    public double hitungVolume2() {
        return hitungLuas() * tinggi; 
    } 

    //output
    public void tampilkanInfoRuang(){
        super.tampilkanHasil();
        System.out.println("Tinggi : " + tinggi);
    }
}
