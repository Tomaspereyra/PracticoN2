package modelo.vista;

import java.util.ArrayList;
import java.util.List;

import modelo.Boxeador;
import modelo.Entrenador;
import modelo.TipoCategoria;
import modelo.controlador.GimnasioControlador;
import modelo.implementacion.GimnasioImpl;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GimnasioControlador g = new GimnasioControlador(new GimnasioImpl(new ArrayList<Boxeador>(),new ArrayList<Entrenador>()));
	
		Entrenador e1 = new Entrenador(new ArrayList<Boxeador>(),"Tomas",new ArrayList<TipoCategoria>());
		e1.agregarCategoria(TipoCategoria.MOSCA);
		e1.agregarCategoria(TipoCategoria.GALLO);

		g.agregarEntrenador(e1);
		
		Entrenador e2 = new Entrenador(new ArrayList<Boxeador>(),"Nehuen",new ArrayList<TipoCategoria>());
		e2.agregarCategoria(TipoCategoria.PLUMA);
		e2.agregarCategoria(TipoCategoria.LIGERO);
		
		g.agregarEntrenador(e2);
		
		Entrenador e3 = new Entrenador(new ArrayList<Boxeador>(),"Juan",new ArrayList<TipoCategoria>());
		e3.agregarCategoria(TipoCategoria.WELTER);
		e3.agregarCategoria(TipoCategoria.MEDIANO);
		g.agregarEntrenador(e3);
		
		Entrenador e4 = new Entrenador(new ArrayList<Boxeador>(),"Pepe",new ArrayList<TipoCategoria>());
		e4.agregarCategoria(TipoCategoria.MEDIOPESADO);
		e4.agregarCategoria(TipoCategoria.PESADO);
		
		g.agregarEntrenador(e4);
		
		g.ingresarAspirante(new Boxeador("Roberto", "Garcia", 20, 1.70, 70.5));
		g.ingresarAspirante(new Boxeador("Roberto", "G", 20, 1.70, 70.5));
		g.ingresarAspirante(new Boxeador("Roberto", "Gcia", 20, 1.70, 70.5));
		g.ingresarAspirante(new Boxeador("Roberto", "arcia", 20, 1.70, 70.5));
		g.ingresarAspirante(new Boxeador("Roberto", "apellido1", 20, 1.70, 70.5));
		g.ingresarAspirante(new Boxeador("Roberto", "apellido2", 20, 1.70, 70.5));
		System.out.println(g.traerEntrenadores());


	}

}
