package inheritance_bangun_datar_pbo.tugas_latihan_inheritance;

public class Segitiga extends BangunDatar {
    
     public double LuasSegitiga(){
        return 0.5 * getAlas() * getTinggi();
    }

    public double KelilingSegitiga(){
        return getSisi1() + getSisi2() + getSisi3();
    }

}