public class CellPhone extends Product{
    private int hafiza;
    private double ekranBoyutu;
    private int kamera;
    private double pil;
    private int ram;
    private String renk;

    public CellPhone(int id, double birimFiyat, double indirimOran, int stokMiktar, String urunAd, Brand brand, int hafiza, double ekranBoyutu, int kamera, double pil, int ram, String renk) {
        super(id, birimFiyat, indirimOran, stokMiktar, urunAd, brand);
        this.hafiza = hafiza;
        this.ekranBoyutu = ekranBoyutu;
        this.kamera = kamera;
        this.pil = pil;
        this.ram = ram;
        this.renk = renk;
    }

    public int getHafiza() {
        return hafiza;
    }

    public void setHafiza(int hafiza) {
        this.hafiza = hafiza;
    }

    public double getEkranBoyutu() {
        return ekranBoyutu;
    }

    public void setEkranBoyutu(double ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }

    public int getKamera() {
        return kamera;
    }

    public void setKamera(int kamera) {
        this.kamera = kamera;
    }

    public double getPil() {
        return pil;
    }

    public void setPil(double pil) {
        this.pil = pil;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
}
