import java.util.Scanner;

public class MaiorIdade {
    public static void main(String[] args) throws Exception {
        boolean maiorIdade = false;
        System.out.println("Digte a Idade: ");
        try (Scanner sc = new Scanner(System.in)) {
            int idade = sc.nextInt();
            if(idade>=18){
                maiorIdade = true;
            }
        }
        System.out.println(maiorIdade);
        
    }
}
