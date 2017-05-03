package actArmada;

public class Soldado {
	private String region;
	private int rango;
	private double velocidad;
	private TipoSoldado tipo;
	
	public Soldado(String region, int rango, double velocidad, TipoSoldado tipo) {
		super();
		this.region = region;
		this.rango = rango;
		this.velocidad = velocidad;
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rango;
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		long temp;
		temp = Double.doubleToLongBits(velocidad);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Soldado other = (Soldado) obj;
		if (rango != other.rango)
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (tipo != other.tipo)
			return false;
		if (Double.doubleToLongBits(velocidad) != Double.doubleToLongBits(other.velocidad))
			return false;
		return true;
	}

	public String getRegion() {
		return region;
	}

	public int getRango() {
		return rango;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public TipoSoldado getTipo() {
		return tipo;
	}
	
	
}
