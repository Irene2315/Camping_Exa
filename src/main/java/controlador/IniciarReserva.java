package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Parcela;
import modelo.ParcelaModelo;

/**
 * Servlet implementation class IniciarReserva
 */
@WebServlet("/IniciarReserva")
public class IniciarReserva extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IniciarReserva() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	   String numero= request.getParameter("numero");
	   
	   ParcelaModelo parcelaM = new ParcelaModelo();
	   
	   Parcela parcela =parcelaM.getParcela(numero);
	   
	   request.setAttribute("parcela", parcela);
	   
	   request.getRequestDispatcher("formReserva.jsp").forward(request, response);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
