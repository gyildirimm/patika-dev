import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
    System.out.print("Yılı girin: ");
    int yil = inp.nextInt();
    int artikYil = yil % 4;
    if (artikYil == 0){ System.out.println( yil + " Artık yıldır!");}
    else { System.out.println( yil + " Artık yıl değildir!");}
    }
}