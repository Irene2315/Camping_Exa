package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;

import clases.Parcela;

public class ParcelaModelo extends Conector {

	public ArrayList<Parcela> getParcelas() {
		
		ArrayList<Parcela> parcelas = new ArrayList<>();
		PreparedStatement prt;
		
		try {
			prt=con.prepareStatement("SELECT `id`, `numero`, `m_cuadrados`, `precio_dia` FROM `parcelas` ");
		
			ResultSet result = prt.executeQuery();
			
			while(result.next()) {
				Parcela parcela = new Parcela();
				
				parcela.setId(result.getInt(1));
				parcela.setNumero(result.getString(2));
				parcela.setmCuadrados(result.getInt(3));
				parcela.setPrecioDia(result.getDouble(4));
				
				parcelas.add(parcela);
				
				
			}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return parcelas;
	}

	public Parcela getParcela(String numero) {
		Parcela parcela = new Parcela();
		PreparedStatement prt;
		
		try {
			prt=con.prepareStatement("SELECT `id`, `numero`, `m_cuadrados`, `precio_dia` FROM `parcelas` WHERE numero=?");
		
			prt.setString(1, numero);
			ResultSet result = prt.executeQuery();
			
			if(result.next()) {
				
				
				parcela.setId(result.getInt(1));
				parcela.setNumero(result.getString(2));
				parcela.setmCuadrados(result.getInt(3));
				parcela.setPrecioDia(result.getDouble(4));
				
				
				
				
			}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return parcela;
		
	}

	public Parcela getParcelaId(int idParcela) {
		Parcela parcela = new Parcela();
		PreparedStatement prt;
		
		try {
			prt=con.prepareStatement("SELECT `id`, `numero`, `m_cuadrados`, `precio_dia` FROM `parcelas` WHERE id=?");
		
			prt.setInt(1, idParcela);
			ResultSet result = prt.executeQuery();
			
			if(result.next()) {
				
				
				parcela.setId(result.getInt(1));
				parcela.setNumero(result.getString(2));
				parcela.setmCuadrados(result.getInt(3));
				parcela.setPrecioDia(result.getDouble(4));
				
				
				
				
			}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return parcela;
	}
	
	//select * from parcelas
	
	
	


}
