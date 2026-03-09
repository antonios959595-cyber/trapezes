package Trapezes;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {

		ArrayList<Trapezes> sinalasomenoi = new ArrayList<>();

		sinalasomenoi.add(new Kratos("Kentriki", 200, "1234", 0));
		//Η φορολογικη κατηγορια την δηλωνεις int που σημαινει ακαιρος αλλα του δινεις 0.15 σαν τιμη
		sinalasomenoi.add(new Idiotes("babis", 100, "2134", 15, 5000, "AE1520"));
		//οι επιχειρησεις δεν εχουν AT
		sinalasomenoi.add(new Epixiriseis("souvlakia", 50, "3134", 0, 325, "ZH4032"));

		Katastima k1 = new Katastima("Athina");
		Katastima k2 = new Katastima("thessaloniki");

		//8a eprepe na eixes mia alli klasi gia tous pelates (8a deis kai ta sxolia meta)
		//Episi i trapeza 8a eprepe na exei katastimata opote meta apo edw 8a perimena kati tou tipou
		//t.add(k1)
		//t.add(k2)
		Trapezes t = new Trapezes("peiraios", 1000, "234323", 0, 42); //ο constructor δεχεται 4 πεδια εσυ του δινεις 5

		//thelw na to kanw kai me allon tropo

		Kratos kr1 = new Kratos("Kentriki", 200, "1234", 0);
		//Η φορολογικη κατηγορια την δηλωνεις int που σημαινει ακαιρος αλλα του δινεις 0.15 σαν τιμη
		Idiotes id1 = new Idiotes("babis", 100, "2134", 15, 5000, "AE1520");
		//οι επιχειρησεις δεν εχουν AT
		Epixiriseis ep1 = new Epixiriseis("souvlakia", 50, "3134", 0, 325, "ZH4032");

		k1.add(kr1);
		k1.add(id1); //ara edw an deis ta sxolia panw apo tin add 8a katalabeiw giati xtipaei o compiler
		k1.add(ep1); //same

		Kratos kr2 = new Kratos("ellas", 100, "2234", 0);
		//Η φορολογικη κατηγορια την δηλωνεις int που σημαινει ακαιρος αλλα του δινεις 0.16 σαν τιμη
		Idiotes id2 = new Idiotes("makis", 230, "2234", 16, 5100, "BE1521");
		//οι επιχειρησεις δεν εχουν AT
		Epixiriseis ep2 = new Epixiriseis("krewpolio", 500, "3144", 0, 432, "KH3232");

		k2.add(kr2);
		k2.add(id2); //same
		k2.add(ep2); //same


		System.out.println("katastima a : " + k1.getName()); //den exeis dimiourgisei ton getter
		System.out.println("katastima b : " + k2.getName());

		// edw kleineis tin main alla sinexizeis ton kwdika

		double synolo1 = 0;

		for (Trapezes t : k1.getPelates()) { //den exeis dimiourgisei ton getter
			synolok1 += t.getYpoloipo(); //typo: synolo1
		}

		double synolo2 = 0;

		//Den mporeis na 3ana xrisimopoiseis to t prepei na to onomaseis diaforetika epeidi to exeis idi stin apo panw for
		//ara 8a eprepe t2 na to peis
		for (Trapezes t : k2.getPelates()) { //den exeis dimiourgisei ton getter
			synolok2 += t.getYpoloipo(); //typo: synolo2
		}

		System.out.println("Ypoloipo katasthmatos : " + k1.getName() + ":" + synolok1); //oute getter kai typo
		System.out.println("Ypoloipo katasthmatos : " + k2.getName() + ":" + synolok2); //oute getter kai typo

		// kai edw to idio ekleines tin main

		double daneiak1 = 0;


		for (
				Trapezes t : k1.getPelates()) { //san ta apo panw
			daneiak1 += t.getDaneia();
		}

		double daneiak2 = 0;

		for (
				Trapezes t : k2.getPelates()) { //san ta apo panw
			daneiak2 += t.getDaneia();
		}

		if (daneak1 > daneiak2) { //typo daneiak1
			System.out.println("katastima" + k1.getName() + "exei perisotera daneia" + daneiak1);
		} else if (daneak2 > daneiak1) { //typo daneak2
			System.out.println("katastima" + k2.getName() + "exei perisotera daneia" + daneiak2);
		} else {
			System.out.println("kai ta 2 katasthmata exoun isa daneia" + daneiak1);
		}
	}

}
