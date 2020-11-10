package controlador.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import controlador.database.DBConnection;

import modelo.UserAdmin;

public class UserAdminController {

	public List<UserAdmin> identificarUsuario(UserAdmin oUserAdmin) {

		String sNombreUsuario;
		String sClave;

		List<UserAdmin> list = null;

		sNombreUsuario = oUserAdmin.getsNombreUsuario();
		sClave = oUserAdmin.getsClave();

		String sql = "SELECT * FROM USERADMIN WHERE NOMBREUSUARIO = '" + sNombreUsuario + "' AND CLAVE = '" + sClave
				+ "';";

		try {
			list = new ArrayList<UserAdmin>();
			Statement statement = DBConnection.getConnection().createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {

				sNombreUsuario = resultSet.getString("nombreUsuario");
				sClave = resultSet.getString("clave");

				UserAdmin oUserAdmin1 = new UserAdmin(sNombreUsuario, sClave);
				list.add(oUserAdmin1);

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return list;

	}

}
