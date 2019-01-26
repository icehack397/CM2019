package cours01;

public class Animal {
	private String nom;
	private int age;
	private int poids;
	private int taille;
	private String couleur;

	public String toString() {
		return "Animal [nom=" + nom + ", age=" + age + ", poids=" + poids + ", taille=" + taille + ", couleur="
				+ couleur + "]";
	}

	public static void main(String[] args) {
		Animal chat = new Animal();
		chat.nom = "felix";
		chat.age = 5;
		chat.poids = 3;
		chat.taille = 50;
		chat.couleur = "rouge";
		System.out.println(chat);
		Animal chien = new Animal();
		chien.nom = "milou";
		chien.age = 7;
		chien.poids = 8;
		chien.taille = 80;
		chien.couleur = "blanc";
		System.out.println(chien);
	}

	public Animal() {
	}
}