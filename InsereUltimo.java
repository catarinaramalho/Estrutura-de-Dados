import java.util.*;

public class InsereUltimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dados = sc.nextLine().split(" ");
        int j = dados.length-1;
        while (j > 0 && Integer.parseInt(dados[j])<Integer.parseInt(dados[j-1])) {
            String temp = dados[j];
            dados[j] = dados[j-1];
            dados[j-1] = temp;
            j-=1;
        }

        System.out.println(Arrays.toString(dados));
        sc.close();
    }
}
