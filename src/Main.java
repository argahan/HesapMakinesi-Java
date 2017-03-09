import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double sayi1,sayi2;
		int deger;
		boolean durum=true;
		System.out.println("Yapmak Ýstediðiniz Ýþlemi Seçiniz.");
		System.out.println("1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme\n5-Faktöriyel\n6-Kuvvet\n7-Mutlak Deðer\n8-Kök Bulma\n9-Çýkýþ");
		
		while(durum){
		System.out.print("Hangi Ýslemi Yapmak Ýstiyorsunuz: ");
		deger=input.nextInt();
		
		if(deger==1){
			System.out.print("1. sayiyi giriniz: ");
			sayi1=input.nextDouble();
			System.out.print("2. sayiyi giriniz: ");
			sayi2=input.nextDouble();
			System.out.println("sonuc= "+islem.Toplama(sayi1, sayi2));
		}
		else if(deger==2){
			System.out.print("1. sayiyi giriniz: ");
			sayi1=input.nextDouble();
			System.out.print("2. sayiyi giriniz: ");
			sayi2=input.nextDouble();
			System.out.println("sonuc= "+islem.Cikarma(sayi1, sayi2));
		}
		else if(deger==3){
			System.out.print("1. sayiyi giriniz: ");
			sayi1=input.nextDouble();
			System.out.print("2. sayiyi giriniz: ");
			sayi2=input.nextDouble();
			System.out.println("sonuc= "+islem.Carpma(sayi1, sayi2));
		}
		else if(deger==4){
			System.out.print("1. sayiyi giriniz: ");
			sayi1=input.nextDouble();
			System.out.print("2. sayiyi giriniz: ");
			sayi2=input.nextDouble();
			System.out.println("sonuc= "+islem.Bolme(sayi1, sayi2));
		}
		else if(deger==5){
			System.out.print("faktöriyeli alýnacak sayiyi giriniz: ");
			sayi1=input.nextDouble();
			System.out.println("sonuc= "+islem.Faktoriyel(sayi1));
		}
		else if(deger==6){
			System.out.print("x^n deki x=");
			sayi1=input.nextDouble();
			System.out.print("x^n deki n=");
			sayi2=input.nextDouble();
			System.out.println("sonuc= "+islem.Kuvvet(sayi1, sayi2));
		}
		else if(deger==7){
			System.out.print("mutlak deðeri alýnacak sayiyi giriniz:");
			sayi1=input.nextDouble();
			System.out.println("sonuc= "+islem.Mutlak(sayi1));
		}
		else if(deger==8){
			System.out.print("Kökü alýnacak sayiyi giriniz:");
			sayi1=input.nextDouble();
			System.out.println("sonuc= "+islem.Kok(sayi1));
		}
		else if(deger==9){
			System.out.println("bizi seçtiðiniz için teþekkürler.");
			durum=false;
		}
		else
			System.out.println("hatalý tuþlama yaptýnýz tekrar deneyiniz.");
		}	
	}

}
