package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;

public class Principal extends JFrame {
	protected pantallaInicio pantallaInicio_;
	

	public Principal() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		Container panel;
		getContentPane().add(panel, BorderLayout.CENTER);
		panel = new JPanel();
		
		JComboBox comboBox = new JComboBox();
		panel.add(comboBox);
		
		 pantallaInicio_ = new pantallaInicio();
		panel.add(pantallaInicio_);
		pantallaInicio_.setLayout(new BoxLayout(pantallaInicio_, BoxLayout.X_AXIS));
	}

}
