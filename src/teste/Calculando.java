/**
 * 
 */
package teste;
import java.util.Scanner;

/**
 * @author Felip
 *
 */
public class Calculando {

	public static void main(String[] args){
		Scanner lendo = new Scanner(System.in);
		Tabuada obj1 = new Tabuada();
		System.out.print("Qual tabuada você deseja? ");
		obj1.numero_usuario = lendo.nextInt();
		obj1.calcular();
		
	}
		
}
