public class Notebook extends Product{
    private int ram;
    private int depolama;
    private double ekranBoyutu;

    public Notebook(int id, double birimFiyat, double indirimOran, int stokMiktar, String urunAd, Brand brand, int ram, int depolama, double ekranBoyutu) {
        super(id, birimFiyat, indirimOran, stokMiktar, urunAd, brand);
        this.ram = ram;
        this.depolama = depolama;
        this.ekranBoyutu = ekranBoyutu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDepolama() {
        return depolama;
    }

    public void setDepolama(int depolama) {
        this.depolama = depolama;
    }

    public double getEkranBoyutu() {
        return ekranBoyutu;
    }

    public void setEkranBoyutu(double ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }
}
