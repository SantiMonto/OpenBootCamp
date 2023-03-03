public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 32;
        cliente.telefono = 4568795;
        cliente.nombre = "Ramiro";
        cliente.credito = 500000;
        System.out.println("El cliente " + cliente.nombre + " de " + cliente.edad + " años" + " cuyo telefono es "
                + cliente.telefono + " posee un credito de $ " + cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 28;
        trabajador.telefono = 7898523;
        trabajador.nombre = "Juan";
        trabajador.salario = 2800.54;
        System.out.println("El trabajador " + trabajador.nombre + " de " + trabajador.edad + " años" + " cuyo telefono es "
                + trabajador.telefono + " posee un salario de $ " + trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona{
    double salario;
}
