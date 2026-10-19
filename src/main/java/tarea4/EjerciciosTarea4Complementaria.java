package tarea4;

import java.util.Locale;
import java.util.Scanner;

public class EjerciciosTarea4Complementaria {
    public static void main(String[] args) {

        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
        ejercicio11();
        ejercicio12();
        ejercicio13();
        ejercicio14();
        ejercicio15();
        ejercicio16();
        ejercicio17();
        ejercicio18();
        ejercicio19();
        ejercicio20();
    }

    public static void ejercicio1() {

        //1 Pedir un número e indicar si es positivo o negativo .

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para saber si es negativo o positivo: ");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Este número es negativo");
        } else {
            System.out.println("Este numero es positivo");
        }
        System.out.println();       //salto de línea para separar los ejercicios

    }

    public static void ejercicio2() {

        //2 Pedir dos números y decir si uno es múltiplo del otro.

        Scanner sc = new Scanner(System.in);
        System.out.println("Comprobaremos si un número es múltiplo de otro.");
        System.out.println("Introduce el primer numero: ");
        int numero1 = sc.nextInt();

        System.out.println("Introduce el segundo numero: ");
        int numero2 = sc.nextInt();
        if (numero1 % numero2 == 0) {
            System.out.println(numero1 + " es múltiplo de " + numero2);
        } else {
            System.out.println(numero1 + " no es múltiplo de " + numero2);
        }
        System.out.println();
    }

    public static void ejercicio3() {

        //3 Pedir dos números y decir cual es el mayor o si son iguales.

        System.out.println("De estos dos números son iguales, alguno es menor o alguno es mayor?");

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero a comparar: ");
        int comparado1 = sc.nextInt();

        System.out.println("Introduce el segundo numero a comparar: ");
        int comparado2 = sc.nextInt();

        if (comparado1 > comparado2) {
            System.out.println(comparado1 + " es mayor que " + comparado2);
        } else if (comparado1 == comparado2) {
            System.out.println("Ambos números son iguales");
        } else {
            System.out.println(comparado1 + " es menor que " + comparado2);
        }
        System.out.println();
    }

    public static void ejercicio4() {

        //4 Pedir tres números y mostrarlos ordenados de mayor a menor.

        System.out.println("Vamos a ordenar 3 números.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int number1 = sc.nextInt();

        System.out.println("Introduce el segundo número: ");
        int number2 = sc.nextInt();

        System.out.println("Introduce el tercer número ");
        int number3 = sc.nextInt();

        int mayor, medio, menor;

        if (number1 > number2 && number1 > number3) {
            mayor = number1;
            if (number2 > number3) {
                medio = number2;
                menor = number3;
            } else {
                medio = number3;
                menor = number2;
            }
        } else if (number2 > number1 && number2 > number3) {
            mayor = number2;
            if (number1 > number3) {
                medio = number1;
                menor = number3;
            } else {
                medio = number3;
                menor = number1;
            }
        } else {
            mayor = number3;
            if (number1 > number2) {
                medio = number1;
                menor = number2;
            } else {
                medio = number2;
                menor = number1;
            }
        }
        System.out.println("El orden de mayor a menor es: " + mayor + "," + medio + "," + menor);
        System.out.println();
    }

    public static void ejercicio5() {

        //5 Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("¿Cual es tu nota?");
        System.out.println("Introduce tu nota del 0 al 10: ");
        double nota = sc.nextDouble();
        if (nota < 5) {
            System.out.println("Tu nota es Insuficiente");
        } else if (nota < 6) {
            System.out.println("Tu nota es Suficiente");
        } else if (nota < 7) {
            System.out.println("Tu nota es Bien");
        } else if (nota < 9) {
            System.out.println("Tu nota es Notable");
        } else if (nota <= 10) {
            System.out.println("Tu nota es Sobresaliente");
        } else {
            System.out.println("Tu nota no es valida");
        }
        System.out.println();
    }

    public static void ejercicio6() {

        /*6 Leer un número e indicar si es positivo o negativo.
        El proceso se repetirá hasta que se introduzca un 0.*/

        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.println("Introduce un numero para saber si es negativo o positivo: ");
            number = sc.nextInt();

            if (number < 0) {
                System.out.println("El número es negativo");
                System.out.println("Para salir del bucle introduce un 0.");
            } else if (number > 0) {
                System.out.println("El numero es positivo");
                System.out.println("Para salir del bucle introduce un 0.");
            }
        } while (number != 0);
        System.out.println("Has introducido 0, fin del bucle");

        System.out.println();
    }

    public static void ejercicio7() {

        //7 Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.

        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.println("Introduce un numero para saber si es par o impar: ");
            number = sc.nextInt();

            if (number % 2 == 0) {
                System.out.println("El número es par");
                System.out.println("Para salir del bucle introduce un 0.");
            } else {
                System.out.println("El numero es impar");
                System.out.println("Para salir del bucle introduce un 0.");
            }
        } while (number != 0);

        System.out.println("Has introducido 0, fin del bucle");
        System.out.println();
    }

    public static void ejercicio8() {

        /*8 Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo números
        indicando “mayor” o “menor” según sea mayor o menor con respecto a N.
        El proceso termina cuando el usuario acierta */

        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina el número secreto");
        System.out.println("JUGADOR 1: Introduce un número secreto: ");
        int N = sc.nextInt();

        System.out.println("JUGADOR 2: Intenta adivinar el número secreto");

        int intento = -1; //siempre habrá como mínimo 1 intento, se marca -1 para que funcione el bucle

        while (N != intento) {
            System.out.println("Intento: ");
            intento = sc.nextInt();

            if (intento < N) {
                System.out.println("El numero es MAYOR");
            } else if (intento > N) {
                System.out.println("El numero es MENOR");

            } else {
                System.out.println("Enhorabuena, has acertado el número secreto");
            }
        }
        System.out.println();
    }

    public static void ejercicio9() {

        //9 Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.

        Scanner sc = new Scanner(System.in);
        System.out.println("Suma de números");
        System.out.println("Introduce un numero: ");
        int number = sc.nextInt();

        int suma =0;
        suma += number;

        while (number != 0) {
            System.out.println("Introduce otro numero para comenzar la suma: ");
            number = sc.nextInt();
            suma += number;
            System.out.println("Para salir del bucle introduce un 0.");
        }
        System.out.println("Has introducido 0, sales del bucle.");
        System.out.println("La suma de todos los números introducidos es: " + suma);
        System.out.println();
    }

    public static void ejercicio10() {

        /*10 Pedir números hasta que se introduzca uno negativo,
        y calcular la media de los números positivos.
        El 0 se considera número positivo */

        Scanner sc = new Scanner(System.in);
        System.out.println("Calcular la media de estos números");
        System.out.println("Introduce un numero: ");
        double number = sc.nextDouble();
        int suma = 0;
        int contador = 0;

        while (number >= 0){
            suma += number;
            contador++;
            System.out.println("Introduce otro número: ");
            number = sc.nextDouble();
            System.out.println("Para salir del bucle introduce un numero negativo.");
        }
        double media = (double) suma / contador; //pasamos int suma a double para calcular la media
        System.out.println("La media de los números positivos introducidos es de: " + media);
        System.out.println();

    }

    public static void ejercicio11() {

        //11 Pedir un número N, y mostrar todos los números del 1 al N.
        System.out.println("Mostrar números hasta llegar al mio");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero ");
        int N = sc.nextInt();

        int i = 1;

        for (i = 1; i <= N; i++) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void ejercicio12() {

        //12 Escribir todos los números del 100 al 0 de 7 en 7.
        System.out.println("Mostar del 100 al 0 de 7 en 7");
        int i = 100;

        for (i = 100; i >= 0; i -= 7) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void ejercicio13() {

        //13 Pedir un número y calcular su factorial.

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para calcular su factorial: ");
        int factorial = sc.nextInt();

        int resultado = 1;

        for (int n = 1; n <= factorial; n++) {
            resultado *= n;
        }
        System.out.println("El factorial de " + factorial + " es " + resultado);
        System.out.println();

    }

    public static void ejercicio14() {
        /*Pedir 10 números.
        Mostrar la media de los números positivos,
        la media de los números negativos y la cantidad de ceros. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Se pedirán 10 números. Introduce tanto negativos como positivos");

        int sumaPos = 0;
        int sumaNeg = 0;
        int contadorPos = 0;
        int contadorNeg = 0;
        int contadorCeros = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un número: ");
            int num = sc.nextInt();

            if (num > 0) {
                sumaPos += num;
                contadorPos++;
            } else if (num < 0) {
                sumaNeg += num;
                contadorNeg++;
            } else {
                contadorCeros++;
            }
        }

        //Medias con condicionales para evitar que se divida entre 0
        double mediaPos = 0;
        if (contadorPos > 0) {
            mediaPos = (double) sumaPos / contadorPos;
        } else {
            System.out.println("No se ha introducido ningún positivo");
        }
        double mediaNeg = 0;
        if (contadorNeg > 0) {
            mediaNeg = (double) sumaNeg / contadorNeg;
        } else {
            System.out.println("No se ha introducido ningún negativo");
        }

        System.out.println("La media de todos los números positivos es: " + mediaPos);
        System.out.println("La media de todos los número negativos es: " + mediaNeg);
        System.out.println("La cantidad de ceros introducida es: " + contadorCeros);
        System.out.println();

    }

    public static void ejercicio15() {

         /*15 Dadas las edades y alturas de 5 alumnos, mostrar la edad
        y la estatura media, la cantidad de alumnos mayores de 18 años,
        y la cantidad de alumnos que miden más de 1.75.*/

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Edades y alturas de 5 alumnos, se realizarán algunos cálculos");

        int sumaEdad = 0;
        double sumaEstatura = 0;
        int mayor18 = 0;
        int mas175 = 0;

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Introduce tu edad: ");
           int edad = sc.nextInt();
            sumaEdad += edad;
            if (edad > 18){
                mayor18++;
            }
            System.out.println("Introduce tu estatura en: ");
            double estatura = sc.nextDouble();
            sumaEstatura += estatura;
            if (estatura > 1.75){
                mas175++;
            }
        }
        double mediaEdad = (double) sumaEdad / 5;
        double mediaEstatura = sumaEstatura / 5;

        System.out.println("La edad media de los alumnos es: " + mediaEdad);
        System.out.println("La estatura media de los alumnos es: " + mediaEstatura);
        System.out.println("La cantidad de alumnos mayores de 18 años es de: " + mayor18);
        System.out.println("La cantidad de alumnos que miden mas de 1.75m es de: " + mas175);
        System.out.println();

    }

    public static void ejercicio16() {

        //16 Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.

        Scanner sc = new Scanner(System.in);
        System.out.println("Tabla de multiplicar");
        System.out.println("Introduce un numero para mostrar su tabla de multiplicar: ");
        int tabla = sc.nextInt();

        int resultado;

        for (int i = 0; i <= 10; i++) {
            resultado = tabla * i;
            System.out.println(tabla + " * " + i + " = " + resultado);
        }
        System.out.println();
    }

    public static void ejercicio17() {

        //17 Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.

        Scanner sc = new Scanner(System.in);
        System.out.println("Total de aprobados, condicionales y suspensos.");
        int aprobados = 0;
        int condicionados = 0;
        int suspensos = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Introduce tu nota: ");
            int nota = sc.nextInt();

            if (nota < 4){
                suspensos++;
            } else if (nota > 4) {
                aprobados++;
            } else {
                condicionados++;
            }
        }
        System.out.println("La cantidad de alumnos aprobados es: " + aprobados);
        System.out.println("La cantidad de alumnos condicionados es: " + condicionados);
        System.out.println("La cantidad de alumnos suspensos es: " + suspensos);
        System.out.println();

    }

    public static void ejercicio18() {

        //18 Realizar un programa que muestre las tablas de multiplicar del 1 al 10.
        System.out.println("TABLAS DE MULTIPLICAR");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i + ":"); //numero de la tabla

            for (int b = 1; b <= 10; b++) {
                System.out.println(i + " x " + b + " = " + (i * b)); //numero a multiplicar
            }
            System.out.println(); //salto de linea
        }
        System.out.println();
    }

    public static void ejercicio19() {

        /*19 Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los números
        del 0-0-0-0-0 al 9-9-9-9-9,
        con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.*/

        System.out.println("Contador de 5 dígitos");

        int i = 0;

        while (i <= 9) {
            if (i == 3) {
                System.out.println("E-E-E-E-E");
            } else {
                System.out.println(i + "-" + i + "-" + i + "-" + i + "-" + i);
            }
            i++;
        }
        System.out.println();
    }

    public static void ejercicio20() {

        /*Realizar un programa que nos pida un número n,
        y nos diga cuantos números hay entre 1 y n que son primos. */

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos números primos hay entre 1 y tu número?");
        System.out.println("Introduce tu número: ");
        int n = sc.nextInt();

        int contadorPrimos = 0;

        //Comienzo en 2 porque es el primer número primo
        for (int i = 2; i <= n; i++){
            boolean primo = true;   //suponemos que i es primo hasta que se demuestre lo contrario

            for (int j =  2; j < i; j++) {   /*si hay algún número "j" por debajo de "i" que al dividirlo por otro
                                            su resto sea 0 ya no es primo*/
                if (i % j == 0){
                    primo = false;
                    break;
                }
            }

            if(primo == true){     //si es primo contamos +1 en el contador
                contadorPrimos++;
            }
        }

        System.out.println("Desde el número 1 hasta " + n + " hay " + contadorPrimos + " números primos.");
    }

}
