
public class Livraison {
	private Livreur livreur;
	private Commande commande;
	private double distance;
	
	public Livraison(Livreur livreur, Commande commande, double distance) {
		super();
		this.livreur = livreur;
		this.commande = commande;
		this.distance = distance;
	}
	
	public double calculerMontant() {
		return livreur.calculerFrais(distance);
	}
	
	public void afficherRecapitulatif() {
		System.out.println("informations du livreur : ");
		livreur.afficherDetails();
		System.out.println("nformations de la commande : ");
		System.out.println(commande);
		System.out.println(" distance parcourue : " + distance + "Km");
		System.out.println(" montant de la livraison : " +calculerMontant()+ "DH" );
		
	}
	
	

}
