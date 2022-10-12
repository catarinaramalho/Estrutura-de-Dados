import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortRecursivo {

    public static void selectionSort(int[] array, int index){
        if (array.length - 1 == index){
            return;
        }
        
        int indexMenor = index;
        for (int j = index+1; j < array.length; j++) {
            if (array[j]<array[indexMenor]){
                indexMenor = j;
            }
        }
        int temp = array[index];
        array[index] = array[indexMenor];
        array[indexMenor] = temp;
        System.out.println(Arrays.toString(array));
        selectionSort(array, index+1);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dados = sc.nextLine().split(" ");
        int[] v = new int[dados.length];
        sc.close();
        for (int c = 0; c < v.length; c++) {
            v[c] = Integer.parseInt(dados[c]);
        }
        selectionSort(v, 0);
        
    }

}
