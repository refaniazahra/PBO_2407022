package inheritance_bangun_datar_pbo.tugas_latihan_inheritance;

public class PersegiPanjang extends BangunDatar {
    
    public double LuasPersegiPanjang(){
        return getPanjang() * getLebar();
    }

    public double KelilingPersegiPanjang(){
        return 2 * (getPanjang() + getLebar());
    }

}