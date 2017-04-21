package strategy2;

/**
 * <h2>Engenharia de Software</h2></br>
 * 
 * Classe que implementa do cálculo de frete padrao
 * 
 * @see Design Patterns – Elements of Reusable Object-Oriented Software
 * {@link https://pt.wikipedia.org/wiki/Strategy}</br>
 * {@link https://robsoncastilho.com.br/2011/06/25/conhecendo-design-patterns-e-o-padrao-strategy/}</br>
 * 
 * @since 2017
 * 
 * 
 * */
public class CalculadorDeFretePadrao implements ICalculadorDeFrete {

	@Override
	public String calcularFretePara(Pedido pedido) {
		// Algorítimo de calculo de frete padrão
		return "Frete padrao";
	}

}
