package Operaciones;

import java.util.ArrayList;

public class Operacione {
	
	public ArrayList<Integer> primos(int numero) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		for (int i = numero; i >= 2; i--) {
			if (i != numero) {
				if (numeros.size() != 3) {

					if (esPrimo(i)) {
						numeros.add(i);
					}
				} else {
					return numeros;
				}
			}
		}
		return numeros;
	}

	public int menor(int n1, int n2, int n3) {
		int[] ArrayNumeros = new int[] { n1, n2, n3 };
		int menor = ArrayNumeros[0];
		for (int x = 1; x < ArrayNumeros.length; x++) {
			int numeroActual = ArrayNumeros[x];
			if (numeroActual < menor) {
				menor = numeroActual;
			}
		}
		return menor;

	}

	private Boolean esPrimo(int numero) {
		int contador = 2;
		boolean primo = true;

		while ((primo) && (contador != numero)) {
			if (numero % contador == 0)
				primo = false;
			contador++;
		}
		return primo;
	}


}
