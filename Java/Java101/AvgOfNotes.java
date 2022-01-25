import java.util.Scanner;
public class AvgOfNotes
{
	public static void main(String[] args) {
		/* 
		ÖDEV
		    Not Ortalaması Hesaplayan Program
            Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
            
            Ödev
            Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
            
            Not : If ve Else kullanılmayacak...
		
		*/
		
		String[] dersler = new String[] {"Matematik", "Fizik", "Kimya", "Türkçe", "Müzik"};
		Scanner input = new Scanner(System.in);
		int toplam = 0;
		
		for(String ders : dersler) {
		    System.out.print(ders + " Matematik Notu => ");
		    toplam += input.nextInt();
		}
		
		double avg = toplam / dersler.length;

		System.out.print(avg > 60 ? "Sınıfı geçti" : "Sınıfta Kaldı");
	}
}