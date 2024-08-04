package interfaz;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.RenderingHints.Key;
import javax.sound.sampled.*;//hace sonidos
import LogicaClases.Banco;
import LogicaClases.Usuario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Inicio.elmain;
import componentesVisuales.BotonAnimacion;
import componentesVisuales.NotificacionesModernas.Localizacion;
import componentesVisuales.NotificacionesModernas.Tipo;
import componentesVisuales.PanelGradiente;

import javax.swing.ButtonGroup;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.extras.components.FlatSpinner;

import componentesVisuales.NotificacionesModernas;

import com.formdev.flatlaf.extras.components.FlatButton;
import com.github.weisj.jsvg.nodes.text.TextPath;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.peer.TextFieldPeer;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import componentesVisuales.AvatarCircular;

import javax.swing.ImageIcon;

import raven.swing.AvatarIcon;

import javax.swing.Icon;

import java.awt.Toolkit;

import componentesVisuales.PanelAnimacionCurvas;
import raven.popup.GlassPanePopup;
import raven.popup.GlassPopup;
import raven.popup.component.GlassPaneChild;
import raven.popup.Option;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.CardLayout;

import javax.swing.JLayeredPane;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.BoxLayout;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;



public class Lobby extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField txtEscribaAqui;
	private JPasswordField passwordField_1;
	private boolean blanco=false;
	/**
	 * @wbp.nonvisual location=753,134
	 */
	private final NotificacionesModernas notificacionesModernas = new NotificacionesModernas();
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblInversionMax;
	private BotonAnimacion botonAnimacion;
	private JLabel lblModoClaro;
	private JLabel lblNewLabel_1;
	private JLabel lblContra;
	private boolean visto=false;
	public static int pos=-1;
	private JPanel panel;
	private BotonAnimacion btnmcnAx;
	private BotonAnimacion btnmcnSdf;
	
	/**
	 * @wbp.nonvisual location=690,274
	 */

	
	/**
	 * @wbp.nonvisual location=283,64
	 */
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		FlatDarculaLaf.setup();
		
		EventQueue.invokeLater(new Runnable() {
			
			
			public void run() {
				try {
					Lobby frame = new Lobby();
					
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
	public Lobby() {
		
		setTitle("Lobby");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Lobby.class.getResource("/iconos/iconfinder-481-university-bank-campus-court-4212926_114964.png")));
		
		getContentPane().setLayout(null);
		
		BotonAnimacion btnmcnAceptar = new BotonAnimacion();
		btnmcnAceptar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnmcnAceptar.setText("Aceptar");
		btnmcnAceptar.setBounds(144, 296, 173, 50);
		getContentPane().add(btnmcnAceptar);
		
		
		JLabel lblNewLabel = new JLabel("Introduzac su usuario");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(128, 74, 201, 40);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(128, 113, 201, 27);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblIntroduzacSuContra = new JLabel("Introduzac su contra");
		lblIntroduzacSuContra.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntroduzacSuContra.setBounds(128, 139, 201, 40);
		getContentPane().add(lblIntroduzacSuContra);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(128, 181, 201, 27);
		getContentPane().add(passwordField);
		getContentPane().setLayout(null);
		
		BotonAnimacion btnmcnPrecioneAqui = new BotonAnimacion();
		btnmcnPrecioneAqui.setText("precione aqui");
		btnmcnPrecioneAqui.setBackground(Color.GRAY);
		btnmcnPrecioneAqui.setBounds(131, 143, 144, 49);
		getContentPane().add(btnmcnPrecioneAqui);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 724);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		setContentPane(contentPane);
		
		btnmcnAx = new BotonAnimacion();
		btnmcnAx.setForeground(new Color(0, 0, 0));
		btnmcnAx.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				btnmcnAx.setForeground(new Color(0, 0, 128));
			}
			
			@Override
			public void focusLost(FocusEvent arg0) {
				btnmcnAx.setForeground(new Color(0, 0, 0));
			}
		});
		btnmcnAx.addMouseListener(new MouseAdapter() {

		});
		btnmcnAx.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent v) {
				if(v.getKeyCode()==KeyEvent.VK_DOWN)
					btnmcnSdf.requestFocus();
				if(v.getKeyCode()==KeyEvent.VK_UP)
					passwordField_1.requestFocus();
			}

		});
		btnmcnAx.setColorEfecto(new Color(0, 255, 0));
		btnmcnAx.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnmcnAx.setBackground(new Color(0, 128, 0));
		btnmcnAx.setBounds(151, 482, 290, 67);
		btnmcnAx.setText("Aceptar");
		btnmcnAx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				iniciarSesion();
				
				
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnmcnAx);
		
		
		
		txtEscribaAqui = new JTextField();
		txtEscribaAqui.addKeyListener(new KeyAdapter() {
			@Override
			
			public void keyPressed(KeyEvent a) {
				if(a.getKeyCode() == KeyEvent.VK_DOWN)
				passwordField_1.requestFocus();
			}
		});
		txtEscribaAqui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		txtEscribaAqui.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtEscribaAqui.getText().equals("Escriba aquí...")) {
					txtEscribaAqui.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtEscribaAqui.getText().isEmpty()) {
                	txtEscribaAqui.setText("Escriba aquí...");
                }
            }
        });
		txtEscribaAqui.setText("Escriba aqu\u00ED...");
		txtEscribaAqui.setBounds(151, 300, 290, 30);
		contentPane.add(txtEscribaAqui);
		txtEscribaAqui.setColumns(10);
		
		
		lblNewLabel_1 = new JLabel("Usuario o correo electronico:");
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(127, 257, 331, 30);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1);
		
		lblContra = new JLabel("Contrase\u00F1a:");
		lblContra.setHorizontalAlignment(SwingConstants.CENTER);
		lblContra.setFont(new Font("Segoe UI Black", Font.PLAIN, 23));
		lblContra.setBounds(127, 343, 314, 30);
		contentPane.add(lblContra);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent x) {
				if(x.getKeyCode()== KeyEvent.VK_UP)
					txtEscribaAqui.requestFocus();
				if(x.getKeyCode()== KeyEvent.VK_DOWN)
					btnmcnAx.requestFocus();
			}
		});
		passwordField_1.setBounds(151, 386, 290, 30);
		contentPane.add(passwordField_1);
		
	     AvatarCircular avatarCircular = new AvatarCircular();
	        avatarCircular.setAvatar(new ImageIcon("D:\\Proyectos\\Java\\tarea-final\\iconos\\1486564400-account_81513 (3).png"));
	        avatarCircular.setBounds(212, 128, 153, 131); //sino te sale la imagen es por que uno de los ejes esta negativo
	        contentPane.add(avatarCircular);
	        
	        PanelAnimacionCurvas panelAnimacionCurvas = new PanelAnimacionCurvas((Color) null, (Color) null, (Color) null, (Color) null);
	        panelAnimacionCurvas.setInicioGradiente(new Color(0, 255, 0));
	        panelAnimacionCurvas.setForeground(new Color(0, 255, 0));
	        panelAnimacionCurvas.setColorInicioAnimacion(new Color(0, 250, 154));
	        panelAnimacionCurvas.setColorFinalAnimacion(new Color(0, 255, 0));
	        panelAnimacionCurvas.setFinGradiente(new Color(0, 0, 0));
	        panelAnimacionCurvas.setBounds(0, 0, 638, 37);
	        contentPane.add(panelAnimacionCurvas);
	        
	        PanelAnimacionCurvas panelAnimacionCurvas_1 = new PanelAnimacionCurvas((Color) null, (Color) null, (Color) null, (Color) null);
	        panelAnimacionCurvas_1.setForeground(new Color(0, 255, 0));
	        panelAnimacionCurvas_1.setInicioGradiente(new Color(0, 255, 0));
	        panelAnimacionCurvas_1.setColorInicioAnimacion(new Color(0, 255, 0));
	        panelAnimacionCurvas_1.setColorFinalAnimacion(new Color(0, 255, 0));
	        panelAnimacionCurvas_1.setBackground(new Color(0, 255, 0));
	        panelAnimacionCurvas_1.setFinGradiente(new Color(0, 0, 0));
	        panelAnimacionCurvas_1.setBounds(0, 652, 638, 37);
	        contentPane.add(panelAnimacionCurvas_1);
	        
	        btnmcnSdf = new BotonAnimacion();
	        btnmcnSdf.addFocusListener(new FocusAdapter() {
	        	@Override
	        	public void focusGained(FocusEvent arg0) {
	        		btnmcnSdf.setForeground(new Color(0, 0, 128));
	        	}
	        	@Override
	        	public void focusLost(FocusEvent arg0) {
	        		btnmcnSdf.setForeground(new Color(0, 0, 0));
	        	}
	        });
	        btnmcnSdf.addKeyListener(new KeyAdapter() {
	        	@Override
	        	public void keyPressed(KeyEvent h) {
	        		if(h.getKeyCode()==KeyEvent.VK_UP)
	        			btnmcnAx.requestFocus();
	        	}
	        });
	        btnmcnSdf.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
	        btnmcnSdf.setBackground(new Color(255, 0, 0));
	        btnmcnSdf.setColorEfecto(new Color(128, 0, 0));
	        btnmcnSdf.setForeground(new Color(0, 0, 0));
	        btnmcnSdf.setText("Salir");
	        btnmcnSdf.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent arg0) {
	        		Salir();
	        		
	        	}
	        });
	        btnmcnSdf.setBounds(151, 562, 290, 67);
	        contentPane.add(btnmcnSdf);
	        btnmcnSdf.setBorder(new EmptyBorder(40,40,40,40));
	        
	        lblInversionMax = new JLabel("");
	        lblInversionMax.setIcon(new ImageIcon("D:\\Proyectos\\Java\\tarea-final\\iconos\\inversion-max-high-resolution-logo-transparent.png"));
	        lblInversionMax.setHorizontalAlignment(SwingConstants.CENTER);
	        lblInversionMax.setFont(new Font("Segoe UI Black", Font.PLAIN, 23));
	        lblInversionMax.setBounds(55, 50, 466, 80);
	        contentPane.add(lblInversionMax);
	        
	        lblNewLabel_4 = new JLabel("Ha olvidado su contrase\u00F1a?.");
	        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        lblNewLabel_4.addMouseListener(new MouseAdapter() {
	        	@Override
	        	public void mouseEntered(MouseEvent arg0) {
	        		lblNewLabel_4.setForeground(Color.BLUE);
	        	}

	        	public void mouseExited(MouseEvent arg0) {
	        		if(!blanco){
	        	    lblNewLabel_4.setForeground(null);
	        		}
	        		else{	
	        			lblNewLabel_4.setForeground(Color.BLACK);
	        		}
	        	    
	        	}
	        	

	        	@Override
	        	public void mousePressed(MouseEvent arg0) {
	        		Perdida();
	        	}
	        });
	        lblNewLabel_4.setBounds(151, 413, 184, 16);
	        contentPane.add(lblNewLabel_4);
	        
	        lblNewLabel_5 = new JLabel("Crear cuenta?");
	        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        lblNewLabel_5.addMouseListener(new MouseAdapter() {
	        	public void mouseEntered(MouseEvent arg0) {
	        		lblNewLabel_5.setForeground(Color.BLUE);
	        	}
	        	public void mousePressed(MouseEvent arg0) {
	        		lblNewLabel_5.setForeground(Color.getHSBColor(240/360f, 1f, 0.545f));

	        	}
	        	
	        	public void mouseExited(MouseEvent arg0) {
	        		if(!blanco)
	        	    lblNewLabel_5.setForeground(null);
	        		else
	        			lblNewLabel_5.setForeground(Color.BLACK);
	        	}

	        	public void mouseClicked(MouseEvent arg0) {	        		
	        		Nueva();
	        		
	        	}
	        	
	        });
	        
	        lblNewLabel_5.setBounds(334, 413, 95, 16);
	        contentPane.add(lblNewLabel_5);
	        
	        lblModoClaro = new JLabel("Modo claro:");
	        lblModoClaro.setForeground(Color.WHITE);
	        lblModoClaro.setFont(new Font("Tahoma", Font.BOLD, 13));
	        lblModoClaro.setBounds(490, 60, 95, 16);
	        contentPane.add(lblModoClaro);

	        setVisible(true);
	        setLocationRelativeTo(null);
	        setResizable(false);
	        NotificacionesModernas.getInstancia().setJFrame(this);
	        
	        botonAnimacion = new BotonAnimacion();
	        botonAnimacion.setActionCommand("Modo Claro");
	        botonAnimacion.setForeground(Color.WHITE);
	        botonAnimacion.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent arg0) {
	        		ColorFondo();
	        	}
	        	
	        });
	        botonAnimacion.setBounds(511, 90, 40, 40);
	        contentPane.add(botonAnimacion);
	        
	        AvatarCircular avatarCircular_1 = new AvatarCircular();
	        avatarCircular_1.setBounds(484, 416, -33, -29);
	        contentPane.add(avatarCircular_1);
	        
	        BotonAnimacion botonAnimacion_1 = new BotonAnimacion();
	        botonAnimacion_1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent arg0) {
	        		if(!visto){
	        		passwordField_1.setEchoChar((char)0);
	        		visto=true;
	        	}
	        		else{
	        			passwordField_1.setEchoChar('*');
	        			visto=false;
	        		}
	        		
	        	}
	        });
	        botonAnimacion_1.setForeground(null);
	        botonAnimacion_1.setBackground(null);
	        
	        botonAnimacion_1.setIcon(new ImageIcon(Lobby.class.getResource("/iconos/eye_low_vision_icon_199248.png")));
	        botonAnimacion_1.setBounds(441, 386, 39, 30);
	        contentPane.add(botonAnimacion_1);
	        
	        
	        
	        
	        

	}

	public boolean iniciarSesion(){
		boolean valido = true;

		String username = txtEscribaAqui.getText();
		String password = passwordField_1.getText();

		if(usuarioValido(username,password)!=-1){
			pos=usuarioValido(username,password);
			Menu elmenu = new Menu();
			elmenu.setVisible(true);
			dispose();
			NotificacionesModernas.getInstancia().show(Tipo.INFO,Localizacion.SUP_DER,3000,"Se ha autenticado correctamente en la plataforma");
		}
		else{
			
			NotificacionesModernas.getInstancia().show(Tipo.ERROR,Localizacion.SUP_DER,3000,"Usuario o contraseña incorrecta");
		}

		return valido;
	}

	private int usuarioValido(String username, String password){
		int valido = -1;
		for(int i=0;i<elmain.banco.getUsuarios().size();i++){
		if((username.equalsIgnoreCase(elmain.banco.getUsuarios().get(i).getIdU()) || username.equalsIgnoreCase(elmain.banco.getUsuarios().get(i).getCorreoelectronico())) && password.equalsIgnoreCase(elmain.banco.getUsuarios().get(i).getContraseña())){
			valido = i;
		}
		}
		return valido;
	}
	public void Salir(){
		int respuesta= JOptionPane.showConfirmDialog(null, "Desea Salir","Inversion Max", JOptionPane.YES_NO_OPTION);

		if(respuesta==JOptionPane.YES_OPTION){
			dispose();
		}

	}

	public void Nueva(){
		NuevaCuenta a =new NuevaCuenta();
		dispose();
		a.setVisible(true);
	}
	public void Perdida(){
		CuentaPerdida b =new CuentaPerdida();
		dispose();
		b.setVisible(true);
	}
	public void ColorFondo(){
		if(!blanco){
			botonAnimacion.setBackground(Color.BLACK);
			lblModoClaro.setForeground(Color.BLACK);        			        		
			blanco=true;
			lblModoClaro.setText("Modo oscuro:");
			contentPane.setBackground(Color.WHITE);
			lblNewLabel_1.setForeground(Color.BLACK);
			lblContra.setForeground(Color.BLACK);
			lblNewLabel_4.setForeground(Color.BLACK);
			lblNewLabel_5.setForeground(Color.BLACK);
			

		}
		else{
			botonAnimacion.setBackground(Color.WHITE);
			lblModoClaro.setForeground(Color.WHITE);	
			blanco=false;
			lblModoClaro.setText("Modo claro:");
			contentPane.setBackground(null);
			lblNewLabel_1.setForeground(null);
			lblContra.setForeground(null);
			lblNewLabel_4.setForeground(null);
			lblNewLabel_5.setForeground(null);
		}


	}
}