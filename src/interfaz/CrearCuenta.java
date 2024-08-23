package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.plaf.basic.BasicComboBoxUI.ComboBoxLayoutManager;

import Inicio.elmain;
import interfaz.Menu;
import interfaz.Lobby;
import LogicaClases.*;

import com.formdev.flatlaf.FlatDarculaLaf;

import java.awt.Color;

import componentesVisuales.BotonAnimacion;
import componentesVisuales.NotificacionesModernas;

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
import javax.swing.JFrame;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.toedter.calendar.demo.JCalendarDemo;

import raven.datetime.component.time.TimePicker;
import componentesVisuales.JLabelHora;
import componentesVisuales.NotificacionesModernas.Tipo;
import componentes.JHora;
import componentes.JFecha;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;


public class CrearCuenta extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField txtDejeLaCelda;
	private JTextField textField_1;
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
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel label_11;
	private JLabel label_13;
	private JLabel label_5;
	private JLabel label_12;
	private JLabel label_16;
	private JLabel lblNewLabel_8;
	private JLabel label_17;
	private JLabel label_21;
	private JLabel label_25;
	private JLabel label_35;
	private JLabel label_32;
	private JLabel label_33;
	private JLabel label_36;
	private JLabel label_34;
	private JLabel label_37;
	private JLabel label_29;
	private JLabel label_28;
	private JLabel lblNewLabel_9;
	private JLabel label_30;
	private JLabel label_26;
	private JLabel label_31;
	private Date fechaUsuario;
	private Date fechaActual;






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
		getRootPane().setBorder(new LineBorder(Color.BLACK, 3));//poner bordes al Jdialog
		contentPanel.setBounds(0, 0, 656, 452);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		setResizable(false);//para que no sea responsiva
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
					else if(textField_13.getText().length()>8){
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
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent x) {
				if(textField_8.getText().length()>UsuarioTam()){
					x.consume();
				}
			}
		});
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
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent v) {
				if(!(textField_9.getText().equalsIgnoreCase(""))){
					if(!EsFloat(textField_9.getText())){
						textField_9.setText("");
						v.consume();

					}
					else if(textField_9.getText().length()>8){
						v.consume();
					}

				}
			}
		});
		textField_9.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		textField_9.setColumns(10);
		textField_9.setBounds(42, 186, 330, 46);
		panelFondo.add(textField_9);

		JLabel lblEscribaAquEl_2 = new JLabel("Escriba aqu\u00ED el salario fijo de la entidad que le paga.");
		lblEscribaAquEl_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblEscribaAquEl_2.setBounds(42, 231, 513, 33);
		panelFondo.add(lblEscribaAquEl_2);

		JLabel lblDebeSerMayor_2 = new JLabel("(pueden ingresar kilos con un punto '.').");
		lblDebeSerMayor_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblDebeSerMayor_2.setBounds(42, 288, 513, 33);
		panelFondo.add(lblDebeSerMayor_2);

		JLabel label_18 = new JLabel("Advertencia");
		label_18.setForeground(new Color(220, 20, 60));
		label_18.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_18.setBounds(40, 340, 96, 33);
		panelFondo.add(label_18);

		JLabel label_19 = new JLabel(":Solo puede tener una cuenta MLC o de Fondo.En caso");
		label_19.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_19.setBounds(130, 340, 425, 33);
		panelFondo.add(label_19);

		JLabel label_20 = new JLabel("de tener una de estas cuentas no podra obtener otra.");
		label_20.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_20.setBounds(42, 356, 425, 33);
		panelFondo.add(label_20);

		JLabel lblLoSePuede = new JLabel("lo se puede extraer 4");
		lblLoSePuede.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblLoSePuede.setBounds(386, 172, 270, 33);
		panelFondo.add(lblLoSePuede);

		JLabel lblVecesAlAo = new JLabel("veces al a\u00F1o.");
		lblVecesAlAo.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblVecesAlAo.setBounds(386, 192, 270, 33);
		panelFondo.add(lblVecesAlAo);

		JLabel lblSeLeIngresara = new JLabel("Se le ingresara el 10% de su saldo.Aunque puede cambiarlo a traves");
		lblSeLeIngresara.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblSeLeIngresara.setBounds(42, 250, 513, 33);
		panelFondo.add(lblSeLeIngresara);

		JLabel lblSeLeIngresara_1 = new JLabel("del comercio de la Agencia Bancaria.Debe ser mayor de 30 cup.");
		lblSeLeIngresara_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblSeLeIngresara_1.setBounds(42, 269, 513, 33);
		panelFondo.add(lblSeLeIngresara_1);

		lblNewLabel_8 = new JLabel(".");
		lblNewLabel_8.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(12, 62, 362, 16);
		panelFondo.add(lblNewLabel_8);
		lblNewLabel_8.setVisible(false);

		label_17 = new JLabel("");
		label_17.addMouseListener(new MouseAdapter() {


			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNewLabel_8.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblNewLabel_8.setVisible(false);
			}
		});
		label_17.setIcon(new ImageIcon(CrearCuenta.class.getResource("/iconos/exclamacion.png")));
		label_17.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		label_17.setBounds(8, 80, 49, 43);
		panelFondo.add(label_17);
		label_17.setVisible(false);
		label_17.setEnabled(false);

		label_21 = new JLabel(".");
		label_21.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		label_21.setBounds(12, 169, 362, 16);
		panelFondo.add(label_21);
		label_21.setVisible(false);

		label_25 = new JLabel("");
		label_25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				label_21.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				label_21.setVisible(false);

			}
		});
		label_25.setIcon(new ImageIcon(CrearCuenta.class.getResource("/iconos/exclamacion.png")));
		label_25.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		label_25.setBounds(8, 192, 56, 40);
		panelFondo.add(label_25);
		label_25.setVisible(false);
		label_25.setEnabled(false);

		final JPanel panelCorriente = new JPanel();
		panel_1.add(panelCorriente, "Corriente");
		panelCorriente.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Parametros para la cuenta Corriente:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(42, 13, 513, 46);
		panelCorriente.add(lblNewLabel_1);

		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent x) {
				if(textField.getText().length()>UsuarioTam()){
					x.consume();
				}
			}
		});
		textField.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		textField.setBounds(44, 72, 330, 46);
		panelCorriente.add(textField);
		textField.setColumns(10);

		txtDejeLaCelda = new JTextField();
		txtDejeLaCelda.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		txtDejeLaCelda.setColumns(10);
		txtDejeLaCelda.setBounds(44, 180, 330, 46);
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
		lblEscribaAquEl.setBounds(44, 220, 295, 33);
		panelCorriente.add(lblEscribaAquEl);

		JLabel label = new JLabel("En el caso de no tener deje la celda en blanco.");
		label.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label.setBounds(44, 238, 330, 33);
		panelCorriente.add(label);

		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent v) {
				if(!(textField_1.getText().equalsIgnoreCase(""))){
					if(!EsFloat(textField_1.getText())){
						textField_1.setText("");
						v.consume();

					}
					else if(textField_1.getText().length()>8){
						v.consume();
					}

				}

			}
		});
		textField_1.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(44, 285, 330, 46);
		panelCorriente.add(textField_1);

		JLabel lblEscribaAquEl_1 = new JLabel("Escriba aqu\u00ED el monto inicial de la cuenta.");
		lblEscribaAquEl_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblEscribaAquEl_1.setBounds(42, 328, 332, 33);
		panelCorriente.add(lblEscribaAquEl_1);

		JLabel lblDebeSerMayor = new JLabel("Debe ser mayor de 50 pesos(pueden ingresar kilos con un punto '.').");
		lblDebeSerMayor.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblDebeSerMayor.setBounds(42, 345, 500, 33);
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

		lblNewLabel_7 = new JLabel(".");
		lblNewLabel_7.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(12, 55, 362, 16);
		panelCorriente.add(lblNewLabel_7);
		lblNewLabel_7.setVisible(false);

		label_5 = new JLabel("");
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNewLabel_7.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblNewLabel_7.setVisible(false);
			}
		});
		label_5.setIcon(new ImageIcon(CrearCuenta.class.getResource("/iconos/exclamacion.png")));
		label_5.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		label_5.setBounds(10, 80, 56, 33);
		panelCorriente.add(label_5);
		label_5.setVisible(false);
		label_5.setEnabled(false);

		label_11 = new JLabel(".");
		label_11.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		label_11.setBounds(12, 165, 362, 16);
		panelCorriente.add(label_11);
		label_11.setVisible(false);

		label_12 = new JLabel("");
		label_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				label_11.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				label_11.setVisible(false);
			}
		});
		label_12.setIcon(new ImageIcon(CrearCuenta.class.getResource("/iconos/exclamacion.png")));
		label_12.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		label_12.setBounds(10, 188, 56, 33);
		panelCorriente.add(label_12);
		label_12.setVisible(false);
		label_12.setEnabled(false);

		label_13 = new JLabel(".");
		label_13.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		label_13.setBounds(12, 268, 362, 16);
		panelCorriente.add(label_13);
		label_13.setVisible(false);

		label_16 = new JLabel("");
		label_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				label_13.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				label_13.setVisible(false);
			}
		});
		label_16.setIcon(new ImageIcon(CrearCuenta.class.getResource("/iconos/exclamacion.png")));
		label_16.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		label_16.setBounds(10, 291, 56, 33);
		panelCorriente.add(label_16);
		label_16.setVisible(false);
		label_16.setEnabled(false);

		final JPanel panelPlazoFijo = new JPanel();
		panel_1.add(panelPlazoFijo, "PlazoFijo");
		panelPlazoFijo.setLayout(null);

		JLabel lblParametrosParaLa_2 = new JLabel("Parametros para la cuenta de Plazo Fijo:");
		lblParametrosParaLa_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblParametrosParaLa_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 26));
		lblParametrosParaLa_2.setBounds(42, 13, 513, 46);
		panelPlazoFijo.add(lblParametrosParaLa_2);

		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent x) {
				if(textField_2.getText().length()>UsuarioTam()){
					x.consume();
				}
			}
		});
		textField_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(44, 72, 330, 46);
		panelPlazoFijo.add(textField_2);

		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(textField_3.getText().length()>11){
					e.consume();
				}
			}
		});
		textField_3.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(42, 181, 330, 46);
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
		lblEscribaAquCuantos.setBounds(44, 225, 452, 33);
		panelPlazoFijo.add(lblEscribaAquCuantos);

		JLabel lblago = new JLabel("\"01-ago-2024\".");
		lblago.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblago.setBounds(44, 244, 330, 33);
		panelPlazoFijo.add(lblago);

		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent v) {
				if(!(textField_4.getText().equalsIgnoreCase(""))){
					if(!EsFloat(textField_4.getText())){
						textField_4.setText("");
						v.consume();

					}
					else if(textField_4.getText().length()>8){
						v.consume();
					}

				}
			}
		});
		textField_4.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(44, 286, 330, 46);
		panelPlazoFijo.add(textField_4);

		JLabel label_6 = new JLabel("Escriba aqu\u00ED el monto inicial de la cuenta.");
		label_6.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_6.setBounds(42, 328, 332, 33);
		panelPlazoFijo.add(label_6);

		JLabel lblDebeSerMayor_3 = new JLabel("Debe ser mayor de 50 pesos(pueden ingresar kilos con un punto '.').");
		lblDebeSerMayor_3.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblDebeSerMayor_3.setBounds(42, 345, 500, 33);
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

		label_32 = new JLabel(".");
		label_32.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		label_32.setBounds(8, 56, 366, 16);
		panelPlazoFijo.add(label_32);
		label_32.setVisible(false);

		label_33 = new JLabel(".");
		label_33.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		label_33.setBounds(8, 165, 366, 16);
		panelPlazoFijo.add(label_33);
		label_33.setVisible(false);

		label_34 = new JLabel(".");
		label_34.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		label_34.setBounds(8, 271, 366, 16);
		panelPlazoFijo.add(label_34);
		label_34.setVisible(false);

		label_35 = new JLabel("");
		label_35.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				label_32.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				label_32.setVisible(false);
			}
		});
		label_35.setIcon(new ImageIcon(CrearCuenta.class.getResource("/iconos/exclamacion.png")));
		label_35.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		label_35.setBounds(8, 80, 45, 33);
		panelPlazoFijo.add(label_35);
		label_35.setVisible(false);
		label_35.setEnabled(false);

		label_36 = new JLabel("");
		label_36.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				label_33.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				label_33.setVisible(false);
			}
		});
		label_36.setIcon(new ImageIcon(CrearCuenta.class.getResource("/iconos/exclamacion.png")));
		label_36.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		label_36.setBounds(8, 191, 45, 33);
		panelPlazoFijo.add(label_36);
		label_36.setVisible(false);
		label_36.setEnabled(false);

		label_37 = new JLabel("");
		label_37.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				label_34.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				label_34.setVisible(false);
			}
		});
		label_37.setIcon(new ImageIcon(CrearCuenta.class.getResource("/iconos/exclamacion.png")));
		label_37.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		label_37.setBounds(8, 295, 45, 33);
		panelPlazoFijo.add(label_37);
		label_37.setVisible(false);
		label_37.setEnabled(false);

		final JPanel panelAhorro = new JPanel();
		panel_1.add(panelAhorro, "Ahorro");
		panelAhorro.setLayout(null);

		JLabel lblParametrosParaLa_3 = new JLabel("Parametros para la cuenta de Ahorro:");
		lblParametrosParaLa_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblParametrosParaLa_3.setFont(new Font("Segoe UI Black", Font.PLAIN, 26));
		lblParametrosParaLa_3.setBounds(42, 13, 513, 46);
		panelAhorro.add(lblParametrosParaLa_3);

		textField_5 = new JTextField();
		textField_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent x) {
				if(textField_5.getText().length()>UsuarioTam()){
					x.consume();
				}
			}
		});
		textField_5.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		textField_5.setColumns(10);
		textField_5.setBounds(44, 72, 330, 46);
		panelAhorro.add(textField_5);

		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent v) {
				if(!(textField_6.getText().equalsIgnoreCase(""))){
					if(!EsFloat(textField_6.getText())){
						textField_6.setText("");
						v.consume();

					}
					else if(textField_6.getText().length()>8){
						v.consume();
					}
				}
			}
		});
		textField_6.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		textField_6.setColumns(10);
		textField_6.setBounds(327, 221, 215, 46);
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
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent v) {
				if(!(textField_7.getText().equalsIgnoreCase(""))){
					if(!EsFloat(textField_7.getText())){
						textField_7.setText("");
						v.consume();

					}
					else if(textField_7.getText().length()>8){
						v.consume();
					}
				}
			}
		});
		textField_7.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		textField_7.setColumns(10);
		textField_7.setBounds(42, 221, 215, 46);
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
		lblMlc.setBounds(42, 191, 54, 33);
		panelAhorro.add(lblMlc);

		JLabel lblCup = new JLabel("CUP:");
		lblCup.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblCup.setBounds(325, 191, 54, 33);
		panelAhorro.add(lblCup);

		buttonEstatal = new JRadioButton("Estatal");
		buttonEstatal.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		buttonEstatal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(buttonEstatal.isSelected()){

				}
			}

		});
		buttonEstatal.setBounds(130, 349, 69, 25);
		panelAhorro.add(buttonEstatal);

		buttonPersonal = new JRadioButton("Personal");
		buttonPersonal.setSelected(true);
		buttonPersonal.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		buttonPersonal.setBounds(42, 349, 127, 25);
		panelAhorro.add(buttonPersonal);

		JLabel lblNewLabel = new JLabel("Elija el tipo de cuenta a crear :");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel.setBounds(188, 24, 312, 43);
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
				if(comboBox.getSelectedItem().equals("Corriente")){
					if(ValidacionCorriente()){
						Menu.cuentaCreada=true;
						AñadirCuenta();
						dispose();
					}
					else
						Menu.SonidoError();
				}
				else
					if(comboBox.getSelectedItem().equals("MLC")){
						if(ValidacionMLC()){
							Menu.cuentaCreada=true;
							AñadirCuenta();
							dispose();
						}
						else
							Menu.SonidoError();
					}
					else
						if(comboBox.getSelectedItem().equals("Fondo")){
							if(ValidacionFondo()){
								Menu.cuentaCreada=true;
								AñadirCuenta();
								dispose();
							}
							else
								Menu.SonidoError();
						}
						else
							if(comboBox.getSelectedItem().equals("Ahorro")){
								if(ValidacionAhorro()){
									Menu.cuentaCreada=true;
									AñadirCuenta();
									dispose();
								}
								else
									Menu.SonidoError();
							}
							else
								if(comboBox.getSelectedItem().equals("Plazo Fijo")){
									if(ValidacionPlazoFijo()){
										Menu.cuentaCreada=true;
										AñadirCuenta();
										dispose();
									}
									else
										Menu.SonidoError();
								}

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

		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNewLabel_4.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblNewLabel_4.setVisible(false);
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon(CrearCuenta.class.getResource("/iconos/exclamacion.png")));
		lblNewLabel_3.setBounds(8, 80, 40, 38);
		panelMLC.add(lblNewLabel_3);
		lblNewLabel_3.setVisible(false);
		lblNewLabel_3.setEnabled(false);

		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNewLabel_6.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblNewLabel_6.setVisible(false);
			}
		});
		lblNewLabel_5.setIcon(new ImageIcon(CrearCuenta.class.getResource("/iconos/exclamacion.png")));
		lblNewLabel_5.setBounds(8, 190, 40, 38);
		panelMLC.add(lblNewLabel_5);
		lblNewLabel_5.setVisible(false);
		lblNewLabel_5.setEnabled(false);





		lblNewLabel_4 = new JLabel(".");
		lblNewLabel_4.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(12, 61, 360, 16);
		panelMLC.add(lblNewLabel_4);
		lblNewLabel_4.setVisible(false);

		lblNewLabel_6 = new JLabel(".");
		lblNewLabel_6.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(12, 170, 360, 16);
		panelMLC.add(lblNewLabel_6);
		lblNewLabel_6.setVisible(false);



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

		JLabel lblSitanteSeUna = new JLabel("sitante sea una empresa");
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

		JLabel lblAdvertencia_1 = new JLabel("Advertencia");
		lblAdvertencia_1.setForeground(Color.RED);
		lblAdvertencia_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblAdvertencia_1.setBounds(199, 344, 88, 33);
		panelAhorro.add(lblAdvertencia_1);

		JLabel lblsiEsEstatal = new JLabel(":Si es estatal el usuario no podra eliminarla");
		lblsiEsEstatal.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblsiEsEstatal.setBounds(287, 344, 317, 33);
		panelAhorro.add(lblsiEsEstatal);

		lblNewLabel_9 = new JLabel(".");
		lblNewLabel_9.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(80, 200, 216, 16);
		panelAhorro.add(lblNewLabel_9);
		lblNewLabel_9.setVisible(false);

		label_26 = new JLabel(".");
		label_26.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		label_26.setBounds(360, 200, 215, 16);
		panelAhorro.add(label_26);
		label_26.setVisible(false);

		label_28 = new JLabel("");
		label_28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				label_29.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				label_29.setVisible(false);
			}
		});
		label_28.setIcon(new ImageIcon(CrearCuenta.class.getResource("/iconos/exclamacion.png")));
		label_28.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		label_28.setBounds(8, 72, 44, 46);
		panelAhorro.add(label_28);
		label_28.setVisible(false);
		label_28.setEnabled(false);

		label_29 = new JLabel(".");
		label_29.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		label_29.setBounds(12, 56, 366, 16);
		panelAhorro.add(label_29);
		label_29.setVisible(false);

		label_30 = new JLabel("");
		label_30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNewLabel_9.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblNewLabel_9.setVisible(false);
			}
		});
		label_30.setIcon(new ImageIcon(CrearCuenta.class.getResource("/iconos/exclamacion.png")));
		label_30.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		label_30.setBounds(6, 221, 44, 46);
		panelAhorro.add(label_30);
		label_30.setVisible(false);
		label_30.setEnabled(false);

		label_31 = new JLabel("");
		label_31.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				label_26.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				label_26.setVisible(false);
			}
		});
		label_31.setIcon(new ImageIcon(CrearCuenta.class.getResource("/iconos/exclamacion.png")));
		label_31.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		label_31.setBounds(290, 221, 44, 46);
		panelAhorro.add(label_31);
		label_31.setVisible(false);
		label_31.setEnabled(false);

		JLabel lblSiapareceToque = new JLabel("Toque si aparece:");
		lblSiapareceToque.setIcon(null);
		lblSiapareceToque.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblSiapareceToque.setBounds(0, 31, 138, 34);
		contentPanel.add(lblSiapareceToque);

		JLabel label_38 = new JLabel("");
		label_38.setBounds(136, 33, 39, 34);
		contentPanel.add(label_38);
		label_38.setIcon(new ImageIcon(CrearCuenta.class.getResource("/iconos/exclamacion.png")));
		label_38.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));

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
					salarioEstatal=Float.parseFloat(textField_9.getText());
					Fondo p=new Fondo(usuario.getIdU(),textField_8.getText(),salarioEstatal * 10 / 100);
					banco.getUsuarios().get(pos).getCuentas().add(p);
				}else
					if(comboBox.getSelectedItem().equals("MLC")){
						MLC p=new MLC(usuario.getIdU(),textField_11.getText(),Float.parseFloat(textField_13.getText()));
						banco.getUsuarios().get(pos).getCuentas().add(p);
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

	public boolean ValidacionAhorro(){
		label_29.setText("");
		lblNewLabel_9.setText("");
		label_26.setText("");
		label_28.setVisible(false);
		label_28.setEnabled(false);
		label_30.setVisible(false);
		label_30.setEnabled(false);
		label_31.setVisible(false);
		label_31.setEnabled(false);
		boolean validoB=false;//beneficiario
		boolean validoS=false;//saldo
		if(!textField_5.getText().equals("")){
			for(int i=0;i<banco.getUsuarios().size();i++){
				if(textField_5.getText().equals(banco.getUsuarios().get(i).getIdU())){
					validoB=true;
					i=banco.getUsuarios().size();
				}
			}
		}
		else{
			validoB=true;
		}
		if(!validoB){
			label_28.setVisible(true);
			label_28.setEnabled(true);
			label_29.setText("Ese usuario no existe");
		}

		if(!(textField_7.getText().isEmpty() && textField_6.getText().isEmpty())){
			if((!(textField_7.getText().isEmpty()) && textField_6.getText().isEmpty()) || (textField_7.getText().isEmpty()) && !(textField_6.getText().isEmpty())){
				if((!(textField_7.getText().isEmpty()) && textField_6.getText().isEmpty())){
					if(EsFloat(textField_7.getText())){
						float saldo = Float.parseFloat(textField_7.getText());
						if(saldo>10){
							validoS=true;
						}
						else{
							label_30.setVisible(true);
							label_30.setEnabled(true);
							lblNewLabel_9.setText("Debe ser mayor que 10 mlc");
						}
					}
					else{
						label_30.setVisible(true);
						label_30.setEnabled(true);
						lblNewLabel_9.setText("No se aceptan letras");
					}
				}
				else{
					if(EsFloat(textField_6.getText())){
						float saldo = Float.parseFloat(textField_6.getText());
						if(saldo>50){
							validoS=true;
						}
						else{
							label_31.setVisible(true);
							label_31.setEnabled(true);
							label_26.setText("Debe ser mayor que 50 pesos");
						}
					}
					else{
						label_31.setVisible(true);
						label_31.setEnabled(true);
						label_26.setText("No se aceptan letras");
					}


				}
			}
			else{
				label_30.setVisible(true);
				label_30.setEnabled(true);
				label_31.setVisible(true);
				label_31.setEnabled(true);
				lblNewLabel_9.setText("Una celda debe estar vacia");
				label_26.setText("Una celda debe estar vacia");

			}
		}
		else{
			label_30.setVisible(true);
			label_30.setEnabled(true);
			label_31.setVisible(true);
			label_31.setEnabled(true);
			lblNewLabel_9.setText("Una celda debe tener numeros");
			label_26.setText("Una celda debe tener numeros");
		}


		return validoB==true && validoS==true ? true : false;

	}
	public boolean ValidacionPlazoFijo(){
		label_32.setText("");
		label_33.setText("");
		label_34.setText("");
		label_35.setVisible(false);
		label_35.setEnabled(false);
		label_36.setVisible(false);
		label_36.setEnabled(false);
		label_37.setVisible(false);
		label_37.setEnabled(false);
		boolean validoB=false;//beneficiario
		boolean validoS=false;//saldo
		boolean validoF=false;//fecha
		SimpleDateFormat fechaPrederteminada = new SimpleDateFormat("dd-MMM-yyyy");//verifica si un String puede ser una fecha con este modelo de fecha
		fechaPrederteminada.setLenient(false);//Lenient es el modo de flexibilidad,si es true 32-ene-2024 va a ser 01-feb-2024,en false lanzara una exception de que no puede ser
		if(!textField_2.getText().equals("")){
			for(int i=0;i<banco.getUsuarios().size();i++){
				if(textField_2.getText().equals(banco.getUsuarios().get(i).getIdU())){
					validoB=true;
					i=banco.getUsuarios().size();
				}
			}
		}
		else{
			validoB=true;
		}
		if(!validoB){
			label_35.setVisible(true);
			label_35.setEnabled(true);
			label_32.setText("Ese usuario no existe");
		}

		if(!textField_3.getText().isEmpty()){
			if(ValidarFecha(textField_3.getText())){
				if(fechaUsuario.after(fechaActual)){//existe el after que con eso podemos saber si una fecha es mas alante a otra y el before que es lo contrario
					validoF=true;
				}
				else{
					if(fechaUsuario.before(fechaActual)){
						label_36.setVisible(true);
						label_36.setEnabled(true);
						label_33.setText("La fecha es anterior a la actual");
					}
					else{
						label_36.setVisible(true);
						label_36.setEnabled(true);
						label_33.setText("La fecha coincide con la actual");
					}
				}

			}
			else{
				label_36.setVisible(true);
				label_36.setEnabled(true);
				label_33.setText("Le faltan datos");

			}
		}
		else{
			label_36.setVisible(true);
			label_36.setEnabled(true);
			label_33.setText("Esta vacia la celda");
		}


		if(!textField_4.getText().isEmpty()){
			if(EsFloat(textField_4.getText())){
				float saldo = Float.parseFloat(textField_4.getText());
				if(saldo>50){
					validoS=true;
				}
				else{
					label_37.setVisible(true);
					label_37.setEnabled(true);
					label_34.setText("Debe ser mayor que 50 pesos");
				}
			}
			else{
				label_37.setVisible(true);
				label_37.setEnabled(true);
				label_34.setText("No se aceptan letras");
			}
		}
		else{
			label_37.setVisible(true);
			label_37.setEnabled(true);
			label_34.setText("Esta vacia la celda");
		}

		return validoB==true && validoS==true && validoF==true ? true : false;
	}
	public boolean ValidacionMLC(){
		lblNewLabel_6.setText("");
		lblNewLabel_4.setText("");
		lblNewLabel_3.setVisible(false);
		lblNewLabel_3.setEnabled(false);
		lblNewLabel_5.setVisible(false);
		lblNewLabel_5.setEnabled(false);
		boolean validoB=false;//beneficiario
		boolean validoS=false;//saldo
		boolean MoF=false;
		if(!textField_11.getText().equals("")){
			for(int i=0;i<banco.getUsuarios().size();i++){
				if(textField_11.getText().equals(banco.getUsuarios().get(i).getIdU())){
					validoB=true;
					i=banco.getUsuarios().size();
				}
			}
		}
		else{
			validoB=true;
		}
		if(!validoB){
			lblNewLabel_3.setVisible(true);
			lblNewLabel_3.setEnabled(true);
			lblNewLabel_4.setText("Ese usuario no existe");
		}
		if(!textField_13.getText().isEmpty()){
			if(EsFloat(textField_13.getText())){
				float saldo = Float.parseFloat(textField_13.getText());
				if(saldo>10){
					validoS=true;
				}
				else{
					lblNewLabel_5.setVisible(true);
					lblNewLabel_5.setEnabled(true);
					lblNewLabel_6.setText("Debe ser mayor que 10 mlc");
				}
			}
			else{
				lblNewLabel_5.setVisible(true);
				lblNewLabel_5.setEnabled(true);
				lblNewLabel_6.setText("No se aceptan letras");
			}

			for(int i=0;i<usuario.getCuentas().size();i++){
				if(usuario.getCuentas().get(i) instanceof Fondo || usuario.getCuentas().get(i) instanceof MLC){
					MoF=true;
					i=usuario.getCuentas().size();
				}
			}
			if(MoF){
				JOptionPane.showMessageDialog(null, "Ya tiene una cuenta de Fondo o MLC");
			}
		}
		else{
			lblNewLabel_5.setVisible(true);
			lblNewLabel_5.setEnabled(true);
			lblNewLabel_6.setText("Esta vacia la celda");
		}




		return validoB==true && validoS==true && MoF==false? true : false;

	}
	public boolean ValidacionCorriente(){
		lblNewLabel_7.setText("");
		label_11.setText("");
		label_13.setText("");
		label_5.setVisible(false);
		label_5.setEnabled(false);
		label_12.setVisible(false);
		label_12.setEnabled(false);
		label_16.setVisible(false);
		label_16.setEnabled(false);
		boolean validoB=false;
		boolean validoS=false;
		boolean validoT=false;
		if(!textField.getText().equals("")){
			for(int i=0;i<banco.getUsuarios().size();i++){
				if(textField.getText().equals(banco.getUsuarios().get(i).getIdU())){
					validoB=true;
					i=banco.getUsuarios().size();
				}
			}
		}
		else{
			validoB=true;
		}

		if(!txtDejeLaCelda.getText().equals("")){
			for(int i=0;i<banco.getUsuarios().size();i++){
				if(txtDejeLaCelda.getText().equals(banco.getUsuarios().get(i).getIdU())){
					validoT=true;
					i=banco.getUsuarios().size();
				}
			}
		}
		else{
			validoT=true;
		}


		if(!validoB){
			label_5.setVisible(true);
			label_5.setEnabled(true);
			lblNewLabel_7.setText("Ese usuario no existe");
		}

		if(!validoT){
			label_12.setVisible(true);
			label_12.setEnabled(true);
			label_11.setText("Ese usuario no existe");
		}

		if(!textField_1.getText().isEmpty()){
			if(EsFloat(textField_1.getText())){
				float saldo = Float.parseFloat(textField_1.getText());
				if(saldo>50){
					validoS=true;
				}
				else{
					label_16.setVisible(true);
					label_16.setEnabled(true);
					label_13.setText("Debe ser mayor que 50 pesos");
				}
			}
			else{
				label_16.setVisible(true);
				label_16.setEnabled(true);
				label_13.setText("No se aceptan letras");
			}
		}
		else{
			label_16.setVisible(true);
			label_16.setEnabled(true);
			label_13.setText("Esta vacia la celda");
		}

		return validoB==true && validoT==true && validoS==true ? true : false;
	}
	public boolean ValidacionFondo(){
		lblNewLabel_8.setText("");
		label_21.setText("");
		label_17.setVisible(false);
		label_17.setEnabled(false);
		label_25.setVisible(false);
		label_25.setEnabled(false);

		boolean validoB=false;//beneficiario
		boolean validoS=false;//saldo
		boolean MoF=false;
		if(!textField_8.getText().equals("")){
			for(int i=0;i<banco.getUsuarios().size();i++){
				if(textField_8.getText().equals(banco.getUsuarios().get(i).getIdU())){
					validoB=true;
					i=banco.getUsuarios().size();
				}
			}
		}
		else{
			validoB=true;
		}
		if(!validoB){
			label_17.setVisible(true);
			label_17.setEnabled(true);
			lblNewLabel_8.setText("Ese usuario no existe");
		}
		if(!textField_9.getText().isEmpty()){
			if(EsFloat(textField_9.getText())){
				float saldo = Float.parseFloat(textField_9.getText());
				if(saldo>30){
					validoS=true;
				}
				else{
					label_25.setVisible(true);
					label_25.setEnabled(true);
					label_21.setText("Debe ser mayor que 30 pesos");
				}
			}
			else{
				label_25.setVisible(true);
				label_25.setEnabled(true);
				label_21.setText("No se aceptan letras");
			}
		}
		else{
			label_25.setVisible(true);
			label_25.setEnabled(true);
			label_21.setText("Esta vacia la celda");
		}

		for(int i=0;i<usuario.getCuentas().size();i++){
			if(usuario.getCuentas().get(i) instanceof Fondo || usuario.getCuentas().get(i) instanceof MLC){
				MoF=true;
				i=usuario.getCuentas().size();
			}
		}
		if(MoF){
			JOptionPane.showMessageDialog(null, "Ya tiene una cuenta de Fondo o MLC");
		}

		return validoB==true && validoS==true && MoF==false? true : false;

	}

	public boolean ValidarFecha(String fecha){
		boolean sifecha=false;
		SimpleDateFormat fechaPrederteminada = new SimpleDateFormat("dd-MMM-yyyy");//verifica si un String puede ser una fecha con este modelo de fecha
		fechaPrederteminada.setLenient(false);//Lenient es el modo de flexibilidad,si es true 32-ene-2024 va a ser 01-feb-2024,en false lanzara una exception de que no puede ser
		try{
			fechaUsuario = fechaPrederteminada.parse(fecha);
			fechaActual = fechaPrederteminada.parse(fchjul.getText());
			sifecha=true;

		}
		catch(ParseException e) {
			sifecha=false;
		}
		return sifecha;
	}
}