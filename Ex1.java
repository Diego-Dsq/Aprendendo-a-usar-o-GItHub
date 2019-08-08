package ferias1;

import java.util.Scanner;
import java.util.Random;

public class Ex1 {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] matriz = PreenchimentoDaMatriz();
        apresentarMatriz1(matriz);
        int[][] matrizTransposta = matrizTransposta(matriz);
        apresentarMatriz2 (matrizTransposta);
    }

    static void apresentarMatriz2(int[][] matrizTransposta) {
        for (int i = 0; i < matrizTransposta.length; i++) {
            for (int j = 0; j < matrizTransposta[0].length; j++) {
                System.out.print(matrizTransposta[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void apresentarMatriz1(int[][] matriz) {
        System.out.println("-----------------------------------------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("-----------------------------------------");

    }

    static int[][] PreenchimentoDaMatriz() {
        int linhas, colunas, a;
        Random gerador = new Random();

        System.out.println("Digite a quantidade de linhas: ");
        linhas = ler.nextInt();

        System.out.println("Digite a quantidade de Colunas: ");
        colunas = ler.nextInt();

        int[][] matriz1 = new int[linhas][colunas];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                a = gerador.nextInt(50);
                matriz1[i][j] = a;
            }
        }
        return matriz1;
    }

    static int[][] matrizTransposta(int[][] matriz) {

        int[][] matrizT = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT[0].length; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }
        return matrizT;
    }
}
