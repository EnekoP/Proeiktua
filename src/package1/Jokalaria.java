package package1;

import java.util.ArrayList;

public class Jokalaria {
	
private ArrayList<Karta> eskua = new ArrayList<Karta>();
	
	public Jokalaria () {
		this.hartuEskuIniziala();
	}
	
	public void hartuEskuIniziala() {
		Baraja b = Baraja.getNireInstatziaBakarra();
		for (int i= 0; i < 7; i++)
		{
			eskua.add(b.hartuKarta());
		}
	}
	
	public void hartuKartaBat() {
		Baraja b = Baraja.getNireInstatziaBakarra();
		eskua.add(b.hartuKarta());
	}
	
	public void imprimatuEskua() {
		for (int i= 0; i < eskua.size(); i++) {
			System.out.print("Karta ["+i+"]: "+eskua.get(i).toString());
			if(i+1 < eskua.size())
			{
				System.out.print(", ");
			}
		}
	}
//imprimatu eskua
}

