package cl.ido.ws;

public class HelloWorld {
	
	public String sayHelloWorld(String name) {  
        return "Hello world from "+ name;  
    }  

	public Persona getPersona(String name) {
		Persona p = new Persona();
		p.setName(name);
		p.setLastName("Doe");
		return p;
	}
}