package test;
import modelo.Cola;
public class ColaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cola c = new Cola();
		
		c.encolar(1, 1);
		c.encolar(2, 11);
		c.encolar(3, 5);
		c.encolar(4, 0);
		
		System.out.println(c);
		
	}

}
