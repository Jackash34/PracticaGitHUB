package Calculadora;

/**
 * La clase Programa contiene el main del programa. Desde esta clase se pueden generar calculadoras mediante
 * el constructor parametrizado de la clase Calculadora.
 * La clase Programa es también la clase encargada de ejecutar la aplicación.
 * @author miguel
 *
 */
public class Programa {
	
	/**
	 * Este es el main desde donde se inicia el programa y se realizan las pruebas pertinentes para 
	 * comprobar la funcionalidad de la clase Calculadora.
	 * @param args
	 */
	public static void main(String[] args) {
		//TODO: Crear un programa principal que 
		//utilice todas las funciones de la calculadora
		//Incluida las operaciones toString y la potencia
		//que habr�is a�adido.
		//Ejecutadlo.
		
		Calculadora calculadora = new Calculadora(5, 7);
		
		System.out.println(calculadora.suma());
		System.out.println(calculadora.resta());
		System.out.println(calculadora.division());
		System.out.println(calculadora.potencia());
		System.out.println(calculadora);
		
		Calculadora calculadora2 = new Calculadora(5, 0);
		System.out.println(calculadora2.potencia());
		
		Calculadora calculadora3 = new Calculadora(2, -3);
		System.out.println(calculadora3.potencia());
		
	}
}
