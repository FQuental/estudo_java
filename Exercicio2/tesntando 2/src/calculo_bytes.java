public class calculo_bytes {
    public static void main(String[] args) throws Exception {
        byte a = 12;
        byte d = 84;
        short b = 54;
        //int c = 500;

        System.out.println("Valor de byte: " + a);
        d = (byte) (d + a);
        System.out.println("Valor de a+d: " + d);
        b += d;
        System.out.println("Valor de b+d+a: " + b);
        a += d;
    }
}