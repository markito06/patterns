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
public interface Voar {
	
	/**
	 * Método que será sobreescrito por quem implementar a interface Voar
	 * 
	 * <p><b>Vantagens:</b></p>
	 * <p> -Encapsulamento dos algorítimos. </p>
	 * <p> -Diminuição do acoplamento. </p>
	 * <p> -Aumento da composição <b>Reuso</b>. </p> 
	 * 
	 *  */
	String voar();
}
