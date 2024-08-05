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
	private DefaultTableModel miTabla=new DefaultTableModel();
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
	private boolean tiempoInteres=false;
	private boolean negocios=false;
	private JTextField textField_1;
	private JLabel lblNewLabel_8;
	private int cambioPos=0;//la posicion del saldo que transfiere ,la posicion del enviado esta en el evento de el boton Acaptar
	private int fondoA=0;
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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(false);
		setLocationRelativeTo(null);
		NotificacionesModernas.getInstancia().setJFrame(this);
		
		
		contentPane.setLayout(null);



		panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 0, 0)));
		panel.setForeground(Color.GRAY);
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
				lblNewLabel_10.setText(String.valueOf(SalarioFondo()));
				
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
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(231, 186, 107, 23);
		panelinicio.add(lblNewLabel_1);
		lblNewLabel_1.setText(String.valueOf(pos));
		
		
		
		
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
		 timerst = new Timer(10 * 1000, new ActionListener(){
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
		
		
		
		
		
		JPanel paneltabla = new JPanel();
		paneltabla.setBounds(0, 122, 866, 317);
		panelperfil.add(paneltabla);
		paneltabla.setLayout(null);
		

		
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
		table.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		table.setBounds(47, 38, 647, 229);
		paneltabla.add(table);
		table.setFillsViewportHeight(true);
		
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
		
		JLabel lblTablaDeTodas = new JLabel("tabla de todas las operaciones hasta la fecha");
		lblTablaDeTodas.setBounds(286, 195, 344, 16);
		panelultiope.add(lblTablaDeTodas);
		
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
										saldo=String.valueOf(((MLC)usuario.getCuentas().get(lil)).getMlc());
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
											saldo=String.valueOf(((MLC)usuario.getCuentas().get(lil)).getMlc());
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
						saldoTrans=((Ahorro)usuario.getCuentas().get(cambioPos)).getCup()-restaSaldo;
						((Ahorro)usuario.getCuentas().get(cambioPos)).setCup(saldoTrans);
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
							((Ahorro)usuario.getCuentas().get(enviar)).setCup(SaldoEnvio);
							}
					miTabla.setValueAt(saldoTrans, cambioPos, 1);
					miTabla.setValueAt(SaldoEnvio, enviar, 1);

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
									saldo=String.valueOf(((MLC)usuario.getCuentas().get(lil)).getMlc());
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
						saldoTrans=((Ahorro)usuario.getCuentas().get(cambioPos)).getCup()-restaSaldo;
						((Ahorro)usuario.getCuentas().get(cambioPos)).setCup(saldoTrans);
					}
					miTabla.setValueAt(saldoTrans, cambioPos, 1);

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

		JLayeredPane panelAgenciaC = new JLayeredPane();
		panelAgenciaC.setBounds(0, 50, 866, 386);
		panelAgencias.add(panelAgenciaC);
		panelAgenciaC.setLayout(new CardLayout(0, 0));

		JPanel panelA1 = new JPanel();
		panelAgenciaC.add(panelA1, "Agencia1");

		JPanel panelA2 = new JPanel();
		panelAgenciaC.add(panelA2, "Agencia2");

		JPanel panelA3 = new JPanel();
		panelAgenciaC.add(panelA3, "Agencia3");

		JPanel panelA4 = new JPanel();
		panelAgenciaC.add(panelA4, "Agencia4");

		JPanel panelA5 = new JPanel();
		panelAgenciaC.add(panelA5, "Agencia5");

		JLabel lblAgenciasYCajeros = new JLabel("Agencias y Cajeros");
		lblAgenciasYCajeros.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblAgenciasYCajeros.setBackground(Color.BLACK);
		lblAgenciasYCajeros.setBounds(236, 10, 288, 27);
		panelAgencias.add(lblAgenciasYCajeros);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		comboBox.setBounds(547, 6, 280, 40);
		panelAgencias.add(comboBox);
		comboBox.addItem("Banco Central de Cuba:");
		comboBox.addItem("Banco Nacional de Cuba:");
		comboBox.addItem("Banco Popular de Ahorro (BPA):");
		comboBox.addItem("Banco Inversiones S.A. (Bancoi):");
		comboBox.addItem("Banco Metropolitano S.A.:");


		JPanel panelInteresPlazoFijo = new JPanel();
		panel_1.add(panelInteresPlazoFijo, "InteresAhorro");

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
									saldo=String.valueOf(((MLC)usuario.getCuentas().get(lil)).getMlc());
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
				((Corriente)usuario.getCuentas().get(cambioPos)).setCup(SaldoAntiguo+recarga);
				miTabla.setValueAt(SaldoAntiguo+recarga, cambioPos, 1);
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

		BotonAnimacion botonAnimacion_11 = new BotonAnimacion();
		botonAnimacion_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		botonAnimacion_11.setText("    ");
		botonAnimacion_11.setIcon(new ImageIcon(Menu.class.getResource("/iconos/donacion.png")));
		botonAnimacion_11.setBackground(new Color(50, 205, 50));
		botonAnimacion_11.setBounds(109, 178, 231, 78);
		panelIntereses.add(botonAnimacion_11);

		BotonAnimacion botonAnimacion_13 = new BotonAnimacion();
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

		JLabel lblNewLabel_7 = new JLabel("Salario Estatal Actual:");
		lblNewLabel_7.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(40, 144, 196, 77);
		panelNegociosFondo.add(lblNewLabel_7);

		lblNewLabel_10 = new JLabel(".");
		lblNewLabel_10.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		lblNewLabel_10.setBounds(242, 144, 110, 77);
		panelNegociosFondo.add(lblNewLabel_10);

		JLabel lblEstoEsEl = new JLabel("Esto es el comercio de la agencia bancaria.Aqu\u00ED valoraran si merece");
		lblEstoEsEl.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblEstoEsEl.setBounds(30, 0, 740, 61);
		panelNegociosFondo.add(lblEstoEsEl);

		JLabel lblUnAumentodeterminandoSu = new JLabel("un aumento,determinando su rendimiento y el aumento que solicite.");
		lblUnAumentodeterminandoSu.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblUnAumentodeterminandoSu.setBounds(30, 23, 754, 61);
		panelNegociosFondo.add(lblUnAumentodeterminandoSu);

		JLabel lblIngreseLaCantidad = new JLabel("Ingrese la cantidad que considere apropiada.(Tenga en cuenta que la ");
		lblIngreseLaCantidad.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblIngreseLaCantidad.setBounds(30, 45, 766, 61);
		panelNegociosFondo.add(lblIngreseLaCantidad);

		JLabel lbltengaEnCuenta = new JLabel("cifra que ingrese se le suma a su salario actual).");
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

		JLabel lblAumentoDeseado = new JLabel("Aumento deseado:");
		lblAumentoDeseado.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		lblAumentoDeseado.setBounds(217, 205, 196, 77);
		panelNegociosFondo.add(lblAumentoDeseado);
		
		botonAnimacion_14 = new BotonAnimacion();
		botonAnimacion_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float aumentar=Float.parseFloat(textField_4.getText());
				boolean aumento=((Fondo)usuario.getCuentas().get(fondoA)).AumentoSalario(aumentar, salarioEstatal);
				ImageIcon icono=new ImageIcon("/iconos/aprobacion-de-documento.png");
				if(aumento){
					salarioEstatal+=aumentar;
					JOptionPane.showMessageDialog(null, "¡Felicidades! Se ha aprobado un aumento de salario, ahora cobrará: " + salarioEstatal, "Aumento de Salario", JOptionPane.INFORMATION_MESSAGE, icono);
				}
				else{
					JOptionPane.showMessageDialog(null, "Lo siento,lamentablemente no se ha aprobado el aumento de salario.");
				}
				
			}
		});
		botonAnimacion_14.setText("Aceptar");
		botonAnimacion_14.setForeground(Color.BLACK);
		botonAnimacion_14.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		botonAnimacion_14.setColorEfecto(Color.GREEN);
		botonAnimacion_14.setBackground(new Color(0, 128, 0));
		botonAnimacion_14.setBounds(174, 313, 290, 67);
		panelNegociosFondo.add(botonAnimacion_14);




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
		Timer timers = new Timer(120 * 1000, Intereses);
		timers.setInitialDelay(120 * 1000); // Para que la tarea se ejecute inmediatamente al inicio
		timers.start();

		ActionListener PagarEstatal= new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
				float depositarSalario=0;
				for(int i=0;i<usuario.getCuentas().size();i++){
					if(usuario.getCuentas().get(i)instanceof Fondo){
						depositarSalario=((Fondo)usuario.getCuentas().get(i)).getCup();
						((Fondo)usuario.getCuentas().get(i)).setCup(depositarSalario + salarioEstatal);
						miTabla.setValueAt(depositarSalario+salarioEstatal, i, 1);
					}
				}
		}
				catch(Exception ex) {
		            ex.printStackTrace();
				}
			}
		};
		timerd =new Timer(200 * 1000,PagarEstatal);
		timerd.setInitialDelay(0);
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
						mitabla.addRow(new Object[]{c.getTipo(),((PlazoFijo)c).getCup(),"cup","no","12:50:30 PM","18-oct-2024","no",beneficiario,"no","no",lineas});
						lineas++;
					}
					if(c.getTipo().equalsIgnoreCase("Fondo")){
						mitabla.addRow(new Object[]{c.getTipo(),((PlazoFijo)c).getCup(),"cup","12","12:50:30 PM","18-oct-2024","no",beneficiario,"no","si",lineas});
						lineas++;
					}

				}

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
}

