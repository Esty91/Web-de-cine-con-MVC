package controlador.modelo;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import controlador.database.DBConnection;

import modelo.Pelicula;

public class PeliculaController {

	public List<Pelicula> buscarPeliculaPorDirector(Pelicula oPelicula) {

		String sDirector = null;
		String sTitulo = null;
		Date fecha;
		List<Pelicula> list = null;
		
		sDirector = oPelicula.getsDirector();

		String sql = "SELECT * FROM PELICULA WHERE DIRECTOR = '" + sDirector + "';";

		try {
			list = new ArrayList<Pelicula>();
			Statement statement = DBConnection.getConnection().createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {

				sDirector = resultSet.getString("director");
				sTitulo = resultSet.getString("titulo");
				fecha = resultSet.getDate("fecha");
			

				Pelicula oPelicula1 = new Pelicula(sDirector, sTitulo, fecha);
				list.add(oPelicula1);

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return list;

	}

}
