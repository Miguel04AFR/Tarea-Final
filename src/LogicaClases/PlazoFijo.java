package LogicaClases;

public class PlazoFijo extends CuentaBancaria{
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
	
	

}
