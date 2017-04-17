package strategy;

/**
 * <p><b><h4>Engehharia de Software</h4></b></p>
 * 	<p>Aplicação de padrões de projeto</p>
 * 
 * @see	<b>Strategy pattern</b>
 * 
 * 
 * @see {@link http://www.newthinktank.com/2012/08/strategy-design-pattern-tutorial/}
 *  
 * @author Adriano Lima
 * @author Letícia
 * @author Marcos Alexandre Ventura Costa
 * 
 * @since 2017
 * 
 * */
public class AlgoritimoNaoVoar implements Voar {
	
	/**
	 * Método que implementa o algorítimo que faz o animal voar mais alto
	 * 
	 * @param Sem parametros
	 * @return {@link String}
	 * */
	@Override
	public String voar() {
		
		return "Eu não posso voar";
	}
	
}
