package Ejercicio3;

/*
 *Creado por Elias Peria�ez
 *20 nov. 2018
 *Como parte del proyecto Tarea 4-Monitores (Ultra Instinto)
 *Este archivo esta bajo la licencia de Creative Commons Reconocimiento 4.0 Internacional (M�s informacion https://creativecommons.org/licenses/by/4.0/)
________________________________________________________________________________________________________________________________________________________
 *Created by Elias Peria�ez
 *20 nov. 2018
 *As part of the project Tarea 4-Monitores (Ultra Instinto)
 *This file is under the Creative Commons Attribution 4.0 International (More info here https://creativecommons.org/licenses/by/4.0/)
 */

public class Comedero {
	
	private boolean food = false;
	
	public Comedero() {}
	
	public synchronized void comer() {
		this.setFood(false);
	}

	public synchronized boolean haveFood() {
		synchronized (this) {
			return food;
		}
		
	}

	public boolean isFood() {
		return food;
	}

	public void setFood(boolean food) {
		this.food = food;
	}

}
