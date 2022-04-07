package app;

import model.Carga;
import model.Particular;
import model.Remolque;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Particular parti1 = new Particular("123asd",4);
		Particular parti2 = new Particular("456zxc",2);
		
		Carga car1 = new Carga("789rty");
		Carga car2 = new Carga("369okm");
		
		Remolque remol1= new Remolque(500,"584adf");
		Remolque remol2= new Remolque(250,"111ppp");
		
		try {
			parti1.acelerar(800);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(parti1.toString());
		System.out.println(parti2.toString());
		
		if(car1.sinRemolque()) {
			car1.ponRemolque(remol2);
		}
		
		System.out.println(car1.toString());
	
			try {
				car1.acelerar(500);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		System.out.println(car1.toString());
		
		
		
		System.out.println(car2.toString());
	
	}

}
