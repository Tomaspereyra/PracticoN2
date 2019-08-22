package modelo.implementacion;

import java.util.List;

import modelo.Boxeador;
import modelo.Entrenador;
import modelo.TipoCategoria;
import modelo.interfaz.Gimnasio;

public class GimnasioImpl implements Gimnasio {

	private List<Boxeador> boxeadores;
	private List<Entrenador> entrenadores;
	
	public GimnasioImpl(List<Boxeador> boxeadores,List<Entrenador> entrenadores) {
		this.boxeadores = boxeadores;
		this.entrenadores=entrenadores;
	}
	@Override
	public void agregarEntrenador(Entrenador e) {
		this.entrenadores.add(e);
	}
	public List<Boxeador> traerBoxeadores(){
		return this.boxeadores;
	}
	
	


	public List<Entrenador> getEntrenadores() {
		return entrenadores;
	}
	@Override
	public void ingresarAspirante(Boxeador b) {
		Double peso = b.getPeso();
		
		if(peso<48.988) {
			b.setCategoria(TipoCategoria.MOSCA); // asignarle dieta
		}
	
		if ( peso >= 48.988 && peso <=50.802) {
			b.setCategoria(TipoCategoria.MOSCA);
		
			
		}
		else if (peso >= 52.163 && peso<=53.525) {
			b.setCategoria(TipoCategoria.GALLO);
		}
		else if(peso>=55.338 && peso<=57.152) {
			b.setCategoria(TipoCategoria.PLUMA);
		}
		else if(peso>=58.967 && peso<=61.237) {
			b.setCategoria(TipoCategoria.LIGERO);
		}
		else if(peso>=63.503 && peso<= 66.678) {
			b.setCategoria(TipoCategoria.WELTER);
		}
		else if(peso>=69.853 && peso<= 72.562){
			b.setCategoria(TipoCategoria.MEDIANO);
		}
		else if(peso>=76.205 && peso<= 79.378){
			b.setCategoria(TipoCategoria.MEDIOPESADO);
		}
		else if(peso>=91) {
			b.setCategoria(TipoCategoria.PESADO);
		}
		
		
		this.asignarEntrenador(b); //asigno entrenador una vez que ya se definio la categoria
		
		
		

	}
	@Override
	public void asignarEntrenador(Boxeador b) {
		Entrenador entrenador = this.traerEntrenador(b.getCategoria());
		if(entrenador.getBoxeadoresAsignados().size()<5) {		
			b.setEntrenador(entrenador);
			entrenador.getBoxeadoresAsignados().add(b);
			
	}
		else {
			System.out.println("El entrenador de"+b.getCategoria()+" a superado el limite de boxeadores");
		}
	}
	
	private Entrenador traerEntrenador(TipoCategoria tipo) {
		Entrenador entrenador = null;
		for(Entrenador e : this.entrenadores) {
			for (TipoCategoria t : e.getCategorias()) {
				if( t.compareTo(tipo)== 0) {
					entrenador = e;
				}
			}
		}
		return entrenador;
	}

}
