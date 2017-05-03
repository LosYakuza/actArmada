package actArmada;

public enum TipoSoldado {
	Hoplital(1),Jabalina(3),Caballero(4),Hondero(2),Arqueros(5);
	
	private int orden;
	private TipoSoldado(int orden) {
		this.orden = orden;
	}
	
	public int getOrden() {
		return orden;
	}
}
