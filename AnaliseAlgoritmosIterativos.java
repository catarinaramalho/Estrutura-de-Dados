import java.util.Arrays;

public class AnaliseAlgoritmosIterativos {
    public static void main(String[] args) {
        /*
         * Questão 01
         */
        int[] v1 = new int[] { 1, 13, 3, 4, 5 };
        troca_vizinhos(v1);
        int[] v2 = new int[] { 1, 13, 3, 4 };
        troca_vizinhos(v2);
        System.out.println(Arrays.toString(v1));
        System.out.println(Arrays.toString(v2));
        /*
         * Questão 02
         */
        char[] v = new char[] { '1', '2', '1' };
        System.out.println(eh_palindromo(v));
        char[] b = new char[] { '1', '2', '3', '4' };
        System.out.println(eh_palindromo(b));

    }

    /*
     * Questão 01 - Escreva um método que receba um array de inteiros e troca os
     * elementos
     * vizinhos. Se o tamanho da sequência for ímpar, troque os vizinhos e mantenha
     * o último elemento em sua posição.
     * Ordem de Cresciemnto - f(n) = n
     */
    public static void troca_vizinhos(int[] v) {
        int auxiliar = 0;
        for (int i = 0; i < v.length - 1; i = i + 2) {
            auxiliar = v[i];
            v[i] = v[i + 1];
            v[i + 1] = auxiliar;
        }
    }

    /*
     * Questão 02 - Uma palavra ou frase é um palíndromo caso possa ser lida tanto
     * da esquerda para a direita, como da direita para a esquerda, sem alterar seu
     * sentido. Escreva um método que receba um array de char, representando uma
     * palavra, e retorna um boolean. O método deve retornar true, caso a palavra
     * seja um palíndromo, e false, caso o contrário.
     * 
     * Ordem de Cresciemnto - f(n) = n
     */

    public static boolean eh_palindromo(char[] palavra) {
        for (int i = 0; i < palavra.length / 2; i++) {
            if (palavra[i] != palavra[palavra.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    /*
     * Questão 03 - Escreva um método que receba um array de inteiros e um inteiro,
     * target. O método deve retornar um array de duas posições contendo um par de
     * inteiros distintos cuja soma seja igual ao valor target, caso não exista um
     * par, retorna array vazio.
     * Ordem de Cresciemnto - f(n) = n**2
     * 
     */

    public int[] two_sum(int[] v, int target) {
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] + v[j] == target) {
                    return new int[] { v[i], v[j] };
                }
            }
        }
        return new int[0];
    }

}