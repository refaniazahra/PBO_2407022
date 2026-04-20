package latihan_pbo.tugas_polymorphism;

public class Persegi extends BangunDatar {
    
    //Constructor berjumlah 1 parameter (sisi)
    public Persegi(double varA) {
        super(varA); //varA = sisi
    }
    
    //Override pada method hitungLuas
    @Override
    public double hitungLuas() {
        return getVarA() * getVarA();
    }

    //Override pada method tampilkan
    @Override
    public void tampilkan() {
        System.out.println("Persegi");
        System.out.println("====================");
        System.out.println("Sisi: " + getVarA());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("====================");
    }
}
