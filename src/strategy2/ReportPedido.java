package strategy2;

public class ReportPedido {
	
	
	private IEnviar imprimir;
	
	public ReportPedido(IEnviar formasDeSaida) {
		this.imprimir = formasDeSaida;
	}
	
	
	
	public void imprimir(String toPrint) {
		imprimir.envie(toPrint);
	}
	
	
}
