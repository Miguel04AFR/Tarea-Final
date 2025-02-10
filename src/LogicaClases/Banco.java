package LogicaClases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Banco {
	private String nombre;
	

	private ArrayList<Usuario> usuarios;
	private ArrayList<Agencia> agencias;
	private static Banco instancia;
	
	public Banco(String nombre){
		setNombre(nombre);
		usuarios=new ArrayList<Usuario>();
		agencias=new ArrayList<Agencia>();
		
	}
	
	public ArrayList<Usuario> getUsuarios(){
		return usuarios;
	}
	
	public void setUsuarios(ArrayList<Usuario> usuarios){
		this.usuarios=usuarios;
		
	}

	public ArrayList<Agencia> getAgencias() {
		return agencias;
	}

	public void setAgencias(ArrayList<Agencia> agencias) {
		this.agencias = agencias;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int UsuarioTam(){
		int caracterTam=0;
		for(Usuario u :  getUsuarios()){
			if(caracterTam<u.getIdU().length()){
				caracterTam=u.getIdU().length();
			}
		}
		return caracterTam;
	}
	
	public static Banco getInstancia() {
        if (instancia == null) {
        	instancia= new Banco("Inversion Max");
        }
        return instancia;
    }
	

}
