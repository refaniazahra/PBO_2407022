package latihan_pbo.latihan7_exception;

public class tes {
    
    public static void main (String[] args) {
        double x = 7;
        double y = 0;

        double bagi = x/y;

        try {
            System.out.println(bagi);
        } catch (Exception e) {
            Exception e;
        }

        System.out.println("end program");
    }
}
