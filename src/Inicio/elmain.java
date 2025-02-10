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

import LogicaClases.Agencia;
import LogicaClases.Banco;
import LogicaClases.Corriente;
import LogicaClases.CuentaBancaria;
import LogicaClases.MLC;
import LogicaClases.PlazoFijo;
import LogicaClases.Usuario;

import com.formdev.flatlaf.FlatDarculaLaf;

import LogicaClases.Banco;
import interfaz.Lobby;
public class elmain {
	public static Banco banco=Banco.getInstancia();//la instancia del banco
	public static String sonidoExito = "sonidos/success-1-6297.mp3"; //el sonido de  exito
	public static String sonidoError = "sonidos/error-126627.mp3"; //el sonido de error
	
	public static void main(String[] args) {
		FlatDarculaLaf.setup();
		Usuario primer=new Usuario("usuario","usuario","Alfredo Lopez","41y48","52334463","usuario@gmail.com",'M',"04040534681","perfil","77234398");
		Corriente j=new Corriente("usuario",null,40,null);
		primer.getCuentas().add(j);
	   
		cargarUsuarios();
		PlazoFijo b=new PlazoFijo("usuario", null, 50);
		primer.getCuentas().add(b);
		banco.getUsuarios().add(primer);
	    Agencia a=new Agencia("Banco Central de Cuba","Joaquín Alonso Vázquez","Cuba #402 e/ Lamparilla y Amargura, Habana Vieja, La Habana");
		Agencia w=new Agencia("Banco Nacional de Cuba","Joscelín Rio Álvarez","Aguiar 456 e/ Amargura y Lamparilla, Habana Vieja, La Habana");
		Agencia c=new Agencia("Banco Popular de Ahorro (BPA)","Alejandro Martínez López","Calle 16 No. 306 e/ 3ra y 5ta, Miramar, Municipio Playa, La Habana");
		Agencia x=new Agencia("Banco Inversiones S.A. (Bancoi)","Marlie León Simón","Avenida 5taA, Plaza de la Revolución, La Habana, Cuba");
		Agencia z=new Agencia("Banco Metropolitano S.A.","Luis Majin Gamboa","Cuba #225 Esquina A O’reilly, La Habana Vieja, La Habana");
		Inicializar agencias=new Inicializar();
		agencias.InicializarAgencia(a, w, c, x, z);
		banco.getAgencias().add(a);
		banco.getAgencias().add(w);
		banco.getAgencias().add(c);
		banco.getAgencias().add(x);
		banco.getAgencias().add(z);
		
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
