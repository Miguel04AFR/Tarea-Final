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
import java.awt.Window;

import javax.swing.SwingConstants;

import java.awt.ComponentOrientation;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import java.awt.Font;
import java.awt.CardLayout;

import javax.swing.DefaultListModel;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.JTextPane;
import javax.swing.JTextField;

import java.awt.event.KeyAdapter;

import logica.utilidades.logica.Validaciones;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import com.toedter.calendar.demo.JCalendarDemo;


public class CrearCuenta extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField txtDejeLaCelda;
	private JTextField textField_1;
	private String tipoCuenta;
	private JComboBox comboBox;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private String tex;
	private int pos=Lobby.pos;
	private JList<String> jListCuentas;
	private Banco banco=Banco.getInstancia();


	

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
		setResizable(false);//para que no sea recursiva
		setUndecorated(true);//esto es lo de quitar la cruz de cerrar
		setLocation(40, 50);
		setLocationRelativeTo(null);//esto es lo que hace que se centre
		setModalityType(ModalityType.APPLICATION_MODAL); //esto es lo que hace que solo puedas interactuar con esta ventana
		
		final JLayeredPane panel_1 = new JLayeredPane();
		panel_1.setBounds(0, 69, 656, 383);
		contentPanel.add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JPanel panelMLC = new JPanel();
		panel_1.add(panelMLC, "MLC");
		panelMLC.setLayout(null);
		
		JLabel lblParametrosParaLa = new JLabel("Parametros para la cuenta MLC:");
		lblParametrosParaLa.setHorizontalAlignment(SwingConstants.LEFT);
		lblParametrosParaLa.setFont(new Font("Segoe UI Black", Font.PLAIN, 26));
		lblParametrosParaLa.setBounds(42, 13, 513, 46);
		panelMLC.add(lblParametrosParaLa);
		
		textField_11 = new JTextField();
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent x) {
				if(textField_11.getText().length()>UsuarioTam()){
					x.consume();
				}
			}
		});
		textField_11.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		textField_11.setColumns(10);
		textField_11.setBounds(44, 72, 330, 46);
		panelMLC.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		textField_12.setColumns(10);
		textField_12.setBounds(44, 165, 330, 46);
		panelMLC.add(textField_12);
		
		JLabel label_23 = new JLabel("Escriba aqu\u00ED el usuario de su beneficiario.");
		label_23.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_23.setBounds(44, 119, 303, 33);
		panelMLC.add(label_23);
		
		JLabel label_24 = new JLabel("En el caso de no tener deje la celda en blanco.");
		label_24.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_24.setBounds(44, 135, 330, 33);
		panelMLC.add(label_24);
		
		JLabel label_25 = new JLabel("Escriba aqu\u00ED el usuario de el otro titular.");
		label_25.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_25.setBounds(44, 210, 295, 33);
		panelMLC.add(label_25);
		
		JLabel label_26 = new JLabel("En el caso de no tener deje la celda en blanco.");
		label_26.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_26.setBounds(44, 228, 330, 33);
		panelMLC.add(label_26);

		textField_13 = new JTextField();
		textField_13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent v) {

				if(!(textField_13.getText().equalsIgnoreCase(""))){
					if(!EsFloat(textField_13.getText())){
						textField_13.setText("");
						v.consume();
									
					}
				}
			}
		});
		textField_13.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		textField_13.setColumns(10);
		textField_13.setBounds(44, 256, 330, 46);
		panelMLC.add(textField_13);

		JLabel label_27 = new JLabel("Escriba aqu\u00ED el monto inicial de la cuenta.");
		label_27.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_27.setBounds(42, 298, 332, 33);
		panelMLC.add(label_27);
		
		JLabel lblDebeSerMayor_1 = new JLabel("Debe ser mayor de 50 pesos(pueden ingresar kilo con un punto '.').");
		lblDebeSerMayor_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblDebeSerMayor_1.setBounds(42, 315, 493, 33);
		panelMLC.add(lblDebeSerMayor_1);
		
		JPanel panelFondos = new JPanel();
		panel_1.add(panelFondos, "Fondos");
		panelFondos.setLayout(null);
		
		JLabel lblParametrosParaLa_1 = new JLabel("Parametros para la cuenta de Fondos:");
		lblParametrosParaLa_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblParametrosParaLa_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 26));
		lblParametrosParaLa_1.setBounds(42, 13, 513, 46);
		panelFondos.add(lblParametrosParaLa_1);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		textField_8.setColumns(10);
		textField_8.setBounds(44, 72, 330, 46);
		panelFondos.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		textField_9.setColumns(10);
		textField_9.setBounds(44, 165, 330, 46);
		panelFondos.add(textField_9);
		
		JLabel label_16 = new JLabel("Escriba aqu\u00ED el usuario de su beneficiario.");
		label_16.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_16.setBounds(44, 119, 303, 33);
		panelFondos.add(label_16);
		
		JLabel label_17 = new JLabel("En el caso de no tener deje la celda en blanco.");
		label_17.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_17.setBounds(44, 135, 330, 33);
		panelFondos.add(label_17);
		
		JLabel label_18 = new JLabel("Escriba aqu\u00ED el usuario de el otro titular.");
		label_18.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_18.setBounds(44, 210, 295, 33);
		panelFondos.add(label_18);
		
		JLabel label_19 = new JLabel("En el caso de no tener deje la celda en blanco.");
		label_19.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_19.setBounds(44, 228, 330, 33);
		panelFondos.add(label_19);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		textField_10.setColumns(10);
		textField_10.setBounds(44, 256, 330, 46);
		panelFondos.add(textField_10);
		
		JLabel label_20 = new JLabel("Escriba aqu\u00ED el monto inicial de la cuenta.");
		label_20.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_20.setBounds(42, 298, 332, 33);
		panelFondos.add(label_20);
		
		JLabel label_21 = new JLabel("Debe ser mayor de 50 pesos(pueden ingresar kilo con ',' o '.').");
		label_21.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_21.setBounds(42, 315, 456, 33);
		panelFondos.add(label_21);
		
		JLabel label_1 = new JLabel("Esta cuenta tiene intereses");
		label_1.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		label_1.setBounds(386, 72, 270, 33);
		panelFondos.add(label_1);
		
		JLabel label_8 = new JLabel("fijados por el banco.Estos");
		label_8.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		label_8.setBounds(386, 92, 270, 33);
		panelFondos.add(label_8);
		
		JLabel label_15 = new JLabel("son anuales y depende de ");
		label_15.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		label_15.setBounds(386, 112, 270, 33);
		panelFondos.add(label_15);
		
		JLabel label_22 = new JLabel("el monto depositado,es ");
		label_22.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		label_22.setBounds(386, 132, 270, 33);
		panelFondos.add(label_22);
		
		JLabel label_29 = new JLabel("decir su saldo actual.");
		label_29.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		label_29.setBounds(386, 152, 270, 33);
		panelFondos.add(label_29);
		
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
		
		JLabel lblEstaCuentaTiene = new JLabel("Esta cuenta tiene intereses");
		lblEstaCuentaTiene.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblEstaCuentaTiene.setBounds(386, 72, 270, 33);
		panelCorriente.add(lblEstaCuentaTiene);
		
		JLabel lblFijadosPorEl = new JLabel("fijados por el banco.Estos");
		lblFijadosPorEl.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblFijadosPorEl.setBounds(386, 92, 270, 33);
		panelCorriente.add(lblFijadosPorEl);
		
		JLabel lblSonAnualesY = new JLabel("son anuales y depende de ");
		lblSonAnualesY.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblSonAnualesY.setBounds(386, 112, 270, 33);
		panelCorriente.add(lblSonAnualesY);
		
		JLabel lblElMontoDepositado = new JLabel("el monto depositado,es ");
		lblElMontoDepositado.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblElMontoDepositado.setBounds(386, 132, 270, 33);
		panelCorriente.add(lblElMontoDepositado);
		
		JLabel lblDecirSuSaldo = new JLabel("decir su saldo actual.");
		lblDecirSuSaldo.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblDecirSuSaldo.setBounds(386, 152, 270, 33);
		panelCorriente.add(lblDecirSuSaldo);
		
		JPanel panelPlazoFijo = new JPanel();
		panel_1.add(panelPlazoFijo, "PlazoFijo");
		panelPlazoFijo.setLayout(null);
		
		JLabel lblParametrosParaLa_2 = new JLabel("Parametros para la cuenta de Plazo Fijo:");
		lblParametrosParaLa_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblParametrosParaLa_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 26));
		lblParametrosParaLa_2.setBounds(42, 13, 513, 46);
		panelPlazoFijo.add(lblParametrosParaLa_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(44, 72, 330, 46);
		panelPlazoFijo.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(44, 165, 330, 46);
		panelPlazoFijo.add(textField_3);
		
		JLabel label_2 = new JLabel("Escriba aqu\u00ED el usuario de su beneficiario.");
		label_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_2.setBounds(44, 119, 303, 33);
		panelPlazoFijo.add(label_2);
		
		JLabel label_3 = new JLabel("En el caso de no tener deje la celda en blanco.");
		label_3.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_3.setBounds(44, 135, 330, 33);
		panelPlazoFijo.add(label_3);
		
		JLabel label_4 = new JLabel("Escriba aqu\u00ED el usuario de el otro titular.");
		label_4.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_4.setBounds(44, 210, 295, 33);
		panelPlazoFijo.add(label_4);
		
		JLabel label_5 = new JLabel("En el caso de no tener deje la celda en blanco.");
		label_5.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_5.setBounds(44, 228, 330, 33);
		panelPlazoFijo.add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(44, 256, 330, 46);
		panelPlazoFijo.add(textField_4);
		
		JLabel label_6 = new JLabel("Escriba aqu\u00ED el monto inicial de la cuenta.");
		label_6.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_6.setBounds(42, 298, 332, 33);
		panelPlazoFijo.add(label_6);
		
		JLabel label_7 = new JLabel("Debe ser mayor de 50 pesos(pueden ingresar kilo con ',' o '.').");
		label_7.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_7.setBounds(42, 315, 456, 33);
		panelPlazoFijo.add(label_7);
		
		JPanel panelAhorro = new JPanel();
		panel_1.add(panelAhorro, "Ahorro");
		panelAhorro.setLayout(null);
		
		JLabel lblParametrosParaLa_3 = new JLabel("Parametros para la cuenta de Ahorro:");
		lblParametrosParaLa_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblParametrosParaLa_3.setFont(new Font("Segoe UI Black", Font.PLAIN, 26));
		lblParametrosParaLa_3.setBounds(42, 13, 513, 46);
		panelAhorro.add(lblParametrosParaLa_3);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		textField_5.setColumns(10);
		textField_5.setBounds(44, 72, 330, 46);
		panelAhorro.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		textField_6.setColumns(10);
		textField_6.setBounds(44, 165, 330, 46);
		panelAhorro.add(textField_6);
		
		JLabel label_9 = new JLabel("Escriba aqu\u00ED el usuario de su beneficiario.");
		label_9.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_9.setBounds(44, 119, 303, 33);
		panelAhorro.add(label_9);
		
		JLabel label_10 = new JLabel("En el caso de no tener deje la celda en blanco.");
		label_10.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_10.setBounds(44, 135, 330, 33);
		panelAhorro.add(label_10);
		
		JLabel label_11 = new JLabel("Escriba aqu\u00ED el usuario de el otro titular.");
		label_11.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_11.setBounds(44, 210, 295, 33);
		panelAhorro.add(label_11);
		
		JLabel label_12 = new JLabel("En el caso de no tener deje la celda en blanco.");
		label_12.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_12.setBounds(44, 228, 330, 33);
		panelAhorro.add(label_12);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		textField_7.setColumns(10);
		textField_7.setBounds(44, 256, 330, 46);
		panelAhorro.add(textField_7);
		
		JLabel label_13 = new JLabel("Escriba aqu\u00ED el monto inicial de la cuenta.");
		label_13.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_13.setBounds(42, 298, 332, 33);
		panelAhorro.add(label_13);
		
		JLabel label_14 = new JLabel("Debe ser mayor de 50 pesos(pueden ingresar kilo con ',' o '.').");
		label_14.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_14.setBounds(42, 315, 456, 33);
		panelAhorro.add(label_14);
		
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
		btnmcnAceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btnmcnAceptar.setColorEfecto(new Color(0, 255, 0));
		btnmcnAceptar.setBackground(new Color(0, 128, 0));
		btnmcnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {		
				Menu.cuentaCreada=true;
				AñadirCuenta();
				dispose();

					
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
		btnmcnVolverAlMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VolverMenu();
			}
		});
		btnmcnVolverAlMenu.setText("Volver al menu");
		btnmcnVolverAlMenu.setColorEfecto(new Color(255, 215, 0));
		btnmcnVolverAlMenu.setBackground(new Color(255, 255, 0));
		btnmcnVolverAlMenu.setBounds(454, 13, 202, 40);
		panel.add(btnmcnVolverAlMenu);
		
		
		  comboBox = new JComboBox();
		comboBox.addItem("MLC");
		comboBox.addItem("Plazo Fijo");
		comboBox.addItem("Ahorro");
		comboBox.addItem("Corriente");
		comboBox.addItem("Fondos");
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
				else if(comboBox.getSelectedItem().equals("Fondos"))
					card.show(panel_1, "Fondos");

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
			Menu.salirDialog=true;
			
		}

	}
	public void AñadirCuenta(){
		if(comboBox.getSelectedItem().equals("Corriente")){
			Corriente p=new Corriente(banco.getUsuarios().get(pos).getIdU(),textField.getText(),Float.parseFloat(textField_1.getText()),txtDejeLaCelda.getText());
			banco.getUsuarios().get(pos).getCuentas().add(p);
		}
		if(comboBox.getSelectedItem().equals("Ahorro")){
			Corriente p=new Corriente(banco.getUsuarios().get(pos).getIdU(),textField.getText(),Float.parseFloat(textField_1.getText()),txtDejeLaCelda.getText());
			banco.getUsuarios().get(pos).getCuentas().add(p);
		}
		if(comboBox.getSelectedItem().equals("Fondos")){
			Corriente p=new Corriente(banco.getUsuarios().get(pos).getIdU(),textField.getText(),Float.parseFloat(textField_1.getText()),txtDejeLaCelda.getText());
			banco.getUsuarios().get(pos).getCuentas().add(p);
		}
		if(comboBox.getSelectedItem().equals("MLC")){
			Corriente p=new Corriente(banco.getUsuarios().get(pos).getIdU(),textField.getText(),Float.parseFloat(textField_1.getText()),txtDejeLaCelda.getText());
			banco.getUsuarios().get(pos).getCuentas().add(p);
		}
		if(comboBox.getSelectedItem().equals("PlazoFijo")){
			Corriente p=new Corriente(banco.getUsuarios().get(pos).getIdU(),textField.getText(),Float.parseFloat(textField_1.getText()),txtDejeLaCelda.getText());
			banco.getUsuarios().get(pos).getCuentas().add(p);
		}
	}
	


	
	public void VolverMenu(){
		dispose();
	}
	public int UsuarioTam(){
		int caracterTam=0;
		for(Usuario u : banco.getUsuarios()){
			if(caracterTam<u.getIdU().length()){
				caracterTam=u.getIdU().length();
			}
		}
		return caracterTam;
	}

	public static boolean EsFloat(String text) {
		boolean sies;
        try {
            Float.parseFloat(text);
            sies=true;
        } catch (NumberFormatException e) {
           sies=false;
        }
        return sies;
    }
}