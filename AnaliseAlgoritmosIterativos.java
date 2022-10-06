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

        /*
         * Questão 03
         */
        int[] a = new int[] { 1, 13, 0, 4, 5 };
        System.out.println(Arrays.toString(two_sum(a, 5)));

        /*
         * Questão 04
         */
        int numero = 3;
        System.out.println(eh_primo(numero));
        numero = 15;
        System.out.println(eh_primo(numero));

        /*
         * Questão 05
         */
        int[] lista = new int[] { 1, 13, 3, 4, 5, 1 };
        System.out.println(tem_repetido(lista));
        lista = new int[] { 1, 13, 3, 4, 5 };
        System.out.println(tem_repetido(lista));

        /*
         * Questão 06
         */
        lista = new int[] { 4, 5, 6, 1 };
        System.out.println(vetorCircular(lista, 6));
        lista = new int[] { 3, 4, 2 };
        System.out.println(vetorCircular(lista, 8));

    }

    /*
     * Questão 01 - Escreva um método que receba um array de inteiros e troca os
     * elementos
     * vizinhos. Se o tamanho da sequência for ímpar, troque os vizinhos e mantenha
     * o último elemento em sua posição.
     * ANÁLISE ANALÍTICA:
     * ---- Primitivias ----
     * c1 = int auxiliar = 0
     * c2 = int i = 0
     * c3 = i < v.length - 1
     * c4 = i = i + 2
     * c5 = auxiliar[i] = v[i]
     * c6 = v[i] = v[i + 1]
     * c7 = v[i + 1] = auxiliar
     * ---- Vezes de Execução ----
     * f(n) = c1 * 1 + c2*1 + c3*(n/2 + 1) + c4*n/2 + n *(c5+c6+c7)
     * f(n) = c4*n/2 + c3*n/2 + (c5+c6+c7) * n + c1 + c2 + c3
     * f(n) = n/2(c1+c3) + (c5+c6+c7) * n + c1 + c2 + c3
     * f(n) = n/2 + n + 1
     * ANÁLISE ASSINTÓTICA
     * f(n) = n/2 + n + 1
     * g(n) = n
     * c1 = 1
     * c2 = 3
     * n0 = 1
     * 
     * Formalmente,
     * c1 * n <= n/2 + n + 1 <= c2 * n
     * n <= n/2 + n + 1 <= 3n
     * 
     * Ordem de crescimento linear
     * 
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
     * ANÁLISE ANALÍTICA:
     * ---- Primitivias ----
     * c1 = int i = 0
     * c2 = i < palavra.length / 2
     * c3 = i++
     * c4 = palavra[i] != palavra[palavra.length - i - 1]
     * c5 = return false; === 0
     * c6 = return true
     * 
     * ---- Vezes de Execução ----
     * f(n) = c1 * 1 + c2*((n/2)+1) + c3*(n/2) + c4*n/2 + c6
     * f(n) = (c4+c3)*n/2 + c2*((n/2)+1) + c1 + c6
     * f(n) = n/2 + n/2 + 1
     * f(n) = n + 1
     * 
     * ANÁLISE ASSINTÓTICA
     * f(n) = n + 1
     * g(n) = n
     * c1 = 1
     * c2 = 2
     * n0 = 1
     * 
     * Formalmente,
     * c1 * n <= n + 1 <= c2 * n
     * n <= n + 1 <= 2n
     * 
     * Ordem de crescimento linear
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
     * ANÁLISE ANALÍTICA:
     * ---- Primitivias ----
     * c1 = int i = 0
     * c2 = i < v.length
     * c3 = i++
     * c4 = int j = i + 1
     * c5 = j < v.length
     * c6 = j++
     * c7 = v[i] + v[j] == target
     * c8 = return new int[] { v[i], v[j] }
     * c9 = return new int[0]
     * 
     * ---- Vezes de Execução ----
     * f(n) = c1 + c2*(n+1) + c3*n + n *(c4 + (c5 * n) + c6 * (n - 1) + c7 * (n-1))
     * + c9
     * f(n) = c2 * (n+1) + c3 * n + c4 * n + c5 * n2 + c6 * n2 - c6 * n + c7 * n2 -
     * c7 * n + c9 + c1
     * f(n) = c2 * (n+1) + (c3 + c4 + c6 + c7) * n + (c5 + c6 + c7) * n2 + c9 +c1
     * f(n) = n+1+n+n2+1
     * f(n) = n2 + 2n + 2
     * 
     * ANÁLISE ASSINTÓTICA
     * f(n) = n2 + 2n + 2
     * g(n) = n2
     * c1 = 1
     * c2 = 5
     * n0 = 1
     * 
     * Formalmente,
     * c1 * n2 <= n2 + 2n + 2 <= c2 * n2
     * n2 <= n2 + 2n + 2 <= 5n2
     * 
     * Ordem de crescimento quadrático
     * 
     */

    public static int[] two_sum(int[] v, int target) {
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] + v[j] == target) {
                    return new int[] { v[i], v[j] };
                }
            }
        }
        return new int[0];
    }

    /*
     * Questão 04 - Escreva um método que verifica se um número é primo ou não.
     * ANÁLISE ANALÍTICA:
     * ---- Primitivias ----
     * c1 = int i = 2
     * c2 = i < n
     * c3 = i++
     * c4 = n % i == 0
     * c5 = return false
     * c6 = return true
     * 
     * ---- Vezes de Execução ----
     * f(n) = c1 * 1 + c2*(n+1) + c3*n + c4 *n + c6 * 1
     * f(n) = c2 * (n+1) + (c3 + c4)* n + c1 + c6
     * f(n) = n+1 + n + 1
     * f(n) = 2n + 2
     * 
     * ANÁLISE ASSINTÓTICA
     * f(n) = 2n + 2
     * g(n) = n
     * c1 = 1
     * c2 = 4
     * n0 = 1
     * 
     * Formalmente,
     * c1 * n <= 2n + 2 <= c2 * n
     * n <= 2n + 2 <= 4n
     * 
     * Ordem de crescimento linear
     * 
     */

    public static boolean eh_primo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * Questão 05- Escreva um método que receba um array de inteiros não ordenado e
     * verifica existe algum elemento repetido presente no array. Retorne true ou
     * false.
     * ANÁLISE ANALÍTICA:
     * ---- Primitivias ----
     * c1 = int i = 0
     * c2 = i < v.length
     * c3 = i++
     * c4 = int j = i + 1
     * c5 = j < v.length
     * c6 = j++
     * c7 = v[i] == v[j]
     * c8 = return true ---- não entra no pior caso
     * c9 = return false
     * 
     * ---- Vezes de Execução ----
     * f(n) = c1 * 1 + c2*(n+1) + c3*n + n *(c4 + (c5 * n) + c6 * (n - 1) + c7 *
     * (n-1))
     * + c9
     * f(n) = c2 * (n+1) + c3 * n + c4 * n + c5 * n2 + c6 * n2 - c6 * n + c7 * n2 -
     * c7 * n + c9 + c1
     * f(n) = c2 * (n+1) + (c3 + c4 + c6 + c7) * n + (c5 + c6 + c7) * n2 + c9 +c1
     * f(n) = n+1+n+n2+1
     * f(n) = n2 + 2n + 2
     * 
     * ANÁLISE ASSINTÓTICA
     * f(n) = n2 + 2n + 2
     * g(n) = n2
     * c1 = 1
     * c2 = 5
     * n0 = 1
     * 
     * Formalmente,
     * c1 * n2 <= n2 + 2n + 2 <= c2 * n2
     * n2 <= n2 + 2n + 2 <= 5n2
     * 
     * Ordem de crescimento quadrático
     * 
     */

    public static boolean tem_repetido(int[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] == v[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /*
     * Questão 06- Escreva um método que receba um array inteiros e um inteiro N e
     * retorne uma String que representa a impressão do array de forma circular. Ou
     * seja, quando o último elemento for visitado ele deve voltar para o primeiro e
     * continuar até chegar a N elementos impressos.
     * Ordem de crescimento = f(n) = n**2
     * 
     */
    public static String vetorCircular(int[] array, int quantidadeElementos) {
        String out = "";
        int quociente = quantidadeElementos / array.length;
        int resto = quantidadeElementos % array.length;
        for (int i = 0; i < quociente; i++) {
            for (int j = 0; j < array.length; j++) {
                out += array[j] + " ";
            }

        }
        for (int a = 0; a < resto; a++) {
            out += array[a] + " ";
        }
        return out.trim();
    }

}