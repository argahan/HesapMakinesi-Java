import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double sayi1,sayi2;
		int deger;
		boolean durum=true;
		System.out.println("Yapmak �stedi�iniz ��lemi Se�iniz.");
		System.out.println("1-Toplama\n2-��karma\n3-�arpma\n4-B�lme\n5-Fakt�riyel\n6-Kuvvet\n7-Mutlak De�er\n8-K�k Bulma\n9-��k��");
		
		while(durum){
		System.out.print("Hangi �slemi Yapmak �stiyorsunuz: ");
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
			System.out.print("fakt�riyeli al�nacak sayiyi giriniz: ");
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
			System.out.print("mutlak de�eri al�nacak sayiyi giriniz:");
			sayi1=input.nextDouble();
			System.out.println("sonuc= "+islem.Mutlak(sayi1));
		}
		else if(deger==8){
			System.out.print("K�k� al�nacak sayiyi giriniz:");
			sayi1=input.nextDouble();
			System.out.println("sonuc= "+islem.Kok(sayi1));
		}
		else if(deger==9){
			System.out.println("bizi se�ti�iniz i�in te�ekk�rler.");
			durum=false;
		}
		else
			System.out.println("hatal� tu�lama yapt�n�z tekrar deneyiniz.");
		}	
	}

}
