package actArmada;

import java.util.Comparator;

public abstract class SoldadoOrder  {

	public static Comparator<Soldado> getOrderByRango(){
		return new Comparator<Soldado>() {
			@Override
			public int compare(Soldado o1, Soldado o2) {
				if (o1.getRango() == o2.getRango())
					return 0;
				if(o1.getRango() > o2.getRango())
					return 1;
				return -1;
			}
		};
	}
	
	public static Comparator<Soldado> getOrderByVelocidad(){
		return new Comparator<Soldado>() {
			@Override
			public int compare(Soldado o1, Soldado o2) {
				if (o1.getVelocidad() == o2.getVelocidad())
					return 0;
				if(o1.getVelocidad() > o2.getVelocidad())
					return 1;
				return -1;
			}
		};
	}
	
	public static Comparator<Soldado> getOrderByTropa(){
		return new Comparator<Soldado>() {
			@Override
			public int compare(Soldado o1, Soldado o2) {
				
				if(o1.getTipo().getOrden() == o2.getTipo().getOrden()){
					if (o1.getRango() == o2.getRango())
						return 0;
					if(o1.getRango() > o2.getRango())
						return 1;
					return -1;
				}
				
				if(o1.getTipo().getOrden() > o2.getTipo().getOrden())
					return 1;
				return -1;
				
			}
		};
	}
	
	public static Comparator<Soldado> getOrderByRegion(){
		return new Comparator<Soldado>() {
			@Override
			public int compare(Soldado o1, Soldado o2) {
				return o1.getRegion().compareTo(o2.getRegion());
			}
		};
	}

}
