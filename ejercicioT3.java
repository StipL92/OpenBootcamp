public class Main {

    public static void main(String[] args) {
        suma(15, 35, 45);

        Coche miCoche = new Coche();

        miCoche.sumarPuertas();
        miCoche.sumarPuertas();
        System.out.println("El numero de puertas es: " + miCoche.numPuertas);

    }

    public static void suma(int a, int b, int c){
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
}

class Coche {
    int numPuertas = 3;

    public void sumarPuertas(){

        this.numPuertas++;
    }
}