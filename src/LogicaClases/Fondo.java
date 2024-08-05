package LogicaClases;
import java.util.Random;

public class Fondo extends CuentaBancaria implements IdepositarEntidad,Iintereses{
	private float cup;

	
	public Fondo(String titular,String beneficiario,float cup){
		super(titular,beneficiario);
		setCup(cup);
	}
	public float getCup() {
		return cup;
	}

	public void setCup(float cup) {
		this.cup = cup;
	}
	
	public float DepositarEntidad(float salarioEstatal){
		
		
		
		return 2;
	}
	
	public double CalcularInteres(){
		return (cup / 5) * 0.75;
	}

	public boolean AumentoSalario(float aumento,float salarioEstatal){
		Random random=new Random();
		float diferencia=salarioEstatal-aumento;
		boolean aumentar=false;
		 //aumentar = !(diferencia < 0 || diferencia > 900); Programacion oscura XDD
		if(diferencia<0 && diferencia>800){
			aumentar=false;
		}
		else
			aumentar=true;
		return aumentar==true ? random.nextBoolean() : false;
	}

}
