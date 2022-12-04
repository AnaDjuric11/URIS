package prva_vjezba;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		// OOIT - Vjezbe 2.
		
		//Zadatak 1.
		
		/*
		int godine = 73;
		
		if (godine < 18) {
			System.out.println("Osoba je maloljetna.");
		} else if (godine >= 18 & godine < 65) {
			System.out.println("Osoba je punoljetna i sposobna za rad");
		} else {
			System.out.println("Osoba je u penziji.");
		}
		*/
		
		//Zadatak 2.

		/*
		 for(int i=0; i<=30; i++) {
			 if (i % 2 == 0) {
				 System.out.println(i);
				 System.out.println("Ja volim programiranje");
			 }
		 }
		 */
		
		// Zadatak 3.
		
		/*
		for (int i=0; i<10; i++) {
			if (i%5==0) {
				continue;
			}
			System.out.println(i);
		}*/
		
		
		// Zadatak 4.
		
		/*
		for (int i=1; i<=10; i++) {
			System.out.println(i);
			if (i%5==0) {
				break;
			}
		}
		*/
		
		// Zadatak 5.
		
		/*
		int i = 0;
		while (i<=10) {
			System.out.println("Ja volim programiranje");
			i++;	
		}
		*/
		
		// Zadatak 6.
		
		/*
		int i = 0;
		while (i<=10) {
			i++;
			if (i%5 == 0) {
				continue;
			}
			System.out.println(i);
		}
		*/
		
		// URIS - vezbe 2.
		
		// Zadatak 1.
		
		/*
		int prviBroj = 24;
		int drugiBroj = 12;
		
		char operacija = '-';
		
		switch(operacija) {
		
		case '+':
			System.out.println(prviBroj + drugiBroj);
			break;
			
		case '-':
			System.out.println(prviBroj - drugiBroj);
			break;
		
		case '*':
			System.out.println(prviBroj * drugiBroj);
			break;
			
		case '/':
			System.out.println(prviBroj / drugiBroj);
			break;
			
		default:
			System.out.println("Unesite odgovarajuci znak.");
		}
		*/
		
		// Zadatak 2.
		
		/*
		System.out.println("Unesite vrijednost poluprecnika u konzolu");
		Scanner it = new Scanner(System.in);
		int poluprecnik = it.nextInt();
		final double PI = 3.14;
		
		if (poluprecnik <= 0) {
			System.out.println("GRESKA");
		}else if (poluprecnik > 60) {
			System.out.println("Poluprecnik ne moze biti veci od 60");
		} else {
			System.out.println("Aplikacija racuna povrsinu i obim");
		}
		
		double povrsinaKruga = poluprecnik * poluprecnik * PI;
		System.out.println("Povrsina kruga je " + povrsinaKruga);
		double obimKruga = 2* poluprecnik * PI;
		System.out.println("Obim kruga je " + obimKruga);
		*/
		
		// Zadatak 3.
		
		/*
		System.out.println("Unesite broj koji nije veci od 200");
		Scanner number = new Scanner (System.in);
		int broj = number.nextInt();
		
		if (broj>200) {
			System.out.println("Broj ne moze biti veci od 200");
		} else {
			int rezultat = 0;
			for (int i = 0; i<=broj; i = i+2) {
				rezultat +=i;
		}
			System.out.println("Zbir svih parnih brojeva je: " + rezultat);
		}
		*/
		
		// Zadatak 4.
		
		/*
		int zbir = 0;
		for (int i = 2022; i<=2100; i = i+4) {
			if(i == 2022) {
				i = i+2;
				zbir ++;
			}else {
				zbir++;
			}
		}
		System.out.println(zbir);
		*/
		
		//ili
		
		/*
		int zbir = 0;
		for (int i = 2022; i<=2100; i=i+2) {
			if (i%4 == 0) {
				zbir++;
			}
		}
		System.out.println("Broj prestupnih godina je: " + zbir);
		*/
		
		// Zadatak 5.
		
		/*
		for(int i = 1; i<=50; i+=2) {
			System.out.println(i);
			if (i==33) {
				break;
			}
		}
		*/
		
		// OOIT - Predavanja
		
		// Zadatak 1.
		
		/*
		for (int kvadrant = 1; kvadrant < 5; kvadrant ++) {
			for (int zub = 1; zub <9; zub++) {
				System.out.println(kvadrant*10 + zub);
			}
		}
		*/
		
		// Zadatak 2.
		
		/*
		int broj = 5;
		int faktorjel = 1;  // mnozenje 1, sabiranje 0
		while (broj>0) {
			faktorjel = faktorjel * broj;
			broj--;
		}
		System.out.println(faktorjel);
		*/
		
		// Zadatak 3.
		
		/*
		for (int i=10; i<100; i++) {
			if (i%2==1) {
				System.out.println(i);
			}
		}
		*/
		
		// Zadatak 4.
		
		/*
		int[] brojevi = new int [] {5,7,4,2,1}; //int [] brojevi = new int [5]; 
		int proizvod = 1;
		
		for (int i=0; i<brojevi.length; i++) {
			proizvod = proizvod * brojevi[i];
		}
		System.out.println(proizvod);
		*/
		
		// Zadatak 5.
		
		/*
		for (int i=10; i<100; i++) {
			if (i%2==0) {
				System.out.println("Parni " + i);
			}
		}
		*/
		
		// Zadatak 5.
		
		/*
		for (int i=0; i<10; i++) {
			if (i%2 == 0) {
				System.out.println("Parni jednocifreni " + i);
			}
		}
		*/
		
		// Zadatak 6.
		
		/*
		for (int i=0; i<10; i++) {
			if (i%2 !=0) {
				System.out.println("Neparni jednocifreni " + i);
			}
		}
		*/
		
		// OOIT - Zadaci za vjezbanje
		
		// Zadatak 1.
		
		/*
		System.out.println("Unesite dva broja");
		
		Scanner it = new Scanner (System.in);
		int prviBroj = it.nextInt();
		
		Scanner numb = new Scanner (System.in);
		int drugiBroj = numb.nextInt();
		
		int zbir = 0;
		for (int i=prviBroj; i<drugiBroj; i++) {
			if (i%3 == 0) {
				zbir +=i;
			}
		} 
		System.out.println("Zbir brojeva djeljivih sa tri je: " +zbir);
		*/
		
		// Zadatak 3.
		
		/*
		System.out.println("Unesite 10 brojeva");
		
		Scanner input = new Scanner (System.in);
		int[] numbers = new int[10];

	    for (int i = 0; i < numbers.length; i++){
	        
	    	numbers[i] = input.nextInt();
	    } 
	    for (int i: numbers) {
	    	if (i == 33) {
	    		continue;
	    	}else if(i == 7) {
	    		break;
	    	}if (i%2 == 1) {
	    		System.out.println(i*i);
	    	}
	    }
	    */
		
		// Zadatak 4.
		
		/*
		System.out.println("Unesite broj");
		Scanner it= new Scanner(System.in);
		int broj = it.nextInt();
		int faktorjel =1;
		
		while(broj>0) {
			faktorjel*=broj;
			broj--;
		}
		System.out.println("Faktorjel unesenog broja je: " + faktorjel);
		*/
		
		// Zadatak 5.
		
		/*
		System.out.println("Unesite brojeve");
		
		Scanner input = new Scanner (System.in);
		int[] numbers = new int[5];

	    for (int i = 0; i < numbers.length; i++){
	        
	    	numbers[i] = input.nextInt();
	    } 
	    int neparanBr = 0;
	    for (int i: numbers) {
	    	if (i%2==1) {
	    		neparanBr++;
	    	}
	    }
	    System.out.println("Broj neparnih elemenata je: " + neparanBr);
		*/
		
		// Zadatak 6.
		
		/*
		System.out.println("Unesite dva broja, a potom znak za operaciju");
		
		Scanner it = new Scanner (System.in);
		int prviBroj = it.nextInt();
		
		Scanner numb = new Scanner (System.in);
		int drugiBroj = numb.nextInt();
		
		Scanner op = new Scanner (System.in);
		String operacija = op.nextLine();
		
		int zbir = 0;
		int proizvod =1;
		int razlika;
		for (int i=prviBroj; i<drugiBroj; i+=3) {
			if (i%3 == 1) {
				i=i+2;		
			}else if (i%3 == 2){
				i=i+1;
			}
			switch (operacija) {
			case "+":
				System.out.println(zbir+=i);
				break;
			case "*":
				System.out.println(proizvod*=i);
				break;
			case "-":
				System.out.println(razlika = prviBroj-i);
				break;
			}
		} 
		*/
		
		/*
		System.out.println("Unesite dva broja, a potom znak za operaciju");
		
		Scanner it = new Scanner (System.in);
		int prviBroj = it.nextInt();
		
		Scanner numb = new Scanner (System.in);
		int drugiBroj = numb.nextInt();
		
		Scanner op = new Scanner (System.in);
		String operacija = op.nextLine();
		
		int zbir = 0;
		int proizvod =1;
		int razlika;
		int i = prviBroj;

		while (i<drugiBroj) {
			
		if (i%3 == 1) {
			i=i+2;		
		}else if (i%3 == 2){
			i=i+1;
		}else if(i%3 == 0){
			i=i+3;
		}
		
			switch (operacija) {
			case "+":
				System.out.println(zbir+=i);
				break;
			case "*":
				System.out.println(proizvod*=i);
				break;
			case "-":
				System.out.println(razlika = prviBroj-i);
				break;
			}
		} 
		*/
		
		/*
		System.out.println("Unesite broj");
		Scanner number = new Scanner (System.in);
		
		int broj = 0;
		int zbir=0;
		
		while ((broj = number.nextInt()) != 13) {
			zbir = zbir + broj;
			
		}
		System.out.println("Zbir unesenih brojeva je: " +zbir);
		*/
		
		/*
		System.out.println("Unesite broj");
		Scanner it = new Scanner (System.in);
		int broj = it.nextInt();
		
		int brojac = 1;
		int proizvod = 1;
		while (brojac<10) {
			proizvod = broj * brojac;
			System.out.println(proizvod);
			brojac++;
		}
		*/
		
		/*
		System.out.println("Unesite trocifreni broj");
		Scanner it = new Scanner (System.in);
		int broj = it.nextInt();
		
		int a = broj /100;
		int b = broj%10;
		System.out.println("Prva cifra je: " + a + ", a druga cifra je: " +b);
		*/
		
		/* ako zelimo ubaciti ogranicenje za trocifrene brojeve mozemo pomocu
		 uslova: if(broj>=1000 || broj<100)
		 */
		
		/*
		System.out.println("Unesite trocifreni broj");
		Scanner it = new Scanner (System.in);
		int broj = it.nextInt();
		
		int a = broj /100;
		int b = broj%10;
		int c = broj%100/10; // (broj - stotina*100 - jedinica)/10
		System.out.println(a+b+c);
		*/
		
		/*
		System.out.println("Unesite dva broja");
		
		Scanner it = new Scanner (System.in);
		int a = it.nextInt();
		int b = it.nextInt();
		
		int zbir = a+b;
		int razlika = a-b;
		int proizvod = a*b;
		int kolicnik = a/b;
		int ostatak = a%b;
		
		System.out.println("Zbir je: " + zbir + ", razlika je: " + razlika + ", proizvod je: " + proizvod + ", kolicnik je: " + kolicnik + ", a ostatak: " + ostatak);
		*/
		
		/*
		double c;
		
		for (int f=0; f<=200; f=f+100) {
			c= (5/9d)*(f-32);
			System.out.println(c);
		} 
		
		
		int f=200;
		while (f>=0) {
			c= (5/9d)*(f-32);
			System.out.println(c);
			f=f-100;
			
		}
		*/
		
		/*
		System.out.println("Unesite dvocifreni broj");
		
		Scanner it = new Scanner (System.in);
		int a = it.nextInt();
		
		if (a<=9 || a>=100) {
			System.out.println("Niste unijeli dvocifreni broj");
		}else {
			int desetica = a/10;
			int jedinica = a%10;
			String d = String.valueOf(desetica); //String d = Integer.toString(desetica)
			String j = String.valueOf(jedinica);
			System.out.println(j+d);
		}
		*/
		
		/*
		System.out.println("Unesite dva dvocifrena broj");
		
		Scanner it = new Scanner (System.in);
		int a = it.nextInt();
		int b = it.nextInt();
		
		if (a<=9 || a>=100 & b<=9 || b>=100) {
			System.out.println("Niste unijeli dvocifreni broj");
		}else {
			int desetica = a/10;
			int jedinica = a%10;
			String d = String.valueOf(desetica); //String d = Integer.toString(desetica)
			String j = String.valueOf(jedinica);
			String broj = Integer.toString(b);
			System.out.println(d+broj+j);
		}
		*/
		
		//ZADATAK 3 - VEZBE 2 od 0 do 120
		
		/*
				int zbirParnih = 0;
				for(int i=0; i<=6; i= i+2) {
					zbirParnih = zbirParnih+i;
				}
				System.out.println(zbirParnih);
				
				zbirParnih = 0;
				int brojac = 0;
				while(brojac <= 6) {
					zbirParnih = zbirParnih+brojac;
					brojac = brojac +2;
				}
				System.out.println(zbirParnih);
				*/
		/*
		int x = 55; 
		String b = "50";
		String ab = b+x;
		System.out.println(ab);
		char f = ab.charAt(1);
		System.out.println(f);
		*/
		
		/*
		int x = 5;
		boolean iAmCool = true;
		if(x != 5){
		System.out.println(x);
		}
		else if (!iAmCool){
		System.out.println("To boli!");
		}
		else{
		System.out.println("Moje vreme je došlo");
		}
		*/
		
	    
	}
}
