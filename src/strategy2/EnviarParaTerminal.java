package strategy2;

public class ImprimaNoConsole implements IImprimir {

	@Override
	public void show(String toPrint) {
		System.out.println(toPrint);

	}

}
