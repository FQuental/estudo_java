import java.util.Scanner;

public class Imc {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double alt,peso;
        System.out.println("Digite o Peso: "); peso = sc.nextDouble();
        System.out.println("Digite a Altura: "); alt = sc.nextDouble();
        sc.close();
        if((peso/(alt*alt))>= 18.5 && (peso/(alt*alt))<=25)
            System.out.println("Está no peso correto!");
        else System.out.println("Está fora do peso normal");
    }
}
