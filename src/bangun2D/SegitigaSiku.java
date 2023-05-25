package bangun2D;

public class SegitigaSiku extends Segitiga {
    public SegitigaSiku(double a, double t){
        super(a, t);
    }

    public double getKeliling(){
        return getAlas()+getKeliling()+getSisiMiring();
    }

    public double getSisiMiring(){
        return Math.sqrt(Math.pow(getAlas(),2)+Math.pow(getTinggi(),2));
    }

    @Override
    public String toString() {
        return "SegitigaSiku{" +
                "a=" + getAlas() +
                ", t=" + getTinggi() +
                '}';
    }
}
