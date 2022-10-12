import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortPassoAPasso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dados = sc.nextLine().split(" ");
        int[] v = new int[dados.length];
        sc.close();
        for (int c = 0; c < v.length; c++) {
            v[c] = Integer.parseInt(dados[c]);
        }
        for(int i = 0; i < v.length; i++){
            int indexMenor = i;
            boolean trocou = false;
            for (int j = i+1; j < v.length; j++) {
                if (v[j]<v[indexMenor]){
                    indexMenor = j;
                    trocou = true;
                }
            }
            int temp = v[i];
            v[i] = v[indexMenor];
            v[indexMenor] = temp;
            if (trocou){
                System.out.println(Arrays.toString(v));
            }
           
        }   
    }

}
