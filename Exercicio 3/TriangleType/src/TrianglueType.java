import java.util.Scanner;

public class TrianglueType {
    public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
                System.out.println("Digite o valor do 1º lado: ");
                int lado1=sc.nextInt();
                System.out.println("Digite o valor do 2º lado: ");
                int lado2=sc.nextInt();
                System.out.println("Digite o valor do 3º lado: ");
                int lado3=sc.nextInt();

       if (lado1 == lado2 && lado2 == lado3 && lado1==lado3){
            System.out.println("É um triangulo Equilatero.");
        }if(lado1!=lado2 && lado1!=lado3 && lado2!=lado3){
            System.out.println("É um triangulo Ecaleno.");
        }if((lado1==lado2&&lado1!=lado3)||(lado2==lado3&&lado2!=lado1)||(lado1==lado3&&lado1!=lado2)){
            System.out.println("É um triangulo Isocele.");
        }
    }
}