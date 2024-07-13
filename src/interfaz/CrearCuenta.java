package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.plaf.basic.BasicComboBoxUI.ComboBoxLayoutManager;

import Inicio.elmain;
import interfaz.Menu;
import interfaz.Lobby;
import LogicaClases.*;


import com.formdev.flatlaf.FlatDarculaLaf;

import java.awt.Color;

import componentesVisuales.BotonAnimacion;

import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Point;

import javax.swing.SwingConstants;

import java.awt.ComponentOrientation;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import java.awt.Font;
import java.awt.CardLayout;

import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextPane;
import javax.swing.JTextField;

public class CrearCuenta extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField txtDejeLaCelda;
	private JTextField textField_1;
	private String tipoCuenta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		FlatDarculaLaf.setup();
		try {
			CrearCuenta dialog = new CrearCuenta();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			
			dialog.setVisible(true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CrearCuenta() {
		setBounds(100, 100, 656, 518);
		getContentPane().setLayout(null);
		
		contentPanel.setBounds(0, 0, 656, 452);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		setResizable(false);
		setUndecorated(true);
		setLocation(40, 50);
		setLocationRelativeTo(null);
		setModalityType(ModalityType.APPLICATION_MODAL);
		
		final JLayeredPane panel_1 = new JLayeredPane();
		panel_1.setBounds(0, 69, 656, 383);
		contentPanel.add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JPanel panelMLC = new JPanel();
		panel_1.add(panelMLC, "MLC");
		panelMLC.setLayout(null);
		
		JPanel panelFondos = new JPanel();
		panel_1.add(panelFondos, "Fondos");
		panelFondos.setLayout(null);
		
		JPanel panelCorriente = new JPanel();
		panel_1.add(panelCorriente, "Corriente");
		panelCorriente.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Parametros para la cuenta Corriente:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(42, 13, 513, 46);
		panelCorriente.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		textField.setBounds(44, 72, 330, 46);
		panelCorriente.add(textField);
		textField.setColumns(10);
		
		txtDejeLaCelda = new JTextField();
		txtDejeLaCelda.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		txtDejeLaCelda.setColumns(10);
		txtDejeLaCelda.setBounds(44, 165, 330, 46);
		panelCorriente.add(txtDejeLaCelda);
		
		JLabel lblNewLabel_2 = new JLabel("Escriba aqu\u00ED el usuario de su beneficiario.");
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(44, 119, 303, 33);
		panelCorriente.add(lblNewLabel_2);
		
		JLabel lblDejeLaCelda = new JLabel("En el caso de no tener deje la celda en blanco.");
		lblDejeLaCelda.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblDejeLaCelda.setBounds(44, 135, 330, 33);
		panelCorriente.add(lblDejeLaCelda);
		
		JLabel lblEscribaAquEl = new JLabel("Escriba aqu\u00ED el usuario de el otro titular.");
		lblEscribaAquEl.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblEscribaAquEl.setBounds(44, 210, 295, 33);
		panelCorriente.add(lblEscribaAquEl);
		
		JLabel label = new JLabel("En el caso de no tener deje la celda en blanco.");
		label.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label.setBounds(44, 228, 330, 33);
		panelCorriente.add(label);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(44, 256, 330, 46);
		panelCorriente.add(textField_1);
		
		JLabel lblEscribaAquEl_1 = new JLabel("Escriba aqu\u00ED el monto inicial de la cuenta.");
		lblEscribaAquEl_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblEscribaAquEl_1.setBounds(42, 298, 332, 33);
		panelCorriente.add(lblEscribaAquEl_1);
		
		JLabel lblDebeSerMayor = new JLabel("Debe ser mayor de 50 pesos(pueden ingresar kilo con ',' o '.').");
		lblDebeSerMayor.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblDebeSerMayor.setBounds(42, 315, 456, 33);
		panelCorriente.add(lblDebeSerMayor);
		
		JPanel panelPlazoFijo = new JPanel();
		panel_1.add(panelPlazoFijo, "PlazoFijo");
		panelPlazoFijo.setLayout(null);
		
		JPanel panelAhorro = new JPanel();
		panel_1.add(panelAhorro, "Ahorro");
		panelAhorro.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elija el tipo de cuenta a crear ");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel.setBounds(145, 24, 312, 43);
		contentPanel.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		menuBar.setBounds(0, 0, 656, 26);
		contentPanel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Configuracion");
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Modo Claro");
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.add(mntmNewMenuItem);
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 452, 656, 66);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		BotonAnimacion btnmcnAceptar = new BotonAnimacion();
		btnmcnAceptar.setColorEfecto(new Color(0, 255, 0));
		btnmcnAceptar.setBackground(new Color(0, 128, 0));
		btnmcnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(tipoCuenta.equals("Corriente")){
					Corriente z=new Corriente(elmain.banco.getUsuarios().get(Menu.pos).getIdU(),null,50,null);
					elmain.banco.getUsuarios().get(Menu.pos).getCuentas().add(z);
				}
					//else if(tipoCuenta.equals("Ahorro")){
						
					//}

					
			}
		});
		btnmcnAceptar.setBounds(0, 13, 209, 40);
		btnmcnAceptar.setText("Crear");
		panel.add(btnmcnAceptar);
		
		BotonAnimacion btnmcnSalir = new BotonAnimacion();
		btnmcnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Salir();
			}
		});
		btnmcnSalir.setText("Salir");
		btnmcnSalir.setColorEfecto(new Color(128, 0, 0));
		btnmcnSalir.setBackground(new Color(255, 0, 0));
		btnmcnSalir.setBounds(221, 13, 221, 40);
		panel.add(btnmcnSalir);
		
		BotonAnimacion btnmcnVolverAlMenu = new BotonAnimacion();
		btnmcnVolverAlMenu.setText("Volver al menu");
		btnmcnVolverAlMenu.setColorEfecto(new Color(255, 215, 0));
		btnmcnVolverAlMenu.setBackground(new Color(255, 255, 0));
		btnmcnVolverAlMenu.setBounds(454, 13, 202, 40);
		panel.add(btnmcnVolverAlMenu);
		
		
		final JComboBox comboBox = new JComboBox();
		comboBox.addItem("MLC");
		comboBox.addItem("Plazo Fijo");
		comboBox.addItem("Ahorro");
		comboBox.addItem("Corriente");
		comboBox.addItem("Fondo");
		tipoCuenta=((String)comboBox.getSelectedItem());
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				//cambiar de panel			
				CardLayout card=(CardLayout) panel_1.getLayout();
				if(comboBox.getSelectedItem().equals("MLC"))
				card.show(panel_1, "MLC");
				else if(comboBox.getSelectedItem().equals("Ahorro"))
				card.show(panel_1, "Ahorro");
				else if(comboBox.getSelectedItem().equals("Plazo Fijo"))
					card.show(panel_1, "PlazoFijo");
				else if(comboBox.getSelectedItem().equals("Corriente"))
					card.show(panel_1, "Corriente");
				else if(comboBox.getSelectedItem().equals("Fondo"))
					card.show(panel_1, "Fondo");
				
			}
			
		});
		comboBox.setFont(new Font("Segoe UI", Font.BOLD, 17));
		comboBox.setBounds(512, 26, 132, 43);
		contentPanel.add(comboBox);
		
		
		
			
	}
	
	public void Salir(){
		int respuesta= JOptionPane.showConfirmDialog(null, "Desea Salir","Inversion Max", JOptionPane.YES_NO_OPTION);

		if(respuesta==JOptionPane.YES_OPTION){
			dispose();
		}

	}
}
