package modelo;

import java.sql.Date;

public class Pelicula {

	private String sDirector;
	private String sTitulo;
	private Date fecha;
	
	
	public Pelicula(String sDirector, String sTitulo, Date fecha) {
		super();
		this.sDirector = sDirector;
		this.sTitulo = sTitulo;
		this.fecha = fecha;
	}


	public String getsDirector() {
		return sDirector;
	}


	public void setsDirector(String sDirector) {
		this.sDirector = sDirector;
	}


	public String getsTitulo() {
		return sTitulo;
	}


	public void setsTitulo(String sTitulo) {
		this.sTitulo = sTitulo;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	@Override
	public String toString() {
		return "Pelicula [sDirector=" + sDirector + ", sTitulo=" + sTitulo + ", fecha=" + fecha + "]";
	}
	
	
	
}
