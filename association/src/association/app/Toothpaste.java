package association.app;

public class Toothpaste {
	
		public String pasteName;
		public String pasteBrand;
		public Company company;
		public Ingredients[] ingredents;

		public Toothpaste(String pasteName, String pasteBrand, Company company, Ingredients[] ingredents) {
			this.pasteName = pasteName;
			this.pasteBrand = pasteBrand;
			this.company = company;
			this.ingredents = ingredents;
		}

		public void toothPasteMethod() {
			System.out.println("pasteName: " + pasteName);
			System.out.println("pasteBrand: " + pasteBrand);

			company.companyMethod();

			for (int index = 0; index < ingredents.length; index++) {

				Ingredients ingredients = ingredents[index];
				

	}
	}
	}


