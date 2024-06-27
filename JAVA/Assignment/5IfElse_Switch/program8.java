class TripPlan{

	public static void main(String[] args){

		int budget = 2000;

		switch(budget){

			case 15000:
				System.out.println(budget+ " then plan for Jammu and Kashmir.");
				break;
			case 10000:
				System.out.println(budget+ " then plan for Manali.");
				break;
			case 6000:
				System.out.println(budget+ " then plan for Amritsar.");
				break;
			case 2000:
				System.out.println(budget+ " then plan for Mahabaleshwar.");
				break;

			default:
				System.out.println("For other budget try next time.");
			
		}
	}
}
