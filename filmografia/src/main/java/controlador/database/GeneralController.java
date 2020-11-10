package controlador.database;

import controlador.modelo.PeliculaController;
import controlador.modelo.UserAdminController;

public class GeneralController implements IGeneralController{
	private DBConnection conexionDB;
	private PeliculaController peliculaController;
	private UserAdminController userAdminController;

	public GeneralController(String sDatabase) {

		this.conexionDB = new DBConnection(sDatabase);
		this.peliculaController = new PeliculaController();
		this.userAdminController = new UserAdminController();

	}

	@Override
	public DBConnection getConexionDB() {
		return this.conexionDB;
	}

	
	@Override
	public PeliculaController getPeliculaController() {
		return this.peliculaController;
	}
    @Override
	public UserAdminController getUserAdminController() {
		return this.userAdminController;
		
	}
}
