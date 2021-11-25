import java.util.ArrayList;
import java.util.Scanner;

public class PatikaStore {
    private String ad;
    private static ArrayList<Brand> brands;
    private static ArrayList<Product> products;
    private Scanner input=new Scanner(System.in);

    public PatikaStore(String ad) {
        this.ad = ad;
    }

    static {
        brands = new ArrayList<>();
        brands.add(new Brand(1, "Samsung"));
        brands.add(new Brand(2, "Lenovo"));
        brands.add(new Brand(3, "Apple"));
        brands.add(new Brand(4, "Huawei"));
        brands.add(new Brand(5, "Casper"));
        brands.add(new Brand(6, "Asus"));
        brands.add(new Brand(7, "HP"));
        brands.add(new Brand(8, "Xiaomi"));
        brands.add(new Brand(9, "Monster"));

        products = new ArrayList<>();

        // Cep Telefonu
        products.add(new CellPhone(1, 3199.0, 0, 1, "SAMSUNG GALAXY A51",
                brands.get(0), 128, 6.5, 32, 4000.0, 6, "Siyah"));

        products.add(new CellPhone(2, 7379.0, 0, 1, "iPhone 11 64 GB",
                brands.get(2), 128, 6.1, 5, 3046.0, 6, "Mavi"));

        products.add(new CellPhone(3, 4012.0, 0, 1, "Redmi Note 10 Pro 8GB",
                brands.get(7), 128, 6.5, 35, 4000.0, 12, "Beyaz"));

        // Notebook
        products.add(new Notebook(1, 7000.0, 0, 1, "HUAWEI Matebook 14", brands.get(3),
                16, 512, 14.0));

        products.add(new Notebook(2, 3699.0, 0, 1, "LENOVO V14 IGL", brands.get(1),
                8, 1024, 14.0));

        products.add(new Notebook(3, 8199.0, 0, 1, "ASUS Tuf Gaming", brands.get(5),
                32, 2048, 15.6));
    }

    public void printMenu() {
        System.out.println("Patika Store Ürün Yönetim Paneli !");
        System.out.println("1 - Notebook İşlemleri");
        System.out.println("2 - Cep Telefonu İşlemleri");
        System.out.println("3 - Marka Listele");
        System.out.println("4 - Urunleri Listele");
        System.out.println("0 - Cikis Yap");
        System.out.print("Tercihiniz : ");
    }

    public void brandList(){
        System.out.println("Markalarımız");
        System.out.println("---------------------");
        for(int i=0;i<brands.size();i++){
            System.out.println("- "+brands.get(i).getAd());
        }
        System.out.println();
    }

    public void productList(){
        System.out.println("Notebook Listesi");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for(int i = 0; i < products.size(); i++) {
            if(products.get(i) instanceof Notebook) {
                Notebook n = (Notebook) products.get(i);
                String temp = "|";
                temp += " " + String.format("%-" + 3 + "s" ,n.getId());
                temp += "|";
                temp += " " + String.format("%-" + 30 + "s" ,n.getUrunAd());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,n.getBirimFiyat());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,n.getBrand().getAd());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,n.getDepolama());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,n.getEkranBoyutu());
                temp += "|";
                temp += " " + String.format("%-" + 12 + "s" ,n.getRam());
                temp += "|";
                System.out.println(temp);
            }
        }

        System.out.println("----------------------------------------------------------------------------------------------------");

        System.out.println();
        System.out.println("Cep Telefonu Listesi");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for(int i = 0; i < products.size(); i++) {
            if(products.get(i) instanceof CellPhone) {
                Notebook n = (Notebook) products.get(i);
                String temp = "|";
                temp += " " + String.format("%-" + 3 + "s" ,n.getId());
                temp += "|";
                temp += " " + String.format("%-" + 30 + "s" ,n.getUrunAd());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,n.getBirimFiyat());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,n.getBrand().getAd());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,n.getDepolama());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,n.getEkranBoyutu());
                temp += "|";
                temp += " " + String.format("%-" + 12 + "s" ,n.getRam());
                temp += "|";
                System.out.println(temp);
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    public void notebookList(){
        System.out.println("Notebook Listesi");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for(int i = 0; i < products.size(); i++) {
            if(products.get(i) instanceof Notebook) {
                Notebook n = (Notebook) products.get(i);
                String temp = "|";
                temp += " " + String.format("%-" + 3 + "s" ,n.getId());
                temp += "|";
                temp += " " + String.format("%-" + 30 + "s" ,n.getUrunAd());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,n.getBirimFiyat());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,n.getBrand().getAd());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,n.getDepolama());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,n.getEkranBoyutu());
                temp += "|";
                temp += " " + String.format("%-" + 12 + "s" ,n.getRam());
                temp += "|";
                System.out.println(temp);
            }
        }

        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    public void cellphoneList(){
        System.out.println("Cep Telefonu Listesi");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for(int i = 0; i < products.size(); i++) {
            if(products.get(i) instanceof CellPhone) {
                Notebook n = (Notebook) products.get(i);
                String temp = "|";
                temp += " " + String.format("%-" + 3 + "s" ,n.getId());
                temp += "|";
                temp += " " + String.format("%-" + 30 + "s" ,n.getUrunAd());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,n.getBirimFiyat());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,n.getBrand().getAd());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,n.getDepolama());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,n.getEkranBoyutu());
                temp += "|";
                temp += " " + String.format("%-" + 12 + "s" ,n.getRam());
                temp += "|";
                System.out.println(temp);
            }
        }

        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    public boolean addProduct(String productClassName) {
        if(productClassName.equals("CellPhone")) {
            System.out.print("Urunun id'sini giriniz: ");
            int id = input.nextInt();

            System.out.print("Ürünün birim fiyatını giriniz: ");
            double birimFiyati = input.nextDouble();

            System.out.print("Ürünün indirim oranını giriniz: ");
            double indirimOrani = input.nextDouble();

            System.out.print("Ürünün stok miktarını giriniz: ");
            int stokMiktari = input.nextInt();

            System.out.print("Ürünün adını giriniz: ");
            String urunAdi = input.nextLine();

            for(int i = 0; i < brands.size(); i++) {
                System.out.println(i + ") " + brands.get(i).getAd());
            }
            System.out.println();
            System.out.print("Ürünün markasını seçiniz: ");
            int markaIndex = input.nextInt();
            Brand marka = brands.get(markaIndex - 1);

            System.out.print("Ürünün hafızasını giriniz: ");
            int hafiza = input.nextInt();

            System.out.print("Ürünün ekran boyutunu giriniz: ");
            double ekranBoyutu = input.nextDouble();

            System.out.print("Ürünün kamerasını giriniz: ");
            int kamera = input.nextInt();

            System.out.print("Ürünün pil gücünü giriniz: ");
            double pilGucu = input.nextDouble();

            System.out.print("Ürünün ram'ini giriniz: ");
            int ram = input.nextInt();

            System.out.print("Ürünün rengini giriniz: ");
            String renk = input.nextLine();

            Product yeniUrun = new CellPhone(id, birimFiyati, indirimOrani, stokMiktari, urunAdi, marka, hafiza, ekranBoyutu,
                    kamera, pilGucu, ram, renk);
            products.add(yeniUrun);
            return true;
        } else if(productClassName.equals("Notebook")) {
            System.out.print("Ürünün id'sini giriniz: ");
            int id = input.nextInt();

            System.out.print("Ürünün birim fiyatını giriniz: ");
            double birimFiyati = input.nextDouble();

            System.out.print("Ürünün indirim oranını giriniz: ");
            double indirimOrani = input.nextDouble();

            System.out.print("Ürünün stok miktarını giriniz: ");
            int stokMiktari = input.nextInt();

            System.out.print("Ürünün adını giriniz: ");
            String urunAdi = input.nextLine();

            for(int i = 0; i < brands.size(); i++) {
                System.out.println(i + ") " + brands.get(i).getAd());
            }
            System.out.println();
            System.out.print("Ürünün markasını seçiniz: ");
            int markaIndex = input.nextInt();
            Brand marka = brands.get(markaIndex - 1);

            System.out.print("Ürünün ram'ini giriniz: ");
            int ram = input.nextInt();

            System.out.print("Ürünün depolama alanını giriniz: ");
            int depolama = input.nextInt();

            System.out.print("Ürünün ekran boyutunu giriniz: ");
            double ekranBoyutu = input.nextDouble();

            Product yeniUrun = new Notebook(id, birimFiyati, indirimOrani, stokMiktari, urunAdi, marka, ram, depolama, ekranBoyutu);
            products.add(yeniUrun);
            return true;
        } else {
            System.out.println("Yanlış ürün grubu seçtiniz.");
            return false;
        }
    }

    public boolean removeProduct(String className, int id) {
        for(int i = 0; i < products.size(); i++) {
            try {
                if(products.get(i).getId() == id && Class.forName(className).isInstance(products.get(i))) {
                    products.remove(i);
                    return true;
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public Product filterProoductById(int id) {
        for(int i = 0; i < products.size(); i++) {
            if(products.get(i).getId() == id) return products.get(i);
        }
        return null;
    }

    public ArrayList<Product> filterProductByBrand(Brand brand) {
        ArrayList<Product> filteredProducts = new ArrayList<>();
        for(int i = 0; i < products.size(); i++) {
            if(products.get(i).getBrand().getAd().equals(brand.getAd())) {
                filteredProducts.add(products.get(i));
            }
        }
        return filteredProducts;
    }

    public static ArrayList<Brand> getBrands() {
        return brands;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
