package servlet;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Pelicula;
import vista.Principal;

/**
 * Servlet implementation class ServletBuscarPeliculasPorDirector
 */
public class ServletBuscarPeliculasPorDirector extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletBuscarPeliculasPorDirector() {
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
		String sDirector = request.getParameter("director");
		String sTitulo = null;
		Date fecha = null;

		Pelicula oPelicula = new Pelicula(sDirector, sTitulo, fecha);
		List<Pelicula> list = Principal.generalController.getPeliculaController().buscarPeliculaPorDirector(oPelicula);

		request.setAttribute("peliculaPorDirector", list);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("peliculaPorDirector.jsp");
		requestDispatcher.forward(request, response);
	}

}
