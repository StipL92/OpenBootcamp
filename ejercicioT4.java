public class Main {
    public static void main(String[] args) {
        var numeroIf = 5;

        //if - else

        if ( numeroIf < 0){
            System.out.println("El numero " + numeroIf + " es negativo");
        } else if ( numeroIf > 0) {
            System.out.println("El numero " + numeroIf + " es positivo");
        } else {
            System.out.println("El numero es cero");
        }

        //while

        var numeroWhile = 1;

        while ( numeroWhile < 3) {
            numeroWhile++;
            System.out.println("numeroWhile ahora vale: " + numeroWhile);
            
        }

        //Do while

        var numeroDoWhile = 3;

        do {
            numeroDoWhile++;
            System.out.println("numeroDoWhile ahora vale: " + numeroDoWhile);
        } while ( numeroDoWhile < 3);

        //For

        for ( var numeroFor = 0 ; numeroFor <= 3 ; numeroFor++) {
            System.out.println("El numeroFor es: " + numeroFor);
        }

        //switch

        var estacion = "verano";

        switch (estacion) {
            case "verano":
                System.out.println ("Es verano");
                break;
            case "otoño":
                System.out.println ("Es otoño");
                break;
            case "invierno":
                System.out.println ("Es invierno");
                break;
            case "primavera":
                System.out.println ("Es primavera");
                break;
            default:
                System.out.println ("No es una estacion");
        }
    }

}