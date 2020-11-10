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
 * Servlet implementation class ServletAniadirPelicula
 */
public class ServletAniadirPelicula extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAniadirPelicula() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String sDirector = request.getParameter("director");
		String sTitulo = request.getParameter("titulo");
		Date fecha = null;
		Pelicula oPelicula = new Pelicula(sDirector, sTitulo, fecha);
		List<Pelicula> list = Principal.generalController.getPeliculaController().aniadirPelicula(oPelicula);
		
		request.setAttribute("peliculaAniadida", list);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("peliculaAniadida.jsp");
		requestDispatcher.forward(request, response);
	}

}
