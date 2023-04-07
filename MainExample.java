
public class MainExample {
    public static void main(String[] args) {
        Recursividad r = new Recursividad();
        
        espaciado();
        int[] arreglo = new int[20];
        r.cargarSerie(12, arreglo);
        for (int i = 0; i < 12; i++) {
            System.out.print(arreglo[i] + ", ");
        }

        espaciado();
        int[][] matriz = new int[4][5];
        r.cargarMatriz(4, 5, matriz);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + ", ");
            }
            System.out.println("");
        }

        System.out.println(r.suma(arreglo, 2, 5));

        int[] a1 = new int[10];
        a1[0] = 1;
        a1[1] = 2;
        a1[2] = 3;
        a1[3] = 4;
        a1[4] = 5;
        int[] a2 = new int[] { 8, 7, 4 };

        r.insertarVector(a2, a1, 2);
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + ", ");
        }

        espaciado();
        String[][] matrizCadena = new String[10][10];
        String cadena = "HOLA MUNDITO";
        r.cargarMatriz(matrizCadena, 4, 4, cadena);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizCadena[i][j] + ", ");
            }
            System.out.println("");
        }

        espaciado();
        int numeroEntero = 48765;
        int cantidad = (int) (Math.log10(numeroEntero) + 1);
        int[] arr = new int[10];
        r.cargarVector(numeroEntero, arr);
        for (int i = 0; i < cantidad; i++) {
            System.out.print(arr[i] + ", ");
        }

        espaciado();
        int[] temp = new int[10];
        r.cargarSerieFibonacciNormal(10, temp);
        for (int i = 0; i < 10; i++) {
            System.out.print(temp[i] + ", ");
        }
        System.out.println("");
        temp = new int[10];
        r.cargarSerieFibonacci(10, temp);
        for (int i = 0; i < 10; i++) {
            System.out.print(temp[i] + ", ");
        }

        espaciado();
        System.out.println(r.obtenerVocales("buenas tardes a todos"));

        espaciado();
        int[][] matrizForma1 = new int[10][10];
        r.cargarMatrizForma1(matrizForma1, 5, 5);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizForma1[i][j] + ", ");
            }
            System.out.println("");
        }

        espaciado();
        System.out.println(r.verificarPalindrome("ORURO"));

        espaciado();
        int[][] matrizForma2 = new int[10][10];
        r.cargarMatrizForma2(matrizForma2, 7, 7);

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matrizForma2[i][j] + ", ");
            }
            System.out.println("");
        }

        espaciado();
        r.moveFirstMenor(635624);

        espaciado();
        int[][] matrizCuadrada = new int[10][10];
        r.cargarCuadradoMagico(matrizCuadrada, 5, 5);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizCuadrada[i][j] + " \t");
            }
            System.out.println("");
        }

        espaciado();
        System.out.println(r.crearCadenaDigitos(5021));

        espaciado();
        int[] arregloInterseccion = r.mostrarInterseccion(new int[]{4, 3, 2, 1}, new int[]{1, 2, 3, 4});
        for (int i = 0; i < arregloInterseccion.length; i++) {
            System.out.print(arregloInterseccion[i] + ", ");
        }

        espaciado();
        int[][] matrizEjemplo = new int[10][10];
        r.llenarMatrizTriangular(matrizEjemplo, 5, 5);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizEjemplo[i][j] + " \t");
            }
            System.out.println("");
        }

        espaciado();
        int[] arreglo1 = new int[5];
        r.cargarOrdenado(82731, arreglo1, 0);
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.print(arreglo1[i] + ", ");
        }
        System.out.println("");


        System.out.println(r.numMayor("ho2la 23com82o es43ta3s?"));


        espaciado();
        int[][] matrizHueca = new int[10][10];
        r.cargarMatrizHueca(matrizHueca, 5, 5);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizHueca[i][j] + " \t");
            }
            System.out.println("");
        }

        espaciado();
        r.generarSerie(5);

        espaciado();
        String cadena2 = "hola como estas?";
        System.out.println(cadena2);
        System.out.println(r.cantidadDePalabras(cadena2));

        espaciado();
        int[] array = new int[10];
        array[0] = 5;
        array[1] = 2;
        array[2] = 7;
        array[3] = 4;
        array[4] = 9;
        r.eliminarElemento(array, 5, 4);
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("");

    }





    public static void espaciado() {
        String s = "---------------------";
        s = s + s + s;
        System.out.println("");
        System.out.println(s);
        System.out.println("");
    }

}
