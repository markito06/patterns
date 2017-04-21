package strategy2;

public class PedidoDemo {

	public static void main(String[] args) {
		
		Pedido pedidoPadrao = new Pedido(new CalculadorDeFretePadrao());
		Pedido pedidoExpresso = new Pedido(new CalculadorDeFreteExpresso());
		
		ReportPedido console = new ReportPedido(new ImprimaNoConsole());
		ReportPedido tela = new ReportPedido(new imprimaNaTela());
		ReportPedido pdf = new ReportPedido(new ImprimaPdf());
		
		console.imprimir(pedidoPadrao.calcularFrete());
		tela.imprimir(pedidoExpresso.calcularFrete());
		pdf.imprimir(pedidoExpresso.calcularFrete());

	}
	
	
}
