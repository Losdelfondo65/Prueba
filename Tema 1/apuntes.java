import java.util.Scanner;
// poner esta información siempre que se utilice el Scanner porque sino no funciona
public class apuntes {
    public static void main(String[] args) throws Exception {
        // escribimos aqui nuestro código

        // necesito el valor del lado

        double ladoCuadrado = 6.2;
        double resultado ;
        // el resultado es lado al cuadrado
        resultado = ladoCuadrado + ladoCuadrado;
        System.out.println("El resultado del área del cuadrado es");
        System.out.println(resultado);
        Scanner scanner = new Scanner(System.in);
        int numero;
        // scanner.nextIN(); para pedir el numero entero al usuario
        System.out.println("Introduce el numero");
        numero = scanner.nextInt();
        System.out.println("Has escrito el " + numero + " pez");
        // importante poner + para que funcione tanto antes como despues

        /*
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         */

        // Para hacer un programa que funcione que nos diga diferentes datos deberemos de introducir esto
        
        System.out.println("Buenas, Usuario comuniqueme los siguientes datos");
        Scanner nombre = new Scanner(System.in);
        System.out.println("¿Como te llamas?");
        String nombrePersona = nombre.nextLine();

        // EL String se utiliza cuando hay que utilizar texto

        Scanner apellidos = new Scanner(System.in);
        System.out.println("¿Como te apellidas?");
        String apellidosPersona = apellidos.nextLine();

        Scanner postal = new Scanner(System.in);
        System.out.println("¿Cuál es tu código postal?");
        int respuestaPostal = postal.nextInt();

        // El int se utiliza cuando hay que utilizar numeros

        Scanner Calle = new Scanner(System.in);
        System.out.println("Dime tu calle");
        String nombreCalle = Calle.nextLine();

        Scanner numeroScanner = new Scanner(System.in);
        System.out.println("¿Que numero es?");
        int numeroCalle = numeroScanner.nextInt();

        Scanner numeroPiso = new Scanner(System.in);
        System.out.println("¿Dime que numero de piso tienes?");
        int numeroPuerta = numeroPiso.nextInt();

        Scanner letraPiso = new Scanner(System.in);
        System.out.println("¿Que letra es?");
        String piso = letraPiso.nextLine();

        Scanner localidad = new Scanner(System.in);
        System.out.println("¿En que localidad resides?");
        String ciudad = localidad.nextLine();

        System.out.println("Tu nombre es " + nombrePersona + " te apellidas " + apellidosPersona + " tu código postal es " + respuestaPostal + " Vives en la calle " + nombreCalle + " el numero de la calle es " + numeroCalle + " el numero de piso es " + numeroPuerta + " con letra " + piso + " y resides en " + ciudad);
  
    }
}
