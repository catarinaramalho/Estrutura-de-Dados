import java.util.Scanner;

public class BuscaLinearRecursiva {
    public static int buscaLinear(int[] array,int n, int i){
        if (array[i] == n){
            return i;
        } else if (i == array.length-1 && array[i]!=n){
            return -1;
        }
        return buscaLinear(array,n,i+1);
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] dados = sc.nextLine().split(" ");
        int[] v = new int[dados.length];
        for (int i = 0; i < v.length; i++) {
            v[i] = Integer.parseInt(dados[i]);
        }
        int n = sc.nextInt();
        sc.close();
        System.out.println(buscaLinear(v,n,0));
    }
}
