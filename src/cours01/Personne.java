package cours01;

public class Personne {
	private String nom;
	private String prenom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
	}

	public static void main(String[] args) {
		Personne p1 = new Personne();
		p1.nom = "Boulbane";
		p1.prenom = "Soufiane";
		System.out.println(p1);
		Personne p2 = new Personne();
		p2.nom = "Vroman";
		p2.prenom = "Marie-Noël";
		System.out.println(p2);
	}

}



