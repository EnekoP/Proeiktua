package package1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Baraja {

	private ListaKartak lista;
	private static Baraja instantziaBakarra=null;
	
	private Baraja () {
		ListaKartak lista= new ListaKartak();
		//GENERAR EL LISTADO DE CARTAS
		lista.add(new BatBederatzi("Gorria", 0));
		lista.add(new BatBederatzi("Gorria", 1));
		lista.add(new BatBederatzi("Gorria", 2));
		lista.add(new BatBederatzi("Gorria", 3));
		lista.add(new BatBederatzi("Gorria", 4));
		lista.add(new BatBederatzi("Gorria", 5));
		lista.add(new BatBederatzi("Gorria", 6));
		lista.add(new BatBederatzi("Gorria", 7));
		lista.add(new BatBederatzi("Gorria", 8));
		lista.add(new BatBederatzi("Gorria", 9));
		lista.add(new BatBederatzi("Horia", 0));
		lista.add(new BatBederatzi("Horia", 1));
		lista.add(new BatBederatzi("Horia", 2));
		lista.add(new BatBederatzi("Horia", 3));
		lista.add(new BatBederatzi("Horia", 4));
		lista.add(new BatBederatzi("Horia", 5));
		lista.add(new BatBederatzi("Horia", 6));
		lista.add(new BatBederatzi("Horia", 7));
		lista.add(new BatBederatzi("Horia", 8));
		lista.add(new BatBederatzi("Horia", 9));
		lista.add(new BatBederatzi("Berdea", 0));
		lista.add(new BatBederatzi("Berdea", 1));
		lista.add(new BatBederatzi("Berdea", 2));
		lista.add(new BatBederatzi("Berdea", 3));
		lista.add(new BatBederatzi("Berdea", 4));
		lista.add(new BatBederatzi("Berdea", 5));
		lista.add(new BatBederatzi("Berdea", 6));
		lista.add(new BatBederatzi("Berdea", 7));
		lista.add(new BatBederatzi("Berdea", 8));
		lista.add(new BatBederatzi("Berdea", 9));
		lista.add(new BatBederatzi("Urdina", 0));
		lista.add(new BatBederatzi("Urdina", 1));
		lista.add(new BatBederatzi("Urdina", 2));
		lista.add(new BatBederatzi("Urdina", 3));
		lista.add(new BatBederatzi("Urdina", 4));
		lista.add(new BatBederatzi("Urdina", 5));
		lista.add(new BatBederatzi("Urdina", 6));
		lista.add(new BatBederatzi("Urdina", 7));
		lista.add(new BatBederatzi("Urdina", 8));
		lista.add(new BatBederatzi("Urdina", 9));
	}
	
	public static Baraja getNireInstatziaBakarra() {
		if(instantziaBakarra==null) {
			instantziaBakarra= new Baraja();
		}
		return instantziaBakarra;
	}
	
	private Iterator<Karta> getIteradorea(){
		return this.lista.iterator();
	}
	
	public Karta hartuKarta() {
		Random rand = new Random();
		int n = rand.nextInt(this.lista.size());
		Karta k = lista.get(n);
		lista.remove(n);
		return k;
	}
	
	/*
	 * public void jokatuPartida(int pJokalariKop) { //TODO }
	 */
	
	  public void errekorrituBaraja(){
	  Karta kartaBat=null; Iterator<Karta>
	  itr=this.getIteradorea();
	  
	  }
	
	
	  public void kartakBanatu() { Jokalaria pJok1=null; Jokalaria pJok2=null;
	  Karta kartaBat=null; 
	  int kop=0; 
	  Iterator<Karta> itr=this.getIteradorea();
	  while (itr.hasNext() || kop<=7) { 
		  kartaBat=itr.next();
	  pJok1.hartuKarta(kartaBat); 
	  kartaBat= itr.next();
	  kop=kop+1; }
	  
	  
	  }
}

