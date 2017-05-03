package strategy2;

public class PedidoDemo {

	public static void main(String[] args) {
		
		Pedido pedidoPadrao = new Pedido(new CalculadorDeFretePadrao());
		Pedido pedidoExpresso = new Pedido(new CalculadorDeFreteExpresso());
		
		ReportPedido console = new ReportPedido(new EnviarParaTerminal());
		ReportPedido tela = new ReportPedido(new EnviarParaTela());
		ReportPedido pdf = new ReportPedido(new EnviarParaPdf());
		
		console.imprimir(pedidoPadrao.calcularFrete());
		tela.imprimir(pedidoExpresso.calcularFrete());
		pdf.imprimir(pedidoExpresso.calcularFrete());

	}
	
	
}
