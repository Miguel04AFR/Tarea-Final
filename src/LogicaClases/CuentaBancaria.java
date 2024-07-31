package LogicaClases;

public abstract class CuentaBancaria {
	protected String titular;
	protected String beneficiario;
	
	
	public CuentaBancaria(String titular,String beneficiario){
		setTitular(titular);
		setBeneficiario(beneficiario);
	}
	
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getBeneficiario() {
		return beneficiario;
	}
	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}
	
	public String getTipo(){
		return getClass().getSimpleName();
	}

}
