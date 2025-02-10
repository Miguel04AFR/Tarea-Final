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
	if(!(getBilletes().size()==1) || !(getBilletes().size()==0)){
		for(Integer c : billetes){
			total+=c;
		}
	}
		else
			total=0;
	
	return total;
}
public boolean Extraer(int numExtraer){
	int extraer=0;
	ArrayList<Integer> removidos=new ArrayList<Integer>();
	boolean extraido=false;
	if(!(extraer==numExtraer)){
	for(int i=getBilletes().size()-1;i>=0;i--){
		extraer+=getBilletes().get(i);
		if(numExtraer<=extraer){
			if(numExtraer==extraer){
				extraido=true;
				getBilletes().remove(i);
				i=-1;
			}
			else{
				extraer-=getBilletes().get(i);
			}
		}
		else{
			getBilletes().remove(i);
			removidos.add(i);
		}
	}
	}
	else{
		extraido=true;
	}
	
	if(!extraido){
		for(int i=removidos.size()-1;i>=0;i--){
			getBilletes().add(removidos.get(i));
		}
	}
	return extraido;
}
public void RenovarBilletes(){
	int uno=0;
	int tres=0;
	int cinco=0;
	int dies=0;
	int veinte=0;
	int cincuenta=0;
	int cien=0;
	int doscientos=0;
	int quinientos=0;
	int mil=0;
	
	
	for(Integer c :  billetes){
		if(c.equals(1))
			uno++;
		else if(c.equals(3))
			tres++;
		else if(c.equals(5))
			cinco++;
		else if(c.equals(10))
			dies++;
		else if(c.equals(20))
			veinte++;
		else if(c.equals(50))
			cincuenta++;
		else if(c.equals(100))
			cien++;
		else if(c.equals(500))
			quinientos++;
		else if(c.equals(200))
			doscientos++;
		else 
			mil++;
	}	
		for(int i=uno;i<20;i++)
			getBilletes().add(1);
		for(int i=tres;i<20;i++)
			getBilletes().add(3);
		for(int i=cinco;i<24;i++)
			getBilletes().add(5);
		for(int i=dies;i<30;i++)
			getBilletes().add(10);
		for(int i=veinte;i<25;i++)
			getBilletes().add(20);
		for(int i=cincuenta;i<20;i++)
			getBilletes().add(50);
		for(int i=cien;i<10;i++)
			getBilletes().add(100);
		for(int i=doscientos;i<5;i++)
			getBilletes().add(200);
		for(int i=quinientos;i<4;i++)
			getBilletes().add(500);
		for(int i=mil;i<4;i++)
			getBilletes().add(1000);	
	
}


}
