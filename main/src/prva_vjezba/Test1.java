package prva_vjezba;

import java.util.Scanner;



public class Test1 {
	
	public static void funkcija (double broj) {
		
		double cijena;
		if (broj<1000) {
			cijena = broj - broj*0.05;
			System.out.println("Cijena kupljene robe sa popustom je: " + cijena);
		} else if (broj<10000) {
			cijena = broj - broj*0.1;
			System.out.println("Cijena kupljene robe sa popustom je: " + cijena);
		} else if (broj<50000) {
			cijena = broj - broj*0.2;
			System.out.println("Cijena kupljene robe sa popustom je: " + cijena);
		} else if (broj<100000) {
			cijena = broj - broj*0.25;
			System.out.println("Cijena kupljene robe sa popustom je: " + cijena);
		} else {
			cijena = broj - broj*0.3;
			System.out.println("Cijena kupljene robe sa popustom je: " + cijena);
		}
	}
		
	
	
	public static void main(String[] args) {
		funkcija(110000);
	
	}
}
