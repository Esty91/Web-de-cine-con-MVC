package controlador.database;

import controlador.modelo.PeliculaController;
import controlador.modelo.UserAdminController;

public interface IGeneralController {
	public DBConnection getConexionDB();

	public PeliculaController getPeliculaController();
	
	public UserAdminController getUserAdminController();

}