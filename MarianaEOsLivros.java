import java.util.*;

public class MarianaEOsLivros {

    public static void insertionSort(String[] array, int i, int n){
        int j = i;
		while (j > 0 && array[j].compareTo(array[j-1]) < 0) {
			String aux = array[j];
			array[j] = array[j - 1];
			array[j - 1] = aux;
			j -= 1;
		}
        String out = "";
        for (int k = 0; k < array.length-1; k++) {
            out += array[k] + ", ";
        }
        out += array[array.length-1];
        System.out.println(out);
        if (i + 1 <= n) {
            insertionSort(array, i + 1, n);
        }
        
    }
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] dados = sc.nextLine().split(",");
        sc.close();
        insertionSort(dados, 0, dados.length);
    }

}
