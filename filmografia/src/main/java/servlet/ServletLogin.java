package servlet;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.UserAdmin;
import vista.Principal;

/**
 * Servlet implementation class ServletLogin
 */
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String sNombreUsuario = request.getParameter("usuario");
		String sClave = request.getParameter("clave");

		UserAdmin oUserAdmin = new UserAdmin(sNombreUsuario, sClave);
		List<UserAdmin> list = Principal.generalController.getUserAdminController().identificarUsuario(oUserAdmin);

		request.setAttribute("usuarioAdministrador", list);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("usuarioAdministrador.jsp");
		requestDispatcher.forward(request, response);
	}

}
