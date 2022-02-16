public abstract class Viagen implements IViagen{

	private String titulo;
	private String ida;
	private String volta;
	private double valorGasto;
	private String destino;
	private String proposito;
	

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIda() {
		return ida;
	}
	public void setIda(String ida) {
		this.ida = ida;
	}
	public String getVolta() {
		return volta;
	}
	public void setVolta(String volta) {
		this.volta = volta;
	}
	public double getValorGasto() {
		return valorGasto;
	}
	public void setValorGasto(double valorGasto) {
		this.valorGasto = valorGasto;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getProposito() {
		return proposito;
	}
	public void setProposito(String proposito) {
		this.proposito = proposito;
	}
	@Override
	public void cadViagen(double titulo, String ida, String volta, double valorGasto, String destino, String proposito) {
		// TODO Auto-generated method stub
		
	}
	protected void imprimirInforComund() {
		System.out.println("Titulo : "+ titulo);
		System.out.println("Destino : "+ destino);
		System.out.println("Data de Ida : "+ ida);
		System.out.println("Data de Volta : "+ volta);
		System.out.println("Propósito : "+ proposito);
		System.out.println("Valores Gastos : "+ valorGasto);
	}
	
}
