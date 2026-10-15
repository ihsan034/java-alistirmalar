package ders10_metotlar;

import java.util.Scanner;

public class KullaniciLoginUygulamasiYapimi {

	static boolean aktif = true;
	static int hakSayisi = 3;

	public static void main(String[] args) {
		// Kullanicinin uygulamaya giris yapmasini saglayalim 3 hakki olsun.
		// 3 hakkini doldurdugunda hesabi disabled olsun. Dogru girer ise sisteme giris yapsin.

		Scanner scanner = new Scanner(System.in);

		if (aktif) {

			if (hakSayisi > 0) {

				while (aktif) {
					System.out.print("Kullanici adinizi giriniz: ");
					String username = scanner.nextLine();

					System.out.print("Sifrenizi giriniz: ");
					String password = scanner.nextLine();

					System.out.println("--------------------");

					boolean sonuc = login(username, password);
					if (sonuc) {
						System.out.println("Uygulamaya basarili olarak giris yaptiniz!");
						break;
					} else {
						if (hakSayisi == 0) {
							aktif = false;
							break;
						}
					}
				}
				if (!aktif) {
					System.out.println("Deneme hakkiniz dolmustur!");
				}

			} else {
				System.out.println("Hak sayiniz doldu, hesabiniz bloke olmustur.");
			}

		} else {
			System.out.println("Hesabiniz aktif degildir, danismaniniz ile gorusunuz!");
		}
		
		scanner.close();

	}

	public static boolean login(String username, String password) { // donduren deger'e boolean kullandigimiz icin
																	// boolean deger dondurmek zorundayiz
		if (username.equals("ihsan") && password.equals("123")) {
			return true;
		} else {
			hakSayisi--;
			System.out.println("Kullanici adiniz veya sifreniz yanlis. Kalan hak sayiniz: " + hakSayisi);
			return false;
		}
	}

}
