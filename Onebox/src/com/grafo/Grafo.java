package com.grafo;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.lang.String;

class Grafo {
	Map<String, Nodo> nodos;

	  public Grafo() {
	    nodos = new HashMap<String, Nodo>();
	  }

	  public void addVertice(String desde, String hasta, Integer distancia) {
	    Nodo n = nodos.get(desde);

	    if (n == null) {
	      n = new Nodo(desde);
	      nodos.put(desde, n);
	    }

	    n.addDistancia(hasta, distancia);
	  }

	  public Integer getDistanciaParaRuta(String ruta) {
	    Integer distancia = 0;

	    String origen = ruta.substring(0, 1);
	    for (String destination : ruta.substring(1).split("")) {
	      Integer d = nodos.get(origen).getDistanciaParaDestino(destination);
	      if (d != null) distancia += d;
	      else return null;

	      origen = destination;
	    }

	    return distancia;
	  }

	  public static Grafo fromLista(List<String> list) {
	    Grafo g = new Grafo();

	    for (String s : list) { 
	      g.addVertice(s.substring(0, 1), s.substring(1, 2), Integer.parseInt(s.substring(2, 3)));
	    }

	    return g;
	  }

	  @Override
	  public String toString() {
	    String salida = "";
	    
	    for (Nodo n : nodos.values()) {
	      salida += n.toString();
	    }

	    return salida;
	  }
}
