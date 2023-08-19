import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String USUARIO = "usuario";
        final String CONTRASENA = "12345";
        boolean USUARIOCORRECTO = false;
        boolean CONTRASENACORRECTA = false;

        while (!USUARIOCORRECTO) {
            System.out.println("Por favor ingrese su nombre de usuario:");
            String entradaUsuario = scanner.nextLine();

            if (entradaUsuario.equals(USUARIO)) {
                USUARIOCORRECTO = true;
            } else {
                System.out.println("Nombre de usuario incorrecto");
            }
        }
        while (!CONTRASENACORRECTA) {
            System.out.println("Por favor ingrese la contraseña");
            String entradaUsuario = scanner.nextLine(); // Cambio 'nextline()' a 'nextLine()'
            if (entradaUsuario.equals(CONTRASENA)) {
                System.out.println("Contraseña correcta, Bienvenido");
                CONTRASENACORRECTA = true;
            } else {
                System.out.println("Contraseña incorrecta");
            }
        }
        scanner.close();
    }
}
