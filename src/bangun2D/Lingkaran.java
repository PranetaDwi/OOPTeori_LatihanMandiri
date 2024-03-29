package bangun2D;
import master.Matematika;
public class Lingkaran implements bangun2D{
    private double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getLuas(){
        return Matematika.phi*r*r;
    }
    public double getKeliling(){
        return 2*Matematika.phi*r;
    }

    @Override
    public String toString() {
        return "Lingkaran{" +
                "r=" + r +
                '}';
    }
}
