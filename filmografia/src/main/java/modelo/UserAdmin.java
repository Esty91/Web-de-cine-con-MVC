package modelo;

public class UserAdmin {

	private String sNombreUsuario;
	private String sClave;
	
	
	public UserAdmin(String sNombreUsuario, String sClave) {
		super();
		this.sNombreUsuario = sNombreUsuario;
		this.sClave = sClave;
	}


	public String getsNombreUsuario() {
		return sNombreUsuario;
	}


	public void setsNombreUsuario(String sNombreUsuario) {
		this.sNombreUsuario = sNombreUsuario;
	}


	public String getsClave() {
		return sClave;
	}


	public void setsClave(String sClave) {
		this.sClave = sClave;
	}


	@Override
	public String toString() {
		return "UserAdmin [sNombreUsuario=" + sNombreUsuario + ", sClave=" + sClave + "]";
	}
	
	
}
