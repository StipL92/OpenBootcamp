public class Main
{
	public static void main(String[] args) {
	    
	    Cliente cliente = new Cliente();
	    Trabajador trabajador = new Trabajador();
	    
	    cliente.nombre = "Stiven";
	    cliente.edad = 30;
	    cliente.telefono = 31178715;
	    cliente.credito = 53.1;
	    
		System.out.println(cliente.nombre + " tiene " + cliente.edad +
		 " años, su telefono es: " + cliente.telefono + " y tiene un credito por un valor de: " +
		 cliente.credito);
		 
		trabajador.nombre = "Kelly";
	    trabajador.edad = 28;
	    trabajador.telefono = 31485235;
	    trabajador.salario = 1.190;
	    
		System.out.println(trabajador.nombre + " tiene " + trabajador.edad +
		 " años, su telefono es: " + trabajador.telefono +  " y tiene un salario de " + trabajador.salario);
	
	}
}
	
class Persona {
    int edad;
    String nombre;
    int telefono;
    
   
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona {
    double salario;
}
