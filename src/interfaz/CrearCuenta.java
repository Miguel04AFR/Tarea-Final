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
import java.util.Date;
import java.util.List;

import com.toedter.calendar.demo.JCalendarDemo;

import raven.datetime.component.time.TimePicker;
import componentesVisuales.JLabelHora;
import componentes.JHora;
import componentes.JFecha;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;


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
	private JTextField textField_11;
	private JTextField textField_13;
	private String tex;
	private int pos=Lobby.pos;
	private Banco banco=Banco.getInstancia();
	private JHora hrPm;
	public static String fechaCreada;
	public static String horaCreada;
	public static String fechaPlazo="";
	public static String Estatal="";
	public static float salarioEstatal=0;
	private boolean MoF=true;
	private JFecha fchjul;
	private JTextField textField_8;
	private JTextField textField_9;
	private Usuario usuario=banco.getUsuarios().get(pos);
	/**
	 * @wbp.nonvisual location=721,394
	 */
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton buttonEstatal;
	private JRadioButton buttonPersonal;
	
	

	

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
		
		final JPanel panelMLC = new JPanel();
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
		textField_11.setBounds(42, 77, 330, 46);
		panelMLC.add(textField_11);
		
		JLabel label_23 = new JLabel("Escriba aqu\u00ED el usuario de su beneficiario.");
		label_23.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_23.setBounds(42, 119, 303, 33);
		panelMLC.add(label_23);
		
		JLabel label_24 = new JLabel("En el caso de no tener deje la celda en blanco.");
		label_24.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_24.setBounds(42, 136, 330, 33);
		panelMLC.add(label_24);

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
		textField_13.setBounds(42, 186, 330, 46);
		panelMLC.add(textField_13);

		JLabel label_27 = new JLabel("Escriba aqu\u00ED el monto inicial de la cuenta.");
		label_27.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_27.setBounds(42, 231, 332, 33);
		panelMLC.add(label_27);
		
		JLabel lblDebeSerMayor_1 = new JLabel("Debe ser mayor de 10 mlc(pueden ingresar centavos con un punto '.').");
		lblDebeSerMayor_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblDebeSerMayor_1.setBounds(42, 247, 513, 33);
		panelMLC.add(lblDebeSerMayor_1);
		
		
		
		
		
		
		
		final JPanel panelFondo = new JPanel();
		panel_1.add(panelFondo, "Fondo");
		panelFondo.setLayout(null);
		
		JLabel lblParametrosParaLa_1 = new JLabel("Parametros para la cuenta de Fondo:");
		lblParametrosParaLa_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblParametrosParaLa_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 26));
		lblParametrosParaLa_1.setBounds(42, 13, 513, 46);
		panelFondo.add(lblParametrosParaLa_1);
		
		JLabel label_1 = new JLabel("Esta cuenta tiene intereses");
		label_1.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		label_1.setBounds(386, 72, 270, 33);
		panelFondo.add(label_1);
		
		JLabel label_8 = new JLabel("fijados por el banco.Estos");
		label_8.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		label_8.setBounds(386, 92, 270, 33);
		panelFondo.add(label_8);
		
		JLabel label_15 = new JLabel("son anuales y depende de ");
		label_15.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		label_15.setBounds(386, 112, 270, 33);
		panelFondo.add(label_15);
		
		JLabel label_22 = new JLabel("el monto depositado,es ");
		label_22.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		label_22.setBounds(386, 132, 270, 33);
		panelFondo.add(label_22);
		
		JLabel lblDecirSuSaldo_1 = new JLabel("decir su saldo actual.So-");
		lblDecirSuSaldo_1.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblDecirSuSaldo_1.setBounds(386, 152, 270, 33);
		panelFondo.add(lblDecirSuSaldo_1);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		textField_8.setColumns(10);
		textField_8.setBounds(42, 77, 330, 46);
		panelFondo.add(textField_8);
		
		JLabel label_7 = new JLabel("Escriba aqu\u00ED el usuario de su beneficiario.");
		label_7.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_7.setBounds(42, 119, 303, 33);
		panelFondo.add(label_7);
		
		JLabel label_14 = new JLabel("En el caso de no tener deje la celda en blanco.");
		label_14.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_14.setBounds(42, 136, 330, 33);
		panelFondo.add(label_14);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		textField_9.setColumns(10);
		textField_9.setBounds(42, 186, 330, 46);
		panelFondo.add(textField_9);
		
		JLabel lblEscribaAquEl_2 = new JLabel("Escriba aqu\u00ED el salario fijo que la entidad que le paga le proporcione.");
		lblEscribaAquEl_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblEscribaAquEl_2.setBounds(42, 231, 513, 33);
		panelFondo.add(lblEscribaAquEl_2);
		
		JLabel lblDebeSerMayor_2 = new JLabel("(pueden ingresar kilos con un punto '.').");
		lblDebeSerMayor_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblDebeSerMayor_2.setBounds(42, 279, 513, 33);
		panelFondo.add(lblDebeSerMayor_2);
		
		JLabel label_18 = new JLabel("Advertencia");
		label_18.setForeground(new Color(220, 20, 60));
		label_18.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_18.setBounds(40, 299, 96, 33);
		panelFondo.add(label_18);
		
		JLabel label_19 = new JLabel(":Solo puede tener una cuenta MLC o de Fondo.En caso");
		label_19.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_19.setBounds(130, 299, 425, 33);
		panelFondo.add(label_19);
		
		JLabel label_20 = new JLabel("de tener una de estas cuentas no podra obtener otra.");
		label_20.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_20.setBounds(42, 315, 425, 33);
		panelFondo.add(label_20);
		
		JLabel lblLoSePuede = new JLabel("lo se puede extraer 4");
		lblLoSePuede.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblLoSePuede.setBounds(386, 172, 270, 33);
		panelFondo.add(lblLoSePuede);
		
		JLabel lblVecesAlAo = new JLabel("veces al a\u00F1o.");
		lblVecesAlAo.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblVecesAlAo.setBounds(386, 192, 270, 33);
		panelFondo.add(lblVecesAlAo);
		
		JLabel lblSeLeIngresara = new JLabel("Se le ingresara el 10% de su saldo.Aunque puede cambiarlo a travez");
		lblSeLeIngresara.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblSeLeIngresara.setBounds(42, 247, 513, 33);
		panelFondo.add(lblSeLeIngresara);
		
		JLabel lblSeLeIngresara_1 = new JLabel("del comercio de la Agencia Bancaria.Debe ser mayor de 30 cup.");
		lblSeLeIngresara_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblSeLeIngresara_1.setBounds(42, 263, 513, 33);
		panelFondo.add(lblSeLeIngresara_1);
		
		final JPanel panelCorriente = new JPanel();
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
		
		JLabel lblDebeSerMayor = new JLabel("Debe ser mayor de 50 pesos(pueden ingresar kilos con un punto '.').");
		lblDebeSerMayor.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblDebeSerMayor.setBounds(42, 315, 500, 33);
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
		
		final JPanel panelPlazoFijo = new JPanel();
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
		
		JLabel lblEscribaAquCuantos = new JLabel("Escriba la fecha tope del plazo.Como en el ejemplo siguiente:");
		lblEscribaAquCuantos.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblEscribaAquCuantos.setBounds(44, 210, 452, 33);
		panelPlazoFijo.add(lblEscribaAquCuantos);
		
		JLabel lblago = new JLabel("\"01-ago-2024\".");
		lblago.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblago.setBounds(44, 228, 330, 33);
		panelPlazoFijo.add(lblago);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(44, 256, 330, 46);
		panelPlazoFijo.add(textField_4);
		
		JLabel label_6 = new JLabel("Escriba aqu\u00ED el monto inicial de la cuenta.");
		label_6.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_6.setBounds(42, 298, 332, 33);
		panelPlazoFijo.add(label_6);
		
		JLabel lblDebeSerMayor_3 = new JLabel("Debe ser mayor de 50 pesos(pueden ingresar kilos con un punto '.').");
		lblDebeSerMayor_3.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblDebeSerMayor_3.setBounds(42, 315, 500, 33);
		panelPlazoFijo.add(lblDebeSerMayor_3);
		
		JLabel label_4 = new JLabel("Esta cuenta tiene intereses");
		label_4.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		label_4.setBounds(386, 72, 270, 33);
		panelPlazoFijo.add(label_4);
		
		JLabel lblDependiendoDelPlazoestos = new JLabel("dependiendo del plazo.");
		lblDependiendoDelPlazoestos.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblDependiendoDelPlazoestos.setBounds(386, 92, 270, 33);
		panelPlazoFijo.add(lblDependiendoDelPlazoestos);
		
		JLabel lblEstosInteresesSe = new JLabel("Estos intereses se cobran");
		lblEstosInteresesSe.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblEstosInteresesSe.setBounds(386, 112, 270, 33);
		panelPlazoFijo.add(lblEstosInteresesSe);
		
		JLabel lblAlFinalizarEl = new JLabel("al finalizar el plazo,en caso");
		lblAlFinalizarEl.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblAlFinalizarEl.setBounds(386, 132, 270, 33);
		panelPlazoFijo.add(lblAlFinalizarEl);
		
		JLabel lblDeCierreImprevisto = new JLabel("de cierre imprevisto ");
		lblDeCierreImprevisto.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblDeCierreImprevisto.setBounds(386, 152, 270, 33);
		panelPlazoFijo.add(lblDeCierreImprevisto);
		
		JLabel lblNoSeCobra = new JLabel("no se cobra el interes");
		lblNoSeCobra.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblNoSeCobra.setBounds(386, 172, 270, 33);
		panelPlazoFijo.add(lblNoSeCobra);
		
		final JPanel panelAhorro = new JPanel();
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
		textField_6.setBounds(327, 211, 215, 46);
		panelAhorro.add(textField_6);
		
		JLabel label_9 = new JLabel("Escriba aqu\u00ED el usuario de su beneficiario.");
		label_9.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_9.setBounds(44, 119, 303, 33);
		panelAhorro.add(label_9);
		
		JLabel label_10 = new JLabel("En el caso de no tener deje la celda en blanco.");
		label_10.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_10.setBounds(44, 135, 330, 33);
		panelAhorro.add(label_10);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		textField_7.setColumns(10);
		textField_7.setBounds(42, 211, 215, 46);
		panelAhorro.add(textField_7);
		
		JLabel lblEscribaAquEl_3 = new JLabel("Escriba aqu\u00ED el monto inicial de la cuenta.Debe ser mayor de 50 ");
		lblEscribaAquEl_3.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblEscribaAquEl_3.setBounds(42, 270, 500, 33);
		panelAhorro.add(lblEscribaAquEl_3);
		
		JLabel lblDebeSerMayor_4 = new JLabel("pesos o 10mlc(pueden ingresar kilos o centavos con un punto '.').");
		lblDebeSerMayor_4.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblDebeSerMayor_4.setBounds(42, 292, 500, 33);
		panelAhorro.add(lblDebeSerMayor_4);
		
		JLabel lblMlc = new JLabel("MLC:");
		lblMlc.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblMlc.setBounds(44, 181, 54, 33);
		panelAhorro.add(lblMlc);
		
		JLabel lblCup = new JLabel("CUP:");
		lblCup.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblCup.setBounds(327, 181, 54, 33);
		panelAhorro.add(lblCup);
		
		buttonEstatal = new JRadioButton("Estatal");
		buttonEstatal.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		buttonEstatal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(buttonEstatal.isSelected()){
					
				}
			}
			
		});
		buttonEstatal.setBounds(130, 349, 127, 25);
		panelAhorro.add(buttonEstatal);
		
		buttonPersonal = new JRadioButton("Personal");
		buttonPersonal.setSelected(true);
		buttonPersonal.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		buttonPersonal.setBounds(42, 349, 127, 25);
		panelAhorro.add(buttonPersonal);
		
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
		btnmcnAceptar.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		btnmcnAceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btnmcnAceptar.setColorEfecto(new Color(0, 255, 0));
		btnmcnAceptar.setBackground(new Color(0, 128, 0));
		btnmcnAceptar.setForeground(Color.BLACK);
		btnmcnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {		
				Menu.cuentaCreada=true;
				AñadirCuenta();
				dispose();
				

					
			}
		});
		btnmcnAceptar.setBounds(12, 13, 197, 40);
		btnmcnAceptar.setText("Crear");
		panel.add(btnmcnAceptar);
		
		BotonAnimacion btnmcnSalir = new BotonAnimacion();
		btnmcnSalir.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		btnmcnSalir.setForeground(Color.BLACK);
		btnmcnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Salir();
			}
		});
		btnmcnSalir.setText("Salir");
		btnmcnSalir.setColorEfecto(new Color(128, 0, 0));
		btnmcnSalir.setBackground(new Color(255, 0, 0));
		btnmcnSalir.setBounds(229, 13, 197, 40);
		panel.add(btnmcnSalir);
		
		BotonAnimacion btnmcnVolverAlMenu = new BotonAnimacion();
		btnmcnVolverAlMenu.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		btnmcnVolverAlMenu.setForeground(Color.BLACK);
		btnmcnVolverAlMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VolverMenu();
			}
		});
		btnmcnVolverAlMenu.setText("Volver al menu");
		btnmcnVolverAlMenu.setColorEfecto(new Color(255, 215, 0));
		btnmcnVolverAlMenu.setBackground(new Color(255, 255, 0));
		btnmcnVolverAlMenu.setBounds(447, 13, 197, 40);
		panel.add(btnmcnVolverAlMenu);
		
		
		  comboBox = new JComboBox();
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
				if(comboBox.getSelectedItem().equals("MLC")){
					panelMLC.add(hrPm);
				panelMLC.add(fchjul);
				card.show(panel_1, "MLC");
				}
					
				else if(comboBox.getSelectedItem().equals("Ahorro")){
						card.show(panel_1, "Ahorro");
						panelAhorro.add(hrPm);
						panelAhorro.add(fchjul);
					}
					
				else 
					if(comboBox.getSelectedItem().equals("Plazo Fijo")){
						card.show(panel_1, "PlazoFijo");
						panelPlazoFijo.add(fchjul);
						panelPlazoFijo.add(hrPm);
					}
					
				else 
					if(comboBox.getSelectedItem().equals("Corriente")){
						card.show(panel_1, "Corriente");
						panelCorriente.add(hrPm);
						panelCorriente.add(fchjul);
					}
					
				else
					if(comboBox.getSelectedItem().equals("Fondo")){
						card.show(panel_1, "Fondo");
						panelFondo.add(hrPm);
						panelFondo.add(fchjul);
					}
			}
			
		});
		comboBox.setFont(new Font("Segoe UI", Font.BOLD, 17));
		comboBox.setBounds(512, 26, 132, 43);
		contentPanel.add(comboBox);
		
		
		hrPm = new JHora(0);
		hrPm.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		hrPm.setBounds(560, 367, 96, 16);
		panelMLC.add(hrPm);
		
		
		
		
		
		
		fchjul = new JFecha();
		fchjul.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		fchjul.setBounds(560, 344, 93, 16);
		panelMLC.add(fchjul);
		
		JLabel lblAdvertencia = new JLabel("Advertencia");
		lblAdvertencia.setForeground(new Color(220, 20, 60));
		lblAdvertencia.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblAdvertencia.setBounds(42, 299, 96, 33);
		panelMLC.add(lblAdvertencia);
		
		JLabel lblsoloPodraTener = new JLabel(":Solo puede tener una cuenta MLC o de Fondo.En caso");
		lblsoloPodraTener.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblsoloPodraTener.setBounds(132, 299, 425, 33);
		panelMLC.add(lblsoloPodraTener);
		
		JLabel lblDeTenerYa = new JLabel("de tener una de estas cuentas no podra obtener otra.");
		lblDeTenerYa.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblDeTenerYa.setBounds(42, 315, 425, 33);
		panelMLC.add(lblDeTenerYa);
			
		buttonGroup.add(buttonPersonal);
		buttonGroup.add(buttonEstatal);
		
		JLabel lblEstaCuentaPuede = new JLabel("Esta cuenta puede ser de");
		lblEstaCuentaPuede.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblEstaCuentaPuede.setBounds(386, 72, 270, 33);
		panelAhorro.add(lblEstaCuentaPuede);
		
		JLabel lblDeDosTipos = new JLabel("de dos tipos de moneda.\r\n");
		lblDeDosTipos.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblDeDosTipos.setBounds(386, 92, 270, 33);
		panelAhorro.add(lblDeDosTipos);
		
		JLabel lblEnCasoDe = new JLabel("En caso de que el depo-");
		lblEnCasoDe.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblEnCasoDe.setBounds(386, 112, 270, 33);
		panelAhorro.add(lblEnCasoDe);
		
		JLabel lblSitanteSeUna = new JLabel("sitante se una empresa");
		lblSitanteSeUna.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblSitanteSeUna.setBounds(386, 132, 270, 33);
		panelAhorro.add(lblSitanteSeUna);
		
		JLabel lblEstatalelUsuarioNo = new JLabel("estatal,el usuario no po-");
		lblEstatalelUsuarioNo.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblEstatalelUsuarioNo.setBounds(386, 152, 270, 33);
		panelAhorro.add(lblEstatalelUsuarioNo);
		
		JLabel lblDraCerrarSu = new JLabel("dra cerrar su cuenta.");
		lblDraCerrarSu.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblDraCerrarSu.setBounds(386, 172, 270, 33);
		panelAhorro.add(lblDraCerrarSu);
		
		JLabel lblSoloPuedeElegir = new JLabel("Solo puede elegir un tipo de moneda.");
		lblSoloPuedeElegir.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblSoloPuedeElegir.setBounds(42, 316, 500, 33);
		panelAhorro.add(lblSoloPuedeElegir);
		
	}
	
	public void Salir(){
		int respuesta= JOptionPane.showConfirmDialog(null, "Desea Salir","Inversion Max", JOptionPane.YES_NO_OPTION);

		if(respuesta==JOptionPane.YES_OPTION){
			dispose();
			Menu.salirDialog=true;
			
		}

	}
	public void AñadirCuenta(){
		PersonalOEstatal();
		fechaCreada=fchjul.getText();
		horaCreada=hrPm.getText();
		if(comboBox.getSelectedItem().equals("Corriente")){
			Corriente p=new Corriente(usuario.getIdU(),textField.getText(),Float.parseFloat(textField_1.getText()),txtDejeLaCelda.getText());
			banco.getUsuarios().get(pos).getCuentas().add(p);
		}else
		if(comboBox.getSelectedItem().equals("Ahorro")){
			if(textField_7.getText().equals("") && !(textField_6.getText().equalsIgnoreCase(""))){
			Ahorro p=new Ahorro(usuario.getIdU(),textField_5.getText(),-1,Float.parseFloat(textField_6.getText()));
			banco.getUsuarios().get(pos).getCuentas().add(p);
			}
			else{
				if(!(textField_7.getText().equals("")) && textField_6.getText().equalsIgnoreCase("")){
					Ahorro p=new Ahorro(usuario.getIdU(),textField_5.getText(),Float.parseFloat(textField_7.getText()),-1);
					banco.getUsuarios().get(pos).getCuentas().add(p);
				}
				
			}
		}else
		if(comboBox.getSelectedItem().equals("Fondo")){
			if(MoF){
				MoF=false;
				salarioEstatal=Float.parseFloat(textField_9.getText());
			Fondo p=new Fondo(usuario.getIdU(),textField_8.getText(),salarioEstatal * 10 / 100);
			banco.getUsuarios().get(pos).getCuentas().add(p);
			}
			
		}else
		if(comboBox.getSelectedItem().equals("MLC")){
			if(MoF){
			MoF=false;
			MLC p=new MLC(usuario.getIdU(),textField_11.getText(),Float.parseFloat(textField_13.getText()));
			banco.getUsuarios().get(pos).getCuentas().add(p);}
		}else
		if(comboBox.getSelectedItem().equals("Plazo Fijo")){
			PlazoFijo p=new PlazoFijo(usuario.getIdU(),textField_2.getText(),Float.parseFloat(textField_4.getText()));
			banco.getUsuarios().get(pos).getCuentas().add(p);
			fechaPlazo=textField_3.getText().toString();
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

	public  static boolean EsFloat(String text) {
		boolean sies;
        try {
            Float.parseFloat(text);
            sies=true;
        } catch (NumberFormatException e) {
           sies=false;
        }
        return sies;
    }
	
	public void PersonalOEstatal(){
		if(buttonPersonal.isSelected())
			Estatal="no";
		else if(buttonEstatal.isSelected())
			Estatal="si";
	}
}