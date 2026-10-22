package ders11_nesne_yonelimli_programlama_OOP;

public class CalisanOrnegi {

	public int no;
	
	public String isim;
	
	public String soyisim;
	
	public int tecrube;
	
	public double maas;
	
	
	public CalisanOrnegi() {
		
	}
	// alt + shift + s --> constructor olusturur tum fieldlari parametre olarak alir.
	public CalisanOrnegi(int no, String isim, String soyisim, int tecrube, double maas) {
		this.no = no;
		this.isim = isim;
		this.soyisim = soyisim;
		this.tecrube = tecrube;
		this.maas = maas;
	}
	
	
	public void calisanBilgileriGoster() {
		
		System.out.println("Calisan No: " + no);
		System.out.println("Calisan Isim: " + isim);
		System.out.println("Calisan Soyisim: " + soyisim);
		System.out.println("Calisan Tecrube: " + tecrube);
		System.out.println("Calisan Maas: " + maas);
		
	}
	
	public void zamYap(int zamDegeri) {
		System.out.println("Maasiniza " + zamDegeri + " TL zam yapildi.");
		System.out.println("Su anki guncel maasiniz: " + (maas + zamDegeri));
	}
	
	public void formatAt(String isletimSistemi , String kim) {
		System.out.println(kim + " su anda " + isletimSistemi + " isletim sistemine format atiyor.");
	}

	
	
	

}
