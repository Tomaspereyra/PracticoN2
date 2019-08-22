package modelo.interfaz;

import modelo.Boxeador;
import modelo.Entrenador;

public interface Gimnasio<B extends Boxeador,E extends Entrenador> {
public void ingresarAspirante(B b);
public void agregarEntrenador(E e) ;
public void asignarEntrenador(B b) ;

}
