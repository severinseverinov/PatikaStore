import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PatikaStore patikaStore=new PatikaStore("Patika Store");
        Scanner input=new Scanner(System.in);
        patikaStore.printMenu();
        int select=input.nextInt();

        while (true){
            System.out.println();
            if (select==0){
                System.out.println("Çıkış yapılıyor.");
                break;
            }else if(select==1){
                System.out.println("1 - Notebookları Listele");
                System.out.println("2 - Notebook Ekle");
                System.out.println("3 - Notebook Sil");
                System.out.println("0 - Ana Menüye Geri Gel");
                int slct=input.nextInt();
                switch (slct){
                    case 0:
                        System.out.println("Ana Menüye Geri Dönülüyor");
                        break;
                    case 1:
                        patikaStore.notebookList();
                        break;
                    case 2:
                        boolean add = patikaStore.addProduct("Notebook");
                        if(add) {
                            System.out.println("Ürün başarıyla eklendi.");
                        }
                        break;
                    case 3:
                        patikaStore.notebookList();
                        System.out.print("Silmek istediginiz ürünün id'sini giriniz : ");
                        int urunId = input.nextInt();
                        boolean deleted = patikaStore.removeProduct("Notebook", urunId);
                        if(deleted) {
                            System.out.println("Ürün başarıyla silindi.");
                        }
                        break;
                    default:
                        System.out.println("Geçersiz bir işlem seçtiniz.");
                }
            }else if(select==2){
                System.out.println("1 - Cep Telefonlarını Listele");
                System.out.println("2 - Cep Telefonu Ekle");
                System.out.println("3 - Cep Telefonu Sil");
                System.out.println("0 - Ana Menüye Geri Gel");
                int slct=input.nextInt();
                switch (slct){
                    case 0:
                        System.out.println("Ana Menüye Geri Dönülüyor");
                        break;
                    case 1:
                        patikaStore.cellphoneList();
                        break;
                    case 2:
                        boolean add = patikaStore.addProduct("CellPhone");
                        if(add) {
                            System.out.println("Ürün başarıyla eklendi.");
                        }
                        break;
                    case 3:
                        patikaStore.cellphoneList();
                        System.out.print("Silmek istediginiz ürünün id'sini giriniz : ");
                        int urunId = input.nextInt();
                        boolean deleted = patikaStore.removeProduct("CellPhone", urunId);
                        if(deleted) {
                            System.out.println("Ürün başarıyla silindi.");
                        }
                        break;
                    default:
                        System.out.println("Geçersiz bir işlem seçtiniz.");
                }
            }else if(select==3){
                patikaStore.brandList();
            }else if(select==4){
                patikaStore.productList();
            }else{
                System.out.println("Geçersiz bir işlem seçtiniz.");
            }
            System.out.println();
            patikaStore.printMenu();
            select=input.nextInt();
        }
    }
}
