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
    
}
