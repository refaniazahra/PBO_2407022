package latihan_pbo.latihan4_inheritance;

public class BangunDatar {
    protected double panjang;
    protected double lebar;

     //constructor
    public BangunDatar(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    //method hitungLuas
    public double hitungLuas(){
        return panjang * lebar * 2;
    }

    //output
    public void tampilkanHasil(){
        System.out.println("panjang : " + panjang);
        System.out.println("lebar : " + lebar);
    }
}
