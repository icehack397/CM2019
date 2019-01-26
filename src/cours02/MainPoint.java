package cours02;

public class MainPoint {
	public double abscisse, ordonnee;
	
	public static void main(String[] args) {
		Point a = new Point('A',2,3);
		System.out.println(a);
		a.translate(2, 6);
		System.out.println(a);
		
		
	}

}