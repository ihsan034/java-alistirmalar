package ders11_nesne_yonelimli_programlama_OOP;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// Calisan sinifini olusturup ise baslayalim
		
		System.out.println("********Uygulamaya Hosgeldiniz*********");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("No degerini giriniz: ");
		int no = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Isim degerini giriniz: ");
		String isim = scanner.nextLine();
		
		System.out.print("Soyisim degerini giriniz: ");
		String soyisim = scanner.nextLine();
		
		System.out.print("Kac yillik tecrubeniz var? ");
		int tecrube = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Maas miktarini giriniz: ");
		double maas = scanner.nextDouble();
		scanner.nextLine();
		
		CalisanOrnegi calisan1 = new CalisanOrnegi(no, isim, soyisim, tecrube, maas);
		
		String islemler = "1) Calisan bilgilerini goster\n2) Maasa zam yap\n3) Format at\n";
		System.out.println("------------------------------------");
		System.out.println(islemler);
		System.out.print("Secim yapiniz: ");
		int secim = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("*************");
		
		switch (secim) {
		case 1:
			calisan1.calisanBilgileriGoster();
			break;
		
		case 2:
			System.out.print("Zam degerini giriniz: ");
			int zamDegeri = scanner.nextInt();
			scanner.nextLine(); // Enter karakterini bosa cikaralim (Java bug'i)
			calisan1.zamYap(zamDegeri);
			break;
			
		case 3:	
			System.out.print("Kim format atacak ismini giriniz: ");
			String kisi = scanner.nextLine();
			
			System.out.print("Hangi isletim sistemine format atilacak giriniz: ");
			String isletimSistemi = scanner.nextLine();
			calisan1.formatAt(isletimSistemi, kisi);
			break;

		default:
			System.out.println("LUTFEN BELIRTILEN ARALIKTA DEGER SECIMI YAPINIZ!");
			break;
		}
		
		scanner.close();

	}

}
