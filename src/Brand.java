import java.util.Comparator;
public class Brand implements Comparable<Brand> {

    private int id;
    private String ad;

    public Brand(int id, String ad) {
        this.id = id;
        this.ad = ad;
    }

    @Override
    public int compareTo(Brand brand){
        return this.getAd().compareTo(brand.getAd());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
