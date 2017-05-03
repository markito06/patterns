package strategy2;

public class EnviarParaTerminal implements IEnviar {

	@Override
	public void envie(String conteudo) {
		System.out.println(conteudo);

	}

}
