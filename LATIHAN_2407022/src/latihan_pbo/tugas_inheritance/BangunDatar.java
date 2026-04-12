package latihan_pbo.tugas_inheritance;

public class BangunDatar {
    //encapsulasi
    private double panjang;
    private double lebar;

    //constructor
     public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    //setter
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }

    public void setLebar(double lebar){
        this.lebar = lebar;
    }

    //getter
    public double getPanjang(){
        return panjang;
    } 
    
     public double getLebar(){
        return lebar;
    } 
 
    //method hitungLuas
    public double hitungLuas() {
        return getPanjang() * getLebar() *2;
    }
    
     //output
    public void tampilkanHasil(){
        System.out.println("panjang : " + panjang);
        System.out.println("lebar : " + lebar);
    }
}