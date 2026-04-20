package latihan_pbo.tugas_polymorphism;

public class PersegiPanjang extends BangunDatar {
    
    //Constructor berjumlah 2 parameter (panjang dan lebar)
    public PersegiPanjang(double varA, double varB) {
        super(varA, varB); //varA = panjang, varB = lebar
    }

    //Override pada method hitungLuas
    @Override
    public double hitungLuas() {
        return getVarA() * getVarB();
    }

    //Override pada method tampilkan
    @Override
    public void tampilkan() {
        System.out.println("Persegi Panjang");
        System.out.println("====================");
        System.out.println("Panjang: " + getVarA());
        System.out.println("Lebar: " + getVarB());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("====================");
    }
}
