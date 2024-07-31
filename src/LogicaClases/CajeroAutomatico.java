package LogicaClases;

import java.util.ArrayList;

public class CajeroAutomatico {
private ArrayList<Integer> billetes;
private String moneda;

public CajeroAutomatico(String moneda){
	billetes=new ArrayList<Integer>();
	setMoneda(moneda);
	
	billetes.add(5);
	billetes.add(5);
	billetes.add(5);
	billetes.add(5);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(50);
	billetes.add(50);
	billetes.add(50);
	billetes.add(100);
	billetes.add(100);
	billetes.add(100);
	billetes.add(500);
	billetes.add(500);
	billetes.add(1000);
	billetes.add(1000);
	billetes.add(1000);
	billetes.add(1000);
	billetes.add(5000);
	
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
