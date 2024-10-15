import java.util.Scanner;
public class pasovalor {
    public static void main(String[] args) {
        try( Scanner scanner = new Scanner(System.in)){
            System.out.println("Ingrese nombre");
            String name = scanner.nextLine();
            System.out.println("Valor despues de cambiar nombre" + name);
            cambiarValor(name);

        }
    }
    public static void cambiarValor(String Name) {
        String Name = "hoy gana la selec";
        System.out.println("dentro cambiando nombre" + Name);
        
    }
}
