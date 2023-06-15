package modelo;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import clases.Reserva;


public class ReservaModelo extends Conector{

	public void registrarReserva(int idParcela, Reserva reserva) {
		
		PreparedStatement prt;
		
		try {
			prt= con.prepareStatement("INSERT INTO reservas(nombre_usuario, apellido_usuario, dni_usuario, numero_usuarios, inicio_reserva, fin_reserva,  luz, id_parcela) VALUES (?,?,?,?,?,?,?,?)");
		
			prt.setString(1,reserva.getNombreUsuario());
			prt.setString(2, reserva.getApellidoUsuario());
			prt.setString(3, reserva.getDNIUsuario());
			prt.setInt(4, reserva.getNumeroUsuarios());
			prt.setDate(5, new Date (reserva.getInicioReserva().getTime()));
			prt.setDate(6, new Date (reserva.getFinReserva().getTime()));
			prt.setBoolean(7, reserva.isLuz());
			prt.setInt(8, idParcela);
			
			prt.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		// TODO Auto-generated method stub
		
	}
/*
	"INSERT INTO reservas(nombre_usuario, apellido_usuario, dni_usuario, numero_usuarios, inicio_reserva, fin_reserva,  luz, id_parcela) "
			+ "VALUES (?,?,?,?,?,?,?,?)"
			
	"DELETE FROM reservas WHERE id = ?"
		*/

	public void eliminarReserva(int id) {
		PreparedStatement prt;
		
		try {
			prt = con.prepareStatement("DELETE FROM reservas WHERE id = ?");
			
			prt.setInt(1, id);
			
			prt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	public int getIdReserva(String DNI) {
		Reserva reserva = new Reserva();
		PreparedStatement prt;
		
		try {
			prt = con.prepareStatement("SELECT `id`  FROM `reservas` WHERE dni_usuario=?");
			
			prt.setString(1, DNI);
			
			ResultSet result = prt.executeQuery();
			
			if(result.next()) {
				
				
				reserva.setId(result.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return reserva.getId();
	}
		




}
