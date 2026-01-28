package Trapezes;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		ArrayList<Trapezes> sinalasomenoi = new ArrayList<>();
		
		sinalasomenoi.add(new Kratos("Kentriki", 200, "1234", 0));
		sinalasomenoi.add(new Idiotes("babis", 100, "2134", 0.15, 5000, "AE1520"));
		sinalasomenoi.add(new Epixiriseis("souvlakia", 50, "3134", 0,325%, "ZH4032"));
		
		Katastima k1 = new Katastima("Athina");
		Katastima k2 = new Katastima("thessaloniki");
		
		Trapezes t = new Trapezes("peiraios", 1000, "234323", 0,42 );
		
	//thelw na to kanw kai me allon tropo
		
		Kratos kr1 = new Kratos("Kentriki", 200, "1234", 0);
		Idiotes id1 = new Idiotes("babis", 100, "2134", 0.15, 5000, "AE1520");
		Epixiriseis ep1 = new Epixiriseis("souvlakia", 50, "3134", 0,325%, "ZH4032");
		
		k1.add(kr1);
		k1.add(id1);
		k1.add(ep1);
		
		Kratos kr2 = new Kratos("ellas", 100, "2234", 0);
		Idiotes id2 = new Idiotes("makis", 230, "2234", 0.16, 5100, "BE1521");
		Epixiriseis ep2 = new Epixiriseis("krewpolio", 500, "3144", 0,432%, "KH3232");
		
		k2.add(kr2);
		k2.add(id2);
		k2.add(ep2);
		
		
		System.out.println("katastima a : " + k1.getName());
		System.out.println("katastima b : " + k2.getName());
		
	}
	
double synolo1 = 0;
	
	for(Trapezes t : k1.getPelates()) {
		synolok1 +=t.getYpoloipo();
	}
	
double synolo2 = 0;
	
	for(Trapezes t : k2.getPelates()) {
		synolok2 +=t.getYpoloipo();
	}
	
	System.out.println("Ypoloipo katasthmatos : " + k1.getName() + ":" + synolok1);
	System.out.println("Ypoloipo katasthmatos : " + k2.getName() + ":" + synolok2);

}

double daneiak1 = 0; 
     

for(Trapezes t : k1.getPelates()) {
	daneiak1 += t.getDaneia();
	}

double daneiak2 = 0; 

	for(Trapezes t : k2.getPelates()) {
		daneiak2 += t.getDaneia();
		}
	
	if (daneak1 > daneiak2) {
		System.out.println("katastima" + k1.getName() + "exei perisotera daneia" + daneiak1);
	}
	
	else if (daneak2 > daneiak1) {
		System.out.println("katastima" + k2.getName() + "exei perisotera daneia" + daneiak2);
	}
	
	else {
		System.out.println("kai ta 2 katasthmata exoun isa daneia" + daneiak1);
	}
