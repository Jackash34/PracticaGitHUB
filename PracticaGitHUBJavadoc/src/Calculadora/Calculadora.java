package Calculadora;

/**
 * La clase Calculadora contiene las funciones suma, resta, potencia, división y 
 * toString(método que imprime la clase Calculadora).
 * La clase Calculadora tiene dos atributos: op1(operando 1) y op2(operando2). Con estos atributos
 * Se desarrollan las funciones nombradas anteriormente.
 *
 * @author miguel
 *
 */
public class Calculadora {

	double op1;
	double op2;
	
	/**
	 * Método constructor parametrizado de la clase Calculadora.
	 * @param op1 primer operando 1 de la clase calculadora.
	 * @param op2 segundo operando 2 de la clase calculadora.
	 */
	public Calculadora(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	
	/**
	 * Método de la clase Calculadora que suma los operandos.
	 * @return Devuelve el número real resultante de op1+op2.
	 */
	double suma() {
		return op1+op2;
	}
	
	/**
	 * Método de la clase Calculadora que resta los operandos.
	 * @return Devuelve el número real resultante de op1-op2.
	 */
	double resta() {
		return op1-op2;
	}
	
	/**
	 * Método de la clase Calculadora que divide los operandos.
	 * @return Si el segundo operador es 0, se lanza el error IllegalArgumentException("El divisor es 0"). Devuelve el número real resultante de op1/op2.
	 */
	double division() {
		if(op2==0) {
			throw new IllegalArgumentException("El divisor es 0");
		}
		return op1/op2;
	}
	
	//TODO: A�adir la operaci�n potencia, que devuelve
	//op1 elevado a op2 con las siguientes reglas: 
	//-Por convenio cualquier n�mero elevado a 0 es igual a 1.
	//-Un n�mero "n" elevado a una potencia negativa "-p" es igual a 1/(n^p)
	//As� 232^0 = 1; y 2^(-3)=1/2^3=1/8
	
	/**
	 * Método de la clase Calculadora que eleva op1(primer operando) a op2 (segundo operando).
	 * @return Si el segundo operando (op2) es igual a 0, devuelve 1. De otra forma, devuelve el número real resultante de op1^op2.
	 */
	double potencia() {
		if(op2==0){
			return 1;
			
		}else {
			return Math.pow(op1, op2);
		}
	}

	//TODO: A�adir la operacion toString que devuelva los operandos
	//la cadena:
	//"Calculadora de <vuestroNombre>: "
	//"operando1 = <op1>"
	//"operando2 = <op2>"

	/**
	 * Método que imprime la clase Calculadora.
	 */
	public String toString() {
		return "Calculadora de Miguel: " +
			   "\noperando1 = " + op1 +
			   "\noperando2 = " + op2;
	}
}
