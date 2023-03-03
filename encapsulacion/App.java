public class App {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Santiago");
        System.out.println("Se llama "+persona.getNombre());
        persona.setEdad(32);
        System.out.println("Tiene "+persona.getEdad()+" años");
        persona.setTelefono(4124896);
        System.out.println("Su telefono es "+persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getTelefono(){
        return this.telefono;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
}