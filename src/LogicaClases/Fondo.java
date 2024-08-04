package LogicaClases;
import java.util.Random;

public class Fondo extends CuentaBancaria implements IdepositarEntidad{
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
	
	public float DepositarEntidad(){
		
		
		
		return 2;
	}
	
	

}
