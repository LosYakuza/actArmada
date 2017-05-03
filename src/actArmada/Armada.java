package actArmada;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Armada {
	private List<Soldado> listaSoldados;
	
	public Armada() {
		listaSoldados = new ArrayList<>();
	}
	
	public void agregar(Soldado s){
		listaSoldados.add(s);
	}
	
	public List<Soldado> formacionUno(){
		listaSoldados.sort(SoldadoOrder.getOrderByRango());
		return listaSoldados;
	}
	
	public List<Soldado> formacionDos(){
		listaSoldados.sort(SoldadoOrder.getOrderByVelocidad());
		return listaSoldados;
	}
	
	public List<Soldado> formacionTres(){
		listaSoldados.sort(SoldadoOrder.getOrderByTropa());
		return listaSoldados;
	}
	
	public Map<TipoSoldado, ArrayList<Soldado>> agrupar(){
		Map<TipoSoldado, ArrayList<Soldado>> mapSoldados = new HashMap<>();
		for(TipoSoldado tipo : TipoSoldado.values()){
			mapSoldados.put(tipo, new ArrayList<Soldado>());
		}
		listaSoldados.forEach((a)->mapSoldados.get(a.getTipo()).add(a) );
		return mapSoldados;
	}
	
	public Set<Soldado> representantes(){
		Set<Soldado> setSoldado = new TreeSet<>(SoldadoOrder.getOrderByRegion());
		setSoldado.addAll(listaSoldados);
		return setSoldado;
	}
}
