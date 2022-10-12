import java.util.Scanner;

public class PotenciaRecursiva {
    public static int potencia(int num1, int num2){
        if (num2 == 0){
            return 1;
        }
        return potencia(num1, num2-1)*num1;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        System.out.println(potencia(num1, num2));
    }
}

