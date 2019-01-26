package cours02;

public class Cercle {
	private Point centre;
	private double rayon;
	
	public void agrandit(double facteur) {
		rayon *= facteur;
	}
	
	public Cercle(Point centre, double rayon) {
		this.centre = centre;
		this.rayon = rayon;
	}
	public String toString() {
		String s = "Cercle de centre "+centre.toString()+" et de rayon "+rayon+ " mètres";
		return s;
	}
	public Cercle() {
	}
	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(new Point('C',2,2), 5);
		System.out.println(cercle1);
		cercle1.agrandit(0.5);
		System.out.println(cercle1);
	}


}