package LogicaClases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlazoFijo extends CuentaBancaria {
	private float cup;
	
	public PlazoFijo(String titular,String beneficiario,float cup){
		super(titular,beneficiario);
		setCup(cup);
	}

	public float getCup() {
		return cup;
	}

	public void setCup(float cup) {
		this.cup = cup;
	}
	
	
	public double CalcularInteres(String fechaFin,String fechaIni){
		int mesI=0;
		int mesF=0;
		double interes=0;
		Pattern pattern = Pattern.compile("\\d{4}");//esto hace que busque una secuencia de 4 digitos
		Matcher matI = pattern.matcher(fechaIni);
		Matcher matF =pattern.matcher(fechaFin);
		int añoI=0;
		int añoF=0;
		if (matI.find()) {
	        añoI = Integer.valueOf(matI.group());
	    }
	    
	    if (matF.find()) {
	        añoF = Integer.valueOf(matF.group());
	    }
		int restaAño=añoF-añoI;
		if(fechaIni.contains("ene"))
		mesI=1;
		else if(fechaIni.contains("feb"))
		mesI=2;
		else if(fechaIni.contains("mar"))
		mesI=3;	
		else if(fechaIni.contains("abr"))
			mesI=4;	
		else if(fechaIni.contains("may"))
			mesI=5;	
		else if(fechaIni.contains("jun"))
			mesI=6;	
		else if(fechaIni.contains("jul"))
			mesI=7;	
		else if(fechaIni.contains("ago"))
			mesI=8;	
		else if(fechaIni.contains("sep"))
			mesI=9;
		else if(fechaIni.contains("oct"))
			mesI=10;	
		else if(fechaIni.contains("nov"))
			mesI=11;	
		else if(fechaIni.contains("dic"))
			mesI=12;
		
		if(fechaFin.contains("ene"))
			mesF=1;
		else if(fechaFin.contains("feb"))
			mesF=2;
		else if(fechaFin.contains("mar"))
			mesF=3;	
		else if(fechaFin.contains("abr"))
			mesF=4;	
		else if(fechaFin.contains("may"))
			mesF=5;	
		else if(fechaFin.contains("jun"))
			mesF=6;	
		else if(fechaFin.contains("jul"))
			mesF=7;	
		else if(fechaFin.contains("ago"))
			mesF=8;	
		else if(fechaFin.contains("sep"))
			mesF=9;
		else if(fechaFin.contains("oct"))
			mesF=10;	
		else if(fechaFin.contains("nov"))
			mesF=11;	
		else if(fechaFin.contains("dic"))
			mesF=12;	

		int totalMeses = (restaAño * 12) + (mesF - mesI);
		if(restaAño!=0 || mesI!=mesF){
			interes=(getCup()-2 +totalMeses) * 0.0003 ;
		}
		else{
			interes=(mesF - mesI) * 0.025 + getCup()-2;
		}
		return interes;
	}

}
