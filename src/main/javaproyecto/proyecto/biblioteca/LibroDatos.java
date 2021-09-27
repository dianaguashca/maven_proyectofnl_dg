package proyecto.biblioteca;

import java.time.LocalDate;

public class LibroDatos {
	public String  nombre;
	public String codigo;
	public String autor;
	public String estado;
	public String fechaEntrega;
	public String añoDePublicacion;
	public String editorial;
	public String cantidadDePaginas;
	public String precio;
	private LocalDate fechaDeEntrega;
     private String cedula;
     
     
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public LocalDate getFechaDeEntrega() {
		return fechaDeEntrega;
	}
	public void setFechaDeEntrega(LocalDate fechaDeEntrega) {
		this.fechaDeEntrega = fechaDeEntrega;
	}
	private String codigoAutor;
	private int tiempoLectura;
	
	
	public String getCodigoAutor() {
		return codigoAutor;
	}
	public void setCodigoAutor(String codigoAutor) {
		this.codigoAutor = codigoAutor;
	}
	public int getTiempoLectura() {
		return tiempoLectura;
	}
	public void setTiempoLectura(int tiempoLectura) {
		this.tiempoLectura = tiempoLectura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigoL) {
		this.codigo = codigoL;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public String getAnioDePublicacion() {
		return añoDePublicacion;
	}
	public void setAnioDePublicacion(String añoDePublicacion) {
		this.añoDePublicacion = añoDePublicacion;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getCantidadDePaginas() {
		return cantidadDePaginas;
	}
	public void setCantidadDePaginas(String cantidadDePaginas) {
		this.cantidadDePaginas = cantidadDePaginas;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "LibroDatos [nombre=" + nombre + ", codigo=" + codigo + ", autor=" + autor + ", estado=" + estado
				+ ", fechaEntrega=" + fechaEntrega + ", añoDePublicacion=" + añoDePublicacion + ", editorial="
				+ editorial + ", cantidadDePaginas=" + cantidadDePaginas + ", precio=" + precio + "]";
	}
	
//	public String toString() {
//		return "BibliotecaUce [nombre]=" + nombre + ", [Codigo]=" + codigo + ", [Autor]=" + autor + ", [Estado]=" + estado
//				+ ", [FechaEntrega]=" + fechaEntrega + ", [AñoDePublicacion]=" + añoDePublicacion + "]";
//	}
//	
//	
	
	
	
}
