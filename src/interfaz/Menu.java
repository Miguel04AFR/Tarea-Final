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

import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;



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
	private Banco banco=Banco.getInstancia();
	private int lineas=0;
	private DefaultTableModel miTabla=new DefaultTableModel();

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
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(false);
		setLocationRelativeTo(null);
		
		
		contentPane.setLayout(null);



		panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 0, 0)));
		panel.setForeground(Color.GRAY);
		panel.setBounds(0, -421, 129, 484);
		contentPane.add(panel);

		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/iconos/iconmonstr-menu-dot-horizontal-circle-lined-48.png")));
		lblNewLabel.setBounds(69, 429, 48, 42);
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
		panel_1.setBounds(130, 28, 839, 435);
		contentPane.add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		panelinicio = new JPanel();
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
		botonAnimacion_1.setIcon(new ImageIcon(Menu.class.getResource("/iconos/transfer_icon_144072 (2).png")));
		botonAnimacion_1.setBackground(new Color(50, 205, 50));
		botonAnimacion_1.setBounds(23, 32, 78, 78);
		panelope.add(botonAnimacion_1);
		
		JLabel label_1 = new JLabel("Transferencia de");
		label_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_1.setBounds(113, 32, 116, 37);
		panelope.add(label_1);
		
		BotonAnimacion botonAnimacion_4 = new BotonAnimacion();
		botonAnimacion_4.setBackground(new Color(50, 205, 50));
		botonAnimacion_4.setBounds(23, 140, 78, 78);
		panelope.add(botonAnimacion_4);
		
		JLabel label_3 = new JLabel("Transferir de");
		label_3.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_3.setBounds(113, 141, 116, 37);
		panelope.add(label_3);
		
		JLabel label_4 = new JLabel("cuenta a cuenta");
		label_4.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_4.setBounds(113, 164, 116, 37);
		panelope.add(label_4);
		
		JLabel label_6 = new JLabel("saldo");
		label_6.setFont(new Font("Segoe UI", Font.BOLD, 15));
		label_6.setBounds(113, 57, 104, 37);
		panelope.add(label_6);
		
		BotonAnimacion botonAnimacion_5 = new BotonAnimacion();
		botonAnimacion_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CrearCuenta p=new CrearCuenta();
				p.setVisible(true);
				VerCuenta();
				 AñadirCuentaTabla(miTabla);
				
				if(salirDialog){
					dispose();
				}
			   
				
				
			}
		});
		botonAnimacion_5.setBackground(new Color(50, 205, 50));
		botonAnimacion_5.setBounds(23, 262, 78, 78);
		panelope.add(botonAnimacion_5);
		
		JLabel lblCrearNueva = new JLabel("Crear nueva ");
		lblCrearNueva.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblCrearNueva.setBounds(113, 270, 116, 37);
		panelope.add(lblCrearNueva);
		
		JLabel lblCuentaDeBanco = new JLabel("cuenta de banco");
		lblCuentaDeBanco.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblCuentaDeBanco.setBounds(113, 291, 116, 37);
		panelope.add(lblCuentaDeBanco);
		
		BotonAnimacion botonAnimacion_6 = new BotonAnimacion();
		botonAnimacion_6.setBackground(new Color(50, 205, 50));
		botonAnimacion_6.setBounds(438, 32, 78, 78);
		panelope.add(botonAnimacion_6);
		
		JLabel lblRecargarSaldo = new JLabel("Recargar saldo");
		lblRecargarSaldo.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblRecargarSaldo.setBounds(522, 32, 116, 37);
		panelope.add(lblRecargarSaldo);
		
		JLabel lblMovil = new JLabel("movil");
		lblMovil.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblMovil.setBounds(522, 57, 116, 37);
		panelope.add(lblMovil);
		
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
		
		
		JLabel lblNewLabel_7 = new JLabel("a");
		lblNewLabel_7.setBounds(166, 71, 56, 16);
		paneldatos.add(lblNewLabel_7);
		if(pos!=-1){
			lblNewLabel_7.setText(String.valueOf(banco.getUsuarios().get(pos).getCuentas().size()));
			}
		
		
		
		
		JPanel paneltabla = new JPanel();
		paneltabla.setBounds(0, 122, 839, 313);
		panelperfil.add(paneltabla);
		paneltabla.setLayout(null);
		

		
		 miTabla.addColumn("Cuenta");
	        miTabla.addColumn("Saldo");
	        miTabla.addColumn("Fecha de creacion");
		
		
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
		scrollPane.setBounds(47, 13, 647, 257);
		paneltabla.add(scrollPane);
		 if(cuentaCreada){ 
			 AñadirCuentaTabla(miTabla);
			 cuentaCreada=false;
		     }
		 AñadirCuentaTabla(miTabla);
		panelultiope = new JPanel();
		panel_1.add(panelultiope, "ultiope");
		panelultiope.setLayout(null);
		
		JLabel lblTablaDeTodas = new JLabel("tabla de todas las operaciones hasta la fecha");
		lblTablaDeTodas.setBounds(286, 195, 344, 16);
		panelultiope.add(lblTablaDeTodas);

		
		NotificacionesModernas.getInstancia().setJFrame(this);
		
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
		for(CuentaBancaria c : banco.getUsuarios().get(pos).getCuentas()){
			if(c.getTipo().equalsIgnoreCase("Corriente")){
			mitabla.addRow(new Object[]{c.getTipo(),((Corriente)c).getCup(),null});
			lineas++;
			}
			if(c.getTipo().equalsIgnoreCase("MLC")){
				mitabla.addRow(new Object[]{c.getTipo(),((MLC)c).getMlc(),null});
				lineas++;
				}
			if(c.getTipo().equalsIgnoreCase("PlazoFijo")){
				mitabla.addRow(new Object[]{c.getTipo(),((PlazoFijo)c).getCup(),null});
				lineas++;
			}
		}

			}
			else{
					while(lineas<banco.getUsuarios().get(pos).getCuentas().size()){
						CuentaBancaria c=banco.getUsuarios().get(pos).getCuentas().get(lineas);
					if(c.getTipo().equalsIgnoreCase("Corriente")){
						mitabla.addRow(new Object[]{c.getTipo(),((Corriente)c).getCup(),null});
						lineas++;
					}
					if(c.getTipo().equalsIgnoreCase("MLC")){
						mitabla.addRow(new Object[]{c.getTipo(),((MLC)c).getMlc(),null});
						lineas++;
					}
					if(c.getTipo().equalsIgnoreCase("PlazoFijo")){
						mitabla.addRow(new Object[]{"Plazo Fijo",((PlazoFijo)c).getCup(),null});
						lineas++;
					}
					if(c.getTipo().equalsIgnoreCase("Ahorro")){
						mitabla.addRow(new Object[]{"Plazo Fijo",((PlazoFijo)c).getCup(),null});
						lineas++;
					}
					if(c.getTipo().equalsIgnoreCase("Fondos")){
						mitabla.addRow(new Object[]{"Fondos",((PlazoFijo)c).getCup(),null});
						lineas++;
					}
				}
			}
			}
		}

	
}
