package vista;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class botonera extends JPanel {
 public JButton[][] botones;

	/**
	 * Create the panel.
	 */
	public botonera(int fila, int columna){
		
		GridLayout gridBotonera= new GridLayout(fila, columna);
		gridBotonera.setColumns(columna);
		gridBotonera.setRows(fila);
		iniciarBotonera(fila,columna);
	}

	private void iniciarBotonera(int fila, int columna) {
		this.botones=new JButton[fila][columna];		
		for (int i = 0; i < this.botones.length; i++) {
			for (int j = 0; j < this.botones.length; j++) {
				this.botones[i][j]= new JButton();
				this.botones[i][j].setName(String.valueOf(i)+""+String.valueOf(j));
				this.add(this.botones[i][j]);
				
			}
		}
	}

}
