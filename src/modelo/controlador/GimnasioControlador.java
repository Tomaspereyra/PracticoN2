package modelo.controlador;

import java.util.List;

import modelo.Boxeador;
import modelo.Entrenador;
import modelo.implementacion.GimnasioImpl;

public class GimnasioControlador {

	private GimnasioImpl gimnasioImplementacion;

	public GimnasioControlador(GimnasioImpl gimnasioImplementacion) {
		super();
		this.gimnasioImplementacion = gimnasioImplementacion;
	}
	
	public void ingresarAspirante(Boxeador b) {
		this.gimnasioImplementacion.ingresarAspirante(b);
	}

	public void asignarEntrenador(Boxeador b) {
		this.gimnasioImplementacion.asignarEntrenador(b);
	}
	public void agregarEntrenador(Entrenador e) {
		this.gimnasioImplementacion.agregarEntrenador(e);
	}

	public GimnasioImpl getGimnasioImplementacion() {
		return gimnasioImplementacion;
	}
	public List<Entrenador> traerEntrenadores(){
		return this.gimnasioImplementacion.getEntrenadores();
	}
	public List<Boxeador> traerBoxeadores(){
		return this.gimnasioImplementacion.traerBoxeadores();
	}


	
	
}
