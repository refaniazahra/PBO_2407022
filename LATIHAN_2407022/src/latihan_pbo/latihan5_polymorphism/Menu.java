package latihan_pbo.latihan5_polymorphism;

public class Menu {
    //Atribut
    private String nama;
    private int harga;

    //Constructor
    public Menu(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // public Menu(int harga) {
    //     this.harga = harga;
    // }

    //Getter
    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    //Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    //Method hitungTotal
    public int hitungTotal(){
        return 0;
    }

    //Method tampilkan
    public void tampilkan() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: " + harga);
    } 
}
