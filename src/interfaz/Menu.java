package interfaz;


import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;

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

import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JTextField;



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
	private JLabel lblNewLabel_6;
	private boolean vercuentas;
	public static boolean salirDialog=false;
	public static boolean cuentaCreada=false;
	private String fechaPlazo;
	private Banco banco=Banco.getInstancia();
	private int lineas=0;
	private int lineast=0;
	private DefaultTableModel miTabla=new DefaultTableModel();
	private String fechaCreada;
	private String horaCreada;
	private JLabel lblNewLabel_7;
	private Usuario usuario=banco.getUsuarios().get(pos);
	private DefaultListModel<String> listaGrafica= new DefaultListModel();
	private JList<String> ListaTranfer=new JList<>(listaGrafica);
	private DefaultListModel<String> ListaGraficaEnvio=listaGrafica;
	private JList<String> ListaEnvio=new JList<>(ListaGraficaEnvio);
	private JTextField textField_1;
	private JLabel lblNewLabel_8;
	private int cambioPos=0;//la posicion del saldo que transfiere ,la posicion del enviado esta en el evento de el boton Acaptar
	private JLabel label_2;

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
		setBounds(100, 100, 975, 498);
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
		panel.setBounds(0, -421, 129, 484);
		contentPane.add(panel);

		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/iconos/iconmonstr-menu-dot-horizontal-circle-lined-48.png")));
		lblNewLabel.setBounds(69, 429, 48, 42);
		//lblNewLabel.setBounds(69, 429, 48, 42); localizacion deseada
		timer = new Timer(10, new ActionListener() {
			int y = panel.getY();

			public void actionPerformed(ActionEvent e){
				if(!arriba){
					if(y<-22){
						y+=5;
						panel.setLocation(panel.getX(), y);
					}
					else {
						((Timer) e.getSource()).stop();

						arriba=true;
					}
				}
				else{
					if(y>-421){
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
		botonAnimacion.setBounds(69, 262, 48, 47);
		panel.add(botonAnimacion);
		botonAnimacion.setIcon(new ImageIcon(Menu.class.getResource("/iconos/checklist_list_icon_259149.png")));
		botonAnimacion.setBackground(null);
		botonAnimacion.setForeground(null);
		
		lblNewLabel_2 = new JLabel("ultimas");
		lblNewLabel_2.setBounds(0, 269, 56, 16);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		
		lblNewLabel_3 = new JLabel("operaciones");
		lblNewLabel_3.setBounds(0, 288, 85, 16);
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
		botonAnimacion_3.setBounds(69, 217, 60, 42);
		panel.add(botonAnimacion_3);
		botonAnimacion_3.setBackground(null);
		botonAnimacion_3.setForeground(null);
		
		lblOperaciones = new JLabel("Operaciones");
		lblOperaciones.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		lblOperaciones.setBounds(0, 229, 69, 16);
		panel.add(lblOperaciones);
		
				JMenuBar menuBar = new JMenuBar();
				menuBar.setBorderPainted(false);
				menuBar.setBounds(925, 0, 40, 26);
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
		menuBar_1.setBounds(810, 0, 114, 26);
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
		menuBar_2.setBounds(0, 0, 982, 26);
		contentPane.add(menuBar_2);
		
		panel_1 = new JLayeredPane();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(128, 26, 841, 438);
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
		
		BotonAnimacion botonAnimacion_6 = new BotonAnimacion();
		botonAnimacion_6.setIcon(new ImageIcon(Menu.class.getResource("/iconos/money-bills-stack-1_icon-icons.com_56168.png")));
		botonAnimacion_6.setBackground(new Color(50, 205, 50));
		botonAnimacion_6.setBounds(446, 131, 78, 78);
		panelope.add(botonAnimacion_6);
		
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
		
		panelperfil = new JPanel();
		panel_1.add(panelperfil, "perfil");
		panelperfil.setLayout(null);
		
		JPanel paneldatos = new JPanel();
		paneldatos.setBounds(0, 0, 839, 125);
		panelperfil.add(paneldatos);
		paneldatos.setLayout(null);
		
		
		avatarCircular = new AvatarCircular();
		avatarCircular.setAvatar(new ImageIcon(Menu.class.getResource("/iconos/woman_female_girl_people_avatar_icon_131275 (5).png")));
		avatarCircular.setBounds(12, -1, 93, 99);
		paneldatos.add(avatarCircular);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(95, 13, 147, 16);
		paneldatos.add(lblNombre);
		
		lblNewLabel_4 = new JLabel("Genero:");
		lblNewLabel_4.setBounds(22, 96, 114, 16);
		paneldatos.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Direccion:");
		lblNewLabel_5.setBounds(95, 42, 127, 16);
		paneldatos.add(lblNewLabel_5);
		
		lblUsuario_1 = new JLabel("Usuario:");
		lblUsuario_1.setBounds(265, 13, 127, 16);
		paneldatos.add(lblUsuario_1);
		
		lblgmail = new JLabel("@gmail:");
		lblgmail.setBounds(265, 42, 185, 16);
		paneldatos.add(lblgmail);
		
		lblNewLabel_6 = new JLabel("Cuenta");
		lblNewLabel_6.setBounds(400, 82, 160, 16);
		paneldatos.add(lblNewLabel_6);
		
		
		lblNewLabel_7 = new JLabel("a");
		lblNewLabel_7.setBounds(166, 71, 56, 16);
		paneldatos.add(lblNewLabel_7);
		
		
		
		
		
		JPanel paneltabla = new JPanel();
		paneltabla.setBounds(0, 122, 839, 313);
		panelperfil.add(paneltabla);
		paneltabla.setLayout(null);
		

		
		    miTabla.addColumn("Cuenta");
	        miTabla.addColumn("Saldo");
	        miTabla.addColumn("Moneda");
	        miTabla.addColumn("Hora creada");
	        miTabla.addColumn("Fecha de creacion");
	        miTabla.addColumn("2do Titular");
	        miTabla.addColumn("Beneficiario");
	        miTabla.addColumn("Plazo");
	        miTabla.addColumn("#Cuenta");
		
		
		/*Object[][] datos = new Object[][] {
			    {null, null, null},
			    {null, null, null},
			    {null, null, null},
			};*/
	    
		table = new JTable(miTabla);
		table.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		table.setBounds(47, 38, 647, 229);
		paneltabla.add(table);
		table.setFillsViewportHeight(true);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(47, 13, 696, 275);
		paneltabla.add(scrollPane);

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
		
		
		JScrollPane scrollPane_1 = new JScrollPane(ListaTranfer);//metes dentro la lista para que salga en el scrollpane

			ListaTranfer.addListSelectionListener(new ListSelectionListener() {// se usan estas dos bibliotecas import javax.swing.event.ListSelectionEvent; import javax.swing.event.ListSelectionListener;
				public void valueChanged(ListSelectionEvent e) {
					if (!e.getValueIsAdjusting()) {
						if(ListaTranfer.getSelectedIndex()>-1){
							for(int lil=0;lil<miTabla.getRowCount();lil++){//las lineas
								String cuenta= miTabla.getValueAt(lil, 0).toString();//getValueAt(lil, 0) es para coger el valor en la tabla y toString para convertir ese valor a String completamente
								String numeroCuenta= miTabla.getValueAt(lil, 8).toString();

								if(ListaTranfer.getSelectedValue().equalsIgnoreCase(cuenta + "-" + numeroCuenta) && ListaTranfer.getSelectedValue()!=null){
									String saldo=String.valueOf(((Corriente)usuario.getCuentas().get(lil)).getCup());
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
		
		lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(111, 249, 140, 16);
		panelTransferir.add(lblNewLabel_8);
		
		JScrollPane scrollPane_2 = new JScrollPane(ListaEnvio);
		scrollPane_2.setBounds(477, 151, 230, 85);
		panelTransferir.add(scrollPane_2);
		ListaEnvio.addListSelectionListener(new ListSelectionListener() {// se usan estas dos bibliotecas import javax.swing.event.ListSelectionEvent; import javax.swing.event.ListSelectionListener;
			public void valueChanged(ListSelectionEvent d) {
				if (!d.getValueIsAdjusting()) {
					if(ListaEnvio.getSelectedIndex()>-1){
						for(int lil=0;lil<miTabla.getRowCount();lil++){//las lineas
							String cuenta= miTabla.getValueAt(lil, 0).toString();//getValueAt(lil, 0) es para coger el valor en la tabla y toString para convertir ese valor a String completamente
							String numeroCuenta= miTabla.getValueAt(lil, 8).toString();

							if(ListaEnvio.getSelectedValue().equalsIgnoreCase(cuenta + "-" + numeroCuenta) && ListaEnvio.getSelectedValue()!=null){
								String saldo=String.valueOf(((Corriente)usuario.getCuentas().get(lil)).getCup());
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
				if(ListaTranfer.getSelectedIndex()>-1 && ListaEnvio.getSelectedIndex()>-1){
					int enviar=ListaEnvio.getSelectedIndex();//la posicion del nuevo Saldo
					float restaSaldo=Float.parseFloat(textField_1.getText());
					float saldoTrans=((Corriente)usuario.getCuentas().get(cambioPos)).getCup()-restaSaldo;
					float SaldoEnvio=(float) miTabla.getValueAt(enviar,1)+restaSaldo;//el casting  es por el dato de las cosas en la tabla 
					
					((Corriente)usuario.getCuentas().get(cambioPos)).setCup(saldoTrans);
					((Corriente)usuario.getCuentas().get(enviar)).setCup(SaldoEnvio);
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
		
		label_2 = new JLabel("New label");
		label_2.setBounds(541, 249, 140, 16);
		panelTransferir.add(label_2);
		
		
		
		
		
		
		
		
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
		lblNombre.setText("Nombre:" + banco.getUsuarios().get(pos).getNombreCompleto());
		lblNewLabel_5.setText("Direccion:" + banco.getUsuarios().get(pos).getDireccion());
		lblUsuario_1.setText("Usuario:" + banco.getUsuarios().get(pos).getIdU());
		lblgmail.setText("@gmail:" + banco.getUsuarios().get(pos).getCorreoelectronico());
		
		CambiarAvatar();
	}
	public void VerCuenta(){
	if(pos!=-1 && banco.getUsuarios().get(pos).getCuentas().size()>2){
		lblNewLabel_6.setText("si hay cuenta");
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
			mitabla.addRow(new Object[]{c.getTipo(),((Corriente)c).getCup(),"cup","07:23:10 PM","18-feb-2024","no",beneficiario,"no",lineas});
			lineas++;
			
			}
			if(c.getTipo().equalsIgnoreCase("MLC")){
				mitabla.addRow(new Object[]{c.getTipo(),((MLC)c).getMlc(),"mlc","09:47:20 PM","18-ene-2024","no",beneficiario,"no",lineas});
				lineas++;
				}
			if(c.getTipo().equalsIgnoreCase("PlazoFijo")){
				mitabla.addRow(new Object[]{"PlazoFijo",((PlazoFijo)c).getCup(),"cup","12:50:30 PM","18-oct-2024","no",beneficiario,"18-oct-2025",lineas});
				lineas++;
			}
			if(c.getTipo().equalsIgnoreCase("Ahorro")){
				mitabla.addRow(new Object[]{c.getTipo(),((PlazoFijo)c).getCup(),"cup","12:50:30 PM","18-oct-2024","no",beneficiario,"no",lineas});
				lineas++;
			}
			if(c.getTipo().equalsIgnoreCase("Fondos")){
				mitabla.addRow(new Object[]{c.getTipo(),((PlazoFijo)c).getCup(),"cup","12:50:30 PM","18-oct-2024","no",beneficiario,"no",lineas});
				lineas++;
			}
			 
		}

			}
			else{
				
				fechaCreada=CrearCuenta.fechaCreada;
				horaCreada=CrearCuenta.horaCreada;
				fechaPlazo=CrearCuenta.fechaPlazo;
					while(lineas< usuario.getCuentas().size()+1){
						CuentaBancaria c= usuario.getCuentas().get(lineas-1);
						String beneficiario=c.getBeneficiario();
						String segundoTitular=((Corriente)c).getTiturales();
						if(beneficiario.equalsIgnoreCase("")){
							beneficiario="no";
						}
						if(segundoTitular.equalsIgnoreCase("")){
							segundoTitular="no";
						}
					if(c.getTipo().equalsIgnoreCase("Corriente")){
						mitabla.addRow(new Object[]{c.getTipo(),((Corriente)c).getCup(),"cup",horaCreada,fechaCreada,segundoTitular,beneficiario,"no",lineas});
						lineas++;
					}
					if(c.getTipo().equalsIgnoreCase("MLC")){
						mitabla.addRow(new Object[]{c.getTipo(),((MLC)c).getMlc(),"mlc",horaCreada,fechaCreada,"no",beneficiario,"no",lineas});
						lineas++;
					}
					if(c.getTipo().equalsIgnoreCase("PlazoFijo")){
						mitabla.addRow(new Object[]{"Plazo Fijo",((PlazoFijo)c).getCup(),"cup",horaCreada,fechaCreada,"no",beneficiario,fechaPlazo,lineas});
						lineas++;
					}
					if(c.getTipo().equalsIgnoreCase("Ahorro")){
						mitabla.addRow(new Object[]{c.getTipo(),((PlazoFijo)c).getCup(),"cup",horaCreada,fechaCreada,"no",beneficiario,"no",lineas});
						lineas++;
					}
					if(c.getTipo().equalsIgnoreCase("Fondos")){
						mitabla.addRow(new Object[]{"Fondos",((PlazoFijo)c).getCup(),"cup",horaCreada,fechaCreada,"no",beneficiario,"no",lineas});
						lineas++;
					}
					}
					 
			}
			ElegirTransferencia();

		}
	}
	public void ElegirTransferencia(){  //recordar t debe ser t-1;
		if(lineast==0){
		for(lineast=1;lineast<usuario.getCuentas().size()+1;lineast++){		
			listaGrafica.addElement(usuario.getCuentas().get(lineast-1).getTipo() + "-" + lineast);	
		}
		}
		else{
			while(lineast<usuario.getCuentas().size()+1){
				listaGrafica.addElement(usuario.getCuentas().get(lineast-1).getTipo() + "-" + lineast);	
				lineast++;
			}
		}
		
		ListaTranfer.revalidate();//estas dos lineas son para actualizar y pintar la lista
		ListaTranfer.repaint();
	}
		
	
	public void SeleccionTransferir(){
		
	}
}
