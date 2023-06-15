package clases;

import java.util.Date;

/**
 * 
 * @author Eñaut
 * Esta clase DTO representa la entidad
 * RESERVA de la BBDD
 *
 */
public class Reserva {
	private int id;
	private String nombreUsuario;
	private String apellidoUsuario;
	private String DNIUsuario;
	private int numeroUsuarios;
	private Date inicioReserva;
	private Date finReserva;
	private Date fechaReserva;
	private boolean luz;
	private Parcela idParcela;
	
	public Reserva(int id, String nombreUsuario, String apellidoUsuario, String dNIUsuario, int numeroUsuarios,
			Date inicioReserva, Date finReserva, Date fechaReserva, boolean luz, Parcela idParcela) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.apellidoUsuario = apellidoUsuario;
		DNIUsuario = dNIUsuario;
		this.numeroUsuarios = numeroUsuarios;
		this.inicioReserva = inicioReserva;
		this.finReserva = finReserva;
		this.fechaReserva = fechaReserva;
		this.luz = luz;
		this.idParcela = idParcela;
	}
	
	public Reserva() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidoUsuario() {
		return apellidoUsuario;
	}

	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}

	public String getDNIUsuario() {
		return DNIUsuario;
	}

	public void setDNIUsuario(String dNIUsuario) {
		DNIUsuario = dNIUsuario;
	}

	public int getNumeroUsuarios() {
		return numeroUsuarios;
	}

	public void setNumeroUsuarios(int numeroUsuarios) {
		this.numeroUsuarios = numeroUsuarios;
	}

	public Date getInicioReserva() {
		return inicioReserva;
	}

	public void setInicioReserva(Date inicioReserva) {
		this.inicioReserva = inicioReserva;
	}

	public Date getFinReserva() {
		return finReserva;
	}

	public void setFinReserva(Date finReserva) {
		this.finReserva = finReserva;
	}

	public Date getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public boolean isLuz() {
		return luz;
	}

	public void setLuz(boolean luz) {
		this.luz = luz;
	}

	public Parcela getIdParcela() {
		return idParcela;
	}

	public void setIdParcela(Parcela idParcela) {
		this.idParcela = idParcela;
	}

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", nombreUsuario=" + nombreUsuario + ", apellidoUsuario=" + apellidoUsuario
				+ ", DNIUsuario=" + DNIUsuario + ", numeroUsuarios=" + numeroUsuarios + ", inicioReserva="
				+ inicioReserva + ", finReserva=" + finReserva + ", fechaReserva=" + fechaReserva + ", luz=" + luz
				+ ", idParcela=" + idParcela + "]";
	}
	
	
}
