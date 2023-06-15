package controlador;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Parcela;
import clases.Reserva;
import modelo.ParcelaModelo;
import modelo.ReservaModelo;

/**
 * Servlet implementation class ConfirmarReserva
 */
@WebServlet("/AlmacenarReserva")
public class AlmacenarReserva extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlmacenarReserva() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    int idParcela = Integer.parseInt(request.getParameter("id_parcela"));
	    
	    String nombre = request.getParameter("nombre");
	    String apellido = request.getParameter("apellido");
	    String DNI = request.getParameter("dni");
	    int numPersonas= Integer.parseInt(request.getParameter("numero_personas"));
	    
	    SimpleDateFormat spd = new SimpleDateFormat("dd-MM-yyyy");
	    Date fechaInicio = new Date();
	    Date fechaFin = new Date();
	    try {
			fechaInicio = spd.parse(request.getParameter("fecha_inicio"));
			fechaFin = spd.parse(request.getParameter("fecha_fin"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	    boolean luz =Boolean.parseBoolean(request.getParameter("luz"));
	    
	    Reserva reserva = new Reserva();
	    reserva.setNombreUsuario(nombre);
	    reserva.setApellidoUsuario(apellido);
	    reserva.setDNIUsuario(DNI);
	    reserva.setNumeroUsuarios(numPersonas);
	    reserva.setInicioReserva(fechaInicio);
	    reserva.setFinReserva(fechaFin);
	    reserva.setLuz(luz);
	    
	    
	    
	    ReservaModelo reservaM = new ReservaModelo();
	    
	    reservaM.registrarReserva(idParcela,reserva);
	    
	    int idReserva =reservaM.getIdReserva(DNI);
	    
	    reserva.setId(idReserva);
	    
	    
	    
	    ParcelaModelo parcelaM = new ParcelaModelo();
	    Parcela parcela =parcelaM.getParcelaId(idParcela);
	    
	    request.setAttribute("parcela", parcela);
	    request.setAttribute("reserva", reserva);
	    
	    request.getRequestDispatcher("infoReserva.jsp").forward(request, response);
	}

}
