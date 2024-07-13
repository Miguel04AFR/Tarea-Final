package LogicaClases;

public class MLC extends CuentaBancaria{
	private float mlc;
	
	public MLC(String titular,String beneficiario,float mlc){
		super(titular,beneficiario);
		setMlc(mlc);
				
	}

	public float getMlc() {
		return mlc;
	}

	public void setMlc(float mlc) {
		this.mlc = mlc;
	}

}
