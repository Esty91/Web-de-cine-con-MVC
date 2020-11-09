package controlador.database;

import controlador.modelo.PeliculaController;

public interface IGeneralController {
	public DBConnection getConexionDB();

	public PeliculaController getPeliculaController();

}