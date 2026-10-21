
public class Main {
	public static void main(String[] args) {
		LivreurMoto l1 = new LivreurMoto("E1", "Ali", 10, 4);
		LivreurMoto l2 = new LivreurMoto("E2", "Alia", 8, 2);
		LivreurCamion c1 = new LivreurCamion("E3", "Samir", 15, 0.20);
		LivreurCamion c2 = new LivreurCamion("E3", "Samira", 12, 0.10);

		Livreur[] livreurs = { l1, l2, c1, c2 };

		Commande cmd1 = new Commande("19", "Marrakech");
		Commande cmd2 = new Commande("33", "Rabat");

		l2.setResponsable(l1);
		c1.setResponsable(l1);
		c2.setResponsable(c1);

		for (int i = 0; i < livreurs.length; i++) {
			livreurs[i].afficherDetails();
			System.out.println();
		}

		Livraison L1 = new Livraison(l1, cmd1, 30);
		Livraison L2 = new Livraison(l1, cmd1, 20);
		Livraison L3 = new Livraison(l2, cmd2, 40);
		Livraison L4 = new Livraison(l2, cmd2, 50);

		Livraison[] livraisons = { L1, L2, L3, L4 };

		double total = 0;

		for (int i = 0; i < livraisons.length; i++) {
			livraisons[i].afficherRecapitulatif();
			total = total + livraisons[i].calculerMontant();
			System.out.println();
		}

		System.out.println("Montant total des livraisons : " + total + " DH");

		int nbre = 0;

		for (int i = 0; i < livraisons.length; i++) {
			if (livreurs[i].getResponsable() == l1) {
				nbre++;
			}
		}
		System.out.println("Nombre  de livreurs directement supervisés par le premier livreur à moto  : " + nbre);

	}

}
