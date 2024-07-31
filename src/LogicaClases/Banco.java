package LogicaClases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Banco {
	private ArrayList<Usuario> usuarios;
	private ArrayList<Agencia> agencias;
	private static Banco instancia;
	
	public Banco(){
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
	
	public static Banco getInstancia() {
        if (instancia == null) {
        	instancia= new Banco();
        }
        return instancia;
    }

}
