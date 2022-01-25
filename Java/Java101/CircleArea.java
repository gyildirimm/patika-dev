import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

        double yariCap, alan, dilimAlan, cevre, pi = 3.14;
        int merkezAci;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        yariCap = input.nextDouble();

        System.out.print("Daire diliminin açısını giriniz: ");
        merkezAci = input.nextInt();

        alan = pi * yariCap * yariCap;
        cevre = 2 * pi * yariCap;
        dilimAlan = (pi * yariCap * yariCap * merkezAci) / 360;

        System.out.println("Dairenin toplam alanı : " + alan);
        System.out.println("Dairenin %i dilimlik alanı: " + dilimAlan);
        System.out.println("Dairenin çevresi :" + cevre);
    }
}
