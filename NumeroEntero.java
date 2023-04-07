public class NumeroEntero {
    private long n;

    public long get() {
        return n;
    }

    public void set(long n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "NumeroEntero: " + this.n;
    }

    public long cantidadDigitos() {
        long n1 = this.n;
        int cantidad = 0;
        while(n1 > 0) {
            n1 = n1 / 10;
            cantidad++;
        }
        return cantidad;
    }

    public int cantidadDigitosPares() {
        long n1 = this.n;
        int cantidad = 0;
        while(n1 > 0) {
            if ((n1 % 10) % 2 == 0) {
                cantidad++;
            }
            n1 = n1 / 10;
        }
        return cantidad;
    }

    public int cantidadDigitosRecursivo() {
        return cantidadDigitosRecursivo(this.n);
    }
    
    private int cantidadDigitosRecursivo(long n) {
        if (n == 0) {
            return 0;
        } else {
            return cantidadDigitosRecursivo(n / 10) + 1;
        }
    }

    public int cantidadDigitosParesRecursivo() {
        return cantidadDigitosParesRecursivo(this.n);
    }

    private int cantidadDigitosParesRecursivo(long n) {
        if (n == 0) {
            return 0;
        } else {
            if ((n % 10) % 2 == 0) {
                return cantidadDigitosParesRecursivo(n / 10) + 1;
            } else {
                return cantidadDigitosParesRecursivo(n / 10);
            }
        }
    }

    public int cantidadDigitosFormula() {
        return (int) (Math.log10(this.n) + 1);
    }
}
