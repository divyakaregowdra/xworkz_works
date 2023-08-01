package association.app;

public class Sport {
	public String name;
	public Player[] players;

	public Sport(String name, Player[] players) {
		this.name = name;
		this.players = players;

	}

	public void printInfo() {
		System.out.println("Running sports info");
		System.out.println("Name :" + this.name);



		for (int sport = 0; sport < this.players.length; sport++) {
			Player ref = players[sport];
			ref.printInfo();


		}
	}

}
