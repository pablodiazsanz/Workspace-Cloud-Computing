package negocio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entidad.Casa;

public class MainSpring {
	
	public static ApplicationContext context = null;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		context = new ClassPathXmlApplicationContext("recursos/context.xml");
		
		Casa miCasaAlquilada = context.getBean("miCasaAlquilada", Casa.class);
		int m2casaAlquilada = miCasaAlquilada.getMetrosCuadrados(context.getBean("arrayHabitaciones", java.util.ArrayList.class));
		System.out.println(miCasaAlquilada.toString());
		System.out.println("La casa alquilada tiene " + m2casaAlquilada + " metros cuadrados");
		
	}

}
