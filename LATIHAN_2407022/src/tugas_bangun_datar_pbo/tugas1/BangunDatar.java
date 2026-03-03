package tugas_bangun_datar_pbo.tugas1;

public class BangunDatar {

    //Private (Encapsulation)
    private double sisi;
    private double panjang;
    private double lebar;
    private double alas;
    private double tinggi;

    //Protected
    protected double diagonal1;
    protected double diagonal2;

    //Constructor
    public BangunDatar() {
    }

    //Setter dan Getter
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setDiagonal(double d1, double d2) {
        this.diagonal1 = d1;
        this.diagonal2 = d2;
    }

    //Public (Method Perhitungan)
    public double hitungLuasPersegi() {
        return sisi * sisi;
    }

    public double hitungKelilingPersegi() {
        return 4 * sisi;
    }

    public double hitungLuasPersegiPanjang() {
        return panjang * lebar;
    }

    public double hitungKelilingPersegiPanjang() {
        return 2 * (panjang + lebar);
    }

    public double hitungLuasSegitiga() {
        return 0.5 * alas * tinggi;
    }

    public double hitungKelilingSegitiga(double a, double b, double c) {
        return a + b + c;
    }

    public double hitungLuasBelahKetupat() {
        return 0.5 * diagonal1 * diagonal2;
    }

    public double hitungKelilingBelahKetupat(double sisi) {
        return 4 * sisi;
    }
}