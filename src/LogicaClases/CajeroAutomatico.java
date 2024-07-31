package LogicaClases;

import java.util.ArrayList;

public class CajeroAutomatico {
private ArrayList<Integer> billetes;
private String moneda;

public CajeroAutomatico(String moneda){
	billetes=new ArrayList<Integer>();
	setMoneda(moneda);
}

public ArrayList<Integer> getBilletes() {
	return billetes;
}

public void setBilletes(ArrayList<Integer> billetes) {
	this.billetes = billetes;
}

public String getMoneda() {
	return moneda;
}

public void setMoneda(String moneda) {
	this.moneda = moneda;
}


}
