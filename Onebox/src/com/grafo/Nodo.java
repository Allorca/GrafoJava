package com.grafo;

import java.util.HashMap;
import java.util.Map;


class Nodo {
	
	String nombre;
	Map<String, Integer> distancias;

	  public Nodo(String nombre) {
	    this.nombre = nombre;
	    distancias = new HashMap();
	  }

	  public void addDistancia(String hasta, Integer distancia) {
	    distancias.put(hasta, distancia);
	  }

	  public Integer getDistanciaParaDestino(String destino) {
	    return distancias.get(destino);
	  }

	  @Override
	  public String toString() {
	    String salida = "Nodo " + nombre + "\n";

	    for (Map.Entry<String, Integer> entry : distancias.entrySet()) {
	      salida += "  " + entry.getKey() + ": " + entry.getValue() + "\n";
	    }

	    return salida;
	  }
}
