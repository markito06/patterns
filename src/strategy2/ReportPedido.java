package strategy2;

public class ReportPedido {
	
	
	private IImprimir imprimir;
	
	public ReportPedido(IImprimir formasDeSaida) {
		this.imprimir = formasDeSaida;
	}
	
	
	
	public void imprimir(String toPrint) {
		imprimir.show(toPrint);
	}
	
	
}
