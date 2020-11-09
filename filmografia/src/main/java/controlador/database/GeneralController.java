package controlador.database;

import controlador.modelo.PeliculaController;

public class GeneralController implements IGeneralController{
	private DBConnection conexionDB;
	private PeliculaController peliculaController;

	public GeneralController(String sDatabase) {

		this.conexionDB = new DBConnection(sDatabase);
		this.peliculaController = new PeliculaController();

	}

	@Override
	public DBConnection getConexionDB() {
		return this.conexionDB;
	}

	
	@Override
	public PeliculaController getPeliculaController() {
		return this.peliculaController;
	}

}
