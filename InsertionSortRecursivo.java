import java.util.*;

public class InsertionSortRecursivo {

    public static void insertionSort(int[] array, int i, int n){
        int j = i;
		while (j > 0 && array[j] < array[j-1]) {
			int aux = array[j];
			array[j] = array[j - 1];
			array[j - 1] = aux;
			j -= 1;
		}
        System.out.println(Arrays.toString(array));
        if (i + 1 <= n) {
            insertionSort(array, i + 1, n);
        }
        
    }
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] dados = sc.nextLine().split(" ");
        int[] v = new int[dados.length];
        sc.close();
        for (int i = 0; i < v.length; i++) {
            v[i] = Integer.parseInt(dados[i]);
        }
        insertionSort(v, 1, v.length - 1);
    }

}
