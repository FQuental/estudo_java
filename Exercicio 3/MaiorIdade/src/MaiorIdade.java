import java.util.Scanner;

public class MaiorIdade {
    public static void main(String[] args) throws Exception {
        boolean maiorIdade = false;
        System.out.println("Digte a Idade: ");
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        sc.close();
        maiorIdade = idade >= 18;
        System.out.println(maiorIdade);

    }
}
