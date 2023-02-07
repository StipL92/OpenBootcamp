public class Main
{
	public static void main(String[] args) {
	    
	    Persona persona = new Persona();
	    
	    persona.setEdad (30);
	    persona.setNombre ("Stiven L");
	    persona.setTelefono (311787151);
	    
		System.out.println(persona.getEdad());
		System.out.println(persona.getNombre());
		System.out.println(persona.getTelefono());
	}
}
	
class Persona {
    private int edad;
    private String nombre;
    private int telefono;
    
    //get set edad
    public void setEdad (int edad){
        this.edad = edad;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    //get set nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    //get set telefono
    public void setTelefono(int telefono ){
        this.telefono = telefono;
    }
    
    public int getTelefono(){
        return this.telefono;
    }
}