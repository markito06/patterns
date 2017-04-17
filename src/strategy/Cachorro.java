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
public class Cachorro extends Animal{
	
	
	/**
	 * Método construtor 
	 * inicializa som do animal
	 * e implementa a configuração do voô
	 * */
	public Cachorro() {
		super();
		setSom("Latido");
		configuraVoo =  new AlgoritimoNaoVoar();
	}
	
	/**
	 * Método cave um buraco
	 * @param sem parâmetros
	 * @return Void
	 * */
	public void caveUmBuraco(){
		System.out.println("Cavar buraco");
	}
	
	/**
	 * <p>Implementação do algorítimo de voo  em {@link Cachorro}</p>
	 * 
	 * Sobreescrevendo o método da super classe com a habilidade de voô
	 * para o cachorro
	 * 
	 * <p>Exemplo de emplementação que é abstraída utilizando {@link Strategy pattern}</p>
	 * */
	@Override
	public void flying() {
		System.out.println("Eu não posso voar");
	}
}
