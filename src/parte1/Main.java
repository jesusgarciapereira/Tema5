package parte1;

public class Main {

	public static void main(String[] args) {
		CuentaCorriente c1 = new CuentaCorriente("77816487N", "Jesús García Pereira", 345.7);
		
		c1.muestraInformacion();
		System.out.println();
		c1.ingresarDinero(100);
		System.out.println();
		c1.muestraInformacion();
		

	}

}
