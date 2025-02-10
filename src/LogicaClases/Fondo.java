package LogicaClases;
import java.util.Random;

public class Fondo extends CuentaBancaria implements Iintereses,IdepositarEntidad{
	private float cup;
	private float salarioEstatal;
	private int extraido;
	private float porcentaje;

	
	public float getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}
	public float getSalarioEstatal() {
		return salarioEstatal;
	}
	public void setSalarioEstatal(float salarioEstatal) {
		this.salarioEstatal = salarioEstatal;
	}
	public Fondo(String titular,String beneficiario,float cup,float salarioEstatal,int porcentaje){
		super(titular,beneficiario);
		setCup(cup);
		setSalarioEstatal(salarioEstatal);
		setPorcentaje(porcentaje);
	}
	public float getCup() {
		return cup;
	}

	public void setCup(float cup) {
		this.cup = cup;
	}
	
	public int getExtraido() {
		return extraido;
	}
	public void setExtraido(int extraido) {
		this.extraido = extraido;
	}

	public double CalcularInteres(){
		return (getCup() * 7) / 100 ;
	}
	
	public float SalarioDepositado(float salarioEstatal, float porcentaje){
		return (salarioEstatal * porcentaje) / 100;
	}
	
	
}


/*public boolean AumentoSalario(float aumento,float salarioEstatal){
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
}*/
