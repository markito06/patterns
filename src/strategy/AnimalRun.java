package strategy;

public class AnimalRun {
	
	
	public static void main(String[] args) {
		
		Animal bobi = new Cachorro();
		Animal ticoTico = new Passaro();
		
		
		System.out.println("Bobi : " + bobi.tenteVoar());
		System.out.println("Tico-Tico : " + ticoTico.tenteVoar());
	}
}
