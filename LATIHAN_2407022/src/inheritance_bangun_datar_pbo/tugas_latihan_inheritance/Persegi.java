package inheritance_bangun_datar_pbo.tugas_latihan_inheritance;

public class Persegi extends BangunDatar {

    public double LuasPersegi(){
        return getSisi()*getSisi();
    }

    public double KelilingPersegi(){
        return 4*getSisi();
    }
    
}