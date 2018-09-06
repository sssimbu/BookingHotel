package com.book.hotel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Example {
	Scanner sc = new Scanner(System.in);

	public ArrayList<Integer> BookHotel(int Star, int Days) {
		int Park;
		int Hyaat;
		int Raddisson;
		int RainTree;
		double Accord;
		double Fortune;

		ArrayList<Integer> FiveStar = new ArrayList<Integer>();
		ArrayList<Integer> ThreeStar = new ArrayList<Integer>();
		ArrayList<Integer> OneStar = new ArrayList<Integer>();

		if (Star == 5) {

			if (Days > 2 && Days < 4) {
				Park = 90 * Days;
				int disPark = (Park / 100) * 20;
				Park = Park - disPark;
				FiveStar.add(Park);

				Hyaat = 82 * Days;
				FiveStar.add(Hyaat);

			}

			else if (Days > 3) {
				Hyaat = 82 * Days;
				int disHyaat = Hyaat / 100 * 12;
				Hyaat = Hyaat - disHyaat;
				FiveStar.add(Hyaat);
				// System.out.println("if give 5 Hyaat"+Hyaat);

				Park = 90 * Days;
				int disPark = (Park / 100) * 20;
				Park = Park - disPark;
				FiveStar.add(Park);
				// System.out.println("if give 5 park"+Park);

			} else {
				Park = 90 * Days;
				FiveStar.add(Park);

				Hyaat = 82 * Days;
				FiveStar.add(Hyaat);

			}

			/*
			 * Iterator itr=FiveStar.iterator(); System.out.
			 * println("Available Hotels(5 Star)-->Hotel Park(14) and Hyaat(15) rates are"
			 * ); while(itr.hasNext()){ System.out.println(itr.next());
			 * System.out.println("/"); }
			 */
			for (int i = 0; i < FiveStar.size(); i++) {
				// if (contain.get(i).contains(code.trim())) {<---Use trim it is
				// possible that code may have extra space
				if (i == 0) {
					System.out.println("The Hotel Park(id:14) Rate is-->" + FiveStar.get(i));

				}
				if (i == 1) {
					System.out.println("The Hotel Hyaat(id:14) Rate is-->" + FiveStar.get(i));

				}
				// System.out.println(FiveStar.get(i));
			}

			System.out.println("Enter Hotel id which u need to book");
			int id = sc.nextInt();

			if (id == 14) {

				System.out.println(
						"Hotel Booked for" + Days + "days in 3 star hotel The Raintree for the cost of" + Park);

			}
			if (id == 15) {

				System.out.println(
						"Hotel Booked for" + Days + "days in 3 star hotel The Raddison for the cost of" + Hyaat);

			}
		}
		if (Star == 3) {
			if (Days > 2 && Days < 4) {
				RainTree = 58 * Days;
				int disRainTree = (RainTree / 100) * 15;
				RainTree = RainTree - disRainTree;
				ThreeStar.add(RainTree);

				Raddisson = 60 * Days;
				ThreeStar.add(Raddisson);

				// RainTree=58*Days;
			}

			else if (Days > 3) {
				Raddisson = 60 * Days;
				int disRaddisson = (Raddisson / 100) * 18;
				Raddisson = Raddisson - disRaddisson;
				ThreeStar.add(Raddisson);

				RainTree = 58 * Days;
				int disRainTree = (RainTree / 100) * 15;
				RainTree = RainTree - disRainTree;
				ThreeStar.add(RainTree);

			} else {
				Raddisson = 60 * Days;
				ThreeStar.add(Raddisson);

				RainTree = 58 * Days;
				ThreeStar.add(RainTree);

			}

			/*
			 * Iterator itr1=ThreeStar.iterator(); System.out.
			 * println("Available Hotels(3 Star)-->Hotel Raintree(12) and Raddison(13) rates are"
			 * ); while(itr1.hasNext()){ System.out.println(itr1.next());
			 * System.out.println("/"); }
			 */
			for (int i = 0; i < ThreeStar.size(); i++) {
				// if (contain.get(i).contains(code.trim())) {<---Use trim it is
				// possible that code may have extra space
				if (i == 0) {
					System.out.println("The Hotel Raddison(id:12) Rate is-->" + ThreeStar.get(i));

				}
				if (i == 1) {
					System.out.println("The Hotel  Raintree(id:13)  Rate is-->" + ThreeStar.get(i));

				}
				// System.out.println(FiveStar.get(i));
			}

			System.out.println("Enter Hotel id which u need to book");
			int id1 = sc.nextInt();

			if (id1 == 13) {

				System.out.println(
						"Hotel Booked for" + Days + "days in 3 star hotel The Raintree for the cost of" + RainTree);

			}
			if (id1 == 12) {

				System.out.println(
						"Hotel Booked for" + Days + "days in 3 star hotel The Raddison for the cost of" + Raddisson);

			}

		}

		if (Star == 1) {

			if (Days > 3 && Days < 5) {
				Accord = 41.55 * Days;
				double disAccord = (Accord / 100) * 11.8;
				Accord = Accord - disAccord;
				OneStar.add((int) Accord);

				// Accord=41.55*Days;

				Fortune = 43 * Days;
				OneStar.add((int) Fortune);
			} else if (Days > 4) {
				Fortune = 43 * Days;
				double disFortune = (Fortune / 100) * 14.8;
				Fortune = Fortune - disFortune;
				OneStar.add((int) Fortune);
				System.out.println("Fortune value "+Fortune);

				Accord = 41.55 * Days;
				double disAccord = (Accord / 100) * 11.8;
				Accord = Accord - disAccord;
				OneStar.add((int) Accord);
				System.out.println("Accord value "+Accord);


			}

			else {

				Accord = 41.55 * Days;
				OneStar.add((int) Accord);

				Fortune = 43 * Days;
				OneStar.add((int) Fortune);

			}

			/*
			 * Iterator itr2=OneStar.iterator(); System.out.
			 * println("Available Hotels(1 Star)-->Hotel Accord(id:10) and Fortune(id:11) rates are "
			 * ); while(itr2.hasNext()){ System.out.print(itr2.next()+"/"); }
			 */
			for (int i = 0; i < OneStar.size(); i++) {
				// if (contain.get(i).contains(code.trim())) {<---Use trim it is
				// possible that code may have extra space
				if (i == 0) {
					System.out.println("The Hotel Accord(id:10) Rate is-->" + OneStar.get(i));

				}
				if (i == 1) {
					System.out.println("The Hotel Fortune(id:11) Rate is-->" + OneStar.get(i));

				}
				// System.out.println(FiveStar.get(i));
			}

			System.out.println("Enter Hotel id which u need to book");
			int id2 = sc.nextInt();

			if (id2 == 10) {

				System.out.println(
						"Hotel Booked for" + Days + "days in 1 star hotel The Fortune for the cost of" +Fortune );

			}
			if (id2 == 11) {

				System.out.println(
						"Hotel Booked for" + Days + "days in 1 star hotel The Accord for the cost of" + Accord);

			}

		}

		return FiveStar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Available hotels");
		System.out.println(
				"The Park, 5 star hotel, will cost $90/day, but if customer stays more than 2 days, then customer gets 20% off on total cost.");
		System.out.println(
				"Hotel Hyaat, 5 star hotel, will cost $82/day, but if customer stays more than 3 days, then customer gets 12% off on total cost.");
		System.out.println(
				"Raddisson, 3 star hotel, will cost $60/day, but if customer stays more than 3 days, then customer gets 18% off on total cost.");
		System.out.println(
				"RainTree, 3 star hotel, will cost $58/day, but if customer stays more than 2 days, then customer gets 15% off on total cost.");
		System.out.println(
				"Accord, 1 star hotel, will cost $41.55/day, but if customer stays more than 3 days, then customer gets 11.8% off on total cost.");
		System.out.println(
				"Fortune, 1 star hotel, will cost $43/day, but if customer stays more than 4 days, then customer gets 14.8% on total cost.");

		Scanner sc = new Scanner(System.in);
		System.out.println("How much amount u have?(Minimum 50)");
		int Amount = sc.nextInt();
		if (Amount >= 50) {
			System.out.println("Enter which type of hotel do u want? 5 or 3 or 1 Star hotel");
			int Star = sc.nextInt();
			System.out.println("Enter How many Days do u want? Enter between 1 to 31 Days");
			int Days = sc.nextInt();

			Example obj = new Example();
			obj.BookHotel(Star, Days);

		} else {
			System.out.println("Sorry! you dont have sufficient amount to book any hotel");
		}

	}
}