package Inicio;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import LogicaClases.Banco;
import LogicaClases.CuentaBancaria;
import LogicaClases.MLC;
import LogicaClases.PlazoFijo;
import LogicaClases.Usuario;

import com.formdev.flatlaf.FlatDarculaLaf;

import LogicaClases.Banco;
import interfaz.Lobby;
public class elmain {
	public static Banco banco=new Banco();
	

	public static void main(String[] args) {
		Usuario primer=new Usuario("usuario","usuario","Alfredo Lopez","41y48","52334463","usuario@gmail.com",'M',"04040534681","perfil","77234398");
		
		cargarUsuarios();
		MLC a=new MLC("usuario", null, 0);
		PlazoFijo b=new PlazoFijo("usuario", null, 0);
		primer.getCuentas().add(a);
		primer.getCuentas().add(b);
		banco.getUsuarios().add(primer);
		FlatDarculaLaf.setup();
		Lobby p=new Lobby();
		p.setVisible(true);
		
	
	}	
	public static void guardarUsuarios() {
	    try {
	        Path path = Paths.get("usuarios.txt");
	        List<String> lines = Files.readAllLines(path);
	        BufferedWriter bw = new BufferedWriter(new FileWriter("usuarios.txt", true));

	        for (Usuario usuario : banco.getUsuarios()) {
	            String userInfo = usuario.getIdU() + "," + usuario.getContraseña() + "," + usuario.getNombreCompleto() + "," + usuario.getDireccion() + "," + usuario.getTelefono() + "," + usuario.getCorreoelectronico() + "," + usuario.getSexo() + "," + usuario.getCI() + "," + usuario.getDosPasos() + "," + usuario.getTelFijo();
	            for (CuentaBancaria cuenta : usuario.getCuentas()) {
	               // userInfo += "," + cuenta.getTipo() + "," + cuenta.getSaldo();
	            }
	            
	            if (!lines.contains(userInfo)) {
	                bw.write(userInfo);
	                bw.newLine();
	            }
	        }
	        bw.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	public static void cargarUsuarios() {
	    try {
	        BufferedReader reader = new BufferedReader(new FileReader("usuarios.txt"));
	        String line = reader.readLine();
	        
	        
	        
	        
	        while (line != null) {
	            String[] parts = line.split(",");	
	                
	            Usuario usuario = new Usuario(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6].charAt(0), parts[7], parts[8], parts[9]);
	            banco.getUsuarios().add(usuario);
	            line = reader.readLine();
	        }
	        reader.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

	
}
