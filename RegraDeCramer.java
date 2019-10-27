/*TG*/
package testes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RegraDeCramer {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int vetor[] = new int[12];
		boolean confirmar = true;
//Pegando valores da primeira função
		try {
		System.out.println("Calculador da regra de Cramer");
		System.out.println("Digite o X1: ");
		vetor[0] = leitor.nextInt();
		System.out.println("Digite o Y1: ");
		vetor[1] = leitor.nextInt();
		System.out.println("Digite o Z1: ");
		vetor[2] = leitor.nextInt();
		System.out.println("Digite o resultado da primeira função: ");
		vetor[3] = leitor.nextInt();
//Pegando valores da segunda função		
		System.out.println("Digite o X2: ");
		vetor[4] = leitor.nextInt();
		System.out.println("Digite o Y2: ");
		vetor[5] = leitor.nextInt();
		System.out.println("Digite o Z2: ");
		vetor[6] = leitor.nextInt();
		System.out.println("Digite o resultado da segunda função: ");
		vetor[7] = leitor.nextInt();
//Pegando valores da terceira função		
		System.out.println("Digite o X3: ");
		vetor[8] = leitor.nextInt();
		System.out.println("Digite o Y3: ");
		vetor[9] = leitor.nextInt();
		System.out.println("Digite o Z3: ");
		vetor[10] = leitor.nextInt();
		System.out.println("Digite o resultado da terceira função: ");
		vetor[11] = leitor.nextInt();
		}catch(InputMismatchException ie) {
			System.out.println("Digite numeros porra!");
			
		}
//Pegando valores das diagonais e multiplicando		
		int diagonal1 = (vetor[0] * vetor[5] * vetor[10]);
		int diagonal2 = (vetor[1] * vetor[6] * vetor[8]);
		int diagonal3 = (vetor[2] * vetor[4] * vetor[9]);
		int diagonalMultiplicacao = (diagonal1 + diagonal2 + diagonal3);
// Pegando valores das diagonais e multiplicando
		int diagonal4 = (vetor[1] * vetor[4] * vetor[10]);
		int diagonal5 = (vetor[0] * vetor[6] * vetor[9]);
		int diagonal6 = (vetor[2] * vetor[5] * vetor[8]);
		int diagonalMultiplicacao2 = (diagonal4 + diagonal5 + diagonal6);
//Somando valores das diagonais e descobrindo determinante
		int determinante = (diagonalMultiplicacao - diagonalMultiplicacao2);
		// Calculando Dx1
		int diagonaldx1 = (vetor[3] * vetor[5] * vetor[10]);
		int diagonaldx2 = (vetor[1] * vetor[6] * vetor[11]);
		int diagonaldx3 = (vetor[2] * vetor[7] * vetor[9]);
		int diagonalMultiplicacaodx1 = (diagonaldx1 + diagonaldx2 + diagonaldx3);
		// Calculando Dx2
		int diagonaldx4 = (vetor[1] * vetor[7] * vetor[10]);
		int diagonaldx5 = (vetor[3] * vetor[6] * vetor[9]);
		int diagonaldx6 = (vetor[2] * vetor[5] * vetor[11]);
		int diagonalMultiplicacaodx2 = (diagonaldx4 + diagonaldx5 + diagonaldx6);
		// Somando valores das diagonais dx e descobrindo DX
		int determinantedx = (diagonalMultiplicacaodx1 - diagonalMultiplicacaodx2);
		// Calculando Dy1
		int diagonaldy1 = (vetor[0] * vetor[7] * vetor[10]);
		int diagonaldy2 = (vetor[3] * vetor[6] * vetor[8]);
		int diagonaldy3 = (vetor[2] * vetor[4] * vetor[11]);
		int diagonalMultiplicacaody1 = (diagonaldy1 + diagonaldy2 + diagonaldy3);
		// Calculando Dy2
		int diagonaldy4 = (vetor[3] * vetor[4] * vetor[10]);
		int diagonaldy5 = (vetor[0] * vetor[6] * vetor[11]);
		int diagonaldy6 = (vetor[2] * vetor[7] * vetor[8]);
		int diagonalMultiplicacaody2 = (diagonaldy4 + diagonaldy5 + diagonaldy6);
		// Somando valores das diagonais dy e descobrindo DY
		int determinantedy = (diagonalMultiplicacaody1 - diagonalMultiplicacaody2);
		// Calculando Dz1
		int diagonaldz1 = (vetor[0] * vetor[5] * vetor[11]);
		int diagonaldz2 = (vetor[1] * vetor[7] * vetor[8]);
		int diagonaldz3 = (vetor[3] * vetor[4] * vetor[9]);
		int verticalMultiplicacaodz1 = (diagonaldz1 + diagonaldz2 + diagonaldz3);
		// Calculando Dz2
		int diagonaldz4 = (vetor[1] * vetor[4] * vetor[11]);
		int diagonaldz5 = (vetor[0] * vetor[7] * vetor[9]);
		int diagonaldz6 = (vetor[3] * vetor[5] * vetor[8]);
		int diagonalMultiplicacaodz2 = (diagonaldz4 + diagonaldz5 + diagonaldz6);
		// Somando valores das diagonais dz e descobrindo DZ
		int determinantedz = (verticalMultiplicacaodz1 - diagonalMultiplicacaodz2);
		//Calculando valores de X,Y,Z
		try {
		int x = (determinantedx / determinante);
		int y = (determinantedy / determinante);
		int z = (determinantedz / determinante);
		System.out.printf("\n------------------\nDeterminante = %d\n"
				+ "------------------\n"
				+ "DX = %d\nDY = %d\nDZ = %d\n------------------\n"
				,determinante,determinantedx,determinantedy,determinantedz);
		System.out.printf("Logo:\nX = %d\nY = %d\nZ = %d\n",x, y, z);
		}
		catch(ArithmeticException ex) {
			System.out.println("O determinante da matriz principal é zero.\n"
					+ " Isto significa que o Sistema de equações lineares é\n"
					+ " inconsistente ou tem soluções infinitas. O método \n"
					+ "de eliminação Gauss-Jordan vai ajudar a obter a\n"
					+ " resposta completa.");
		}catch(NullPointerException np) {
			System.out.println("Erro! Determinante é nulo");
		}
		
	}
}
