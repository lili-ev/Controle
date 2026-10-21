
public abstract class Livreur {
	protected String identifiant;
	protected String nom;
	protected double tarifKm;
	protected Livreur responsable;

	public Livreur(String identifiant, String nom, double tarifKm) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.tarifKm = tarifKm;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public String getNom() {
		return nom;
	}

	public abstract double calculerFrais(double distance);

	public void afficherDetails() {
		System.out.println("identifiant : " + identifiant);
		System.out.println("nom : " + nom);
		System.out.println("tarifKm : " + tarifKm);
	}

	public Livreur getResponsable() {
		return responsable;
	}

	public void setResponsable(Livreur responsable) {
		if (responsable != this) {
			this.responsable = responsable;
		}
	}

}
