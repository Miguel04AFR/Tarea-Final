package LogicaClases;
import java.util.ArrayList;

public class Agencia {
	private String IdAgencia;
	private String gerente;
	private String direccion;
	private ArrayList<CajeroAutomatico> cajero;
	
	public Agencia(String IdAgencia,String gerente,String direccion) {
		setIdAgencia(IdAgencia);
		setGerente(gerente);
		setDireccion(direccion);
		cajero=new ArrayList<CajeroAutomatico>();
	}

	public String getIdAgencia() {
		return IdAgencia;
	}

	public void setIdAgencia(String idAgencia) {
		IdAgencia = idAgencia;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<CajeroAutomatico> getCajero() {
		return cajero;
	}

	public void setCajero(ArrayList<CajeroAutomatico> cajero) {
		this.cajero = cajero;
	}
}
