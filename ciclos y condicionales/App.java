public class App {
    public static void main(String[] args) {
        int numero = -4;

        if(numero>0){
            System.out.println("El numero es positivo");
        }else if(numero<0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es 'cero'");
        }

        int numeroWhile = 0;
        while(numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do{
            System.out.println("Do while muestra que el numeroWhile es"+" "+numeroWhile);
        } while(numeroWhile<3);

        
        for(int numeroFor=0; numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }

        String estacion = "cualquiera";

        switch(estacion){
            case "verano": System.out.println("estamos en verano");
            break;
            case "invierno": System.out.println("estamos en invierno");
            break;
            case "otoño": System.out.println("estamos en otoño");
            break;
            case "primavera": System.out.println("estamos en primavera");
            break;
            default:System.out.println("el valor no corresponde a ninguna estación");
        }
    }
}