public class App {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        // System.out.println(sumar(3,2,5));
        Coche miCoche = new Coche();
        miCoche.incrementar();
        miCoche.incrementar();
        System.out.println(miCoche.puertas);
    }
    public static int sumar(int a, int b, int c) {
        int resultado;
        return resultado = a + b +c;
    }
}

class Coche {
    public int puertas = 4;

    public void incrementar(){
        this.puertas++;
    }
}