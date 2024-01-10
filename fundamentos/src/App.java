public class App {
    public static void main(String[] args) throws Exception {

        //dados do tipo inteiro

        byte v1 = 50;
        short v2 = 10;
        int v3 = -8;
        long v4= 12;

        System.out.println("Byte: " + Byte.MIN_VALUE + " a "  + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.MIN_VALUE + " a "  + Short.MAX_VALUE);
        System.out.println("Integer: " + Integer.MIN_VALUE + " a "  + Integer.MAX_VALUE);
        System.out.println("Long: " + Long.MIN_VALUE + " a "  + Long.MAX_VALUE);

        System.out.println("\n");


        //dados do tipo flutuante

        float num = 58.12f;
        double num2 = 25.48;

        System.out.println("Float: " + Float.MIN_VALUE + " a "  + Float.MAX_VALUE);
        System.out.println("Double: " + Double.MIN_VALUE + " a "  + Double.MAX_VALUE);

        //dado do tipo caractere

        char letra = 'a';
        boolean desconto = true;
        
    }
}
