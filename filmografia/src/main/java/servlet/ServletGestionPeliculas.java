package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletGestionPeliculas
 */
public class ServletGestionPeliculas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletGestionPeliculas() {
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
		String sOpcion = request.getParameter("opcion");
		if (sOpcion.equals("Añadir pelicula")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("aniadirPelicula.jsp");
			dispatcher.forward(request, response);
		}else if (sOpcion.equals("Modificar pelicula")) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("modificarPelicula.jsp");
			requestDispatcher.forward(request, response);
		}else if (sOpcion.equals("Eliminar pelicula")) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("eliminarPelicula.jsp");
			requestDispatcher.forward(request, response);
		}
	}

}
