package strategy2;

/**
 * <h2>Engenharia de Software</h2></br>
 * 
 * Interface do cálculo de frete
 * 
 * @see Design Patterns – Elements of Reusable Object-Oriented Software
 * {@link https://pt.wikipedia.org/wiki/Strategy}</br>
 * {@link https://robsoncastilho.com.br/2011/06/25/conhecendo-design-patterns-e-o-padrao-strategy/}</br>
 * 
 * @since 2017
 * 
 * 
 * */
public interface ICalculadorDeFrete {

	String calcularFretePara(Pedido pedido);

}
