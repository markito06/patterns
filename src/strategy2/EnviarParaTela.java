package strategy2;

import javax.swing.JOptionPane;

public class imprimaNaTela implements IImprimir {

	@Override
	public void show(String toPrint) {
		JOptionPane.showMessageDialog(null, toPrint);

	}

}
