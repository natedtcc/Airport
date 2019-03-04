
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
	static Airplane plane7 = new Airplane("AA", 4992);
	static Airplane plane8 = new Airplane("DL", 8335);
	static Airplane plane9 = new Airplane("AA", 5631);
	static Airplane plane10 = new Airplane("DL", 6643);
	static Airplane plane11 = new Airplane("AA", 3334);
	static Airplane plane12 = new Airplane("DL", 1546);
	static Airplane plane13 = new Airplane("AA", 9924);

	public static void main(String[] args) {

		// Commnent/uncomment as needed for testing
		//testCase1();
		// Flights only in runway1
		// testCase2();
		// Flights in both runways test 1
		//testCase3();
		// Flights in both runways test 2
		//testCase4();

		testCase5();
		runwayStatus();

		/* Air Traffic Logic - Extra credit attempt
		Sends two planes from runway one, then sends
		one plane from runway two.
		 */


		while (!runway1.isEmpty() || !runway2.isEmpty()) {
			if(!runway1.isEmpty()) {
				System.out.println("Departing from runway 1...");
				runway1.dequeue();
				runway1.dequeue();
			}
			if(!runway2.isEmpty()) {
				System.out.println("Departing from runway 2...");
				runway2.dequeue();
			}

			runwayStatus();
		}



	}
	
	public static void runwayStatus() {
		System.out.println("\n------------------------------------------------");
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

	/* Added a test case with 13 planes,
		9 on runway one and 4 on runway
		two.
	 */

	public static void testCase5 () {
			runway1.enqueue(plane1);
			runway1.enqueue(plane2);
			runway1.enqueue(plane3);
			runway1.enqueue(plane4);
			runway1.enqueue(plane5);
			runway1.enqueue(plane6);
			runway1.enqueue(plane7);
			runway1.enqueue(plane8);
			runway1.enqueue(plane9);
			runway2.enqueue(plane10);
			runway2.enqueue(plane11);
			runway2.enqueue(plane12);
			runway2.enqueue(plane13);
	}
}
