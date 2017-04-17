package strategy;
/**
 * <p><b><h4>Engehharia de Software</h4></b></p>
 * 	<p>Aplicação de padrões de projeto</p>
 * 
 * @see	<b>Strategy pattern</b>
 * @see {@link http://www.newthinktank.com/2012/08/strategy-design-pattern-tutorial/}
 *  
 * @author Adriano Lima
 * @author Letícia
 * @author Marcos Alexandre Ventura Costa
 * 
 * @since 2017
 * 
 * */
public class Animal {
	
	
	private String nome;
	private double altura;
	private int peso;
	private double speed;
	private String som;
	
	public Voar configuraVoo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	
	/**
	 * Umas das formas de implementação usuais
	 * <pre>
	 * {@code
	 * 	public void fly() {
	 *		System.out.println("Fazer algo");
	 *	}
	 *}
	 * </pre>>
	 * */
	public void flying() {
		
	}
	
	/**
	 * <p>Trazendo a funcionalidade voô para a super classe<p>
	 * Desta forma quem estende a classe {@link Animal} 
	 * pode se utilizar de algum algorítimo que implementa interface
	 * {@link Voar}
	 * 
	 * @param Sem parâmentros
	 * @return {@link String}
	 * */
	public String tenteVoar() {
		return configuraVoo.voar();

	}
	
	public void configuraVoo(Voar comoVoar){
		configuraVoo  = comoVoar;
	}
	
}
