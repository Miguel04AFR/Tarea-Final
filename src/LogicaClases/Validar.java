package LogicaClases;

import Inicio.elmain;

public class Validar {

	public Validar(){
		
	}
	public  boolean EsFloat(String text) {
		boolean sies;
		try {
			Float.parseFloat(text);
			sies=true;
		} catch (NumberFormatException e) {
			sies=false;
		}
		return sies;
	}
	public int UsuarioValido(String username, String password, Banco banco){
		int valido=-1;
		for(int i=0;i<banco.getUsuarios().size();i++){
		if((username.equals(banco.getUsuarios().get(i).getIdU()) || username.equals(banco.getUsuarios().get(i).getCorreoelectronico())) && password.equals(banco.getUsuarios().get(i).getContraseña())){
			valido = i;
			
		}
		}
		return valido;
	}
	
	
	
	
}
