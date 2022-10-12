import java.util.Scanner;

public class EncontraPrimeiroNegativo {
    public static String encontraPrimeiroNegativo(String[] array, int i){
        if (Integer.parseInt(array[i]) < 0){
            return array[i];
        } else if (i == array.length-1 && Integer.parseInt(array[i]) > 0){
            return "-";
        }
        return encontraPrimeiroNegativo(array,i+1);
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] dados = sc.nextLine().split(" ");
        sc.close();
        System.out.println(encontraPrimeiroNegativo(dados,0));
    }
}
