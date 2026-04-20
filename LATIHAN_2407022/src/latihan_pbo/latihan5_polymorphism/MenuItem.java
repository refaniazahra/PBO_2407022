package latihan_pbo.latihan5_polymorphism;

public class MenuItem extends Menu {
    private int jumlah;
    
    //Constructor
    public MenuItem(String nama, int harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    //Getter
     public int getJumlah() {
        return jumlah;
    }

    //Setter
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    //Override pada method hitungTotal
    @Override
    public int hitungTotal() {
        return getHarga() * jumlah;
    }

    //Override pada method tampilkan
    @Override
    public void tampilkan() {
        System.out.println(getNama() + " ---> " + getHarga() + " x " + jumlah + " = " + hitungTotal());
    }
}
