package com.grafo;

import java.util.Arrays;

/*
1. The distance of the route A-B-C.
2. The distance of the route A-D.
3. The distance of the route A-D-C.
4. The distance of the route A-E-B-C-D.
5. The distance of the route A-E-D.
 
Graph: AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7
Expected Output:
Output #1: 9
Output #2: 5
Output #3: 13
Output #4: 22
Output #5: NO SUCH ROUTE
*/

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Los datos del Grafo que indica el ejercicio.
		String in = "AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7";
	    	
		//Transformamos el String de entrada en un ArrayList donde cada elemento es una ruta disponible del grafo con ciudad origen, ciudad 
		//destino y distancia. 
	    Grafo g = Grafo.fromLista(Arrays.asList(in.split(", ")));
	    
	    System.out.println(g);
	    
	    System.out.println("ABC == 9? " + (g.getDistanciaParaRuta("ABC") == 9));
	    System.out.println("AD == 5? " + (g.getDistanciaParaRuta("AD") == 5));
	    System.out.println("ADC == 13? " + (g.getDistanciaParaRuta("ADC") == 13));
	    System.out.println("AEBCD == 22? " + (g.getDistanciaParaRuta("AEBCD") == 22));
	    System.out.println("AED == null? " + (g.getDistanciaParaRuta("AED") == null));
	    
	    
	}

}
