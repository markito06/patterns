package strategy;

/**
 * <p><b><h4>Engehharia de Software</h4></b></p>
 * 	<p>Aplicação de padrões de projeto</p>
 * 
 * @see	<b>Strategy pattern</b>
 * 
 * {@link AlgoritimoVoarAlto}
 * {@link Animal} 
 *  
 * @author Adriano Lima
 * @author Letícia
 * @author Marcos Alexandre Ventura Costa
 * 
 * @since 2017
 * 
 * */
public class Passaro extends Animal{

	/**
	 * Método construtor vázio
	 * inicializa som do animal
	 * e implementa a configuração do voô
	 * */	
	public Passaro() {
		super();
		setSom("Cantar");
		configuraVoo = new AlgoritimoVoarAlto();
	}

	
}
