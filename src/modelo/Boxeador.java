package modelo;

public class Boxeador {
private String nombre;
private String apellido;
private Integer edad;
private Double altura;
private Double peso;
private Entrenador entrenador;
private TipoCategoria categoria;


public String getNombre() {
	return nombre;
}
public Boxeador(String nombre, String apellido, Integer edad, Double altura, Double peso) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
	this.altura = altura;
	this.peso = peso;
	
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public Integer getEdad() {
	return edad;
}
public void setEdad(Integer edad) {
	this.edad = edad;
}
public Double getAltura() {
	return altura;
}
public void setAltura(Double altura) {
	this.altura = altura;
}
public Double getPeso() {
	return peso;
}
public void setPeso(Double peso) {
	this.peso = peso;
}
public Entrenador getEntrenador() {
	return entrenador;
}
public void setEntrenador(Entrenador entrenador) {
	this.entrenador = entrenador;
}
public TipoCategoria getCategoria() {
	return categoria;
}
public void setCategoria(TipoCategoria categoria) {
	this.categoria = categoria;
}
@Override
public String toString() {
	return "Boxeador [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", altura=" + altura + ", peso="
			+ peso + ", categoria=" + categoria + "]";
}

}
