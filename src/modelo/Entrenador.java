package modelo;

import java.util.List;

public class Entrenador {
private List<Boxeador> boxeadoresAsignados;
private String nombre;

private List<TipoCategoria> categorias;
public Entrenador(List<Boxeador> boxeadoresAsignados, String nombre,List<TipoCategoria> categorias) {
	
	this.boxeadoresAsignados = boxeadoresAsignados;
	this.nombre = nombre;
	this.categorias = categorias;
}

public List<TipoCategoria> getCategorias() {
	return categorias;
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public void agregarCategoria(TipoCategoria t) {
	this.categorias.add(t);
}

public List<Boxeador> getBoxeadoresAsignados() {
	return boxeadoresAsignados;
}

@Override
public String toString() {
	return "Entrenador [boxeadoresAsignados=" + boxeadoresAsignados + ", nombre=" + nombre + ", categorias="
			+ categorias + "]";
}




}
