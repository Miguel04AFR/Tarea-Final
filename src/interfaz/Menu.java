package interfaz;


import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import Inicio.elmain;
import LogicaClases.*;
import interfaz.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import componentesVisuales.BotonAnimacion;
import componentesVisuales.AvatarCircular;
import componentesVisuales.NotificacionesModernas;
import componentesVisuales.NotificacionesModernas.Localizacion;
import componentesVisuales.NotificacionesModernas.Tipo;
import componentesVisuales.PanelGradiente;




import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

import com.formdev.flatlaf.FlatDarculaLaf;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.Timer;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.IconView;

import java.awt.CardLayout;

import javax.swing.JLayeredPane;
import javax.swing.JPopupMenu;

import java.awt.List;
import java.awt.Choice;
import java.awt.TextField;

import javax.swing.JComboBox;
import javax.swing.JTable;

import java.awt.Scrollbar;

import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.Cursor;
import java.util.Date;
import java.util.TimerTask;

import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JTextField;

import java.awt.ScrollPane;
import java.awt.event.KeyAdapter;

import logica.utilidades.logica.Validaciones;
import componentes.JHora;
import componentes.JFecha;

import javax.swing.table.TableModel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.ListModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;



public class Menu extends JFrame {

	private boolean arriba=false;
	private Timer timer;
	private JPanel contentPane;
	private JPanel panel;
	private boolean claro=false;
	private JMenuItem mntmNewMenuItem_3;
	private JLayeredPane panel_1;
	private JPanel panelope;
	private JPanel panelinicio;
	private JPanel panelperfil;
	public static int pos=Lobby.pos;
	private AvatarCircular avatarCircular;
	private JLabel lblNombre;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblUsuario_1;
	private JLabel lblgmail;
	private JTable table;
	private JLabel lblOperaciones;
	private BotonAnimacion botonAnimacion_3;
	private JLabel lblUsuario;
	private BotonAnimacion botonAnimacion_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_2;
	private BotonAnimacion botonAnimacion;
	private JLabel lblNewLabel;
	private JPanel panelultiope;
	private boolean vercuentas;
	public static boolean salirDialog=false;
	public static boolean cuentaCreada=false;
	public static String Estatal;
	private String fechaPlazo;
	private Banco banco=Banco.getInstancia();
	private int lineas=0;//de la tabla
	private int lineast=0;//de la transferencia
	private int lineasE=0;//de la lista de envio
	private int lineasR=0;//estas son para la lista de recargar movil
	private int lineasRC=0;//de recargar la cuenta
	private int lineasCF=0;//de intereses corriente y fondo
	private int lineasPF=0;//de intereses plazofijo
	private int lineasIA=0;//de ingresar Ahorro
	private DefaultTableModel miTabla;//se utiliza para la table,es una tabla default,mas abajo esta la instancia  en la linea 767,tuve que cambiarlo para cambiar un metodo
	private DefaultTableModel ultiOpeTabla=new DefaultTableModel();
	private String fechaCreada;
	private String horaCreada;
	private float salarioEstatal;
	private Usuario usuario=banco.getUsuarios().get(pos);
	private DefaultListModel<String> listaTranferencia= new DefaultListModel();
	private JList<String> ListaTranfer=new JList<>(listaTranferencia);
	private DefaultListModel<String> listaTranferenciaEnvio=new DefaultListModel();
	private JList<String> ListaEnvioG=new JList<>(listaTranferenciaEnvio);
	private DefaultListModel<String> listaMovil= new DefaultListModel();
	private JList<String> ListaMovilRecargaG=new JList<>(listaMovil);
	private DefaultListModel<String> listaRecargaCuenta= new DefaultListModel();
	private JList<String> ListaRecargaCuentaG=new JList<>(listaRecargaCuenta);
	private DefaultListModel<String> listaInteresCF= new DefaultListModel();
	private JList<String> ListaInteresCFG=new JList<>(listaInteresCF);
	private DefaultListModel<String> listaInteresPF= new DefaultListModel();
	private JList<String> ListaInteresPFG=new JList<>(listaInteresPF);
	private DefaultListModel<String> listaIngresarInteresAhorro= new DefaultListModel();
	private JList<String> ListaIngresarInteresAhorroG=new JList<>(listaIngresarInteresAhorro);
	private boolean tiempoInteres=false;
	private boolean negocios=false;
	private JTextField textField_1;
	private JLabel lblNewLabel_8;
	private int cambioPos=0;//la posicion del saldo que transfiere ,la posicion del enviado esta en el evento de el boton Acaptar(lo uso en todos los Jlist)
	private int posAhorro=0;
	private int fondoA=0;
	private int contadorIntereses=0;
	private JLabel label_2;
	private JLabel lblNewLabel_9;
	private JTextField textField;
	private JTextField textField_2;
	private JLabel lblCi;
	private JLabel lblMovil_1;
	private JLabel label_11;
	private JTextField textField_3;
	private BotonAnimacion botonAnimacion_6;
	private Timer timerst;
	private Timer timerd;//depositar estatal
	private BotonAnimacion botonAnimacion_10;
	private JTextField textField_4;
	private JLabel lblNewLabel_10;
	private BotonAnimacion botonAnimacion_14;
	private JTable table_1;
	private JFecha fecha_1;
	private JHora hora_1;
	private float porcentajeFondo=10;
	private JLabel label_14;
	private JLabel lblNewLabel_12;
	private JLabel label_15;
	private JLabel label_17;
	private JLabel label_19;
	private JLabel label_21;
	private BotonAnimacion botonAnimacion_11;
	private JTextField txtNumero;
	private JLayeredPane panelAgenciaC;
	private JComboBox comboBox;
	private Agencia agencia;
	private JLabel lblNewLabel_1;
	private JLabel lblDireccion;
	private BotonAnimacion btnmcnAsd;
	private int cajero=0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		FlatDarculaLaf.setup();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 */

	public Menu() {
		
		 
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/iconos/iconfinder-481-university-bank-campus-court-4212926_114964.png")));
		setTitle("Mi banco");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1002, 502);
		NotificacionesModernas.getInstancia().setJFrame(this);
		contentPane = new JPanel();
		contentPane.setBorder(new CompoundBorder(new LineBorder(new Color(0, 128, 0), 3), new LineBorder(new Color(0, 128, 0), 6)));
		setContentPane(contentPane);
		setResizable(false);
		setLocationRelativeTo(null);
		NotificacionesModernas.getInstancia().setJFrame(this);
		
		
		contentPane.setLayout(null);



		panel = new JPanel();
		panel.setBorder(new CompoundBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 0, 0)), new BevelBorder(BevelBorder.LOWERED, new Color(0, 128, 0), new Color(0, 128, 0), new Color(0, 128, 0), new Color(0, 128, 0))));
		panel.setForeground(new Color(152, 251, 152));
		panel.setBounds(0, -17, 129, 484);
		//panel.setBounds(0, -418, 129, 484); localizacion deseada
		contentPane.add(panel);

		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/iconos/iconmonstr-menu-dot-horizontal-circle-lined-48.png")));
		lblNewLabel.setBounds(69, 429, 48, 42);
		
		timer = new Timer(10, new ActionListener() {
			int y = panel.getY();

			public void actionPerformed(ActionEvent e){
				if(!arriba){
					if(y<-17){
						y+=5;
						panel.setLocation(panel.getX(), y);
					}
					else {
						((Timer) e.getSource()).stop();

						arriba=true;
					}
				}
				else{
					if(y>-425){
						y-=5;
						panel.setLocation(panel.getX(), y);
					}
					else {
						((Timer) e.getSource()).stop();
						arriba=false;
					}
				}
			}
		});
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				timer.start(); 
			}
		});
		panel.setLayout(null);
		panel.add(lblNewLabel);

		botonAnimacion = new BotonAnimacion();
		botonAnimacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) panel_1.getLayout();
		        cardLayout.show(panel_1,"ultiope");
				
			}
		});
		botonAnimacion.setBounds(69, 309, 48, 47);
		panel.add(botonAnimacion);
		botonAnimacion.setIcon(new ImageIcon(Menu.class.getResource("/iconos/checklist_list_icon_259149.png")));
		botonAnimacion.setBackground(null);
		botonAnimacion.setForeground(null);
		
		lblNewLabel_2 = new JLabel("ultimas");
		lblNewLabel_2.setBounds(1, 322, 56, 16);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		
		lblNewLabel_3 = new JLabel("operaciones");
		lblNewLabel_3.setBounds(0, 340, 85, 16);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		
		botonAnimacion_2 = new BotonAnimacion();
		botonAnimacion_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout card =(CardLayout) panel_1.getLayout();
				card.show(panel_1, "perfil");
			}
		});
		botonAnimacion_2.setIcon(new ImageIcon(Menu.class.getResource("/iconos/masculine-avatar-user-with-suit_icon-icons.com_68296 (1).png")));
		botonAnimacion_2.setForeground((Color) null);
		botonAnimacion_2.setBackground((Color) null);
		botonAnimacion_2.setBounds(69, 69, 48, 47);
		panel.add(botonAnimacion_2);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblUsuario.setBounds(0, 85, 56, 16);
		panel.add(lblUsuario);
		
		botonAnimacion_3 = new BotonAnimacion();
		botonAnimacion_3.setIcon(new ImageIcon(Menu.class.getResource("/iconos/bank_transfer_icon_137913 (2).png")));
		botonAnimacion_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout card=(CardLayout) panel_1.getLayout();
				card.show(panel_1, "panelope");
			}
		});
		botonAnimacion_3.setBounds(69, 254, 48, 42);
		panel.add(botonAnimacion_3);
		botonAnimacion_3.setBackground(null);
		botonAnimacion_3.setForeground(null);
		
		lblOperaciones = new JLabel("Operaciones");
		lblOperaciones.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		lblOperaciones.setBounds(1, 265, 69, 16);
		panel.add(lblOperaciones);
		
		BotonAnimacion botonAnimacion_8 = new BotonAnimacion();
		botonAnimacion_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout card =(CardLayout) panel_1.getLayout();
				card.show(panel_1, "inicio");
			}
		});
		botonAnimacion_8.setIcon(new ImageIcon(Menu.class.getResource("/iconos/bank_78916.png")));
		botonAnimacion_8.setForeground((Color) null);
		botonAnimacion_8.setBackground((Color) null);
		botonAnimacion_8.setBounds(69, 369, 48, 47);
		panel.add(botonAnimacion_8);
		
		BotonAnimacion botonAnimacion_9 = new BotonAnimacion();
		botonAnimacion_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout card =(CardLayout) panel_1.getLayout();
				card.show(panel_1, "Agencia");
			}
		});
		botonAnimacion_9.setIcon(new ImageIcon(Menu.class.getResource("/iconos/manandcashiermachine_89097.png")));
		botonAnimacion_9.setForeground((Color) null);
		botonAnimacion_9.setBackground((Color) null);
		botonAnimacion_9.setBounds(69, 188, 48, 54);
		panel.add(botonAnimacion_9);
		
		botonAnimacion_10 = new BotonAnimacion();
		botonAnimacion_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(!negocios){
					NotificacionesModernas.getInstancia().show(Tipo.ERROR, 5000, "No tiene todavia ninguna cuenta de Fondo");
				}
				else
				lblNewLabel_10.setText(String.valueOf(salarioEstatal));
				label_14.setText(String.valueOf(porcentajeFondo));
				
			}
		});
		botonAnimacion_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout card =(CardLayout) panel_1.getLayout();
				card.show(panel_1, "Negocios");
				
				
			}
		});
		botonAnimacion_10.setIcon(new ImageIcon(Menu.class.getResource("/iconos/handshake_icon_198540.png")));
		botonAnimacion_10.setForeground((Color) null);
		botonAnimacion_10.setBackground((Color) null);
		botonAnimacion_10.setBounds(61, 129, 56, 54);
		botonAnimacion_10.setEnabled(false);
		panel.add(botonAnimacion_10);
		
				JMenuBar menuBar = new JMenuBar();
				menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 15));
				menuBar.setBorderPainted(false);
				menuBar.setBounds(950, 0, 50, 26);
				contentPane.add(menuBar);
				
						JMenu mnSalir = new JMenu("Salir");
						mnSalir.setHorizontalAlignment(SwingConstants.CENTER);
						menuBar.add(mnSalir);
						
								JMenuItem mntmNewMenuItem = new JMenuItem("cerrar cuenta");
								mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0));
								mnSalir.add(mntmNewMenuItem);
								
										JMenuItem mntmNewMenuItem_1 = new JMenuItem("cerrar sesion");
										mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, InputEvent.ALT_MASK));
										mnSalir.add(mntmNewMenuItem_1);
										
												JMenuItem mntmNewMenuItem_2 = new JMenuItem("no decidido");
												mnSalir.add(mntmNewMenuItem_2);
												mntmNewMenuItem_1.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent arg0) {
														Lobby ellobby = new Lobby();
														dispose();
														ellobby.setVisible(true);
														NotificacionesModernas.getInstancia().show(Tipo.INFO,Localizacion.SUP_DER,3000,"Sesion cerrada");
													}
												});
												mntmNewMenuItem.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent arg0) {
														dispose();
													}
												});
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBorderPainted(false);
		menuBar_1.setBounds(848, 0, 114, 26);
		contentPane.add(menuBar_1);
		
		JMenu mnNewMenu = new JMenu("Configuraciones");
		menuBar_1.add(mnNewMenu);
		
		mntmNewMenuItem_3 = new JMenuItem("modo claro");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!claro){
					contentPane.setBackground(Color.WHITE);
					panel.setBackground(Color.WHITE);
					claro=true;
					mntmNewMenuItem_3.setText("modo oscuro");
				}
					else {
						contentPane.setBackground(null);
						panel.setBackground(null);
						claro=false;
						mntmNewMenuItem_3.setText("modo claro");
					}
				
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuBar menuBar_2 = new JMenuBar();
		menuBar_2.setBorderPainted(false);
		menuBar_2.setBounds(14, 0, 982, 26);
		contentPane.add(menuBar_2);
		
		panel_1 = new JLayeredPane();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(128, 26, 868, 441);
		contentPane.add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		panelinicio = new JPanel();
		panelinicio.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.add(panelinicio, "inicio");
		panelinicio.setLayout(null);
		
		JLabel lblBienvenidoAInversion = new JLabel("Bienvenido a Inversion Max");
		lblBienvenidoAInversion.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblBienvenidoAInversion.setBackground(Color.BLACK);
		lblBienvenidoAInversion.setBounds(255, 0, 278, 45);
		panelinicio.add(lblBienvenidoAInversion);
		
		
		
		
		panelope = new JPanel();
		panel_1.add(panelope, "panelope");
		panelope.setLayout(null);
		
		BotonAnimacion botonAnimacion_1 = new BotonAnimacion();
		botonAnimacion_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout card =(CardLayout) panel_1.getLayout();
				card.show(panel_1, "Movil");
			}
		});
		botonAnimacion_1.setIcon(new ImageIcon(Menu.class.getResource("/iconos/transfer_data_icon_154703.png")));
		botonAnimacion_1.setBackground(new Color(50, 205, 50));
		botonAnimacion_1.setBounds(80, 131, 78, 78);
		panelope.add(botonAnimacion_1);
		
		JLabel label_1 = new JLabel("Transferencia de");
		label_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_1.setBounds(170, 131, 116, 37);
		panelope.add(label_1);
		
		BotonAnimacion botonAnimacion_4 = new BotonAnimacion();
		botonAnimacion_4.setIcon(new ImageIcon(Menu.class.getResource("/iconos/bank_transfer_icon_137913 (2).png")));
		botonAnimacion_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		botonAnimacion_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CardLayout card =(CardLayout) panel_1.getLayout();
				card.show(panel_1, "Transferir");
				
			}
		});
		botonAnimacion_4.setBackground(new Color(50, 205, 50));
		botonAnimacion_4.setBounds(80, 272, 78, 78);
		panelope.add(botonAnimacion_4);
		
		JLabel label_3 = new JLabel("Transferir de");
		label_3.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_3.setBounds(170, 305, 116, 37);
		panelope.add(label_3);
		
		JLabel label_4 = new JLabel("cuenta a cuenta");
		label_4.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_4.setBounds(170, 272, 116, 37);
		panelope.add(label_4);
		
		JLabel label_6 = new JLabel("saldo");
		label_6.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_6.setBounds(170, 172, 104, 37);
		panelope.add(label_6);

		BotonAnimacion botonAnimacion_5 = new BotonAnimacion();
		botonAnimacion_5.setIcon(new ImageIcon(Menu.class.getResource("/iconos/creditcard_106496.png")));
		botonAnimacion_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CrearCuenta p=new CrearCuenta();
				p.setVisible(true);
				VerCuenta();
				AñadirCuentaTabla(miTabla);


				if(cuentaCreada){
					NotificacionesModernas.getInstancia().show(Tipo.EXITO,Localizacion.SUP_CENTRO,5000,"Cuenta creada exitosamente");
					cuentaCreada=false;
				}

				if(salirDialog){
					dispose();
				}



			}
		});
		botonAnimacion_5.setBackground(new Color(50, 205, 50));
		botonAnimacion_5.setBounds(446, 272, 78, 78);
		panelope.add(botonAnimacion_5);
		
		JLabel lblCrearNueva = new JLabel("Crear nueva ");
		lblCrearNueva.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblCrearNueva.setBounds(536, 272, 116, 37);
		panelope.add(lblCrearNueva);
		
		JLabel lblCuentaDeBanco = new JLabel("cuenta de banco");
		lblCuentaDeBanco.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblCuentaDeBanco.setBounds(536, 305, 116, 37);
		panelope.add(lblCuentaDeBanco);
		
		botonAnimacion_6 = new BotonAnimacion();
		botonAnimacion_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(!tiempoInteres){
					NotificacionesModernas.getInstancia().show(Tipo.ERROR, 5000, "No tiene todavia ningun interes");
				}
			}
		});
		botonAnimacion_6.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				CardLayout card =(CardLayout) panel_1.getLayout();
				card.show(panel_1, "Intereses");
				
				
			}
		});
		 timerst = new Timer(1 * 1000, new ActionListener(){
			  public void actionPerformed(ActionEvent e) {
				  for(int i=0;i<usuario.getCuentas().size();i++){
					  if(usuario.getCuentas().get(i) instanceof Iintereses || usuario.getCuentas().get(i) instanceof PlazoFijo){
						  tiempoInteres=true;
						  botonAnimacion_6.setEnabled(true);
							timerst.setRepeats(false);//Asegurarse de que el Timer no se repita
							i=usuario.getCuentas().size();
							
					  }
				  }
				 
	            }
	        });
		timerst.setRepeats(true); // Asegurarse de que el Timer  se repita
        timerst.start();
	
		botonAnimacion_6.setIcon(new ImageIcon(Menu.class.getResource("/iconos/money-bills-stack-1_icon-icons.com_56168.png")));
		botonAnimacion_6.setBackground(new Color(50, 205, 50));
		botonAnimacion_6.setBounds(446, 131, 78, 78);
		panelope.add(botonAnimacion_6);
		botonAnimacion_6.setEnabled(tiempoInteres);
		

	        
		JLabel lblRecargarSaldo = new JLabel("Extraer intereses");
		lblRecargarSaldo.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblRecargarSaldo.setBounds(551, 131, 129, 37);
		panelope.add(lblRecargarSaldo);
		
		JLabel lblMovil = new JLabel("de cuentas");
		lblMovil.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblMovil.setBounds(551, 172, 116, 37);
		panelope.add(lblMovil);
		
		JLabel label = new JLabel("Bienvenido a Inversion Max");
		label.setFont(new Font("Segoe UI", Font.BOLD, 20));
		label.setBackground(Color.BLACK);
		label.setBounds(210, 13, 278, 45);
		panelope.add(label);
		
		BotonAnimacion btnmcnRecargarCuenta = new BotonAnimacion();
		btnmcnRecargarCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout card =(CardLayout) panel_1.getLayout();
				card.show(panel_1, "Recargar");
			}
		});
		btnmcnRecargarCuenta.setText("Recargar Cuenta");
		btnmcnRecargarCuenta.setForeground(Color.BLACK);
		btnmcnRecargarCuenta.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnmcnRecargarCuenta.setColorEfecto(Color.GREEN);
		btnmcnRecargarCuenta.setBackground(new Color(0, 128, 0));
		btnmcnRecargarCuenta.setBounds(210, 365, 290, 67);
		panelope.add(btnmcnRecargarCuenta);
		
		panelperfil = new JPanel();
		panel_1.add(panelperfil, "perfil");
		panelperfil.setLayout(null);
		
		JPanel paneldatos = new JPanel();
		paneldatos.setBounds(0, 0, 866, 125);
		panelperfil.add(paneldatos);
		paneldatos.setLayout(null);
		
		
		avatarCircular = new AvatarCircular();
		avatarCircular.setAvatar(new ImageIcon(Menu.class.getResource("/iconos/woman_female_girl_people_avatar_icon_131275 (5).png")));
		avatarCircular.setBounds(12, -1, 93, 99);
		paneldatos.add(avatarCircular);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblNombre.setBounds(95, 13, 268, 16);
		paneldatos.add(lblNombre);
		
		lblNewLabel_4 = new JLabel("Genero:");
		lblNewLabel_4.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblNewLabel_4.setBounds(22, 96, 114, 16);
		paneldatos.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Direccion:");
		lblNewLabel_5.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblNewLabel_5.setBounds(95, 42, 268, 16);
		paneldatos.add(lblNewLabel_5);
		
		lblUsuario_1 = new JLabel("Usuario:");
		lblUsuario_1.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblUsuario_1.setBounds(375, 13, 186, 16);
		paneldatos.add(lblUsuario_1);
		
		lblgmail = new JLabel("@gmail:");
		lblgmail.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblgmail.setBounds(375, 42, 248, 16);
		paneldatos.add(lblgmail);
		
		lblCi = new JLabel("CI:");
		lblCi.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblCi.setBounds(95, 71, 153, 16);
		paneldatos.add(lblCi);
		
		lblMovil_1 = new JLabel("Movil:");
		lblMovil_1.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblMovil_1.setBounds(375, 71, 186, 16);
		paneldatos.add(lblMovil_1);
		
		JLabel lblBorrarCuenta = new JLabel("Borrar Cuenta:");
		lblBorrarCuenta.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblBorrarCuenta.setBounds(594, 13, 186, 16);
		paneldatos.add(lblBorrarCuenta);
		
		JLabel lblEscribaEl = new JLabel("Escriba el # de la cuenta");
		lblEscribaEl.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblEscribaEl.setBounds(594, 28, 248, 16);
		paneldatos.add(lblEscribaEl);
		
		JLabel lblLaCuentaA = new JLabel("a eliminar:");
		lblLaCuentaA.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblLaCuentaA.setBounds(594, 42, 143, 16);
		paneldatos.add(lblLaCuentaA);
		
		txtNumero = new JTextField();
		txtNumero.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		txtNumero.setBounds(685, 52, 85, 34);
		paneldatos.add(txtNumero);
		txtNumero.setColumns(10);
		
		btnmcnAsd = new BotonAnimacion();
		btnmcnAsd.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent arg0) {
				btnmcnAsd.doClick();
			}
		});
		btnmcnAsd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BorrarCuenta();
			    
			}
		});
		btnmcnAsd.setColorEfecto(new Color(0, 255, 0));
		btnmcnAsd.setBackground(new Color(0, 128, 0));
		btnmcnAsd.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		btnmcnAsd.setText("Eliminar");
		btnmcnAsd.setBounds(685, 91, 85, 29);
		paneldatos.add(btnmcnAsd);
		
		
		JPanel paneltabla = new JPanel();
		paneltabla.setBounds(0, 122, 866, 317);
		panelperfil.add(paneltabla);
		paneltabla.setLayout(null);
		

		miTabla=new DefaultTableModel(){
		    @Override
		    public boolean isCellEditable(int row, int column) {
		        return false; // Todas las celdas no son editables
		    }
		};
		
		
		    miTabla.addColumn("Cuenta");
	        miTabla.addColumn("Saldo");
	        miTabla.addColumn("Moneda");
	        miTabla.addColumn("Intereses");
	        miTabla.addColumn("Hora creada");
	        miTabla.addColumn("Creado");
	        miTabla.addColumn("2do Titular");
	        miTabla.addColumn("Beneficiario");
	        miTabla.addColumn("Plazo");
	        miTabla.addColumn("Estatal");
	        miTabla.addColumn("#Cuenta");
	        

		
		
		/*Object[][] datos = new Object[][] {
			    {null, null, null},
			    {null, null, null},
			    {null, null, null},
			};*/
	    
		table = new JTable(miTabla);
		table.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		table.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));//cambia el cursor
		table.setBounds(47, 38, 647, 229);
		paneltabla.add(table);
		table.setFillsViewportHeight(true);//para que todo sea visible
		
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(8, 3, 850, 269);
		paneltabla.add(scrollPane);
		
		
		
		
		JHora hora = new JHora(0);
		hora.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		hora.setBounds(773, 300, 96, 16);
		paneltabla.add(hora);
		
		JFecha fecha = new JFecha();
		fecha.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		fecha.setBounds(773, 280, 93, 16);
		paneltabla.add(fecha);

		 AñadirCuentaTabla(miTabla);
		panelultiope = new JPanel();
		panel_1.add(panelultiope, "ultiope");
		panelultiope.setLayout(null);
		

		
		
		ultiOpeTabla.addColumn("Operacion");
		ultiOpeTabla.addColumn("Cuenta");
		ultiOpeTabla.addColumn("Monto");
		ultiOpeTabla.addColumn("Hora");
		ultiOpeTabla.addColumn("Fehca");
		
		table_1 = new JTable(ultiOpeTabla);
		table_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		table_1.setFillsViewportHeight(true);
		table_1.setBounds(12, 80, 842, 267);
		panelultiope.add(table_1);
		
		JScrollPane scrollPaneOpe = new JScrollPane(table_1);
		scrollPaneOpe.setBounds(12, 80, 842, 267);
		panelultiope.add(scrollPaneOpe);
		
		hora_1 = new JHora(0);
		hora_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		hora_1.setBounds(773, 423, 96, 16);
		panelultiope.add(hora_1);
		
		fecha_1 = new JFecha();
		fecha_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		fecha_1.setBounds(773, 403, 93, 16);
		panelultiope.add(fecha_1);
		

		
		
		JPanel panelTransferir = new JPanel();
		panel_1.add(panelTransferir, "Transferir");
		panelTransferir.setLayout(null);
		
		JLabel lblTransferirDeCuenta = new JLabel("Transferir de cuenta a cuenta");
		lblTransferirDeCuenta.setBounds(254, 0, 288, 27);
		lblTransferirDeCuenta.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblTransferirDeCuenta.setBackground(Color.BLACK);
		panelTransferir.add(lblTransferirDeCuenta);
		if(pos!=1){
			int i=0;
			//for(CuentaBancaria c : banco.getUsuarios().get(pos).getCuentas()){
				//comboBox.addItem(c.getTipo());
			//}
		}
		ListaTranfer.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		
		
		JScrollPane scrollPane_1 = new JScrollPane(ListaTranfer);//metes dentro la lista para que salga en el scrollpane

			ListaTranfer.addListSelectionListener(new ListSelectionListener() {// se usan estas dos bibliotecas import javax.swing.event.ListSelectionEvent; import javax.swing.event.ListSelectionListener;
				public void valueChanged(ListSelectionEvent e) {
					if (!e.getValueIsAdjusting()) {
						if(ListaTranfer.getSelectedIndex()>-1){
							for(int lil=0;lil<miTabla.getRowCount();lil++){//las lineas
								String cuenta= miTabla.getValueAt(lil, 0).toString();//getValueAt(lil, 0) es para coger el valor en la tabla y toString para convertir ese valor a String completamente
								String numeroCuenta= miTabla.getValueAt(lil, 10).toString();
								String saldo="";
								if(ListaTranfer.getSelectedValue().equalsIgnoreCase(cuenta + "-" + numeroCuenta) && ListaTranfer.getSelectedValue()!=null){
								if(cuenta.equalsIgnoreCase("Corriente"))
							    saldo=String.valueOf(((Corriente)usuario.getCuentas().get(lil)).getCup());
								else if(cuenta.equalsIgnoreCase("MLC"))
									saldo=String.valueOf(((MLC)usuario.getCuentas().get(lil)).getMlc());
								else if(cuenta.equalsIgnoreCase("Ahorro"))
									if(miTabla.getValueAt(cambioPos, 2).toString().equalsIgnoreCase("cup"))
										saldo=String.valueOf(((Ahorro)usuario.getCuentas().get(lil)).getCup());
									else
										saldo=String.valueOf(((Ahorro)usuario.getCuentas().get(lil)).getMlc());
								else if(cuenta.equalsIgnoreCase("PlazoFijo"))
										saldo=String.valueOf(((PlazoFijo)usuario.getCuentas().get(lil)).getCup());
								else if(cuenta.equalsIgnoreCase("Fondo"))
									saldo=String.valueOf(((Fondo)usuario.getCuentas().get(lil)).getCup());
								lblNewLabel_8.setText(saldo);
									cambioPos=lil;

								}

							}
						}
					}
					
				}
				

		});
		scrollPane_1.setBounds(40, 151, 230, 85);//para ver que es lo que esta seleccionado se usa la ListaTranfer
		panelTransferir.add(scrollPane_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(300, 287, 140, 38);
		panelTransferir.add(textField_1);
		
		lblNewLabel_8 = new JLabel(".");
		lblNewLabel_8.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(120, 237, 85, 38);
		panelTransferir.add(lblNewLabel_8);
		ListaEnvioG.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		
		JScrollPane scrollPane_2 = new JScrollPane(ListaEnvioG);
		scrollPane_2.setBounds(477, 151, 230, 85);
		panelTransferir.add(scrollPane_2);
		ListaEnvioG.addListSelectionListener(new ListSelectionListener() {// se usan estas dos bibliotecas import javax.swing.event.ListSelectionEvent; import javax.swing.event.ListSelectionListener;
			public void valueChanged(ListSelectionEvent d) {
				if (!d.getValueIsAdjusting()) {
					if(ListaEnvioG.getSelectedIndex()>-1){
						for(int lil=0;lil<miTabla.getRowCount();lil++){//las lineas
							String cuenta= miTabla.getValueAt(lil, 0).toString();//getValueAt(lil, 0) es para coger el valor en la tabla y toString para convertir ese valor a String completamente
							String numeroCuenta= miTabla.getValueAt(lil, 10).toString();
							String saldo="";
							if(ListaEnvioG.getSelectedValue().equalsIgnoreCase(cuenta + "-" + numeroCuenta) && ListaEnvioG.getSelectedValue()!=null){
								if(cuenta.equalsIgnoreCase("Corriente"))
								    saldo=String.valueOf(((Corriente)usuario.getCuentas().get(lil)).getCup());
									else if(cuenta.equalsIgnoreCase("MLC"))
										saldo=String.valueOf(((MLC)usuario.getCuentas().get(lil)).getMlc());
									else if(cuenta.equalsIgnoreCase("Ahorro"))
										if(miTabla.getValueAt(cambioPos, 2).toString().equalsIgnoreCase("cup"))
											saldo=String.valueOf(((Ahorro)usuario.getCuentas().get(lil)).getCup());
										else
											saldo=String.valueOf(((Ahorro)usuario.getCuentas().get(lil)).getMlc());
									else if(cuenta.equalsIgnoreCase("PlazoFijo"))
											saldo=String.valueOf(((PlazoFijo)usuario.getCuentas().get(lil)).getCup());
									else if(cuenta.equalsIgnoreCase("Fondo"))
										saldo=String.valueOf(((Fondo)usuario.getCuentas().get(lil)).getCup());
								label_2.setText(saldo);
								

							}

						}
					}
				}
				
			}
		});
		
		BotonAnimacion botonAnimacion_7 = new BotonAnimacion();
		botonAnimacion_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ListaTranfer.getSelectedIndex()>-1 && ListaEnvioG.getSelectedIndex()>-1 && ListaTranfer.getSelectedIndex()!=ListaEnvioG.getSelectedIndex()){
					int enviar=ListaEnvioG.getSelectedIndex();//la posicion del nuevo Saldo
					float restaSaldo=Float.parseFloat(textField_1.getText());
					float saldoTrans=0;
					float SaldoEnvio=(float) miTabla.getValueAt(enviar,1)+restaSaldo;//el casting  es por el dato de las cosas en la tabla 
					if(usuario.getCuentas().get(cambioPos) instanceof Corriente){
					saldoTrans=((Corriente)usuario.getCuentas().get(cambioPos)).getCup()-restaSaldo;
					((Corriente)usuario.getCuentas().get(cambioPos)).setCup(saldoTrans);
					}
					else if(usuario.getCuentas().get(cambioPos) instanceof Fondo){
						saldoTrans=((Fondo)usuario.getCuentas().get(cambioPos)).getCup()-restaSaldo;
						((Fondo)usuario.getCuentas().get(cambioPos)).setCup(saldoTrans);
						}
					else if(usuario.getCuentas().get(cambioPos) instanceof MLC){
						saldoTrans=((MLC)usuario.getCuentas().get(cambioPos)).getMlc()-restaSaldo;
						((MLC)usuario.getCuentas().get(cambioPos)).setMlc(saldoTrans);
						}
					else if(usuario.getCuentas().get(cambioPos) instanceof PlazoFijo){
						saldoTrans=((PlazoFijo)usuario.getCuentas().get(cambioPos)).getCup()-restaSaldo;
						((PlazoFijo)usuario.getCuentas().get(cambioPos)).setCup(saldoTrans);
						}
					else if(usuario.getCuentas().get(cambioPos) instanceof Ahorro){
						if(miTabla.getValueAt(cambioPos, 2).toString().equalsIgnoreCase("cup")){
						saldoTrans=((Ahorro)usuario.getCuentas().get(cambioPos)).getCup()-restaSaldo;
						((Ahorro)usuario.getCuentas().get(cambioPos)).setCup(saldoTrans);
						}
						else {
							saldoTrans=((Ahorro)usuario.getCuentas().get(cambioPos)).getMlc()-restaSaldo;
							((Ahorro)usuario.getCuentas().get(cambioPos)).setMlc(saldoTrans);
						}
						}
					if(usuario.getCuentas().get(enviar) instanceof Corriente){
						((Corriente)usuario.getCuentas().get(enviar)).setCup(SaldoEnvio);
						}
						else if(usuario.getCuentas().get(enviar) instanceof Fondo){
							((Fondo)usuario.getCuentas().get(enviar)).setCup(SaldoEnvio);
							}
						else if(usuario.getCuentas().get(enviar) instanceof MLC){
							((MLC)usuario.getCuentas().get(enviar)).setMlc(SaldoEnvio);
							}
						else if(usuario.getCuentas().get(enviar) instanceof PlazoFijo){
							((PlazoFijo)usuario.getCuentas().get(enviar)).setCup(SaldoEnvio);
							}
						else if(usuario.getCuentas().get(enviar) instanceof Ahorro){
							if(miTabla.getValueAt(cambioPos, 2).toString().equalsIgnoreCase("cup"))
							((Ahorro)usuario.getCuentas().get(enviar)).setCup(SaldoEnvio);
							else
							((Ahorro)usuario.getCuentas().get(enviar)).setMlc(SaldoEnvio);
							}
					miTabla.setValueAt(saldoTrans, cambioPos, 1);
					miTabla.setValueAt(SaldoEnvio, enviar, 1);
					textField_1.setText("");
					ListaTranfer.clearSelection();
					ListaEnvioG.clearSelection();
					ultiOpeTabla.addRow(new Object[]{"Extraccion de cuenta a cuenta",listaTranferencia.get(cambioPos),restaSaldo,hora_1.getText(),fecha_1.getText()});
					ultiOpeTabla.addRow(new Object[]{"Ingreso de cuenta a cuenta",listaTranferencia.get(enviar),restaSaldo,hora_1.getText(),fecha_1.getText()});
				}
			}
		});
		botonAnimacion_7.setText("Aceptar");
		botonAnimacion_7.setForeground(Color.BLACK);
		botonAnimacion_7.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		botonAnimacion_7.setColorEfecto(Color.GREEN);
		botonAnimacion_7.setBackground(new Color(0, 128, 0));
		botonAnimacion_7.setBounds(230, 338, 290, 67);
		panelTransferir.add(botonAnimacion_7);
		
		label_2 = new JLabel(".");
		label_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_2.setBounds(567, 248, 140, 16);
		panelTransferir.add(label_2);
		
		JLabel lblNewLabel_6 = new JLabel("Elija Cuenta de Envio:");
		lblNewLabel_6.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(40, 129, 230, 16);
		panelTransferir.add(lblNewLabel_6);
		
		JLabel lblSaldoActual = new JLabel("Saldo :");
		lblSaldoActual.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		lblSaldoActual.setBounds(62, 237, 78, 37);
		panelTransferir.add(lblSaldoActual);
		
		JLabel lblMontoATranferir = new JLabel("Monto a tranferir:");
		lblMontoATranferir.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		lblMontoATranferir.setBounds(298, 250, 150, 37);
		panelTransferir.add(lblMontoATranferir);
		
		JLabel label_5 = new JLabel("Elija Cuenta a transferir:");
		label_5.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		label_5.setBounds(477, 131, 230, 16);
		panelTransferir.add(label_5);
		
		JLabel label_7 = new JLabel("Saldo :");
		label_7.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		label_7.setBounds(510, 237, 78, 37);
		panelTransferir.add(label_7);
		
		JPanel panelMovil = new JPanel();
		panel_1.add(panelMovil, "Movil");
		panelMovil.setLayout(null);
		ListaMovilRecargaG.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		ListaMovilRecargaG.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent x) {//en los eventos se llama valueChanged
				if (!x.getValueIsAdjusting()) {
					if(ListaMovilRecargaG.getSelectedIndex()>-1){
						for(int lil=0;lil<miTabla.getRowCount();lil++){
							String cuenta= miTabla.getValueAt(lil, 0).toString();
							String numeroCuenta= miTabla.getValueAt(lil, 10).toString();
							String saldo="";
							if(ListaMovilRecargaG.getSelectedValue().equalsIgnoreCase(cuenta + "-" + numeroCuenta) && ListaMovilRecargaG.getSelectedValue()!=null){
								if(cuenta.equalsIgnoreCase("Corriente"))
									saldo=String.valueOf(((Corriente)usuario.getCuentas().get(lil)).getCup());
								else if(cuenta.equalsIgnoreCase("MLC"))
									saldo=String.valueOf(((MLC)usuario.getCuentas().get(lil)).getMlc());
								else if(cuenta.equalsIgnoreCase("Ahorro"))
									if(miTabla.getValueAt(cambioPos, 2).toString().equalsIgnoreCase("mlc"))
									saldo=String.valueOf(((Ahorro)usuario.getCuentas().get(lil)).getMlc());
									else
										saldo=String.valueOf(((Ahorro)usuario.getCuentas().get(lil)).getCup());
								else if(cuenta.equalsIgnoreCase("PlazoFijo"))
									saldo=String.valueOf(((PlazoFijo)usuario.getCuentas().get(lil)).getCup());
								else if(cuenta.equalsIgnoreCase("Fondo"))
									saldo=String.valueOf(((Fondo)usuario.getCuentas().get(lil)).getCup());	
								lblNewLabel_9 .setText(saldo);
								cambioPos=lil;

							}

						}
					}
				}
			}
		});
		
		JScrollPane scrollPane_3 = new JScrollPane(ListaMovilRecargaG);
		scrollPane_3.setBounds(77, 112, 265, 116);
		panelMovil.add(scrollPane_3);

		JLabel lblRecargarSaldoMovil = new JLabel("Recargar Saldo Movil");
		lblRecargarSaldoMovil.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblRecargarSaldoMovil.setBackground(Color.BLACK);
		lblRecargarSaldoMovil.setBounds(243, 13, 208, 27);
		panelMovil.add(lblRecargarSaldoMovil);

		lblNewLabel_9 = new JLabel(".");
		lblNewLabel_9.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		lblNewLabel_9.setBounds(200, 241, 56, 16);
		panelMovil.add(lblNewLabel_9);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(130, 289, 140, 38);
		panelMovil.add(textField);

		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent m) {
				if(textField_2.getText().length()>8){
					m.consume();
				}
			}
		});
		textField_2.setColumns(10);
		textField_2.setBounds(495, 289, 140, 38);
		panelMovil.add(textField_2);

		BotonAnimacion btnmcnRecargar = new BotonAnimacion();
		btnmcnRecargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ListaMovilRecargaG.getSelectedIndex()>-1){
					float restaSaldo=Float.parseFloat(textField.getText());
					float saldoTrans=0;
					if(usuario.getCuentas().get(cambioPos) instanceof Corriente){
						saldoTrans=((Corriente)usuario.getCuentas().get(cambioPos)).getCup()-restaSaldo;
						((Corriente)usuario.getCuentas().get(cambioPos)).setCup(saldoTrans);
					}else if(usuario.getCuentas().get(cambioPos) instanceof Fondo){
						saldoTrans=((Fondo)usuario.getCuentas().get(cambioPos)).getCup()-restaSaldo;
						((Fondo)usuario.getCuentas().get(cambioPos)).setCup(saldoTrans);
					}else if(usuario.getCuentas().get(cambioPos) instanceof MLC){
						saldoTrans=((MLC)usuario.getCuentas().get(cambioPos)).getMlc()-restaSaldo;
						((MLC)usuario.getCuentas().get(cambioPos)).setMlc(saldoTrans);
					}else if(usuario.getCuentas().get(cambioPos) instanceof PlazoFijo){
						saldoTrans=((PlazoFijo)usuario.getCuentas().get(cambioPos)).getCup()-restaSaldo;
						((PlazoFijo)usuario.getCuentas().get(cambioPos)).setCup(saldoTrans);
					}else if(usuario.getCuentas().get(cambioPos) instanceof Ahorro){
						if(miTabla.getValueAt(cambioPos, 2).toString().equalsIgnoreCase("cup")){
						saldoTrans=((Ahorro)usuario.getCuentas().get(cambioPos)).getCup()-restaSaldo;
						((Ahorro)usuario.getCuentas().get(cambioPos)).setCup(saldoTrans);
						}
						else{
							saldoTrans=((Ahorro)usuario.getCuentas().get(cambioPos)).getMlc()-restaSaldo;
							((Ahorro)usuario.getCuentas().get(cambioPos)).setMlc(saldoTrans);
						}
						
					}
					miTabla.setValueAt(saldoTrans, cambioPos, 1);
					textField.setText("");
					textField_2.setText("");
					ultiOpeTabla.addRow(new Object[]{"Recarga Movil",listaMovil.get(cambioPos),restaSaldo,hora_1.getText(),fecha_1.getText()});
					ListaMovilRecargaG.clearSelection();
				}
				
			}
		});
		btnmcnRecargar.setText("Recargar");
		btnmcnRecargar.setForeground(Color.BLACK);
		btnmcnRecargar.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnmcnRecargar.setColorEfecto(Color.GREEN);
		btnmcnRecargar.setBackground(new Color(0, 128, 0));
		btnmcnRecargar.setBounds(218, 340, 290, 67);
		panelMovil.add(btnmcnRecargar);

		JLabel lblSaldo = new JLabel("Saldo:");
		lblSaldo.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		lblSaldo.setBounds(144, 241, 56, 16);
		panelMovil.add(lblSaldo);

		JLabel label_8 = new JLabel("Elija Cuenta de Envio:");
		label_8.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		label_8.setBounds(77, 94, 230, 16);
		panelMovil.add(label_8);

		JLabel label_9 = new JLabel("Monto a tranferir:");
		label_9.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		label_9.setBounds(128, 255, 150, 37);
		panelMovil.add(label_9);

		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		lblTelefono.setBounds(516, 248, 89, 16);
		panelMovil.add(lblTelefono);

		JLabel lblARecargar = new JLabel("a recargar:");
		lblARecargar.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		lblARecargar.setBounds(511, 260, 140, 27);
		panelMovil.add(lblARecargar);

		JPanel panelAgencias = new JPanel();
		panel_1.add(panelAgencias, "Agencia");
		panelAgencias.setLayout(null);

		panelAgenciaC = new JLayeredPane();
		panelAgenciaC.setBounds(0, 50, 866, 386);
		panelAgencias.add(panelAgenciaC);
		panelAgenciaC.setLayout(new CardLayout(0, 0));

		final JPanel panelA1 = new JPanel();
		panelAgenciaC.add(panelA1, "Agencia1");
		panelA1.setLayout(null);
		
		BotonAnimacion botonAnimacion_17 = new BotonAnimacion();
		botonAnimacion_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cajero=1;
				Cajero a=new Cajero(miTabla,agencia,usuario,ultiOpeTabla,cajero);
				a.setVisible(true);
				
			}
		});
		botonAnimacion_17.setIcon(new ImageIcon(Menu.class.getResource("/iconos/cajero-automatico (3).png")));
		botonAnimacion_17.setBackground(null);
		botonAnimacion_17.setBounds(26, 67, 149, 139);
		panelA1.add(botonAnimacion_17);
		
		BotonAnimacion botonAnimacion_18 = new BotonAnimacion();
		botonAnimacion_18.setIcon(new ImageIcon(Menu.class.getResource("/iconos/cajero-automatico (3).png")));
		botonAnimacion_18.setBackground((Color) null);
		botonAnimacion_18.setBounds(343, 67, 149, 139);
		panelA1.add(botonAnimacion_18);
		
		BotonAnimacion botonAnimacion_19 = new BotonAnimacion();
		botonAnimacion_19.setIcon(new ImageIcon(Menu.class.getResource("/iconos/cajero-automatico (3).png")));
		botonAnimacion_19.setBackground((Color) null);
		botonAnimacion_19.setBounds(673, 67, 149, 139);
		panelA1.add(botonAnimacion_19);
		
		BotonAnimacion botonAnimacion_20 = new BotonAnimacion();
		botonAnimacion_20.setIcon(new ImageIcon(Menu.class.getResource("/iconos/cajero-automatico (3).png")));
		botonAnimacion_20.setBackground((Color) null);
		botonAnimacion_20.setBounds(182, 186, 149, 139);
		panelA1.add(botonAnimacion_20);
		
		BotonAnimacion botonAnimacion_21 = new BotonAnimacion();
		botonAnimacion_21.setIcon(new ImageIcon(Menu.class.getResource("/iconos/cajero-automatico (3).png")));
		botonAnimacion_21.setBackground((Color) null);
		botonAnimacion_21.setBounds(512, 186, 149, 139);
		panelA1.add(botonAnimacion_21);
		
		
		lblNewLabel_1 = new JLabel("Gerente:");
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(12, 13, 273, 29);
		panelA1.add(lblNewLabel_1);
		
		lblDireccion = new JLabel("Direccion:");
		lblDireccion.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		lblDireccion.setBounds(12, 357, 697, 29);
		panelA1.add(lblDireccion);
		

		final JPanel panelA2 = new JPanel();
		panelAgenciaC.add(panelA2, "Agencia2");
		panelA2.setLayout(null);
		
		BotonAnimacion botonAnimacion_22 = new BotonAnimacion();
		botonAnimacion_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Cajero a=new Cajero(miTabla,agencia,usuario,ultiOpeTabla,cajero);
				a.setVisible(true);
			}
		});
		botonAnimacion_22.setIcon(new ImageIcon(Menu.class.getResource("/iconos/cajero-automatico (3).png")));
		botonAnimacion_22.setBackground((Color) null);
		botonAnimacion_22.setBounds(26, 67, 149, 139);
		panelA2.add(botonAnimacion_22);
		
		BotonAnimacion botonAnimacion_23 = new BotonAnimacion();
		botonAnimacion_23.setIcon(new ImageIcon(Menu.class.getResource("/iconos/cajero-automatico (3).png")));
		botonAnimacion_23.setBackground((Color) null);
		botonAnimacion_23.setBounds(343, 67, 149, 139);
		panelA2.add(botonAnimacion_23);
		
		BotonAnimacion botonAnimacion_24 = new BotonAnimacion();
		botonAnimacion_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		botonAnimacion_24.setIcon(new ImageIcon(Menu.class.getResource("/iconos/cajero-automatico (3).png")));
		botonAnimacion_24.setBackground((Color) null);
		botonAnimacion_24.setBounds(673, 67, 149, 139);
		panelA2.add(botonAnimacion_24);
		

		final JPanel panelA3 = new JPanel();
		panelAgenciaC.add(panelA3, "Agencia3");
		panelA3.setLayout(null);

		final JPanel panelA4 = new JPanel();
		panelAgenciaC.add(panelA4, "Agencia4");
		panelA4.setLayout(null);

		final JPanel panelA5 = new JPanel();
		panelAgenciaC.add(panelA5, "Agencia5");
		panelA5.setLayout(null);

		JLabel lblAgenciasYCajeros = new JLabel("Agencias y Cajeros");
		lblAgenciasYCajeros.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblAgenciasYCajeros.setBackground(Color.BLACK);
		lblAgenciasYCajeros.setBounds(236, 10, 288, 27);
		panelAgencias.add(lblAgenciasYCajeros);

		comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {//para cambiar los panales de las agencias
				if(comboBox.getSelectedItem().equals("Banco Central de Cuba")){
					CardLayout card =(CardLayout) panelAgenciaC.getLayout();
					card.show(panelAgenciaC, "Agencia1");
					agencia=banco.getAgencias().get(0);
					panelA1.add(lblNewLabel_1);
					panelA1.add(lblDireccion);
				}
				else
				if(comboBox.getSelectedItem().equals("Banco Nacional de Cuba")){
					CardLayout card =(CardLayout) panelAgenciaC.getLayout();
					card.show(panelAgenciaC, "Agencia2");
					agencia=banco.getAgencias().get(1);
					panelA2.add(lblNewLabel_1);
					panelA2.add(lblDireccion);
				}
				else
				if(comboBox.getSelectedItem().equals("Banco Popular de Ahorro (BPA)")){
					CardLayout card =(CardLayout) panelAgenciaC.getLayout();
					card.show(panelAgenciaC, "Agencia3");
					agencia=banco.getAgencias().get(2);
					panelA3.add(lblNewLabel_1);
					panelA3.add(lblDireccion);
				}
				else
				if(comboBox.getSelectedItem().equals("Banco Inversiones S.A. (Bancoi)")){
					CardLayout card =(CardLayout) panelAgenciaC.getLayout();
					card.show(panelAgenciaC, "Agencia4");
					agencia=banco.getAgencias().get(3);
					panelA4.add(lblNewLabel_1);
					panelA4.add(lblDireccion);
				}
				else
				if(comboBox.getSelectedItem().equals("Banco Metropolitano S.A")){
					CardLayout card =(CardLayout) panelAgenciaC.getLayout();
					card.show(panelAgenciaC, "Agencia5");
					agencia=banco.getAgencias().get(4);
					panelA5.add(lblNewLabel_1);
					panelA5.add(lblDireccion);
				}
				
				lblNewLabel_1.setText("Gerente:" + agencia.getGerente());
				lblDireccion.setText("Direccion:" + agencia.getDireccion());
				}
			
		});
		comboBox.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		comboBox.setBounds(547, 6, 280, 40);
		panelAgencias.add(comboBox);
		comboBox.addItem("Banco Central de Cuba");
		comboBox.addItem("Banco Nacional de Cuba");
		comboBox.addItem("Banco Popular de Ahorro (BPA)");
		comboBox.addItem("Banco Inversiones S.A. (Bancoi)");
		comboBox.addItem("Banco Metropolitano S.A");
		
		

		JPanel panelRecargar = new JPanel();
		panel_1.add(panelRecargar, "Recargar");
		panelRecargar.setLayout(null);
		ListaRecargaCuentaG.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent z) {
				if (!z.getValueIsAdjusting()) {
					if(ListaRecargaCuentaG.getSelectedIndex()>-1){
						for(int lil=0;lil<miTabla.getRowCount();lil++){
							String cuenta= miTabla.getValueAt(lil, 0).toString();
							String numeroCuenta= miTabla.getValueAt(lil, 10).toString();
							String saldo="";
							if(ListaRecargaCuentaG.getSelectedValue().equalsIgnoreCase(cuenta + "-" + numeroCuenta) && ListaRecargaCuentaG.getSelectedValue()!=null){
								if(cuenta.equalsIgnoreCase("Corriente"))
									saldo=String.valueOf(((Corriente)usuario.getCuentas().get(lil)).getCup());
								else if(cuenta.equalsIgnoreCase("MLC"))
									saldo=String.valueOf(((MLC)usuario.getCuentas().get(lil)).getMlc());
								else if(cuenta.equalsIgnoreCase("Ahorro"))
									if(miTabla.getValueAt(lil, 2).toString().equalsIgnoreCase("mlc"))
									saldo=String.valueOf(((Ahorro)usuario.getCuentas().get(lil)).getMlc());
									else
										saldo=String.valueOf(((Ahorro)usuario.getCuentas().get(lil)).getCup());
								else if(cuenta.equalsIgnoreCase("PlazoFijo"))
									saldo=String.valueOf(((PlazoFijo)usuario.getCuentas().get(lil)).getCup());
								else if(cuenta.equalsIgnoreCase("Fondo"))
									saldo=String.valueOf(((Fondo)usuario.getCuentas().get(lil)).getCup());	
								label_11.setText(saldo);
								cambioPos=lil;

							}

						}
					}
				}
			}
		});
		ListaRecargaCuentaG.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));

		JScrollPane scrollPane_4 = new JScrollPane(ListaRecargaCuentaG);
		scrollPane_4.setBounds(233, 136, 265, 116);
		panelRecargar.add(scrollPane_4);

		JLabel lblRecargarCuenta = new JLabel("Recargar Cuenta");
		lblRecargarCuenta.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblRecargarCuenta.setBackground(Color.BLACK);
		lblRecargarCuenta.setBounds(253, 0, 288, 27);
		panelRecargar.add(lblRecargarCuenta);

		JLabel lblElijaCuentaPara = new JLabel("Elija Cuenta para Recargar:");
		lblElijaCuentaPara.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		lblElijaCuentaPara.setBounds(233, 109, 265, 27);
		panelRecargar.add(lblElijaCuentaPara);

		JLabel label_10 = new JLabel("Saldo :");
		label_10.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		label_10.setBounds(286, 247, 78, 37);
		panelRecargar.add(label_10);

		label_11 = new JLabel(".");
		label_11.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_11.setBounds(341, 247, 85, 38);
		panelRecargar.add(label_11);

		JLabel label_12 = new JLabel("Monto a tranferir:");
		label_12.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		label_12.setBounds(307, 274, 150, 37);
		panelRecargar.add(label_12);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(307, 311, 140, 38);
		panelRecargar.add(textField_3);

		BotonAnimacion botonAnimacion_12 = new BotonAnimacion();
		botonAnimacion_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float SaldoAntiguo=((Corriente)usuario.getCuentas().get(cambioPos)).getCup();
				float recarga=Float.parseFloat(textField_3.getText());
				if(usuario.getCuentas().get(cambioPos) instanceof Corriente)
					((Corriente)usuario.getCuentas().get(cambioPos)).setCup(SaldoAntiguo+recarga);
				else if(usuario.getCuentas().get(cambioPos) instanceof Fondo)
					((Fondo)usuario.getCuentas().get(cambioPos)).setCup(SaldoAntiguo+recarga);
				else if(usuario.getCuentas().get(cambioPos) instanceof MLC)
					((MLC)usuario.getCuentas().get(cambioPos)).setMlc(SaldoAntiguo+recarga);
				else if(usuario.getCuentas().get(cambioPos) instanceof PlazoFijo)
					((PlazoFijo)usuario.getCuentas().get(cambioPos)).setCup(SaldoAntiguo+recarga);
				else if(usuario.getCuentas().get(cambioPos) instanceof Ahorro)
					if(miTabla.getValueAt(cambioPos, 2).toString().equalsIgnoreCase("cup"))
						((Ahorro)usuario.getCuentas().get(cambioPos)).setCup(SaldoAntiguo+recarga);
					else
						((Ahorro)usuario.getCuentas().get(cambioPos)).setMlc(SaldoAntiguo+recarga);
				miTabla.setValueAt(SaldoAntiguo+recarga, cambioPos, 1);
				ultiOpeTabla.addRow(new Object[]{"Ingreso a cuenta",listaTranferencia.get(cambioPos),recarga,hora_1.getText(),fecha_1.getText()});
				textField_3.setText("");
				ListaRecargaCuentaG.clearSelection();
			}
		});
		botonAnimacion_12.setText("Aceptar");
		botonAnimacion_12.setForeground(Color.BLACK);
		botonAnimacion_12.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		botonAnimacion_12.setColorEfecto(Color.GREEN);
		botonAnimacion_12.setBackground(new Color(0, 128, 0));
		botonAnimacion_12.setBounds(233, 362, 290, 67);
		panelRecargar.add(botonAnimacion_12);

		JPanel panelIntereses = new JPanel();
		panel_1.add(panelIntereses, "Intereses");
		panelIntereses.setLayout(null);

		botonAnimacion_11 = new BotonAnimacion();
		botonAnimacion_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(contadorIntereses<12){
					NotificacionesModernas.getInstancia().show(Tipo.ERROR, 5000, "No tiene todavia intereses de este tipo");
				}
			}
		});
		botonAnimacion_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				{
				CardLayout card =(CardLayout) panel_1.getLayout();
				card.show(panel_1, "InteresCF");
				}
					

			}
		});
		
		
		if(contadorIntereses>=12)
			botonAnimacion_11.setEnabled(true);
			
		botonAnimacion_11.setText("    ");
		botonAnimacion_11.setIcon(new ImageIcon(Menu.class.getResource("/iconos/donacion.png")));
		botonAnimacion_11.setBackground(new Color(50, 205, 50));
		botonAnimacion_11.setBounds(109, 178, 231, 78);
		botonAnimacion_11.setEnabled(false);
		panelIntereses.add(botonAnimacion_11);

		BotonAnimacion botonAnimacion_13 = new BotonAnimacion();
		botonAnimacion_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout card =(CardLayout) panel_1.getLayout();
				card.show(panel_1, "InteresPF");
			}
		});
		botonAnimacion_13.setIcon(new ImageIcon(Menu.class.getResource("/iconos/application_project_scheme_planning_fundraising_icon_251233.png")));
		botonAnimacion_13.setBackground(new Color(50, 205, 50));
		botonAnimacion_13.setBounds(473, 178, 231, 78);
		panelIntereses.add(botonAnimacion_13);

		JLabel lblIntereses = new JLabel("Intereses");
		lblIntereses.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblIntereses.setBounds(176, 148, 108, 27);
		panelIntereses.add(lblIntereses);

		JLabel lblCorrienteODe = new JLabel("Corriente o de Fondo");
		lblCorrienteODe.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorrienteODe.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblCorrienteODe.setBounds(109, 269, 231, 27);
		panelIntereses.add(lblCorrienteODe);

		JLabel label_13 = new JLabel("Intereses");
		label_13.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		label_13.setBounds(542, 148, 108, 27);
		panelIntereses.add(label_13);

		JLabel lblPlazoFijo = new JLabel("Plazo fijo");
		lblPlazoFijo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlazoFijo.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblPlazoFijo.setBounds(473, 269, 231, 27);
		panelIntereses.add(lblPlazoFijo);

		JPanel panelNegociosFondo = new JPanel();
		panel_1.add(panelNegociosFondo, "Negocios");
		panelNegociosFondo.setLayout(null);

		JLabel lblNewLabel_7 = new JLabel("Salario Estatal :");
		lblNewLabel_7.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(40, 131, 196, 77);
		panelNegociosFondo.add(lblNewLabel_7);

		lblNewLabel_10 = new JLabel(".");
		lblNewLabel_10.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		lblNewLabel_10.setBounds(188, 131, 110, 77);
		panelNegociosFondo.add(lblNewLabel_10);

		JLabel lblEstoEsEl = new JLabel("Este es el comercio de la agencia bancaria.Aqu\u00ED puede cambiar");
		lblEstoEsEl.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblEstoEsEl.setBounds(30, 0, 740, 61);
		panelNegociosFondo.add(lblEstoEsEl);

		JLabel lblUnAumentodeterminandoSu = new JLabel("el porcentaje de ingreso que tiene de su salario que le propor-");
		lblUnAumentodeterminandoSu.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblUnAumentodeterminandoSu.setBounds(30, 23, 754, 61);
		panelNegociosFondo.add(lblUnAumentodeterminandoSu);

		JLabel lblIngreseLaCantidad = new JLabel("ciona la empresa estatal que le deposita a su preferencia.");
		lblIngreseLaCantidad.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblIngreseLaCantidad.setBounds(30, 45, 766, 61);
		panelNegociosFondo.add(lblIngreseLaCantidad);

		JLabel lbltengaEnCuenta = new JLabel("(No tiene que poner el signo (%) solo el porcentaje que desee).");
		lbltengaEnCuenta.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lbltengaEnCuenta.setBounds(30, 70, 740, 61);
		panelNegociosFondo.add(lbltengaEnCuenta);

		textField_4 = new JTextField();
		textField_4.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(textField_4.getText().length()>5){
					e.consume();
				}
			}
		});
		textField_4.setBounds(217, 256, 209, 44);
		panelNegociosFondo.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblAumentoDeseado = new JLabel("Cambio del % deseado:");
		lblAumentoDeseado.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		lblAumentoDeseado.setBounds(217, 205, 209, 77);
		panelNegociosFondo.add(lblAumentoDeseado);
		
		botonAnimacion_14 = new BotonAnimacion();
		botonAnimacion_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float aumentar=Float.parseFloat(textField_4.getText());
				SalarioFondo();
				ImageIcon icono=new ImageIcon("/iconos/aprobacion-de-documento.png");
				if(aumentar<=100){
					porcentajeFondo=aumentar;
					JOptionPane.showMessageDialog(null, "¡Felicidades! Se ha aprobado el cambio de porcentaje depositado, ahora cobrará: " + ((Fondo)usuario.getCuentas().get(fondoA)).SalarioDepositado(salarioEstatal, porcentajeFondo), "Cambio % de deposito", JOptionPane.INFORMATION_MESSAGE, icono);
				}
				else{
					JOptionPane.showMessageDialog(null, "Lo siento,no puede tener ese porcentaje(%)");
				}
				textField_4.setText("");
			}
		});
		botonAnimacion_14.setText("Aceptar");
		botonAnimacion_14.setForeground(Color.BLACK);
		botonAnimacion_14.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		botonAnimacion_14.setColorEfecto(Color.GREEN);
		botonAnimacion_14.setBackground(new Color(0, 128, 0));
		botonAnimacion_14.setBounds(174, 313, 290, 67);
		panelNegociosFondo.add(botonAnimacion_14);
		
		JLabel lblDeSalario = new JLabel("El % depositado:");
		lblDeSalario.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		lblDeSalario.setBounds(332, 131, 155, 77);
		panelNegociosFondo.add(lblDeSalario);
		
		label_14 = new JLabel(".");
		label_14.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		label_14.setBounds(485, 131, 110, 77);
		panelNegociosFondo.add(label_14);
		
		JPanel panelInteresCF = new JPanel();
		panel_1.add(panelInteresCF, "InteresCF");
		panelInteresCF.setLayout(null);
		
		

		
		BotonAnimacion btnmcnIngresarALa = new BotonAnimacion();
		btnmcnIngresarALa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float interes=Float.parseFloat(miTabla.getValueAt(cambioPos, 3).toString());
				float saldo=Float.parseFloat(miTabla.getValueAt(cambioPos, 1).toString());
				miTabla.setValueAt(saldo+interes, cambioPos, 1);
				miTabla.setValueAt("0", cambioPos,3);
				if(usuario.getCuentas().get(cambioPos) instanceof Fondo)
					((Fondo)usuario.getCuentas().get(cambioPos)).setCup(saldo+interes);
				else if(usuario.getCuentas().get(cambioPos) instanceof Corriente)
					((Corriente)usuario.getCuentas().get(cambioPos)).setCup(saldo+interes);
				
				ListaInteresCFG.setSelectedIndex(-1);
				ListaInteresCFG.clearSelection();
				
				lblNewLabel_12.setText(String.valueOf(saldo+interes));
				label_15.setText("0");
				ultiOpeTabla.addRow(new Object[]{"Ingresar a cuenta por intereses",listaTranferencia.get(cambioPos),interes,hora_1.getText(),fecha_1.getText()});
			}
		});
		btnmcnIngresarALa.setText("Ingresar a la cuenta");
		btnmcnIngresarALa.setForeground(Color.BLACK);
		btnmcnIngresarALa.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnmcnIngresarALa.setColorEfecto(Color.GREEN);
		btnmcnIngresarALa.setBackground(new Color(0, 128, 0));
		btnmcnIngresarALa.setBounds(84, 315, 290, 67);
		panelInteresCF.add(btnmcnIngresarALa);
		ListaInteresCFG.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent z) {
				if (!z.getValueIsAdjusting()) {
					if(ListaInteresCFG.getSelectedIndex()>-1){
						for(int lil=0;lil<miTabla.getRowCount();lil++){
							String cuenta= miTabla.getValueAt(lil, 0).toString();
							String numeroCuenta= miTabla.getValueAt(lil, 10).toString();
							String saldo="";
							if(ListaInteresCFG.getSelectedValue().equalsIgnoreCase(cuenta + "-" + numeroCuenta) && ListaInteresCFG.getSelectedValue()!=null){
								if(cuenta.equalsIgnoreCase("Corriente"))
									saldo=String.valueOf(((Corriente)usuario.getCuentas().get(lil)).getCup());
								else if(cuenta.equalsIgnoreCase("Fondo"))
									saldo=String.valueOf(((Fondo)usuario.getCuentas().get(lil)).getCup());	
								lblNewLabel_12.setText(saldo);
								label_15.setText(miTabla.getValueAt(lil, 3).toString());
								cambioPos=lil;
							}
						}
						
					}

				}
			}
		});
		ListaInteresCFG.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		
		JScrollPane scrollPane_5 = new JScrollPane(ListaInteresCFG);
		scrollPane_5.setBounds(279, 84, 265, 116);
		panelInteresCF.add(scrollPane_5);
		
		JLabel lblNewLabel_11 = new JLabel("Saldo:");
		lblNewLabel_11.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		lblNewLabel_11.setBounds(150, 248, 56, 16);
		panelInteresCF.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel(".");
		lblNewLabel_12.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		lblNewLabel_12.setBounds(202, 248, 81, 16);
		panelInteresCF.add(lblNewLabel_12);
		
		JLabel lblInteres = new JLabel("Interes:");
		lblInteres.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		lblInteres.setBounds(516, 248, 71, 16);
		panelInteresCF.add(lblInteres);
		
		label_15 = new JLabel(".");
		label_15.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		label_15.setBounds(583, 248, 131, 16);
		panelInteresCF.add(label_15);
		
		BotonAnimacion btnmcnExtraer = new BotonAnimacion();
		btnmcnExtraer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				miTabla.setValueAt("0", cambioPos, 3);
				ListaInteresCFG.setSelectedIndex(-1);
				ListaInteresCFG.clearSelection();
				ultiOpeTabla.addRow(new Object[]{"Extraccion de interes",listaTranferencia.get(cambioPos),label_15.getText(),hora_1.getText(),fecha_1.getText()});
				label_15.setText("0");
				
				
			}
		});
		btnmcnExtraer.setText("Extraer los intereses");
		btnmcnExtraer.setForeground(Color.BLACK);
		btnmcnExtraer.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnmcnExtraer.setColorEfecto(Color.GREEN);
		btnmcnExtraer.setBackground(new Color(0, 128, 0));
		btnmcnExtraer.setBounds(448, 315, 290, 67);
		panelInteresCF.add(btnmcnExtraer);
		
		JLabel lblElijaCuentaPara_1 = new JLabel("Elija Cuenta para los Intereses:");
		lblElijaCuentaPara_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		lblElijaCuentaPara_1.setBounds(265, 56, 280, 27);
		panelInteresCF.add(lblElijaCuentaPara_1);
		
		JLabel lblOperacionesDeInteresescuenta = new JLabel("Operaciones de Intereses,cuenta Corriente y Fondo");
		lblOperacionesDeInteresescuenta.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblOperacionesDeInteresescuenta.setBackground(Color.BLACK);
		lblOperacionesDeInteresescuenta.setBounds(150, 0, 481, 45);
		panelInteresCF.add(lblOperacionesDeInteresescuenta);
		
		JPanel panelInteresesPF = new JPanel();
		panelInteresesPF.setLayout(null);
		panel_1.add(panelInteresesPF, "InteresPF");
		
		BotonAnimacion botonAnimacion_15 = new BotonAnimacion();
		botonAnimacion_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float interes=Float.parseFloat(miTabla.getValueAt(cambioPos, 3).toString());
				float saldo=Float.parseFloat(miTabla.getValueAt(cambioPos, 1).toString());
				miTabla.setValueAt(saldo+interes, cambioPos, 1);
				miTabla.setValueAt("0", cambioPos,3);
				if(usuario.getCuentas().get(cambioPos) instanceof PlazoFijo)
					((PlazoFijo)usuario.getCuentas().get(cambioPos)).setCup(saldo+interes);
				
				ListaInteresPFG.setSelectedIndex(-1);
				ListaInteresPFG.clearSelection();
				ultiOpeTabla.addRow(new Object[]{"Ingresar a cuenta por intereses",listaTranferencia.get(cambioPos),interes,hora_1.getText(),fecha_1.getText()});
				label_17.setText(String.valueOf(saldo+interes));
				label_19.setText("0");
			}
		});
		botonAnimacion_15.setText("Ingresar a la cuenta");
		botonAnimacion_15.setForeground(Color.BLACK);
		botonAnimacion_15.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		botonAnimacion_15.setColorEfecto(Color.GREEN);
		botonAnimacion_15.setBackground(new Color(0, 128, 0));
		botonAnimacion_15.setBounds(12, 315, 239, 67);
		panelInteresesPF.add(botonAnimacion_15);
		ListaInteresPFG.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		ListaInteresPFG.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent f) {
				if(!f.getValueIsAdjusting()){
					if(ListaInteresPFG.getSelectedIndex()>-1){
						String cuenta="";
						String numCuenta="";
						String saldo="";
						String intereses="";
						for(int lil=0;lil<miTabla.getRowCount();lil++){
							cuenta=miTabla.getValueAt(lil, 0).toString();
							numCuenta=miTabla.getValueAt(lil, 10).toString();
							if(ListaInteresPFG.getSelectedValue().equalsIgnoreCase(cuenta + "-" + numCuenta) &&  ListaInteresPFG.getSelectedValue()!=null){
								saldo=miTabla.getValueAt(lil, 1).toString();
								intereses=miTabla.getValueAt(lil, 3).toString();
								
								label_17.setText(saldo);
								label_19.setText(intereses);
								cambioPos=lil;
								
							}
						}
						
					}
				}
			}
		});
		
		JScrollPane scrollPane_6 = new JScrollPane(ListaInteresPFG);
		scrollPane_6.setBounds(63, 85, 265, 116);
		panelInteresesPF.add(scrollPane_6);
		
		JLabel label_16 = new JLabel("Saldo:");
		label_16.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		label_16.setBounds(32, 248, 56, 16);
		panelInteresesPF.add(label_16);
		
		label_17 = new JLabel(".");
		label_17.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		label_17.setBounds(86, 248, 153, 16);
		panelInteresesPF.add(label_17);
		
		JLabel label_18 = new JLabel("Interes:");
		label_18.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		label_18.setBounds(263, 248, 71, 16);
		panelInteresesPF.add(label_18);
		
		label_19 = new JLabel(".");
		label_19.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		label_19.setBounds(339, 248, 161, 16);
		panelInteresesPF.add(label_19);
		
		BotonAnimacion botonAnimacion_16 = new BotonAnimacion();
		botonAnimacion_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				miTabla.setValueAt("0", cambioPos, 3);
				ListaInteresPFG.setSelectedIndex(-1);
				ListaInteresPFG.clearSelection();
				ultiOpeTabla.addRow(new Object[]{"Ingresar a cuenta por intereses",listaTranferencia.get(fondoA),label_19.getText(),hora_1.getText(),fecha_1.getText()});
				label_19.setText("0");
				
			}
		});
		botonAnimacion_16.setText("Extraer los intereses");
		botonAnimacion_16.setForeground(Color.BLACK);
		botonAnimacion_16.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		botonAnimacion_16.setColorEfecto(Color.GREEN);
		botonAnimacion_16.setBackground(new Color(0, 128, 0));
		botonAnimacion_16.setBounds(263, 315, 239, 67);
		panelInteresesPF.add(botonAnimacion_16);
		
		BotonAnimacion btnmcnIngresarEnCuenta = new BotonAnimacion();
		btnmcnIngresarEnCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float interes=Float.parseFloat(miTabla.getValueAt(cambioPos, 3).toString());
				float saldo=Float.parseFloat(miTabla.getValueAt(fondoA, 1).toString());
				miTabla.setValueAt(saldo+interes, fondoA, 1);
				miTabla.setValueAt("0", fondoA,3);
				if(usuario.getCuentas().get(cambioPos) instanceof Ahorro)
					((Ahorro)usuario.getCuentas().get(fondoA)).setCup(saldo+interes);
				
				ultiOpeTabla.addRow(new Object[]{"Ingresar a cuenta por intereses",listaTranferencia.get(fondoA),interes,hora_1.getText(),fecha_1.getText()});
				
				label_19.setText("0");
				label_21.setText(String.valueOf(saldo+interes));
				ListaInteresPFG.clearSelection();
				ListaIngresarInteresAhorroG.clearSelection();
				
			}
		});
		btnmcnIngresarEnCuenta.setText("Ingresar en cuenta de Ahorro");
		btnmcnIngresarEnCuenta.setForeground(Color.BLACK);
		btnmcnIngresarEnCuenta.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnmcnIngresarEnCuenta.setColorEfecto(Color.GREEN);
		btnmcnIngresarEnCuenta.setBackground(new Color(0, 128, 0));
		btnmcnIngresarEnCuenta.setBounds(516, 315, 315, 67);
		panelInteresesPF.add(btnmcnIngresarEnCuenta);
		ListaIngresarInteresAhorroG.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		ListaIngresarInteresAhorroG.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent f) {
				if(!f.getValueIsAdjusting()){
					if(ListaIngresarInteresAhorroG.getSelectedIndex()>-1){
						String cuenta="";
						String numCuenta="";
						String saldo="";
						for(int lil=0;lil<miTabla.getRowCount();lil++){
							cuenta=miTabla.getValueAt(lil, 0).toString();
							numCuenta=miTabla.getValueAt(lil, 10).toString();
							if(ListaIngresarInteresAhorroG.getSelectedValue().equalsIgnoreCase(cuenta + "-" + numCuenta) &&  ListaIngresarInteresAhorroG.getSelectedValue()!=null){
								saldo=miTabla.getValueAt(lil, 1).toString();
								label_21.setText(saldo);
								 posAhorro=lil;
							}
						}
					}
				}
			}
		});
		
		JScrollPane scrollPane_7 = new JScrollPane(ListaIngresarInteresAhorroG);
		scrollPane_7.setBounds(538, 85, 265, 116);
		panelInteresesPF.add(scrollPane_7);
		
		JLabel label_20 = new JLabel("Saldo:");
		label_20.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		label_20.setBounds(565, 214, 56, 16);
		panelInteresesPF.add(label_20);
		
		label_21 = new JLabel(".");
		label_21.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		label_21.setBounds(621, 214, 153, 16);
		panelInteresesPF.add(label_21);
		
		JLabel lblOperacionesDeIntereses = new JLabel("Operaciones de Intereses, de cuenta Plazo Fijo ");
		lblOperacionesDeIntereses.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblOperacionesDeIntereses.setBackground(Color.BLACK);
		lblOperacionesDeIntereses.setBounds(147, 0, 481, 45);
		panelInteresesPF.add(lblOperacionesDeIntereses);
		
		JLabel label_22 = new JLabel("Elija Cuenta para los Intereses:");
		label_22.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		label_22.setBounds(50, 58, 280, 27);
		panelInteresesPF.add(label_22);
		
		JLabel lblElijaCuentaDe = new JLabel("Elija Cuenta de Ahorro a operar:");
		lblElijaCuentaDe.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		lblElijaCuentaDe.setBounds(523, 58, 292, 27);
		panelInteresesPF.add(lblElijaCuentaDe);
		

		ActionListener Intereses = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i=0;
				double interesActual=0;
				double interesAgg=0;
				String fechaIniPlazoFijo="";
				String fechaFinPlazoFijo="";
				for (CuentaBancaria c : usuario.getCuentas()) {

					if(c instanceof Iintereses){ 
						interesAgg=((Iintereses)c).CalcularInteres();
						interesActual=Double.parseDouble(miTabla.getValueAt(i, 3).toString());//el toString es para convertirlo en String ua que esta en la tabla
						miTabla.setValueAt(interesActual + interesAgg, i, 3);
						contadorIntereses++;
						if(contadorIntereses>=12)
						botonAnimacion_11.setEnabled(true);
					}
					if(c instanceof PlazoFijo){
						interesActual=Double.parseDouble(miTabla.getValueAt(i, 3).toString());
						fechaIniPlazoFijo=miTabla.getValueAt(i, 4).toString();
						fechaFinPlazoFijo=miTabla.getValueAt(i, 8).toString();
						interesAgg=((PlazoFijo)c).CalcularInteres(fechaFinPlazoFijo,fechaIniPlazoFijo);
						miTabla.setValueAt(interesActual + interesAgg, i, 3);
					}

					i++;
				}

			}
		};
		// Programar la tarea para que se ejecute cada segundos que pongas en el primer parametro	
		Timer timers = new Timer(1 * 1000, Intereses);
		timers.setInitialDelay(1 * 1000); // Para que la tarea se ejecute inmediatamente al inicio
		timers.start();

		ActionListener PagarEstatal= new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
				float depositarSalario=0;
				for(int i=0;i<usuario.getCuentas().size();i++){
					if(usuario.getCuentas().get(i)instanceof Fondo){
						depositarSalario=((Fondo)usuario.getCuentas().get(i)).SalarioDepositado(salarioEstatal, porcentajeFondo);
						((Fondo)usuario.getCuentas().get(i)).setCup(depositarSalario + ((Fondo)usuario.getCuentas().get(i)).getCup());
						miTabla.setValueAt(depositarSalario+((Fondo)usuario.getCuentas().get(i)).getCup(), i, 1);
						ultiOpeTabla.addRow(new Object[]{"Ingreso,salario estatal","Fondo",salarioEstatal,hora_1.getText(),fecha_1.getText()});
					}
				}
		}
				catch(Exception ex) {
		            ex.printStackTrace();
				}
			}
		};
		timerd =new Timer(70 * 1000,PagarEstatal);
		timerd.setInitialDelay(70);
		timerd.start();
		
		if(pos!=-1){
			PerfilIniciado();
		}
	}
	public void CambiarAvatar(){
		if(banco.getUsuarios().get(pos).getSexo()=='O'){
			avatarCircular.setAvatar(new ImageIcon(Menu.class.getResource("/iconos/woman_female_girl_people_avatar_icon_131275 (5).png")));
			lblNewLabel_4.setText("Sexo:Otro");
		}
		else if(banco.getUsuarios().get(pos).getSexo()=='M'){
			avatarCircular.setAvatar(new ImageIcon(Menu.class.getResource("/iconos/people_avatar_boy_child_person_icon_131264 (3).png")));
			lblNewLabel_4.setText("Sexo:Masculino");
		}
		else if(banco.getUsuarios().get(pos).getSexo()=='F'){
			avatarCircular.setAvatar(new ImageIcon(Menu.class.getResource("/iconos/avatar_woman_female_girl_people_icon_131282 (2) - copia.png")));
			lblNewLabel_4.setText("Sexo:Femenino");
		}
	}

	public void PerfilIniciado(){
		lblNombre.setText("Nombre:" + usuario.getNombreCompleto());
		lblNewLabel_5.setText("Direccion:" +  usuario.getDireccion());
		lblUsuario_1.setText("Usuario:" +  usuario.getIdU());
		lblgmail.setText("@gmail:" +  usuario.getCorreoelectronico());
		lblCi.setText("CI:" + usuario.getCI());
		lblMovil_1.setText("Movil:" + usuario.getTelefono());
		CambiarAvatar();
	}
	public void VerCuenta(){
		if(pos!=-1 && banco.getUsuarios().get(pos).getCuentas().size()>2){

		}
	}

	public void AñadirCuentaTabla(DefaultTableModel mitabla){

		int i=0;
		if(pos!=-1){//para que no se parta sino inicialice 
			if(lineas==0){
				lineas++;
				for(CuentaBancaria c : usuario.getCuentas()){//cuentas de prueba

					String beneficiario="";
					if(beneficiario.equalsIgnoreCase("")){
						beneficiario="no";
					}
					if(c.getTipo().equalsIgnoreCase("Corriente")){
						mitabla.addRow(new Object[]{c.getTipo(),((Corriente)c).getCup(),"cup","12","07:23:10 PM","18-feb-2024","no",beneficiario,"no","no",lineas});
						lineas++;

					}
					if(c.getTipo().equalsIgnoreCase("MLC")){
						mitabla.addRow(new Object[]{c.getTipo(),((MLC)c).getMlc(),"mlc","no","09:47:20 PM","18-ene-2024","no",beneficiario,"no",lineas});
						lineas++;
					}
					if(c.getTipo().equalsIgnoreCase("PlazoFijo")){
						mitabla.addRow(new Object[]{"PlazoFijo",((PlazoFijo)c).getCup(),"cup","12","12:50:30 PM","18-oct-2024","no",beneficiario,"18-oct-2025","no",lineas});
						lineas++;
					}
					if(c.getTipo().equalsIgnoreCase("Ahorro")){
						mitabla.addRow(new Object[]{c.getTipo(),((Ahorro)c).getCup(),"cup","no","12:50:30 PM","18-oct-2024","no",beneficiario,"no","no",lineas});
						lineas++;
					}
					if(c.getTipo().equalsIgnoreCase("Fondo")){
						mitabla.addRow(new Object[]{c.getTipo(),((Fondo)c).getCup(),"cup","12","12:50:30 PM","18-oct-2024","no",beneficiario,"no","si",lineas});
						lineas++;
					}

				}
				fechaCreada=CrearCuenta.fechaCreada;
				horaCreada=CrearCuenta.horaCreada;
				fechaPlazo=CrearCuenta.fechaPlazo;
				Estatal=CrearCuenta.Estatal;
				
				ElegirTransferencia();
				ListaEnvioIni();
				ListaMovil();
				ListaRecarCuenta();
				Habilitar();
				ListaInteresesCF();
				ListaInteresesPF();
				ListaIngresarInteresAhorro();
			}
			else{

				fechaCreada=CrearCuenta.fechaCreada;
				horaCreada=CrearCuenta.horaCreada;
				fechaPlazo=CrearCuenta.fechaPlazo;
				Estatal=CrearCuenta.Estatal;
				while(lineas< usuario.getCuentas().size()+1){
					CuentaBancaria c= usuario.getCuentas().get(lineas-1);
					String beneficiario=c.getBeneficiario();

					if(beneficiario.equalsIgnoreCase("")){
						beneficiario="no";
					}

					if(c.getTipo().equalsIgnoreCase("Corriente")){
						String segundoTitular=((Corriente)c).getTiturales();
						if(segundoTitular.equalsIgnoreCase("")){
							segundoTitular="no";
						}
						mitabla.addRow(new Object[]{c.getTipo(),((Corriente)c).getCup(),"cup","0",horaCreada,fechaCreada,segundoTitular,beneficiario,"no","no",lineas});
						lineas++;
					}
					if(c.getTipo().equalsIgnoreCase("MLC")){

						mitabla.addRow(new Object[]{c.getTipo(),((MLC)c).getMlc(),"mlc","no",horaCreada,fechaCreada,"no",beneficiario,"no","no",lineas});
						lineas++;
					}
					if(c.getTipo().equalsIgnoreCase("PlazoFijo")){
						mitabla.addRow(new Object[]{"PlazoFijo",((PlazoFijo)c).getCup(),"cup","0",horaCreada,fechaCreada,"no",beneficiario,fechaPlazo,"no",lineas});
						lineas++;
					}
					if(c.getTipo().equalsIgnoreCase("Ahorro")){
						if(((Ahorro)c).getCup()!=-1 && ((Ahorro)c).getMlc()==-1){
							mitabla.addRow(new Object[]{c.getTipo(),((Ahorro)c).getCup(),"cup","no",horaCreada,fechaCreada,"no",beneficiario,"no",Estatal,lineas});
							lineas++;
						}
						else{
							mitabla.addRow(new Object[]{c.getTipo(),((Ahorro)c).getMlc(),"mlc","no",horaCreada,fechaCreada,"no",beneficiario,"no",Estatal,lineas});
							lineas++;
						}
					}
					if(c.getTipo().equalsIgnoreCase("Fondo")){
						salarioEstatal=CrearCuenta.salarioEstatal;
						mitabla.addRow(new Object[]{c.getTipo(),((Fondo)c).getCup(),"cup","0",horaCreada,fechaCreada,"no",beneficiario,"no","si",lineas});
						lineas++;
					}
				}

			}
			ElegirTransferencia();
			ListaEnvioIni();
			ListaMovil();
			ListaRecarCuenta();
			Habilitar();
			ListaInteresesCF();
			ListaInteresesPF();
			ListaIngresarInteresAhorro();
		
			

		}
	}
	public void ElegirTransferencia(){  //recordar t debe ser t-1;
		if(lineast==0){
			for(lineast=1;lineast<usuario.getCuentas().size()+1;lineast++){		
				listaTranferencia.addElement(usuario.getCuentas().get(lineast-1).getTipo() + "-" + lineast);	
			}
		}
		else{
			while(lineast<usuario.getCuentas().size()+1){
				listaTranferencia.addElement(usuario.getCuentas().get(lineast-1).getTipo() + "-" + lineast);	
				lineast++;
			}
		}

		ListaTranfer.revalidate();//estas dos lineas son para actualizar y pintar la lista
		ListaTranfer.repaint();

	}

	public void ListaEnvioIni(){
		while(lineasE<listaTranferencia.getSize()){
			if(!(listaTranferencia.get(lineasE).contains("Fondo"))){
				listaTranferenciaEnvio.addElement(listaTranferencia.get(lineasE));
			}
			lineasE++;
		}
		ListaEnvioG.revalidate();
		ListaEnvioG.repaint();
	}


	public void ListaMovil(){
		boolean noMlc=false;
		while(lineasR<listaTranferencia.getSize()){
			for(int j=0;j<9;j++){
				if(listaTranferencia.get(lineasR).equals("MLC" + "-" + j)){
					noMlc=true;
				}
			}
			if(!noMlc){
				listaMovil.addElement(listaTranferencia.get(lineasR));
			}
			lineasR++;
		}
		ListaMovilRecargaG.revalidate();//estas dos lineas son para actualizar y pintar la lista
		ListaMovilRecargaG.repaint();
	}

	public void ListaRecarCuenta(){
		while(lineasRC<miTabla.getRowCount()){
			if(miTabla.getValueAt(lineasRC, 9).equals("no")){
				listaRecargaCuenta.addElement(listaTranferencia.get(lineasRC));
			}
			lineasRC++;

		}
		ListaRecargaCuentaG.revalidate();
		ListaRecargaCuentaG.repaint();

	}
	public void Habilitar(){
		for(int i=0;i<usuario.getCuentas().size();i++){
			if(usuario.getCuentas().get(i) instanceof  Fondo){
				negocios=true;
				botonAnimacion_10.setEnabled(true);
			}
		}
	}
	public float SalarioFondo(){
		float salario=0;
		int i;
		for(i=0;i<usuario.getCuentas().size();i++){
			if(usuario.getCuentas().get(i) instanceof Fondo){
				fondoA=i;
				salario=((Fondo)usuario.getCuentas().get(i)).getCup();
				i=usuario.getCuentas().size();
			}	
		}
		return salario;
	}
	
	public void ListaInteresesCF(){
		while(lineasCF<miTabla.getRowCount()){
			if(usuario.getCuentas().get(lineasCF) instanceof Iintereses){
				listaInteresCF.addElement(listaTranferencia.get(lineasCF));
			}
			lineasCF++;

		}
		ListaInteresCFG.revalidate();
		ListaInteresCFG.repaint();

	}
	public void ListaInteresesPF(){
		while(lineasPF<miTabla.getRowCount()){
			if(usuario.getCuentas().get(lineasPF) instanceof PlazoFijo){
				listaInteresPF.addElement(listaTranferencia.get(lineasPF));
			}
			lineasPF++;

		}
		ListaInteresPFG.revalidate();
		ListaInteresPFG.repaint();

	}
	
	public void ListaIngresarInteresAhorro(){
		while(lineasIA<miTabla.getRowCount()){
			if(usuario.getCuentas().get(lineasIA) instanceof Ahorro){
				if(miTabla.getValueAt(lineasIA, 2).toString().equalsIgnoreCase("cup"))
				listaIngresarInteresAhorro.addElement(listaTranferencia.get(lineasIA));
			}
			lineasIA++;

		}
		ListaIngresarInteresAhorroG.revalidate();
		ListaIngresarInteresAhorroG.repaint();

	}
	public void BorrarCuenta(){
		String numRemover = txtNumero.getText();
	    String cuenta="";
	    for (int i = miTabla.getRowCount() - 1; i >= 0; i--) {
	        if (miTabla.getValueAt(i, 10).toString().equalsIgnoreCase(numRemover)) {
	        	cuenta=miTabla.getValueAt(i, 0).toString();
	        	
	            usuario.getCuentas().remove(i);
	            miTabla.removeRow(i);
	            txtNumero.setText("");
	            lineas--;
	            lineasCF=0;
	            lineasE=0;
	            lineasIA=0;
	            lineasPF=0;
	            lineasR=0;
	            lineasRC=0;
	            lineast=0;
	            listaTranferencia.clear();
	            listaInteresCF.clear();
	            listaInteresPF.clear();
	            listaIngresarInteresAhorro.clear();
	            listaMovil.clear();
	            listaRecargaCuenta.clear();
	            listaTranferenciaEnvio.clear();
	            
	            
	            for (int j=i; j< miTabla.getRowCount();j++) {
	                miTabla.setValueAt(j + 1, j, 10);
	            }
	            ElegirTransferencia();
	            ListaEnvioIni();
				ListaMovil();
				ListaRecarCuenta();
				Habilitar();
				ListaInteresesCF();
				ListaInteresesPF();
				ListaIngresarInteresAhorro();
	        }
	    }
	}
	
	
	
	
	
}


