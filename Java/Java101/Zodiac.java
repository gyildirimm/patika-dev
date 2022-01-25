import java.util.Scanner;

public class Zodiac {

    public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
        int dogumTarihi, sonuc;
        System.out.print("Doğum yılınızı girin: ");
        dogumTarihi = inp.nextInt();
        sonuc = dogumTarihi % 12;
        if (sonuc == 0){ System.out.println("Maymun");}
        else if (sonuc == 1){ System.out.println("Çin Zodyağı burcunuz: Horoz");}
        else if (sonuc == 2){ System.out.println("Çin Zodyağı burcunuz: Köpek");}
        else if (sonuc == 3){ System.out.println("Çin Zodyağı burcunuz: Domuz");}
        else if (sonuc == 4){ System.out.println("Çin Zodyağı burcunuz: Fare");}
        else if (sonuc == 5){ System.out.println("Çin Zodyağı burcunuz: Öküz");}
        else if (sonuc == 6){ System.out.println("Çin Zodyağı burcunuz: Kaplan");}
        else if (sonuc == 7){ System.out.println("Çin Zodyağı burcunuz: Tavşan");}
        else if (sonuc == 8){ System.out.println("Çin Zodyağı burcunuz: Ejderha");}
        else if (sonuc == 9){ System.out.println("Çin Zodyağı burcunuz: Yılan");}
        else if (sonuc == 10){ System.out.println("Çin Zodyağı burcunuz: At");}
        else if (sonuc == 11){ System.out.println("Çin Zodyağı burcunuz: Koyun");}
    }
}