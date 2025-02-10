package LogicaClases;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class Usuario {
	private String IdU;
	private String contraseña;
	private String nombreCompleto;
	private String direccion;
	private String telefono;
	private String correoelectronico;
	private char sexo;
	private String CI;
	private String DosPasos;
	private String telFijo;
	private ArrayList<CuentaBancaria> cuentas;
	private ArrayList<ArrayList<String>> UltimasOpe;
	
	

	public Usuario(String IdU,String contraseña,String nombreCompleto,String direccion,String telefono,String correoelectronico, char sexo,String CI,String DosPasos,String telFijo){
		setIdU(IdU);
		setContraseña(contraseña);
		setNombreCompleto(nombreCompleto);
		setDireccion(direccion);
	 setTelefono(telefono);
	 setCorreoelectronico(correoelectronico);
	 setSexo(sexo);
	 setCI(CI);
	 setDosPasos(DosPasos);
	 setTelFijo(telFijo);
	 cuentas=new ArrayList<CuentaBancaria>();
	 UltimasOpe=new ArrayList<>();
	 
 }

	
public void setCuentas(ArrayList<CuentaBancaria> cuentas) {
	this.cuentas = cuentas;
}

public String getContraseña() {
	return contraseña;
}

public void setContraseña(String contraseña) {
	this.contraseña = contraseña;
}

public String getIdU() {
	return IdU;
}
public void setIdU(String idU) {
	IdU = idU;
}
public String getNombreCompleto() {
	return nombreCompleto;
}
public void setNombreCompleto(String nombreCompleto) {
	this.nombreCompleto = nombreCompleto;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public String getCorreoelectronico() {
	return correoelectronico;
}
public void setCorreoelectronico(String correoelectronico) {
	this.correoelectronico = correoelectronico;
}
public char getSexo() {
	return sexo;
}
public void setSexo(char sexo) {
	this.sexo = sexo;
}

public String getCI() {
	return CI;
}

public void setCI(String cI) {
	CI = cI;
}

public String getDosPasos() {
	return DosPasos;
}

public void setDosPasos(String dosPasos) {
	DosPasos = dosPasos;
}

public String getTelFijo() {
	return telFijo;
}

public void setTelFijo(String telFijo) {
	this.telFijo = telFijo;
}


public ArrayList<CuentaBancaria> getCuentas() {
	return cuentas;
}

public boolean Solouno(){
	boolean unacuenta=true;

	for(int i=0;i<getCuentas().size();i++){
		if((getCuentas().get(i) instanceof Fondo) || (getCuentas().get(i) instanceof MLC)){
			unacuenta=false;
			i=getCuentas().size();
		}

	}
	return unacuenta;
}
public void UltimasOperaciones(DefaultTableModel ultiTalba){
	UltimasOpe.clear();
	ArrayList<String> fila1 = new ArrayList<>();
	for(int i=0;i<ultiTalba.getRowCount();i++){
	fila1.add(ultiTalba.getValueAt(i, 0).toString());
	fila1.add(ultiTalba.getValueAt(i, 1).toString());
	fila1.add(ultiTalba.getValueAt(i, 2).toString());
	fila1.add(ultiTalba.getValueAt(i, 3).toString());
	fila1.add(ultiTalba.getValueAt(i, 4).toString());
	UltimasOpe.add(fila1);
	}
	
}
public void EliminarCuenta(int cuenta){
	getCuentas().remove(cuenta);
}

}
