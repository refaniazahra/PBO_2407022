package latihan_pbo.tugas_polymorphism;

public class Segitiga extends BangunDatar {
    
    //Constructor berjumlah 2 parameter (alas dan tinggi)
    public Segitiga(double varA, double varB) {
        super(varA, varB); //varA = alas, varB = tinggi
    }

    //Override pada method hitungLuas
    @Override
    public double hitungLuas() {
        return 0.5 * getVarA() * getVarB();
    }

    //Override pada method tampilkan
    @Override
    public void tampilkan() {
        System.out.println("Segitiga");
        System.out.println("====================");
        System.out.println("Alas: " + getVarA());
        System.out.println("Tinggi: " + getVarB());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("====================");
    }
}
