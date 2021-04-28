package teste;

public class Tabuada {
	int numero_usuario;
	int calc;
	int numero_m;
	
	void calcular() {
		System.out.println("# Tabuada do " + numero_usuario + "! #");
		while(numero_m <= 10) {
			calc = numero_m * numero_usuario;
			System.out.println("# " + numero_m + " X " + numero_usuario + " = " + calc + " #");
			numero_m = numero_m + 1;
		}
		System.out.println("############## Fim ##############");
		
	}
	
}
