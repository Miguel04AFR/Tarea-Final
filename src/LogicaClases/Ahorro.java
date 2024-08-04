package LogicaClases;
import java.util.Random;

public class Ahorro extends CuentaBancaria{
	private float mlc;
	private float cup;
	
	
	
	public Ahorro(String titular,String beneficiario,float mlc,float cup){
		super(titular,beneficiario);
		setCup(cup);
		setMlc(mlc);
	}
	
	
	public float getMlc() {
		return mlc;
	}
	public void setMlc(float mlc) {
		this.mlc = mlc;
	}
	public float getCup() {
		return cup;
	}
	public void setCup(float cup) {
		this.cup = cup;
	}
	

	
	
	
	
	

}
