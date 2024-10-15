import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

        
        System.out.println("Ingrese numero a,b y c");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int numero = encontrarMayor(a,b,c);
        System.out.println("El número mayor es: " + numero);
    }
}

    public static int encontrarMayor(int a, int b, int c) {
        if (a>b & a>c){
            return a;
        } else if (b>a & b>c){
            return b;
        } else {
            return c;
        }
    }
}