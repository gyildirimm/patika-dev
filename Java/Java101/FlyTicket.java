import java.util.Scanner;

public class FlyTicket {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int km, yas, yTipi;
        double fiyat, TlKm = 0.10;
        boolean isError = false;

        System.out.print("Lütfen Mesafeyi Km Cinsinden Giriniz: ");
        km = input.nextInt();
        System.out.print("Lütfen Yasinizi Giriniz: ");
        yas = input.nextInt();
        System.out.print("Lütfen Yolculuk Tipinizi Belirtiniz: \n1-Tek Yön\n2-Gidis-Dönüs\n");
        yTipi = input.nextInt();
        fiyat = km * TlKm;


        if (yas <= 12){
            if (yTipi == 1){
                fiyat = fiyat*0.50;
            }else if (yTipi == 2){
                fiyat = (fiyat*0.50)*0.80;
            }else {
                isError = true;
            }
        }if (yas >12 && yas < 24){
            if (yTipi == 1){
                fiyat = fiyat*0.90;
            }else if (yTipi == 2){
                fiyat = (fiyat*0.90)*0.80;
            }else {
                isError = true;
            }
        }if (yas >= 65){
            if (yTipi == 1){
                fiyat = fiyat*0.70;
            }else if (yTipi ==2){
                fiyat = (fiyat*0.70)*0.80;
            }else {
                isError = true;
            }
        }

        if (isError){
            System.out.println("Hatali Giris Yaptiniz !");
        }else {
            System.out.println("Ödenecek Tutar: " + fiyat);
        }

    }
}