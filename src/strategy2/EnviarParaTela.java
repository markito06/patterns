package strategy2;

import javax.swing.JOptionPane;

public class EnviarParaTela implements IEnviar {

	@Override
	public void envie(String toPrint) {
		JOptionPane.showMessageDialog(null, toPrint);

	}

}
