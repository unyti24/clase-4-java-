public class App {
    public static void main(String[] args) throws Exception {
    //    // arreglo de enteros sin inicializar con llaves
    //     int[] numeros = new int[5];
    //     numeros[0] = 10;
    //     numeros[1] = 20;    
    //     numeros[2] = 30;
    //     numeros[3] = 40;
    //     numeros[4] = 50;
    //     // sumar los datos con for
    //     double suma = 0;
    //     double promedio = 0;
    //     for (int i = 0; i < numeros.length; i++) {
    //         suma += numeros[i];
    //     }
    //     promedio = (double) suma / numeros.length;
    //     System.out.println("La suma es: " + suma);
    //     System.out.println("El promedio es: " + promedio);


        // String [] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        // for (String dia : dias) {
        //     System.out.println(dia);
        // }

        // for (int i = dias.length - 1; i >= 0; i--) {
        //     System.out.println(dias[i]);
        // }


        // int i = 0;
        // // while (i < dias.length) {
        //     System.out.println(dias[i]);
        //     i++;
        //     if ( i == 5 ||i == 7 ) {
        //         continue;
        //     }
        //     System.out.println(dias[i]);
        // }
    //         saludar("hola");
    //         saludar(mensaje: "grupo 4");
    // }
    // public  static void saludar(string mensaje) {
    //     System.out.println(mensaje);

    int num1 = 10;
    double resultado = calculadora(num1, 5, "+");
    System.out.println("El resultado de la suma es: " + resultado);

     

    }



    public static double calculadora (int num1, int num2, String operacion) {
        double resultado = 0;
        if(operacion.equals("+") ) {
            resultado = num1 + num2;
        } else if (operacion.equals("-")) {
            resultado = num1 - num2;
        } else if (operacion.equals("*")) {
            resultado = num1 * num2;
        } else if (operacion.equals("/")) {
            if (num2 == 0) {
                System.out.println("Error: División por cero no permitida.");
            } else {
                resultado = (double) num1 / num2;
            }
        } else {
            System.out.println("Operación no válida.");
        }
        return resultado;
    

        
        
    }
    

}
