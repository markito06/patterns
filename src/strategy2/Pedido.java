package strategy2;

public class Pedido {
	
	// utilizando composição: o pedido mantém uma referência (passada em seu construtor)
    // para a Strategy base, normalmente uma interface ou classe abstrata
	
	private ICalculadorDeFrete iCalculadorDeFrete;
	
	public Pedido(ICalculadorDeFrete iCalculadorDeFrete) {
		this.iCalculadorDeFrete = iCalculadorDeFrete;
	}
	
	public String calcularFrete(){
		 // delegando o cálculo do frete para o objeto Strategy configurado
		return iCalculadorDeFrete.calcularFretePara(this);
	}

}
