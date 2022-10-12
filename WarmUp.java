import java.util.Scanner;

class WarmUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] dados = sc.nextLine().split(" ");
        sc.close();
        String resultado = "";
        for (int i = 0; i < dados.length; i++) {
            resultado += Integer.toString(Integer.parseInt(dados[i])*n) + " ";
        }System.out.println(resultado.trim());

    }
}