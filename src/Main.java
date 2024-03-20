import java.util.Random;
import java.util.Scanner;

/*
Ejercicio nº1: Calcular el promedio de un arreglo de números enteros. Realizar variantes con arreglos ya inicializados e ingreso por teclado.
Ejercicio nº2: Calcular si un número es par o no.
Ejercicio nº3: Mostrar los primeros 100 números primos.
Ejercicio nº4: Mostrar los primeros n números primos.
Ejercicio nº6: Ingresar un número o tantos como quiera el usuario y revisar si es primo.
Ejercicio nº7: Encontrar la suma de los primeros 10 números naturales.
Ejercicio nº8: Sumar (en cantidad, no acumular) cuántos números positivos ingresa un usuario.
Ejercicio nº9: Revisar si un año es bisiesto o no.
Ejercicio nº10: Encontrar el valor ASCII de un carácter.
Ejercicio nº11: Multiplicar dos números.
Ejercicio nº12: Realizar un programa que le pregunte al usuario que área desea calcular. Las opciones son: rectángulo, cuadrado, triangulo y circulo.
Ejercicio nº13: Programa que lea un nombre y muestre por pantalla: “Buenos dias nombre_introducido”.
Ejercicio nº14: Escribir un programa que lea un número entero por teclado y obtenga y muestre por pantalla el doble y el triple de ese número.
Ejercicio nº15: Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:  F = 32 + ( 9 * C / 5)
Ejercicio nº16: Programa que lea por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el área de la circunferencia. Investigar el uso de la librería Math.
Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2
Ejercicio nº17: Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
Ejercicio nº18: Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras.
Ejercicio nº19: Programa lea 30 temperaturas correspondientes a un mes y calcule el maximo, el minimo y el promedio.
Ejercicio nº20:Pide por teclado dos números y genera 10 números aleatorios entre esos números. Usa el método Math.random para generar un número entero aleatorio
Ejercicio nº21:  Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello.
Ejercicio nº22: Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el número de cifras que tiene. Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras. Tendremos que controlar si tiene una o más cifras, al mostrar el mensaje.
Ejercicio nº23:  Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y un signo aritmético (String), según este último se realizará la operación correspondiente. Al final mostrara el resultado en un cuadro de diálogo.
Los signos aritméticos disponibles son:
+: suma los dos operandos.
-: resta los operandos.
*: multiplica los operandos.
/: divide los operandos, este debe dar un resultado con decimales (double)
^:  1º operando como base y 2º como exponente.
%:  módulo, resto de la división entre operando1 y operando2.

Ejercicio nº23: Pide por teclado el nombre, edad y salario y muestra el salario
Si es menor de 16 no tiene edad para trabajar
Entre 19 y 50 años el salario es un 5 por ciento más
Entre 51 y 60 años el salario es un 10 por ciento más
Si es mayor de 60 el salario es un 15 por ciento más

Crea un programa que pida al usuario su nombre y su edad, y muestre por pantalla un mensaje personalizado de bienvenida.

Crea un programa que pida al usuario el precio y la cantidad de varios productos, y muestre por pantalla el total de la venta.

Crea un programa que pida al usuario el nombre, la edad y el género de varias personas, y muestre por pantalla estadísticas como la edad promedio y el porcentaje de hombres y mujeres.

Crea un programa que simule una cuenta bancaria, permitiendo al usuario depositar y retirar dinero, y mostrar el saldo actual.

Crea un programa que pida al usuario su altura y su peso, y muestre por pantalla su índice de masa corporal y si se encuentra en un rango saludable.

 */

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {



        //int[] arreglo = new int[]{1,2,3,4,5,6,7,8,9,10}; // declaracio de arreglo
        // cada funcion es el ejercicio resuelto. llamar a la funcion para ejecutar dentro del main
        ejercicio23_rangoSaludable();


    }

    public static void ejercicio23_rangoSaludable()
    {
        System.out.println("Ingresar tu nombre:  ");
        String nombre = scan.next();
        System.out.println("Ingresar tu altura: ");
        double altura = scan.nextDouble();
        System.out.println("Ingresar tu peso corporal: ");
        double peso = scan.nextDouble();

        System.out.println("indice de masa corporal :  ");
        double IMC = peso / (altura*altura); // formula para calcular el  índice de masa corporal
        if(IMC<= 18.3){
            System.out.println("bajo peso, peso NO saludable");
        }else if(IMC>=18.5 && IMC <= 24.9){
            System.out.println("normal, peso saludable ");
        }else if(IMC >= 25.0 && IMC <=29.9){
            System.out.println("sobrepeso, peso NO saludable");
        }else if(IMC >= 30.0){
            System.out.println("obesidad, peso NO saludable");
        }
        System.out.println(IMC);
    }

    public static void ejercicio23_cuentaBancaria()
    {
        boolean salida = true;
        double saldo = 0, transferencia;

        System.out.println("ingrsar nombre de usuario:  ");
        String nombre = scan.next();
        System.out.println("bienvenido "+ nombre+ " !!");
        while(salida!=false){

            System.out.println("1 - ingresar dinero\n2 - retirar dinero\n3 - fondos\n4 - salir\n    Ingresar opcion: ");
            int opcion = scan.nextInt();
            switch (opcion){

                case 1:
                    System.out.println("      ingresar el monto:  ");
                    transferencia = scan.nextDouble();
                    saldo += transferencia;
                    System.out.println("monto cargado con exito!  ");
                    break;

                case 2:
                    System.out.println("retirar fondo:  \n      ingresar el monto a retirar:  ");
                    transferencia = scan.nextDouble();
                    if(transferencia<=saldo){
                        saldo-=transferencia;
                        System.out.println("retiro con exito! ");
                    }else {
                        System.out.println("no tenes fondos suficientes !");

                    }
                    break;

                case 3:
                    System.out.println("fondos : " + saldo);
                    break;

                case 4:
                    System.out.println("gracias !! ");
                    salida = false;
                    break;

                default:
                    System.out.println("error !");
                    break;

            }
        }
    }

    public static void ejercicio24_estadisticasHyM()
    {
        int salida = 1, acumuladorEdad = 0, contadorGeneroF = 0, contadorGeneroM = 0;
        while (salida != 0)
        {
            System.out.println("Ingresar nombre: ");
            String nombre = scan.next();
            System.out.println("Ingresar la edad de " + nombre + " : ");
            int edad = scan.nextInt();
            System.out.println("ingresar un 1 si es mujer y un 2 si es hombre:  ");
            int genero = scan.nextInt();
            while (genero!=1 && genero!=2){ // validacion de genero
                System.out.println("error! Ingresar nuevamente el genero: ");
                genero = scan.nextInt();
            }
            System.out.println("Ingresar un 0 para dejar de cargar datos:  ");
            salida = scan.nextInt();
            acumuladorEdad +=edad; // acumulador del total de edades
            if(genero==1){
                contadorGeneroF++; // contador de mujeres
            }else if(genero==2){
                contadorGeneroM++; // contador de hombres
            }
        }
        double promedioEdad = (double)acumuladorEdad/(contadorGeneroF+contadorGeneroM); // promedio edad
        double porcentajeDeF = (double)contadorGeneroF * 100 /(contadorGeneroF+contadorGeneroM); // promedio de mujeres
        double porcentajeDeM = (double)contadorGeneroM * 100 /(contadorGeneroF+contadorGeneroM); // promedio de hombres

        System.out.println("ESTADISTICAS: \nPromedio de edad : "+promedioEdad+"\nPorcentaje de mujeres "+ porcentajeDeF + "\nProcentaje de hombres " + porcentajeDeM);
    }
    public static void ejercicio24_totalDeLaVenta()
    {
        System.out.println("Ingresar el precio del producto:  ");
        Double valor = scan.nextDouble();
        System.out.println("Ingresar la cantidad de elementos:  ");
        int cantidad = scan.nextInt();

        double total = (double) cantidad * valor;

        System.out.println("Valor = "+valor+" cantida de elementos"+cantidad+" total " + total);
    }
    public static void ejercicio24_saludoDeBienvenida()
    {
        System.out.println("Ingresar por teclado los siguientes datos:  \nNombre :  ");
        String nombre = scan.next();
        System.out.println("Edad :  ");
        int edad = scan.nextInt();

        System.out.println("Bienvenido " + nombre +" nos alegramos que estes acá !!!");
    }

    public static void ejercicio24_calcularSalario(int edad, String nombre){

        if(edad>16){
            System.out.println("Salario :  ");
            Double salario = scan.nextDouble();

            if(edad>=19 && edad<=50){
                salario = salario + (salario*0.05);

            }else if(edad>=51 && edad<=60){
                salario = salario + (salario*0.1);

            }else if(edad>60){
                salario = salario + (salario*0.15);
            }

            System.out.println("El salario es =  " + salario);

        }else {
            System.out.println( nombre + " es menor de 16 NO PUEDE TRABAJAR");
        }
    }

    public static void ejercicio23()
    {
        Double resultado = -1.0;
        System.out.println("Ingresar el primer valor: ");
        int valor1 = scan.nextInt();
        System.out.println("Ingresar el segundo valor: ");
        int valor2 = scan.nextInt();
        System.out.println("1)     +: suma los dos operandos.\n" +
                "2)     -: resta los operandos.\n" +
                "3)     *: multiplica los operandos.\n" +
                "4)     /: divide los operandos, este debe dar un resultado con decimales (double)\n" +
                "5)     ^:  1º operando como base y 2º como exponente.\n" +
                "6)     %:  módulo, resto de la división entre operando1 y operando2.\n\nIngresar la opcion: ");

        int opcion = scan.nextInt();
        switch (opcion) {
            case 1:
                resultado = (double) (valor1 + valor2);
                break;
            case 2:
                resultado = (double) (valor1 - valor2);
                break;
            case 3:
                resultado = (double) (valor1 * valor2);
                break;
            case 4:
                resultado = (double) (valor1 / valor2);
                break;
            case 5:
                resultado = Math.pow((double) valor1, (double) valor2);
                break;
            case 6:
                resultado = (double) (valor1 % valor2);
                break;
            default:
                System.out.println("Ingresó una opción fuera del rango ");
                break;
        }
        System.out.println("El resultado es " + resultado);
    }



    public static void ejercicio22()
    {
        System.out.println("Ingresar un valor positivo: \nIngresar valor: ");
        int valor = scan.nextInt();
        if(valor>0){

            int cantidadDeCifras = String.valueOf(valor).length();// Convertir el número a una cadena y obtener la longitud de la cadena
            System.out.println("el valor "+valor+" tiene "+ cantidadDeCifras+" cifras");
        }else {

            System.out.println("valor no valido");

        }
    }

    public static void ejercicio21()
    {
        System.out.println("Ingresar un dia laboral");
        String dia = scan.nextLine();

        switch (dia.toLowerCase()) {// se utiliza para convertir la entrada a minúsculas
            case "lunes":
            case "martes":
            case "miércoles":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println(dia + " es un día laboral.");
                break;
            case "sábado":
            case "sabado":
            case "domingo":
                System.out.println(dia + " no es un día laboral.");
                break;
            default:
                System.out.println("Entrada no válida. Por favor, ingrese un día de la semana válido.");
        }
    }

    public static void ejercicio20()
    {

        System.out.println("Ingresar dos valores: \nValor 1 = ");
        int valor1 = scan.nextInt();
        System.out.println("Valor 2 = ");
        int valor2 = scan.nextInt();

        int min = Math.min(valor1, valor2); // determina cual es el menor de dos numeros
        int max = Math.max(valor1, valor2); // determina cual es el mayor de dos numeros

        Random random = new Random(); // se crea el objeto random
        for(int i = 0 ; i<10 ; i++){ // se generan 10 valores random dentro de un rango detrminado

            int valor =  random.nextInt(max - min + 1) + min; // Generar un número aleatorio dentro del rango
            System.out.println(" "+ valor);

        }
    }

    public static void ejercicio19(int mes[])
    {
        double promedio, acumulador = 0;
        int maximo = mes[0], minimo = mes[0];

        for(int i = 0 ; i<mes.length ; i++){ //el .length es para tener la cantidad de elementos que tiene un arreglo

            if(mes[i]>maximo){
                maximo = mes[i];
            }
            if(mes[i]<minimo){
                minimo = mes[i];
            }
            acumulador += mes[i];

        }

        promedio = acumulador/mes.length;
        System.out.println("Promedio = " + promedio + "\nMax = " + maximo + "\nMin = " + minimo);

    }

    public static void ejercicio18()
    {
        System.out.println("Ingrese la longitud del primer cateto:");
        double cateto1 = scan.nextDouble();
        System.out.println("Ingrese la longitud del segundo cateto:");
        double cateto2 = scan.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("La longitud de la hipotenusa es: " + hipotenusa);

    }

    public static void ejercicio17()
    {

        System.out.println("Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.\nIngresar los km : ");
        double valor = scan.nextDouble();
        System.out.println("el valor en m/s = " + valor*0.277778);

    }

    public static void ejercicio16()
    {
        System.out.println("Ingresar el Ingresar el radio de una circunferencia");
        double radio = scan.nextDouble();


        System.out.println("la longitud = "+  (2 * Math.PI * radio)  + " y el area = "+ Math.PI * Math.pow(radio, 2));

    }

    public static void ejercicio15()
    {
        System.out.println("Ingresar grados centígrados: ");
        double  gradosC = scan.nextDouble();

        double  resultado = 32 + ( (9 * gradosC) / 5);

        System.out.println(gradosC + " en grados centígrados a fahrenheit = " + resultado);

    }
    public static void ejercicio14()
    {

        System.out.println("Ingresar el valor: ");
        int valor = scan.nextInt();
        System.out.println("el doble de " + valor + " = " + valor*2 + " y el triple = " + valor*3);

    }

    public static void ejercicio13()
    {
        System.out.println("Ingresar tu nombre: ");
        String nombre = scan.next();
        System.out.println("Buenos dias " + nombre);

    }

    public static void ejercicio12()
    {
        System.out.println("¿Que deseas calcular? Se calculará el area:\n1 - Rectangulo\n2 - Cuadrado\n3 - Triangulo\n4 - Círculo");
        int valor = scan.nextInt();
        double resultado = 0;

        switch (valor) {

            case 1:
                System.out.println("Ingresar la base y la altura del rectángulo:\nBase: ");
                double baseRectangulo = scan.nextDouble();
                System.out.println("Altura: ");
                double alturaRectangulo = scan.nextDouble();
                resultado = baseRectangulo * alturaRectangulo;
                break;

            case 2:
                System.out.println("Ingresar el lado del cuadrado: ");
                double ladoCuadrado = scan.nextDouble();
                resultado = ladoCuadrado * ladoCuadrado;
                break;

            case 3:
                System.out.println("Ingresar la base y la altura del triangulo:\nBase: ");
                double baseTriangulo = scan.nextDouble();
                System.out.println("Altura: ");
                double alturaTriangulo = scan.nextDouble();
                resultado = (baseTriangulo * alturaTriangulo) / 2;
                break;

            case 4:
                System.out.println("Ingresar el radio del circulo: ");
                double radioCirculo = scan.nextDouble();
                resultado = Math.PI * Math.pow(radioCirculo, 2);
                break;

            default:
                System.out.println("Se ingreso un valor fuera del rango.");
                break;
        }
        System.out.println("El area es: " + resultado);
    }

    public static void ejercicio11()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("ingresar dos valores para multiplicar: ");
        int valor1 = scan.nextInt();
        System.out.println("Ingresar el segundo valor: ");
        int valor2 = scan.nextInt();
        int resultado = valor1 * valor2;
        System.out.println(valor1 + " x " + valor2 + " = " + resultado);

    }

    public static void ejercicio10()
    {
        System.out.println("Programa que muestra el caracter en ASCII: \n\nIngresar el caracter: ");
        char caracter = scan.next().charAt(0); // Utiliza next() para leer una cadena y charAt(0) para obtener el primer carácter
        int valorASCII = (int)caracter;
        System.out.println("es igual a " + valorASCII );
    }
    public static void ejercicio9()
    {
        System.out.println("Funcion que verifica si un año es bisiesto o no\n\nIngresar el año:  "); // Es divisible por 4 y no es divisible por 100. Es divisible por 400.
        int year = scan.nextInt();
        if(year%4 == 0 && year%100 != 0 || year%400 == 0){
            System.out.println("El año " + year + " es bisiesto");
        } else  {
            System.out.println("El año " + year + " no es bisiesto");
        }
    }

    public static void ejercicio8()
    {

        int  valor=1, cantidad=0;
        while (valor != 0){

            System.out.println("Ingresar valores, ingresar un 0 para salir del programa ");
            valor = scan.nextInt();
            if(valor>0){
                cantidad++;
            }
        }
        System.out.println("la canitdad de elementos ingresados que fueron pares son: " + cantidad);

        scan.close();
    }

    public static void ejercicio7()
    {
        //Encontrar la suma de los primeros 10 números naturales
        int resutado = sumaDeValoresPrimos(10); // se llama a la funcion que suma los numeros primos. se tiene que mandar la cantidad de elementos que se quieren sumar.
        System.out.println("la suma es igual a " + resutado);
    }

    public static int sumaDeValoresPrimos(int cantidaDeValores)
    {
        int valoresPrimos = 0, i = 0 , suma = 0;

        while(valoresPrimos<cantidaDeValores){

                    if(esPrimo(i) == true){
                        suma += i;
                        valoresPrimos++;
                    }

                    i++;

        }

        return suma;
    }

    public static void ejercicio6()
    {

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

    public static  void ejercicio4()
    {

        System.out.println("ejercicio numero 4 \n ingresar un valor : ");
        int numEjercicio4 = scan.nextInt(); // se crea a variable donde se almacena el scanner.

        ejercicio3(numEjercicio4);

    }

    public static void ejercicio3(int cantidad)
    {

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
    public static boolean esPrimo(int numero)
    {

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
    public static void ejercicio2(int valor)
    {

        System.out.println("ejercicio 2");

        if(valor%2 == 0){ // % modulo
            System.out.println("es par");
        }else{
            System.out.println("es impar");

        }
    }

    public static float ejercicio1(int arreglo[])
    {
        System.out.println("ejercicio 1");

        float promedio = 0;
        for(int i = 0; i <arreglo.length ; i++){ // el .length es para tener la cantidad de elementos que tiene un arreglo son la necesidad de tener los validos de un arreglo

            promedio += arreglo[i]; // el =+ es acumulativo


        }
        return promedio = promedio/10; // se tiene que tener un solo return por cada funcion
    }
}