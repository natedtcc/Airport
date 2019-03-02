
/*
 *   Nathan Nasteff
 *   Delaware Tech
 *   Spring 2019
 */

public class AirportSimulation {
	static LinkedQueue<Airplane> runway1 = new LinkedQueue<>();
	static LinkedQueue<Airplane> runway2 = new LinkedQueue<>();
	
	static Airplane plane1 = new Airplane("AA", 4992);
	static Airplane plane2 = new Airplane("DL", 1345);
	static Airplane plane3 = new Airplane("AA", 4531);
	static Airplane plane4 = new Airplane("DL", 9873);
	static Airplane plane5 = new Airplane("AA", 3414);
	static Airplane plane6 = new Airplane("DL", 2366);

	public static void main(String[] args) {

		// Commnent/uncomment as needed for testing
		
		// Flights only in runway1
		testCase1();

		// Flights only in runway1
		testCase2();
	
		// Flights in both runways test 1
		//testCase3();
		
		// Flights in both runways test 2
		//testCase4();

		// TODO: Change the following code, so that each runway alternates if there are planes waiting on both runways
		runwayStatus();

//		while (!runway1.isEmpty()) {
//			System.out.println("Dequeueing from runway 1...");
//			runway1.dequeue();
//			runwayStatus();
//		}
//
//		while (!runway2.isEmpty()) {
//			System.out.println("Dequeueing from runway 2...");
//			runway2.dequeue();
//			runwayStatus();
//		}
		
		// TODO: Extra credit - change the code so that runway 1 has priority and can send two flights at a time

	}
	
	public static void runwayStatus() {
		System.out.println("\n\n------------------------------------------------");
		System.out.println("---- Current runway status ---------------------");
		System.out.println("Runway 1: \n" + runway1);
		System.out.println("Runway 2: \n" + runway2);
		System.out.println("------------------------------------------------");
	}
	
	public static void testCase1 () {
		runway1.enqueue(plane1);
		runway1.enqueue(plane2);
		runway1.enqueue(plane3);
		runway1.enqueue(plane4);
		runway1.enqueue(plane5);
		runway1.enqueue(plane6);
	}
	public static void testCase2 () {
		runway2.enqueue(plane1);
		runway2.enqueue(plane2);
		runway2.enqueue(plane3);
		runway2.enqueue(plane4);
		runway2.enqueue(plane5);
		runway2.enqueue(plane6);
	}
	public static void testCase3 () {
		runway1.enqueue(plane1);
		runway1.enqueue(plane2);
		runway1.enqueue(plane3);
		runway2.enqueue(plane4);
		runway2.enqueue(plane5);
		runway2.enqueue(plane6);
	}
	
	public static void testCase4 () {
		runway1.enqueue(plane1);
		runway1.enqueue(plane2);
		runway1.enqueue(plane3);
		runway1.enqueue(plane4);
		runway1.enqueue(plane5);
		runway2.enqueue(plane6);
	}
}
