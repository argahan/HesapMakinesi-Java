
public class islem {
static double  sonuc;


public static double Toplama(double sayi1,double sayi2){
	sonuc=sayi1+sayi2;
	return sonuc;
}
public static double Cikarma(double sayi1,double sayi2){
	sonuc=sayi1-sayi2;
	return sonuc;
}
public static double Carpma(double sayi1,double sayi2){
	sonuc=sayi1*sayi2;
	return sonuc;
}
public static double Bolme(double sayi1,double sayi2){
	sonuc=sayi1/sayi2;
	return sonuc;
}
public static double Faktoriyel(double sayi1){
	double sonuc2=1; 
	for(int i=1;i<=sayi1;i++){
		sonuc2=sonuc2*i;
	}
	return sonuc2;
}
public static double Kuvvet(double sayi1,double sayi2){
	double sonuc2=1; 

for(int i=0;i<sayi2;i++){
	sonuc2=sonuc2*sayi1;
}
	return sonuc2;
}
public static double Mutlak(double sayi1){
	sonuc=Math.abs(sayi1);
	return sonuc;
}

public static double Kok(double sayi1){
	sonuc=Math.sqrt(sayi1);
	return sonuc;
}

}
