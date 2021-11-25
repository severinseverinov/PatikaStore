public class Product {
    private int id;
    private double birimFiyat;
    private double indirimOran;
    private int stokMiktar;
    private String urunAd;
    private Brand brand;

    public Product(int id, double birimFiyat, double indirimOran, int stokMiktar, String urunAd, Brand brand) {
        this.id = id;
        this.birimFiyat = birimFiyat;
        this.indirimOran = indirimOran;
        this.stokMiktar = stokMiktar;
        this.urunAd = urunAd;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBirimFiyat() {
        return birimFiyat;
    }

    public void setBirimFiyat(double birimFiyat) {
        this.birimFiyat = birimFiyat;
    }

    public double getIndirimOran() {
        return indirimOran;
    }

    public void setIndirimOran(double indirimOran) {
        this.indirimOran = indirimOran;
    }

    public int getStokMiktar() {
        return stokMiktar;
    }

    public void setStokMiktar(int stokMiktar) {
        this.stokMiktar = stokMiktar;
    }

    public String getUrunAd() {
        return urunAd;
    }

    public void setUrunAd(String urunAd) {
        this.urunAd = urunAd;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
