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
        int[] a = new int[] {1,13,0,4,5};
        System.out.println(Arrays.toString(two_sum(a,5)));

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
        int[] lista = new int[] { 1, 13, 3, 4, 5, 1};
        System.out.println(tem_repetido(lista));
        lista = new int[] { 1, 13, 3, 4, 5};
        System.out.println(tem_repetido(lista));

        /*
         * Questão 06
         */
        lista = new int[] {4,5,6,1};
        System.out.println(vetorCircular(lista,6));
        lista = new int[] { 3,4,2};
        System.out.println(vetorCircular(lista,8));


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
     * Ordem de Cresciemnto - f(n) = n
     * 
     */

    public static boolean eh_primo(int n){
        for (int i = 2; i < n; i++) {
            if (n%i==0){
                return false;
            }
        }return true;
    }

    /*
     * Questão 05- Escreva um método que receba um array de inteiros não ordenado e verifica existe algum elemento repetido presente no array. Retorne true ou false.
     * Ordem de CRescimento = f(n) = n**2
     */

    public static boolean tem_repetido(int[] v){
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] == v[j]) {
                    return true;
                }
            }
        } return false;
    }

    /*
     * Questão 06- Escreva um método que receba um array inteiros e um inteiro N e retorne uma String que representa a impressão do array de forma circular. Ou seja, quando o último elemento for visitado ele deve voltar para o primeiro e continuar até chegar a N elementos impressos.
     * Ordem de crescimento = f(n) = n**2

     */
    public static String vetorCircular(int[] array, int quantidadeElementos){
        String out =  "";
        int quociente = quantidadeElementos/array.length;
        int resto =  quantidadeElementos%array.length;
        for (int i = 0; i < quociente; i++) {
            for (int j = 0; j < array.length; j++) {
                out += array[j] + " ";
            }
            
        }
        for (int a = 0; a < resto; a++){
            out += array[a] + " ";
        }
        return out.trim();
    }
    

}