import java.util.Scanner;

class ElementosDuplicados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dados = sc.nextLine().split(" ");
        sc.close();
        for (int i = 0; i < dados.length; i++) {
            for (int j = 0; j < dados.length; j++) {
                if (j!=i && dados[i].equals(dados[j])){
                    System.out.println("true");
                    System.exit(0);
                }
            }
        }System.out.println("false");

    }
}