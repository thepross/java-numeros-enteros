import java.util.prefs.BackingStoreException;

import javax.management.BadBinaryOpValueExpException;

public class Recursividad {

    public void cargarSerie(int n, int[] arreglo) {
        int index = 0;
        int valor = 0;
        int sw = 0;
        cargarSerie(n, arreglo, index, valor, sw);
    }

    private void cargarSerie(int n, int[] arreglo, int index, int valor, int sw) {
        if (index < n) {
            if (sw == 0) {
                valor = valor * 2;
                sw = 1;
            } else {
                valor = valor + 1;
                sw = 0;
            }
            arreglo[index] = valor;
            cargarSerie(n, arreglo, index + 1, valor, sw);
        }
    }

    public void cargarMatriz(int fila, int columna, int[][] matriz) {
        int filaIndex = 0;
        int columnaIndex = 0;
        cargarMatriz(fila, columna, matriz, filaIndex, columnaIndex);
    }

    public void cargarMatriz(int fila, int columna, int[][] matriz, int fi, int ci) {
        if (fi < fila) {
            cargarColumna(fila - fi, columna, matriz, fi, ci);
            cargarMatriz(fila, columna, matriz, fi + 1, ci);
        }
    }

    public void cargarColumna(int fila, int columna, int[][] matriz, int fi, int ci) {
        if (ci < columna) {
            matriz[fi][ci] = fila;
            cargarColumna(fila + 1, columna, matriz, fi, ci + 1);
        }
    }

    public int suma(int[] arreglo, int a, int b) {
        if (a > b) { // caso base
            return 0;
        } else {
            if (a == b) { // otro caso base
                return arreglo[b];
            } else { // caso general
                return suma(arreglo, a, b - 1) + arreglo[b];
            }
        }
    }

    public void insertarVector(int[] v2, int[] v1, int pos) {
        int index = 0;
        int longitudV1 = 5;
        int longitudV2 = 3;
        insertarVector(v2, v1, pos, index, longitudV1, longitudV2);
    }

    private void insertarVector(int[] v2, int[] v1, int pos, int index, int longitudV1, int longitudV2) {
        if (index < longitudV2) {
            insertar(v1, v2[index], pos + index, longitudV1, longitudV2);
            insertarVector(v2, v1, pos, index + 1, longitudV1 + 1, longitudV2);
        }
    }

    public void insertar(int[] arreglo, int elemento, int posicion, int longitudV1, int longitudV2) {
        int index = longitudV1;
        while (index >= posicion) {
            arreglo[index + 1] = arreglo[index];
            index--;
        }
        arreglo[posicion] = elemento;
    }

    public void cargarMatriz(String[][] matriz, int fila, int columna, String cadena) {
        int indexCadena = 0;
        int fi = 0;
        int ci = 0;
        cargarMatriz(matriz, fila, columna, fi, ci, cadena, indexCadena);
    }

    private void cargarMatriz(String[][] matriz, int fila, int columna, int fi, int ci, String cadena,
            int indexCadena) {
        if (ci < columna) {
            cargarFila(matriz, fila, columna, fi, ci, cadena, indexCadena);
            cargarMatriz(matriz, fila, columna, fi, ci + 1, cadena, indexCadena + fila);
        }
    }

    private void cargarFila(String[][] matriz, int fila, int columna, int fi, int ci, String cadena, int indexCadena) {
        if (fi < fila) {
            if (indexCadena < cadena.length()) {
                matriz[fi][ci] = cadena.charAt(indexCadena) + "";
            } else {
                matriz[fi][ci] = " ";
            }
            cargarFila(matriz, fila, columna, fi + 1, ci, cadena, indexCadena + 1);
        }
    }

    public void cargarVector(int numeroEntero, int[] arreglo) {
        int index = 4;
        cargarVector(numeroEntero, arreglo, index);
    }

    private void cargarVector(int numeroEntero, int[] arreglo, int index) {
        if (numeroEntero == 0) {
            return;
        } else {
            arreglo[index] = numeroEntero % 10;
            cargarVector(numeroEntero / 10, arreglo, index - 1);
        }
    }

    public void cargarSerieFibonacci(int n, int[] arreglo) {
        int index = 0;
        cargarSerieFibonacci(n, arreglo, index);
    }

    public void cargarSerieFibonacci(int n, int[] arreglo, int index) {
        if (index == n - 1) {
            arreglo[index] = 0;
        } else {
            if (index == n - 2) {
                arreglo[index] = 1;
            } else {
                cargarSerieFibonacci(n, arreglo, index + 1);
                arreglo[index] = arreglo[index + 1] + arreglo[index + 2];
            }
        }
    }

    public void cargarSerieFibonacciNormal(int n, int[] arreglo) {
        int index = n - 1;
        cargarSerieFibonacciNormal(n, arreglo, index);
    }

    public void cargarSerieFibonacciNormal(int n, int[] arreglo, int index) {
        if (index == 0) {
            arreglo[index] = 0;
        } else {
            if (index == 1) {
                arreglo[index] = 1;
            } else {
                cargarSerieFibonacciNormal(n, arreglo, index - 1);
                arreglo[index] = arreglo[index - 1] + arreglo[index - 2];
            }
        }
    }

    /*
     * Variable global para obtener el resultado de separar vocales en la funcion
     * obtenerVocales()
     */
    public String result = "";

    public String obtenerVocales(String cadena) {
        result = "";
        return obtenerVocales(cadena, 0);
    }

    public String obtenerVocales(String cadena, int index) {
        if (index < cadena.length()) {
            if (esVocal(cadena.charAt(index))) {
                result = result + cadena.charAt(index);
            }
            obtenerVocales(cadena, index + 1);
        }
        return result;
    }

    public boolean esVocal(char caracter) {
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }

    public void cargarMatrizForma1(int[][] matriz, int fila, int columna) {
        int fi = 0;
        int ci = columna - 1;
        int valorInicial = 1;
        cargarMatrizForma1(fila, columna, matriz, fi, ci, valorInicial);
    }

    public void cargarMatrizForma1(int fila, int columna, int[][] matriz, int fi, int ci, int valorInicial) {
        if (fi < fila) {
            if (fi % 2 == 0) {
                cargarColumnaForma1(fila, columna, matriz, fi, ci - fi, valorInicial);
            } else {
                cargarColumnaForma1(fila, columna, matriz, fi, ci - fi, valorInicial + fi);
            }
            cargarMatrizForma1(fila, columna, matriz, fi + 1, ci, valorInicial + fi + 1);
        }
    }

    public void cargarColumnaForma1(int fila, int columna, int[][] matriz, int fi, int ci, int valorInicial) {
        if (ci < columna) {
            matriz[fi][ci] = valorInicial;
            if (fi % 2 == 0) {
                cargarColumnaForma1(fila, columna, matriz, fi, ci + 1, valorInicial + 1);
            } else {
                cargarColumnaForma1(fila, columna, matriz, fi, ci + 1, valorInicial - 1);
            }
        }
    }

    public boolean verificarPalindrome(String cadena) {
        int index = 0;
        return verificarPalindrome(cadena, index);
    }

    public boolean verificarPalindrome(String cadena, int index) {
        if (index == cadena.length() / 2) {
            return true;
        } else {
            if (cadena.charAt(index) == cadena.charAt((cadena.length() - 1) - index)) {
                return verificarPalindrome(cadena, index + 1);
            } else {
                return false;
            }
        }
    }

    public void cargarMatrizForma2(int[][] matriz, int fila, int columna) {
        int fi = 0;
        int ci = 0;
        int valor = 1;
        cargarMatrizForma2(matriz, fila, columna, fi, ci, valor);
    }

    private void cargarMatrizForma2(int[][] matriz, int fila, int columna, int fi, int ci, int valor) {
        if (fi == fila / 2 && ci == columna / 2) {
            matriz[fi][ci] = valor;
        } else {
            cargarMatrizColumna(matriz, fila - fi, columna - ci, fi, ci, valor);
            cargarMatrizFila(matriz, fila - fi, columna - ci - 1, fila - fi - 1, ci, valor);

            cargarMatrizColumna(matriz, fi, columna, fila - fi, columna - ci - 1, valor + 1);
            cargarMatrizFila(matriz, fila, ci + 1, fi, columna - ci, valor + 1);

            cargarMatrizForma2(matriz, fila, columna, fi + 1, ci + 1, valor + 2);
        }

    }

    private void cargarMatrizColumna(int[][] matriz, int fila, int columna, int fi, int ci, int valor) {
        if (valor % 2 == 0) {
            if (fi >= fila) {
                matriz[fi][ci] = valor;
                cargarMatrizColumna(matriz, fila, columna, fi - 1, ci, valor);
            }
        } else {
            if (fi < fila) {
                matriz[fi][ci] = valor;
                cargarMatrizColumna(matriz, fila, columna, fi + 1, ci, valor);
            }
        }
    }

    private void cargarMatrizFila(int[][] matriz, int fila, int columna, int fi, int ci, int valor) {
        if (valor % 2 == 0) {
            if (ci >= columna) {
                matriz[fi][ci] = valor;
                cargarMatrizFila(matriz, fila, columna, fi, ci - 1, valor);
            }
        } else {
            if (ci < columna) {
                matriz[fi][ci] = valor;
                cargarMatrizFila(matriz, fila, columna, fi, ci + 1, valor);
            }
        }
    }

    public int nuevo = 0;
    public boolean b = false;

    public void moveFirstMenor(int numero) {
        nuevo = 0;
        b = false;
        int menor = menor(numero);
        System.out.println(numero);
        moveFirstMenor(numero, menor);
        System.out.println(nuevo);
    }

    private void moveFirstMenor(int numero, int menor) {
        if (numero < 10) {
            nuevo = menor * 10 + numero;
        } else {
            moveFirstMenor(numero / 10, menor);
            if (menor != numero % 10) {
                nuevo = nuevo * 10 + (numero % 10);
            } else {

            }
        }
    }

    public int menor(int numero) {
        if (numero < 10) {
            return numero;
        } else {
            int menor = menor(numero / 10);
            if (numero % 10 < menor) {
                return numero % 10;
            } else {
                return menor;
            }
        }
    }

    public int val = 1;

    public void cargarCuadradoMagico(int[][] matriz, int fila, int columna) {
        int fi = 0;
        int ci = columna / 2;
        if (fila % 2 == 1 && columna % 2 == 1) {
            cargarCuadradoMagico2(matriz, fila, columna, fi, ci);
        }
    }

    private void cargarCuadradoMagico(int[][] matriz, int fila, int columna, int fi, int ci) {
        if (val - 1 == fila * columna) {
            return;
        } else {
            if (fi < 0 && ci >= columna) {
                fi = fi + 2;
                ci--;
            } else {
                if (ci >= columna) {
                    ci = 0;
                }
                if (fi < 0) {
                    fi = fila - 1;
                }
                if (matriz[fi][ci] == 0) {
                    matriz[fi][ci] = val;
                    val++;
                    fi--;
                    ci++;
                } else {
                    fi = fi + 2;
                    ci = ci - 1;
                }
            }

            cargarCuadradoMagico(matriz, fila, columna, fi, ci);
        }
    }

    private void cargarCuadradoMagico2(int[][] matriz, int fila, int columna, int fi, int ci) {
        if (val - 1 == fila * columna) {
            return;
        } else {
            if (fi < 0 && ci < 0) {
                fi = fi + 2;
                ci = ci + 1;
            } else {
                if (ci < 0) {
                    ci = columna - 1;
                }
                if (fi < 0) {
                    fi = fila - 1;
                }
                if (matriz[fi][ci] == 0) {
                    matriz[fi][ci] = val;
                    val++;
                    fi--;
                    ci--;
                } else {
                    fi = fi + 2;
                    ci = ci + 1;
                }
            }

            cargarCuadradoMagico2(matriz, fila, columna, fi, ci);
        }
    }

    public String crearCadenaDigitos(int numero) {
        if (numero > 0) {
            String cadena = crearCadenaDigitos(numero / 10);
            for (int i = 0; i < (numero % 10); i++) {
                cadena = cadena + numero % 10;
            }
            return cadena;
        } else {
            return "";
        }
    }

    public int[] newArreglo;
    public int indexNew;

    public int[] mostrarInterseccion(int[] arreglo1, int[] arreglo2) {
        newArreglo = new int[arreglo1.length + arreglo2.length];
        indexNew = 0;
        int index = 0;
        if (arreglo1.length < arreglo2.length) {
            mostrarInterseccion(arreglo1, arreglo2, index);
        } else {
            mostrarInterseccion(arreglo2, arreglo1, index);
        }
        return newArreglo;
    }

    private void mostrarInterseccion(int[] arreglo1, int[] arreglo2, int index) {
        if (index == arreglo1.length) {
            return;
        } else {
            if (seEncuentra(arreglo2, arreglo1[index], 0)) {
                newArreglo[indexNew] = arreglo1[index];
                indexNew++;
            }
            mostrarInterseccion(arreglo1, arreglo2, index + 1);
        }
    }

    public boolean seEncuentra(int[] arreglo, int elemento, int index) {
        if (index == arreglo.length) {
            return false;
        } else {
            boolean b = seEncuentra(arreglo, elemento, index + 1);
            if (elemento == arreglo[index]) {
                return true;
            } else {
                return b;
            }
        }
    }

    public void llenarMatrizTriangular(int[][] matriz, int fila, int columna) {
        int fi = fila - 1;
        int ci = 0;
        int valor = 1;
        llenarMatrizTriangular(matriz, fila, columna, fi, ci, valor, true);
    }

    private void llenarMatrizTriangular(int[][] matriz, int fila, int columna, int fi, int ci, int valor, boolean b) {
        if (fi >= 0) {
            if (b) {
                for (int i = 0; i < fi + 1; i++) {
                    matriz[fi][i] = valor;
                    valor++;
                }
            } else {
                for (int i = fi; i >= 0; i--) {
                    matriz[fi][i] = valor;
                    valor++;
                }
            }
            llenarMatrizTriangular(matriz, fila, columna, fi - 1, ci, valor, !b);
        }
    }

    public void cargarOrdenado(int numero, int[] arreglo, int n) {
        if (numero == 0) {
            return;
        } else {
            int menor = numero % 10;
            int n1 = numero;
            while (n1 > 0) {
                int d = n1 % 10;
                n1 = n1 / 10;
                if (d < menor) {
                    menor = d;
                } 
            }
            numero = eliminarDigito(numero, menor);
            arreglo[n] = menor;
            cargarOrdenado(numero, arreglo, n + 1);
        }
    }

    public void cargarVector2(int numero, int[] vector, int posicion) {
        if (numero == 0) {
            return;
        }
        cargarVector2(numero / 10, vector, posicion + 1);
        insertarOrdenado(numero % 10, vector, posicion);
    }

    public static void insertarOrdenado(int digito, int[] vector, int posicion) {
        int i = posicion - 1;
        while (i >= 0 && vector[i] > digito) {
            vector[i + 1] = vector[i];
            i--;
        }
        vector[i + 1] = digito;
    }

    public int eliminarDigito(int numero, int digito) {
        if (numero == 0) {
            return 0;
        }
        int d = numero % 10;
        if (d == digito) {
            return eliminarDigito(numero / 10, digito);
        } else {
            return eliminarDigito(numero / 10, digito) * 10 + d;
        }
    }
    
    public int menorDigito(int numero) {
        if (numero < 10) {
            return numero;
        } else {
            int menor = menorDigito(numero / 10);
            return numero % 10 < menor ? numero % 10 : menor;
        }
    }

    public int numMayor(String cadena) {
        return numMayor(cadena, 0);
    }

    private int numMayor(String cadena, int index) {
        if (index == cadena.length()) {
            return 0;
        } else {
            int num = numMayor(cadena, index + 1);
            if (Character.isDigit(cadena.charAt(index))) {
                int digitos = 0;
                while (index < cadena.length() && Character.isDigit(cadena.charAt(index))) {
                    digitos = digitos * 10 + Integer.parseInt(cadena.charAt(index) + "");
                    index++;
                }
                if (digitos > num) {
                    return digitos;
                } else {
                    return num;
                }
            }
            return num;
        }
    }


    public void cargarMatrizHueca(int[][] matriz, int fila, int columna) {
        int fi = 0;
        int ci = 0;
        if (fila % 2 == 1 && columna % 2 == 1 && fila == columna) {
            cargarMatrizHueca(matriz, fila, columna, fi, ci);
        } else {
            System.out.println("La matriz no es de orden NxN IMPAR");
        }
    }

    private void cargarMatrizHueca(int[][] matriz, int fila, int columna, int fi, int ci) {
        if (fi < fila) {
            if (fi == 0 || fi == fila - 1) {
                for (int i = 0; i < columna; i++) {
                    matriz[fi][i] = i + 1;
                }
            } else {
                matriz[fi][0] = 1;
                matriz[fi][columna - 1] = columna;
            }
            cargarMatrizHueca(matriz, fila, columna, fi + 1, ci);
        }
    }

    public void generarSerie(int n) {
        int valor = 2;
        int ini = 3;
        generarSerie(n, valor, ini);
    }

    private void generarSerie(int n, int valor, int ini) {
        if (n != 0) {
            System.out.print(valor + ", ");
            generarSerie(n - 1, valor + ini, ini + 2);
        }
    }
    

    public int cantidadDePalabras(String cadena) {
        int index = 0;
        cadena = cadena.trim();
        System.out.println(cadena);
        return cantidadDePalabras(cadena, index);
    }

    private int cantidadDePalabras(String cadena, int index) {
        if (index == cadena.length()) {
            return 1;
        } else {
            int cantidad = cantidadDePalabras(cadena, index + 1);
            if (cadena.charAt(index) == ' ') {
                cantidad++;
            }
            return cantidad;
        }
    }

    public void eliminarElemento(int[] arreglo, int n, int elemento) {
        int posicion = 0;
        eliminarElemento(arreglo, n, elemento, posicion);
    }

    private void eliminarElemento(int[] arreglo, int n, int elemento, int posicion) {
        if (posicion == n) {
            return;
        } else {
            if (elemento == arreglo[posicion]) {
                for (int i = posicion; i < n; i++) {
                    arreglo[i] = arreglo[i + 1];
                }
                arreglo[n - 1] = 0;
                eliminarElemento(arreglo, n, elemento, posicion);
            } else {
                eliminarElemento(arreglo, n, elemento, posicion + 1);
            }
        }
    }

    

}
