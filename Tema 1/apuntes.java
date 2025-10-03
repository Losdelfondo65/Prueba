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
                /*
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         */
        //Conversión Implicita
        // int  sirve  para dar un valor a un número simple
        // double sirve para dar valor a un número decimal
               //entero a double
        //Declara una variable int con un valor cualquiera
        //y asignala a una variable double
        //muestra ambas en pantalla para comprobar el cambio
        int numeroEntero = 42;
        double numeroDouble = numeroEntero;
        System.out.println("Entero: " + numeroEntero );
        System.out.println( "Entero en decimal: " + numeroDouble);
        //Declara una variable short y asginara a una variable int
        short numeroCorto = 5;
        int NumeroEntero = numeroCorto;
        System.out.println("Numero Corto " + numeroCorto + "Numero Entero " + NumeroEntero);
        /*
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        */
        //Primer condicional
        //definicion de variables
        final int NUMERO = 3;
        int numero;
        Scanner sc =new Scanner(System.in);
        System.out.println("Va dime tu numero");

        numero= sc.nextInt();

        //if (condicion)
        if(numero == NUMERO){
            //Todo lo que vaya dentro {.....}se ejecuta
        System.out.println("Felicidades - Has ganado el premio gordo");
        }else{
            //todo lo que vaya dentro de {....}se ejecuta
            System.out.println("Has fallado prueba en la siguiente");
        }
        /*
        *
        *
        *
        */
           char letra1;
    Scanner sc =new Scanner(System.in);
    System.out.println("Dime una letra");

    letra1= sc.nextLine().charAt(0);

    //if (condicion)
    if(letra1 == 'A'){
        //Todo lo que vaya dentro {.....}se ejecuta
    System.out.println("Pista 1");}

    else if(letra1 == 'E'){
        System.out.println("Pista 2");}

    else if(letra1 == 'I'){
        System.out.println("Pista 3");}

    else if(letra1 == 'O'){
        System.out.println("Pista 4");}

    else if(letra1 == 'U'){
        System.out.println("Pista 5");}

    /*
    *
    *
    *
    *
    *
    */
        
    // Laberinto de true o false
    System.out.println("Bienvenido al laberinto");
Scanner primera = new Scanner(System.in);
System.out.println("A que camino quieres ir a la izquierda o a la derecha");
boolean izq;
izq = primera.nextBoolean();
if (izq)  {
    System.out.println("Te encuentras con una puerta cerrada la abres o no");
    Scanner puerta = new Scanner(System.in);
    boolean Door;
    Door = puerta.nextBoolean();
    if (Door) {
        System.out.println("Felicidades has encontrado la salida!!!!");
        
    }
    else if(Door == false){
        System.out.println("Vaya vino una persona por detras y te mato");
    }
        
    }
 else if(izq == false){
    System.out.println("Acabas de encontrar un rio lo cruzas o no");
    Scanner rio= new Scanner(System.in);
    Boolean caida;
    caida = rio.nextBoolean();
    if(caida){
        System.out.println("Conseguiste pasar y te salvaste");   
    }
    else {
        System.out.println("Vaya te moriste");
     
    }
}


