package LogicaClases;

import java.util.ArrayList;

public class CajeroAutomatico {
private ArrayList<Integer> billetes;


public CajeroAutomatico(){
	billetes=new ArrayList<Integer>();

	billetes.add(1);
	billetes.add(1);
	billetes.add(1);
	billetes.add(1);
	billetes.add(1);
	billetes.add(1);
	billetes.add(1);
	billetes.add(1);
	billetes.add(1);
	billetes.add(1);
	billetes.add(1);
	billetes.add(1);
	billetes.add(1);
	billetes.add(1);
	billetes.add(1);
	billetes.add(1);
	billetes.add(1);
	billetes.add(1);
	billetes.add(1);
	billetes.add(1);
	billetes.add(3);
	billetes.add(3);
	billetes.add(3);
	billetes.add(3);
	billetes.add(3);
	billetes.add(3);
	billetes.add(3);
	billetes.add(3);
	billetes.add(3);
	billetes.add(3);
	billetes.add(3);
	billetes.add(3);
	billetes.add(3);
	billetes.add(3);
	billetes.add(3);
	billetes.add(3);
	billetes.add(3);
	billetes.add(3);
	billetes.add(3);
	billetes.add(3);
	billetes.add(5);
	billetes.add(5);
	billetes.add(5);
	billetes.add(5);
	billetes.add(5);
	billetes.add(5);
	billetes.add(5);
	billetes.add(5);
	billetes.add(5);
	billetes.add(5);
	billetes.add(5);
	billetes.add(5);
	billetes.add(5);
	billetes.add(5);
	billetes.add(5);
	billetes.add(5);
	billetes.add(5);
	billetes.add(5);
	billetes.add(5);
	billetes.add(5);
	billetes.add(5);
	billetes.add(5);
	billetes.add(5);
	billetes.add(5);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(10);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(20);
	billetes.add(50);
	billetes.add(50);
	billetes.add(50);
	billetes.add(50);
	billetes.add(50);
	billetes.add(50);
	billetes.add(50);
	billetes.add(50);
	billetes.add(50);
	billetes.add(50);
	billetes.add(50);
	billetes.add(50);
	billetes.add(50);
	billetes.add(50);
	billetes.add(50);
	billetes.add(50);
	billetes.add(50);
	billetes.add(50);
	billetes.add(50);
	billetes.add(50);
	billetes.add(100);
	billetes.add(100);
	billetes.add(100);
	billetes.add(100);
	billetes.add(100);
	billetes.add(100);
	billetes.add(100);
	billetes.add(100);
	billetes.add(100);
	billetes.add(100);
	billetes.add(200);
	billetes.add(200);
	billetes.add(200);
	billetes.add(200);
	billetes.add(200);
	billetes.add(500);
	billetes.add(500);
	billetes.add(500);
	billetes.add(500);
	billetes.add(1000);
	billetes.add(1000);
	billetes.add(1000);
	billetes.add(1000);
	
	
}

public ArrayList<Integer> getBilletes() {
	return billetes;
}

public void setBilletes(ArrayList<Integer> billetes) {
	this.billetes = billetes;
}
public int TotalBilletes(){
	int total=0;
	for(int i=getBilletes().size()-1;i>=0;i--){
		total+=getBilletes().get(i);
	}
	return total;
}
public boolean Extraer(int numExtraer){
	int extraer=0;
	boolean extraido=false;
	if(!(extraer==numExtraer)){
	for(int i=getBilletes().size()-1;i>=0;i--){
		extraer+=getBilletes().get(i);
		if(numExtraer<=extraer){
			if(numExtraer==extraer){
				extraido=true;
				i=-1;
			}
			else{
				extraer-=getBilletes().get(i);
			}
		}
		else{
			getBilletes().remove(i);
			i--;
		}
	}
	}
	else{
		extraido=true;
	}
	return extraido;
}


}
