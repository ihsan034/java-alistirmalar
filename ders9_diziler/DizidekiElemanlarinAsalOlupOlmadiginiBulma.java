package ders9_diziler;

import java.util.Scanner;

public class DizidekiElemanlarinAsalOlupOlmadiginiBulma {

	public static void main(String[] args) {
		
		// Dizinin elemanlarini kullanicidan alalim.
		// Daha sonra dizinin icindeki elemanlarin asal olanlarini ve olmayanlari ayri bir sekilde yazdiralim.
		
		System.out.println("Asal sayi bulma uygulamasina hosgeldiniz!");
		System.out.println("*****************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		int asalSayilar = 0;
		int asalOlmayanSayilar = 0;
		
		String asalSayilarGosterimi = "";
		String asalOlmayanSayilarGosterimi = "";
		
		
		System.out.print("Dizi kac elemanli olsun? ");
		int diziUzunlugu = scanner.nextInt(); // kullanicidan dizi uzunlugunu aliyoruz
		
		int [] sayilar = new int[diziUzunlugu];
		
		
		// kullanicidan aldigimiz degerleri diziye dolduralim
		for(int i = 0; i < sayilar.length; i++) {
			System.out.print("Dizinin " + (i) + ". index degerini giriniz: ");
			sayilar[i] = scanner.nextInt();
			scanner.nextLine();
		}
		
		System.out.println("-----------------------------------");
				
		
		// dizi icindeki elemanlarin asal olup olmadigini kontrol edelim
		for (int sayi : sayilar) {
			boolean asalMi = sayi >= 2;
			
			for(int i = 2; i < sayi; i++) {
				if (sayi % i == 0) {
					asalMi = false;
					break;
				}
				
				
				
			}
			
			if (asalMi) {
				asalSayilar++;
				asalSayilarGosterimi += sayi + " ";
			} else {
				asalOlmayanSayilar++;
				asalOlmayanSayilarGosterimi += sayi + " ";
			}
			
			
		}
		
		
		scanner.close();
		
		System.out.println("Asal sayilarin sayisi: " + asalSayilar);
		System.out.println("Asal sayilarin Gosterimi: " + asalSayilarGosterimi);
		System.out.println("Asal olmayan sayilarin sayisi: " + asalOlmayanSayilar);
		System.out.println("Asal olmayan sayilarin Gosterimi: " + asalOlmayanSayilarGosterimi);
		
		
		
	}

}
