package ders12_kapsulleme;

import java.util.Random;

public class TCKN {

	private long id;

	private String dogumYeri;

	private String tckn;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDogumYeri() {
		return dogumYeri;
	}

	public void setDogumYeri(String dogumYeri) {
		this.dogumYeri = dogumYeri;
	}

	public String getTckn() {
		return tckn;
	}

	boolean kontrol = true;

	public void setTckn(String tckn) {
		if (tckn.length() == 11) {
			for (int i = 0; i < tckn.length(); i++) {
				char karakter = tckn.charAt(i);
				if (Character.isDigit(karakter)) {
					kontrol = true;
				} else {
					kontrol = false;
					break;
				}
			}

			if (kontrol) {
				
				// Random rastgele deger uretmek icin kullanilan bir siniftir.
				Random random = new Random();
				int giseNo = random.nextInt(100); // random.nextInt(Bount) 0 - 100 arasinda rastgele bir deger uretir.
				sonucYazdir("Gise No: " + giseNo);

			} else {
				sonucYazdir("TCKN sadece rakamlardan olusmalidir.");
			}

		} else {
			sonucYazdir("TC 11 karakter olmak zorundadir.");
		}
	}

	public void sonucYazdir(String sonuc) {
		System.out.println(sonuc);
	}

}
