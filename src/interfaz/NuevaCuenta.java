package interfaz;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import Inicio.elmain;
import LogicaClases.Usuario;
import Inicio.elmain;
import LogicaClases.Banco; 





import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import componentesVisuales.NotificacionesModernas;
import componentesVisuales.PanelAnimacionCurvas;

import java.awt.Color;

import componentesVisuales.BotonAnimacion;
import componentesVisuales.NotificacionesModernas.Localizacion;
import componentesVisuales.NotificacionesModernas.Tipo;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.Timer;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import logica.utilidades.logica.Validaciones;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;


public class NuevaCuenta extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private boolean blanco=false;
	/**
	 * @wbp.nonvisual location=592,29
	 */
	private ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton checkH;
	private JRadioButton checkM;
	private JRadioButton checkOtro;
	private JTextField textField_3;
	private JLabel label;
	private BotonAnimacion botonAnimacion_2;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JLabel lblNombreCompleto;
	private JLabel lblNombreDeUsuario;
	private JLabel lblCorreoElectronico;
	private JLabel lblContrase;
	private JLabel lblCi;
	private JLabel lblSexo;
	private JLabel lblDireecion;
	private JLabel lblNumeroDeTelefono;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel;
	private JLabel lblDeCelular;
	private JLabel lblSuContrasea;
	private JLabel lblUnaPistaPor;
	private JLabel lblDosPasos;
	private JTextField textField;
	private JTextField textField_5;
	private boolean validacion=false;
	private char genero;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_20;
	private boolean validar1=false;
	private boolean validar2=false;
	private boolean validar3=false;
	private boolean validar4=false;
	private boolean validar5=false;
	private boolean validar6=false;
	private boolean validar7=false;//validar usuario existente
	private boolean validar77=false;//validar usuario vacio
	private boolean validar8=true;
	private BotonAnimacion botonAnimacion_1;
	private BotonAnimacion botonAnimacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		FlatDarculaLaf.setup();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevaCuenta frame = new NuevaCuenta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NuevaCuenta() {
		setTitle("Nueva cuenta");
		setIconImage(Toolkit.getDefaultToolkit().getImage(NuevaCuenta.class.getResource("/iconos/1486564400-account_81513 (3).png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 920, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		NotificacionesModernas.getInstancia().setJFrame(this);
		
		PanelAnimacionCurvas panelAnimacionCurvas = new PanelAnimacionCurvas((Color) null, (Color) null, (Color) null, (Color) null);
		panelAnimacionCurvas.setInicioGradiente(Color.GREEN);
		panelAnimacionCurvas.setForeground(Color.GREEN);
		panelAnimacionCurvas.setFinGradiente(Color.BLACK);
		panelAnimacionCurvas.setColorInicioAnimacion(new Color(0, 250, 154));
		panelAnimacionCurvas.setColorFinalAnimacion(Color.GREEN);
		panelAnimacionCurvas.setBounds(0, 0, 914, 37);
		contentPane.add(panelAnimacionCurvas);
		
		PanelAnimacionCurvas panelAnimacionCurvas_1 = new PanelAnimacionCurvas((Color) null, (Color) null, (Color) null, (Color) null);
		panelAnimacionCurvas_1.setInicioGradiente(Color.GREEN);
		panelAnimacionCurvas_1.setForeground(Color.GREEN);
		panelAnimacionCurvas_1.setFinGradiente(Color.BLACK);
		panelAnimacionCurvas_1.setColorInicioAnimacion(Color.GREEN);
		panelAnimacionCurvas_1.setColorFinalAnimacion(Color.GREEN);
		panelAnimacionCurvas_1.setBackground(Color.GREEN);
		panelAnimacionCurvas_1.setBounds(0, 518, 914, 37);
		contentPane.add(panelAnimacionCurvas_1);
		
		botonAnimacion = new BotonAnimacion();
		botonAnimacion.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				botonAnimacion.setForeground(new Color(0, 0, 128));
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				botonAnimacion.setForeground(new Color(0, 0, 0));
			}
		});
		botonAnimacion.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent o) {
				if(o.getKeyCode()==KeyEvent.VK_UP)
					botonAnimacion_1.requestFocus();
			}
		});
		botonAnimacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Salir();
			}
		});
		botonAnimacion.setText("Salir");
		botonAnimacion.setFont(new Font("Segoe UI", Font.BOLD, 20));
		botonAnimacion.setColorEfecto(Color.RED);
		botonAnimacion.setBorder(new EmptyBorder(40,40,40,40));
		botonAnimacion.setBackground(new Color(255, 69, 0));
		botonAnimacion.setForeground(new Color(0, 0, 0));
		botonAnimacion.setBounds(310, 448, 290, 57);
		contentPane.add(botonAnimacion);
		
		botonAnimacion_1 = new BotonAnimacion();
		botonAnimacion_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent p) {
				if(p.getKeyCode()==KeyEvent.VK_DOWN)
					botonAnimacion.requestFocus();
					if(p.getKeyCode()==KeyEvent.VK_LEFT)
						textField_4.requestFocus();
						if(p.getKeyCode()==KeyEvent.VK_RIGHT)
							textField_8.requestFocus();
			}
		});
		botonAnimacion_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				botonAnimacion_1.setForeground(new Color(0, 0, 128));
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				botonAnimacion_1.setForeground(new Color(0, 0, 0));
			}
		});
		botonAnimacion_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent arg0) {
		    	Validacion();
		    	if(validacion){
		    	AñadirUsuario();
		    	cuentacreada();
		    	}
		    	
		       
		        
		       
		    }
		});
		botonAnimacion_1.setText("Aceptar");
		botonAnimacion_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		botonAnimacion_1.setColorEfecto(Color.GREEN);
		botonAnimacion_1.setBackground(new Color(0, 128, 0));
		botonAnimacion_1.setBounds(310, 373, 290, 67);
		botonAnimacion_1.setForeground(new Color(0, 0, 0));
		contentPane.add(botonAnimacion_1);
		
		
		lblNewLabel = new JLabel("Registro de Nuevo Usuario - ");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 22));
		lblNewLabel.setBounds(139, 29, 298, 106);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Proyectos\\Java\\tarea-final\\iconos\\inversion-max-high-resolution-logo-transparent.png"));
		lblNewLabel_1.setBounds(442, 50, 207, 73);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Gracias por elegirnos.");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 22));
		lblNewLabel_2.setBounds(332, 281, 249, 57);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent c) {
				if(c.getKeyCode()==KeyEvent.VK_UP)
					textField_3.requestFocus();
				
				if(c.getKeyCode()==KeyEvent.VK_DOWN)
					textField_1.requestFocus();
				if(c.getKeyCode()==KeyEvent.VK_RIGHT)
					textField_5.requestFocus();
				
			}
			
		});
		textField.setColumns(10);
		textField.setBounds(11, 204, 290, 30);
		contentPane.add(textField);
		
		lblNombreDeUsuario = new JLabel("Nombre de usuario:");
		lblNombreDeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreDeUsuario.setFont(new Font("Segoe UI Black", Font.PLAIN, 22));
		lblNombreDeUsuario.setBounds(-30, 176, 331, 30);
		contentPane.add(lblNombreDeUsuario);
		
		lblCorreoElectronico = new JLabel("Correo electronico:");
		lblCorreoElectronico.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorreoElectronico.setFont(new Font("Segoe UI Black", Font.PLAIN, 22));
		lblCorreoElectronico.setBounds(-30, 230, 331, 30);
		contentPane.add(lblCorreoElectronico);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent v) {
				if(v.getKeyCode()==KeyEvent.VK_UP)
					textField.requestFocus();
					
				
				if(v.getKeyCode()==KeyEvent.VK_DOWN)
					textField_2.requestFocus();
				if(v.getKeyCode()==KeyEvent.VK_RIGHT)
					textField_6.requestFocus();
			}
		});
		textField_1.setColumns(10);
		textField_1.setBounds(11, 263, 290, 30);
		contentPane.add(textField_1);
		
		lblContrase = new JLabel("Contrase\u00F1a:");
		lblContrase.setHorizontalAlignment(SwingConstants.CENTER);
		lblContrase.setFont(new Font("Segoe UI Black", Font.PLAIN, 22));
		lblContrase.setBounds(-30, 294, 331, 30);
		contentPane.add(lblContrase);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent n) {
				if(n.getKeyCode()==KeyEvent.VK_UP)
					textField_1.requestFocus();
					
				
				if(n.getKeyCode()==KeyEvent.VK_DOWN)
					textField_4.requestFocus();
				if(n.getKeyCode()==KeyEvent.VK_RIGHT)
					textField_7.requestFocus();
			}
		});
		textField_2.setColumns(10);
		textField_2.setBounds(11, 330, 290, 30);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon("D:\\Proyectos\\Java\\tarea-final\\iconos\\business_application_addmale_useradd_insert_add_user_client_2312 (1).png"));
		lblNewLabel_3.setBounds(294, 176, 290, 73);
		contentPane.add(lblNewLabel_3);
		
		checkH = new JRadioButton("M");
		checkH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkH.setBounds(73, 470, 43, 23);
		contentPane.add(checkH);
		checkH.setSelected(true);
		
		checkM = new JRadioButton("F");
		checkM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkM.setBounds(120, 470, 43, 23);
		contentPane.add(checkM);
		
		checkOtro = new JRadioButton("Otro");
		checkOtro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkOtro.setBounds(167, 470, 63, 23);
		contentPane.add(checkOtro);
		
		lblSexo = new JLabel("Sexo:");
		lblSexo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSexo.setBounds(76, 448, 137, 22);
		contentPane.add(lblSexo);
		
		lblNombreCompleto = new JLabel("Nombre Completo:");
		lblNombreCompleto.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreCompleto.setFont(new Font("Segoe UI Black", Font.PLAIN, 22));
		lblNombreCompleto.setBounds(-30, 115, 331, 30);
		contentPane.add(lblNombreCompleto);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent b) {
			if(b.getKeyCode()==KeyEvent.VK_DOWN)
				textField.requestFocus();
			if(b.getKeyCode()==KeyEvent.VK_RIGHT)
				textField_5.requestFocus();

			
			}
		});
		textField_3.setColumns(10);
		textField_3.setBounds(11, 148, 290, 30);
		contentPane.add(textField_3);
		
		botonAnimacion_2 = new BotonAnimacion();
		botonAnimacion_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ColorFondo();
			}
		});
		botonAnimacion_2.setForeground(Color.WHITE);
		botonAnimacion_2.setBounds(792, 72, 40, 40);
		contentPane.add(botonAnimacion_2);
		
		label = new JLabel("Modo claro:");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(763, 50, 95, 16);
		contentPane.add(label);
		
		lblCi = new JLabel("CI:");
		lblCi.setHorizontalAlignment(SwingConstants.CENTER);
		lblCi.setFont(new Font("Segoe UI Black", Font.PLAIN, 22));
		lblCi.setBounds(-30, 357, 331, 30);
		contentPane.add(lblCi);
		
		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent m) {
				if(m.getKeyCode()==KeyEvent.VK_UP)
					textField_2.requestFocus();
					
				
				if(m.getKeyCode()==KeyEvent.VK_DOWN)
					checkH.requestFocus();
				if(m.getKeyCode()==KeyEvent.VK_RIGHT)
				botonAnimacion_1.requestFocus();
			}
		});
		textField_4.setColumns(10);
		textField_4.setBounds(8, 394, 290, 30);
		contentPane.add(textField_4);
		
		lblDosPasos = new JLabel("Dos pasos:");
		lblDosPasos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDosPasos.setFont(new Font("Segoe UI Black", Font.PLAIN, 22));
		lblDosPasos.setBounds(583, 115, 331, 30);
		contentPane.add(lblDosPasos);
		
		textField_5 = new JTextField();
		textField_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent s) {
				if(s.getKeyCode()==KeyEvent.VK_DOWN)
					textField_6.requestFocus();
				if(s.getKeyCode()==KeyEvent.VK_LEFT)
					textField.requestFocus();
			}
		});
		textField_5.setColumns(10);
		textField_5.setBounds(612, 187, 290, 30);
		contentPane.add(textField_5);
		
		lblUnaPistaPor = new JLabel("Una pista por si se le olvida");
		lblUnaPistaPor.setHorizontalAlignment(SwingConstants.CENTER);
		lblUnaPistaPor.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblUnaPistaPor.setBounds(578, 136, 331, 30);
		contentPane.add(lblUnaPistaPor);
		
		lblSuContrasea = new JLabel("su contrase\u00F1a");
		lblSuContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuContrasea.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblSuContrasea.setBounds(583, 156, 331, 30);
		contentPane.add(lblSuContrasea);
		
		lblDeCelular = new JLabel("Numero de celular:");
		lblDeCelular.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeCelular.setFont(new Font("Segoe UI Black", Font.PLAIN, 22));
		lblDeCelular.setBounds(583, 219, 331, 30);
		contentPane.add(lblDeCelular);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent d) {
				if(d.getKeyCode()==KeyEvent.VK_UP)
					textField_5.requestFocus();
					
				
				if(d.getKeyCode()==KeyEvent.VK_DOWN)
					textField_7.requestFocus();
				
				if(d.getKeyCode()==KeyEvent.VK_LEFT)
					textField_1.requestFocus();
			}
		});
		textField_6.setColumns(10);
		textField_6.setBounds(612, 251, 290, 30);
		contentPane.add(textField_6);
		
		lblNumeroDeTelefono = new JLabel("Numero de telefono fijo:");
		lblNumeroDeTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroDeTelefono.setFont(new Font("Segoe UI Black", Font.PLAIN, 22));
		lblNumeroDeTelefono.setBounds(583, 282, 331, 30);
		contentPane.add(lblNumeroDeTelefono);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent f) {
				if(f.getKeyCode()==KeyEvent.VK_UP)
					textField_6.requestFocus();
					
				
				if(f.getKeyCode()==KeyEvent.VK_DOWN)
					textField_8.requestFocus();
				
				if(f.getKeyCode()==KeyEvent.VK_LEFT)
					textField_2.requestFocus();
			}
		});
		textField_7.setColumns(10);
		textField_7.setBounds(612, 315, 290, 30);
		contentPane.add(textField_7);
		
		lblDireecion = new JLabel("Direccion:");
		lblDireecion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDireecion.setFont(new Font("Segoe UI Black", Font.PLAIN, 22));
		lblDireecion.setBounds(595, 346, 331, 30);
		contentPane.add(lblDireecion);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent g) {
				if(g.getKeyCode()==KeyEvent.VK_UP)
					textField_7.requestFocus();
				
				if(g.getKeyCode()==KeyEvent.VK_LEFT)
					botonAnimacion_1.requestFocus();
			}
		});
		textField_8.setColumns(10);
		textField_8.setBounds(612, 385, 290, 30);
		contentPane.add(textField_8);
		
		lblNewLabel_4 = new JLabel("*");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setFont(new Font("Segoe UI Black", Font.BOLD, 29));
		lblNewLabel_4.setBounds(12, 115, 25, 27);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setVisible(false);
		
		lblNewLabel_12 = new JLabel("*");
		lblNewLabel_12.setForeground(new Color(255, 0, 0));
		lblNewLabel_12.setFont(new Font("Segoe UI Black", Font.BOLD, 29));
		lblNewLabel_12.setBounds(12, 230, 25, 27);
		contentPane.add(lblNewLabel_12);
		lblNewLabel_12.setVisible(false);
		
		lblNewLabel_15 = new JLabel("*");
		lblNewLabel_15.setForeground(new Color(255, 0, 0));
		lblNewLabel_15.setFont(new Font("Segoe UI Black", Font.BOLD, 29));
		lblNewLabel_15.setBounds(105, 358, 25, 27);
		contentPane.add(lblNewLabel_15);
		lblNewLabel_15.setVisible(false);
		
		lblNewLabel_14 = new JLabel("*");
		lblNewLabel_14.setForeground(new Color(255, 0, 0));
		lblNewLabel_14.setFont(new Font("Segoe UI Black", Font.BOLD, 29));
		lblNewLabel_14.setBounds(627, 219, 25, 27);
		contentPane.add(lblNewLabel_14);
		lblNewLabel_14.setVisible(false);
		
		lblNewLabel_16 = new JLabel("*");
		lblNewLabel_16.setForeground(new Color(255, 0, 0));
		lblNewLabel_16.setFont(new Font("Segoe UI Black", Font.BOLD, 29));
		lblNewLabel_16.setBounds(598, 280, 25, 27);
		contentPane.add(lblNewLabel_16);
		lblNewLabel_16.setVisible(false);
		
		lblNewLabel_17 = new JLabel("*");
		lblNewLabel_17.setForeground(new Color(255, 0, 0));
		lblNewLabel_17.setFont(new Font("Segoe UI Black", Font.BOLD, 29));
		lblNewLabel_17.setBounds(11, 176, 25, 27);
		contentPane.add(lblNewLabel_17);
		lblNewLabel_17.setVisible(false);
		
		lblNewLabel_18 = new JLabel("*");
		lblNewLabel_18.setForeground(new Color(255, 0, 0));
		lblNewLabel_18.setFont(new Font("Segoe UI Black", Font.BOLD, 29));
		lblNewLabel_18.setBounds(110, 448, 25, 27);
		contentPane.add(lblNewLabel_18);
		lblNewLabel_18.setVisible(false);
		
		lblNewLabel_5 = new JLabel("Usuario");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblNewLabel_5.setBounds(303, 204, 79, 16);
		contentPane.add(lblNewLabel_5);
		lblNewLabel_5.setVisible(false);
		
		lblNewLabel_6 = new JLabel("Existente");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblNewLabel_6.setBounds(301, 218, 81, 16);
		contentPane.add(lblNewLabel_6);
		lblNewLabel_6.setVisible(false);
		
		lblNewLabel_20 = new JLabel("Correo");
		lblNewLabel_20.setForeground(Color.RED);
		lblNewLabel_20.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblNewLabel_20.setBounds(304, 263, 79, 16);
		contentPane.add(lblNewLabel_20);
		lblNewLabel_20.setVisible(false);
		
		lblNewLabel_21 = new JLabel("Existente");
		lblNewLabel_21.setForeground(Color.RED);
		lblNewLabel_21.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblNewLabel_21.setBounds(301, 277, 81, 16);
		contentPane.add(lblNewLabel_21);
		lblNewLabel_21.setVisible(false);
		
		setLocationRelativeTo(null);
		setResizable(false);
		getButtonGroup();
		
		
		
		
	}
	
	private ButtonGroup getButtonGroup() {
		if (buttonGroup == null) 
			buttonGroup = new ButtonGroup();
		buttonGroup.add(checkH);
		buttonGroup.add(checkM);
		buttonGroup.add(checkOtro);
		return buttonGroup;
	}
	
	private String obtenerSexo(){
		 String sexo = "";
		 if (checkH.isSelected()){
		 sexo = checkH.getText();
		 genero='M';
		 }
		 else if (checkM. isSelected()){
		 sexo = checkM.getText();
		 genero='F';
		 }
		 else if(checkOtro.isSelected()){
		 sexo = checkOtro.getText();
		 genero='O';
		 }
		 else
			 validar8=false;
		 return sexo;
		}
	
	 public void Salir(){
		  int respuesta= JOptionPane.showConfirmDialog(null, "Desea Salir","Inversion Max", JOptionPane.YES_NO_OPTION);
		  
		  if(respuesta==JOptionPane.YES_OPTION){
			  dispose();
		  }
		  
	  }
	 public void ColorFondo(){
			if(!blanco){
				botonAnimacion_2.setBackground(Color.BLACK);
				label.setForeground(Color.BLACK);        			        		
				blanco=true;
				label.setText("Modo oscuro:");
				contentPane.setBackground(Color.WHITE);
				lblCi.setForeground(Color.BLACK);
				lblContrase.setForeground(Color.BLACK);
				lblCorreoElectronico.setForeground(Color.BLACK);
				lblDeCelular.setForeground(Color.BLACK);
				lblDireecion.setForeground(Color.BLACK);
				lblDosPasos.setForeground(Color.BLACK);
				lblNewLabel.setForeground(Color.BLACK);
				lblNewLabel_2.setForeground(Color.BLACK);
				lblNombreCompleto.setForeground(Color.BLACK);
				lblNombreDeUsuario.setForeground(Color.BLACK);
				lblNumeroDeTelefono.setForeground(Color.BLACK);
				lblSexo.setForeground(Color.BLACK);
				lblSuContrasea.setForeground(Color.BLACK);
				lblUnaPistaPor.setForeground(Color.BLACK);
				checkH.setForeground(Color.BLACK);
				checkM.setForeground(Color.BLACK);
				checkOtro.setForeground(Color.BLACK);

			}
			else{
				botonAnimacion_2.setBackground(Color.WHITE);
				label.setForeground(Color.WHITE);	
				blanco=false;
				label.setText("Modo claro:");
				contentPane.setBackground(null);
				lblCi.setForeground(null);
				lblContrase.setForeground(null);
				lblCorreoElectronico.setForeground(null);
				lblDeCelular.setForeground(null);
				lblDireecion.setForeground(null);
				lblDosPasos.setForeground(null);
				lblNewLabel.setForeground(null);
				lblNewLabel_2.setForeground(null);
				lblNombreCompleto.setForeground(null);
				lblNombreDeUsuario.setForeground(null);
				lblNumeroDeTelefono.setForeground(null);
				lblSexo.setForeground(null);
				lblSuContrasea.setForeground(null);
				lblUnaPistaPor.setForeground(null);
				checkH.setForeground(null);
				checkM.setForeground(null);
				checkOtro.setForeground(null);
			}


		}
	 public void cuentacreada(){
		 
		 Lobby a=new Lobby();
		 dispose();
		 a.setVisible(true);
	 }
	 public void AñadirUsuario(){
		 
		Usuario a = new Usuario(textField.getText(), textField_2.getText(),textField_3.getText(), textField_8.getText(), textField_6.getText(), textField_1.getText(), genero , textField_4.getText(), textField_5.getText(), textField_7.getText());
		elmain.banco.getUsuarios().add(a);
		elmain.guardarUsuarios();
		 
		 
	 }
	 
	 public void Validacion(){
		 obtenerSexo();
		 char c;
		 int espacios=0;
		
		 for(int i=0;i< elmain.banco.getUsuarios().size();i++){
			 if(!textField.getText().equalsIgnoreCase(elmain.banco.getUsuarios().get(i).getIdU())){
				 validar7=true;
			 }
			 else{
				 validar7=false;
				 i=elmain.banco.getUsuarios().size();
				 
			 }
		 }
		 
		 if(textField.getText().equals(""))
			validar77=false;
		 else
			validar77=true;
		 
		 
		 for(int j=0;j< elmain.banco.getUsuarios().size();j++){
			 if(!textField_1.getText().equalsIgnoreCase(elmain.banco.getUsuarios().get(j).getCorreoelectronico())){
				 validar6=true;
			 }
			 else{
				 validar6=false;
				 j=elmain.banco.getUsuarios().size();
				 
			 }
		 }
		 
		 
		 
		 if(textField_7.getText().length()==8){
			 validar1=true;
			 
		 }
		 else {
			 validar1=false;
			 
			 
		 }
		 if(textField_6.getText().length()==8){
			 validar2=true;
		 }
		
		 else {
			 validar2=false;		 
		 }
		 if(textField_1.getText().contains("@gmail.com") && textField_1.getText().length()>10){
			 validar5=true;
		 }
		 else{
			 validar5=false;
			
		 }
		 
		 if(Validaciones.validarStringTodoLetra(textField_3.getText())){
			 for(int i=0;i<textField_3.getText().length();i++){
				 c=textField_3.getText().charAt(i);
				 if(c==' '){
					 espacios++;
				 }
			 }
			 if(espacios==2 || espacios==3)
				 validar3=true;
			 else{
				 validar3=false;
				
			 }
				 
		 }
		 else{
			 validar3=false;
		 }
		 if(Validaciones.validarCI(textField_4.getText(),null,null)){
			 validar4=true;
		 }
		 else{
			 validar4=false;
		 }
		 
		 if(!validar3 || !validar1 || !validar2 || !validar4 || !validar5 || !validar6 || !validar7 || !validar77 || !validar8){
			 NotificacionesModernas.getInstancia().show(Tipo.ERROR,Localizacion.INF_DER,3000,"Error a introducir los datos");
			 validacion=false;
		 }
		 else
			 validacion=true;
		 
		 Asterisco();
	 }
	 public void Asterisco(){
		        if(!validar3)
	            lblNewLabel_4.setVisible(true);
	        	if(!validar2)
	        	lblNewLabel_14.setVisible(true);
	        	if(!validar4)
	        	lblNewLabel_15.setVisible(true);
	        	if(!validar1)
	        	lblNewLabel_16.setVisible(true);
	        	if(!validar5){
	        	lblNewLabel_12.setVisible(true);
	        	}
	        	if(!validar6){
	        	lblNewLabel_20.setVisible(true);
	        	lblNewLabel_21.setVisible(true);
	        	lblNewLabel_12.setVisible(false);
	        	
	        	}
	        	if(!validar7){
	        	lblNewLabel_17.setVisible(true);
	        	lblNewLabel_5.setVisible(true);
	        	lblNewLabel_6.setVisible(true);
	        	}
	        	if(!validar77)
	        	lblNewLabel_17.setVisible(true);
	        	
	        	if(!validar8)
	        	lblNewLabel_18.setVisible(true);
	        		
	        		
		 
		 Timer timer = new Timer(10000, new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		        	if(!validar3)
		            lblNewLabel_4.setVisible(false);
		        	if(!validar2)
		        	lblNewLabel_14.setVisible(false);
		        	if(!validar4)
		        	lblNewLabel_15.setVisible(false);
		        	if(!validar1)
		        	lblNewLabel_16.setVisible(false);
		        	if(!validar5)
		        	lblNewLabel_12.setVisible(false);
		        	
		        	if(!validar6){
		        		lblNewLabel_20.setVisible(false);
			        	lblNewLabel_21.setVisible(false);
			        	lblNewLabel_12.setVisible(false);
		        	}

		        	if(!validar7){
			        lblNewLabel_17.setVisible(false);
			        lblNewLabel_5.setVisible(false);
			        lblNewLabel_6.setVisible(false);
		        	}
		        	if(!validar77)
				    lblNewLabel_17.setVisible(false);
		        	if(!validar8){
		        	lblNewLabel_18.setVisible(false);
		        	}
		        	}
		        	
		 });
		    timer.setRepeats(false);
		    timer.start();

	 }
}
