package ders12_kapsulleme;

import java.util.Scanner;

public class KapsullemeGiseUygulamasi {

	public static void main(String[] args) {
		// Gise uygulamasi yapalim TC'si dogru ise numara versin, yanlis girer ise uyarsin.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gise Uygulamasina Hosgeldiniz!");
		System.out.print("Lutfen TCKN giriniz: ");
		
		String tckn = scanner.nextLine();
		
		TCKN tcknNesne = new TCKN();
		tcknNesne.setTckn(tckn);
		
		scanner.close();
	}

}
