package latihan_pbo.latihan5_polymorphism;

public class Main {

    public static void main(String[] args) {
        
        Menu [] listMenu = {
            new MenuItem("Ketoprak", 12000, 3),
            new MenuItem("Nasi Goreng", 15000, 4),
            new MenuItem("Sogem", 8000, 5)
        };

        
        //Karena sebelum daftar pesanan, saya ingin menambahkan list menu terlebih dahulu,
        //maka kode program dibawah ini untuk menampilkan list menunya.
        System.out.println("=== List Menu ===");
        for (int i = 0; i < listMenu.length; i++) {
            System.out.println("Menu " + (i + 1));
            System.out.println("Nama: " + listMenu[i].getNama());
            System.out.println("Harga: " + listMenu[i].getHarga());
            System.out.println();
        }

        //Untuk menampilkan daftar pesanan
        System.out.println("===== Daftar Pesanan =====");
        int grandTotal = 0;
        for (Menu m : listMenu) {
            m.tampilkan();
            grandTotal += m.hitungTotal();
        }

        //Untuk menampilkan total harga
        System.out.println("----------------------------------");
        System.out.println("Total = " + grandTotal);
    }
    
}
