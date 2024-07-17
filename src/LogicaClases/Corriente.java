package LogicaClases;

public class Corriente extends CuentaBancaria{
	private String titurales;
	private float cup;
	
	
	public Corriente(String titular,String beneficiario,float cup,String string){
		super(titular,beneficiario);
		setCup(cup);
		setTiturales(string);
	}
	
	
	public String getTiturales() {
		return titurales;
	}
	public void setTiturales(String titurales) {
		this.titurales = titurales;
	}
	public float getCup() {
		return cup;
	}
	public void setCup(float cup) {
		this.cup = cup;
	}
	
	
}
