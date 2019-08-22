package modelo;

public class Categoria {

	private TipoCategoria tipoCategoria;
	private Double pesoMinimo;
	private Double pesoMaximo;
	public Categoria(TipoCategoria tipoCategoria, Double pesoMinimo, Double pesoMaximo) {
		super();
		this.tipoCategoria = tipoCategoria;
		this.pesoMinimo = pesoMinimo;
		this.pesoMaximo = pesoMaximo;
	}
	public TipoCategoria getTipoCategoria() {
		return tipoCategoria;
	}
	public void setTipoCategoria(TipoCategoria tipoCategoria) {
		this.tipoCategoria = tipoCategoria;
	}
	public Double getPesoMinimo() {
		return pesoMinimo;
	}
	public void setPesoMinimo(Double pesoMinimo) {
		this.pesoMinimo = pesoMinimo;
	}
	public Double getPesoMaximo() {
		return pesoMaximo;
	}
	public void setPesoMaximo(Double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}
	@Override
	public String toString() {
		return "Categoria [tipoCategoria=" + tipoCategoria + ", pesoMinimo=" + pesoMinimo + ", pesoMaximo=" + pesoMaximo
				+ "]";
	}
	
	
}
