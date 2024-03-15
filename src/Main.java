import javax.sound.midi.Soundbank;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        // int[] arreglo = new int[]{1,2,3,4,5,6,7,8,9,10}; // declaracio de arreglo



        ejercicio5();


    }

    public static void ejercicio5(){

        Scanner scan = new Scanner(System.in); // se crea el scanner
        System.out.println("ejercicio numero 5 ");
        int valor = 1;
        boolean respuesta;
        while(valor!=0) {  // se verifica si el valor ingresadop es primo o no. al ingresar un 0 se da fin a la funcion


            System.out.println("ingresar un valor para ver si es primo o un 0 para salir ");
            valor = scan.nextInt();
            if (valor != 0) {
                respuesta = esPrimo(valor);
                System.out.println("el valor " + valor + " es primo? " + respuesta);

            }

        }


    }

    public static  void ejercicio4(){
        Scanner scan = new Scanner(System.in); // se crea el scanner
        System.out.println("ejercicio numero 4 \n ingresar un valor : ");
        int numEjercicio4 = scan.nextInt(); // se crea a variable donde se almacena el scanner.
        scan.close();
        ejercicio3(numEjercicio4);

    }

    public static void ejercicio3(int cantidad){

        System.out.println("ejercicio 3");

        int contador = 0;
        int numero = 2;

        while(contador<cantidad){
            if(esPrimo(numero)){

                System.out.println(numero + " ");
                contador++;
            }
            numero++;
        }

    }
    // complemento de ejercicio 3
    public static boolean esPrimo(int numero){
        boolean respuesta = true;
        if(numero<=1){
            respuesta = false;
        }
        for(int i = 2 ; i<=Math.sqrt(numero); i++){ // Math. sqrt devuelve la raíz cuadrada de un número
            if(numero%i == 0){
                respuesta = false;
            }

        }

        return respuesta;

    }

    // ------------
    public static void ejercicio2(int valor){

        System.out.println("ejercicio 2");

        if(valor%2 == 0){ // % modulo
            System.out.println("es par");
        }else{
            System.out.println("es impar");

        }

    }

    public static float ejercicio1(int arreglo[]){

        System.out.println("ejercicio 1");

        float promedio = 0;
        for(int i = 0; i <arreglo.length ; i++){ // el .length es para tener la cantidad de elementos que tiene un arreglo son la necesidad de tener los validos de un arreglo

            promedio += arreglo[i]; // el =+ es acumulativo


        }


        return promedio = promedio/10; // se tiene que tener un solo return por cada funcion



}

}