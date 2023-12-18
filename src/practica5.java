

//ESTA ES UNA PRACTICA ANTERIOR PARA LA UT5 DE ENTORNOS

import java.util.Scanner;


public class practica5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//PEDIMOS 2 NUMEROS
        System.out.println("Introduce el primer número: ");
        int primerNumero = scanner.nextInt();

        System.out.println("Introduce el segundo número: ");
        int segundoNumero = scanner.nextInt();

        //MULTIPLICAMOS LOS NUMEROS Y MOSTRAMOS EL RESULTADO EN PANTALLA

        int resultado = primerNumero * segundoNumero;

        System.out.println("El resultado de la multiplicacion es: " + resultado);
        System.out.println("Hola Soy Alberto Alonso");
        System.out.println("Hola Soy Jose Angel");
    }
}

