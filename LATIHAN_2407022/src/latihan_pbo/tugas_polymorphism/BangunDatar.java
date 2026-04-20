package latihan_pbo.tugas_polymorphism;

public class BangunDatar {
    //Atribut dengan menggunakan prinsip encapsulasi
    private double varA;
    private double varB;

    //Constructor pertama berjumlah 2 parameter
    public BangunDatar(double varA, double varB) {
        this.varA =varA;
        this.varB =varB;
    }

    //Constructor kedua berjumlah hanya 1 parameter
    public BangunDatar(double varA) {
        this.varA = varA;
        this.varB = 0;
    }

    //Getter 
    public double getVarA() {
        return varA;
    }

    public double getVarB() {
        return varB;
    }

    //Setter
    public void setVarA(double varA) {
        this.varA = varA;
    }

    public void setVarB(double varB) {
        this.varB = varB;
    }

    //Method hitungLuas dengan nilai default 0
    public double hitungLuas(){
        return 0;
    }

    //Method tampilkan
    public void tampilkan() {
        System.out.println("Bangun Datar");
        System.out.println("====================");
        System.out.println("varA: " + varA);
        System.out.println("varB: " + varB);
        System.out.println("====================");
    } 
}
