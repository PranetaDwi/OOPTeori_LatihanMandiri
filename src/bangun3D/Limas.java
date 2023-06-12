package bangun3D;
import bangun2D.Persegi;
import bangun2D.PersegiPanjang;
import bangun2D.Segitiga;
import bangun2D.Lingkaran;
import bangun2D.bangun2D;

public class Limas {
    private double tinggi;
    private bangun2D alas;

    public Limas (double tinggi, bangun2D alas) {
        this.tinggi = tinggi;
        this.alas = alas;
    }
    public double getVolumeLimas(){
        if (alas instanceof Persegi){
            return (1.0/3.0) * alas.getLuas() * tinggi;
        }
        if (alas instanceof PersegiPanjang){
            return (1.0/3.0) * alas.getLuas() * tinggi;
        }
        if (alas instanceof Lingkaran){
            return (1.0/3.0) * alas.getLuas() * tinggi;
        }
        if (alas instanceof Segitiga){
            return (1.0/3.0) * alas.getLuas() * tinggi;
        }
        return 0;
    }
    public String getDetailAlas(){
        if (alas instanceof Persegi){
            return "Limas Persegi";
        }
        else if (alas instanceof PersegiPanjang){
            return "Limas Persegi Panjang";
        }
        else if (alas instanceof Segitiga){
            return "Limas Segitiga";
        }
        else if (alas instanceof Lingkaran){
            return "Limas Kerucut";
        }
        else{
            return "Bangun 2D";
        }
    }
}