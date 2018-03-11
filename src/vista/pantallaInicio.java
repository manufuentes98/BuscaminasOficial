package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import control.Densidad;

public class pantallaInicio extends JPanel {

	/**
	 * Create the panel.
	 */
	public pantallaInicio() {
		setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(Densidad.values()));
		comboBox.setBounds(132, 73, 49, 20);
		add(comboBox);
		
		JLabel lblDificultad = new JLabel("dificultad");
		lblDificultad.setBounds(129, 48, 64, 14);
		add(lblDificultad);
		
		JButton btnLetsPlay = new JButton("Let's play!");
		btnLetsPlay.setBounds(174, 151, 89, 23);
		add(btnLetsPlay);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(NumeroMinas.values()));
		comboBox_1.setBounds(274, 73, 64, 20);
		add(comboBox_1);
		
		JLabel lblNumeroMians = new JLabel("Numero Minas");
		lblNumeroMians.setBounds(274, 48, 102, 14);
		add(lblNumeroMians);

	}
}
