package interfaz;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Inicio.elmain;

import com.formdev.flatlaf.FlatDarculaLaf;

import componentesVisuales.PanelAnimacionCurvas;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JTextField;

import componentesVisuales.BotonAnimacion;
import componentesVisuales.AvatarCircular;

import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CuentaPerdida extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblVolverAlLobby;
	private boolean blanco=false;
	private JLabel label;
	private BotonAnimacion botonAnimacion_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JLabel lblOSuCorreo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		FlatDarculaLaf.setup();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CuentaPerdida frame = new CuentaPerdida();
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
	public CuentaPerdida() {
		setTitle("Recuperar cuenta");
		setIconImage(Toolkit.getDefaultToolkit().getImage(CuentaPerdida.class.getResource("/iconos/1486564400-account_81513 (3).png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 724);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PanelAnimacionCurvas panelAnimacionCurvas = new PanelAnimacionCurvas((Color) null, (Color) null, (Color) null, (Color) null);
		panelAnimacionCurvas.setInicioGradiente(Color.GREEN);
		panelAnimacionCurvas.setForeground(Color.GREEN);
		panelAnimacionCurvas.setFinGradiente(Color.BLACK);
		panelAnimacionCurvas.setColorInicioAnimacion(new Color(0, 250, 154));
		panelAnimacionCurvas.setColorFinalAnimacion(Color.GREEN);
		panelAnimacionCurvas.setBounds(0, 0, 638, 37);
		contentPane.add(panelAnimacionCurvas);
		
		PanelAnimacionCurvas panelAnimacionCurvas_1 = new PanelAnimacionCurvas((Color) null, (Color) null, (Color) null, (Color) null);
		panelAnimacionCurvas_1.setInicioGradiente(Color.GREEN);
		panelAnimacionCurvas_1.setForeground(Color.GREEN);
		panelAnimacionCurvas_1.setFinGradiente(Color.BLACK);
		panelAnimacionCurvas_1.setColorInicioAnimacion(Color.GREEN);
		panelAnimacionCurvas_1.setColorFinalAnimacion(Color.GREEN);
		panelAnimacionCurvas_1.setBackground(Color.GREEN);
		panelAnimacionCurvas_1.setBounds(0, 640, 638, 37);
		contentPane.add(panelAnimacionCurvas_1);
		
		lblNewLabel = new JLabel("Ha olvidado su contrase\u00F1a?");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(108, 39, 326, 124);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Escriba su nombre de usuario ");
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblNewLabel_1.setBounds(124, 261, 310, 45);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setText("Escriba aqui...");
		textField.setColumns(10);
		textField.setBounds(124, 319, 290, 30);
		contentPane.add(textField);
		
		BotonAnimacion botonAnimacion = new BotonAnimacion();
		botonAnimacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VerificarExistencia();
			}
		});
		botonAnimacion.setText("Aceptar");
		botonAnimacion.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		botonAnimacion.setColorEfecto(Color.GREEN);
		botonAnimacion.setBackground(new Color(0, 128, 0));
		botonAnimacion.setBounds(124, 441, 290, 67);
		contentPane.add(botonAnimacion);
		
		BotonAnimacion botonAnimacion_2 = new BotonAnimacion();
		botonAnimacion_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Salir();
			}
		});
		botonAnimacion_2.setText("Salir");
		botonAnimacion_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		botonAnimacion_2.setColorEfecto(Color.RED);
		botonAnimacion_2.setBorder(new EmptyBorder(40,40,40,40));
		botonAnimacion_2.setBackground(new Color(255, 69, 0));
		botonAnimacion_2.setBounds(124, 540, 290, 57);
		contentPane.add(botonAnimacion_2);
		
		lblNewLabel_2 = new JLabel("Recuperar cuenta...");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_2.setBounds(124, 393, 290, 35);
		contentPane.add(lblNewLabel_2);
		
		AvatarCircular avatarCircular = new AvatarCircular();
		avatarCircular.setAvatar(new ImageIcon("D:\\Proyectos\\Java\\tarea-final\\iconos\\business_man_usersearch_thesearch_theclient_2356 (3).png"));
		avatarCircular.setBounds(118, 142, 296, 124);
		contentPane.add(avatarCircular);
		
		lblVolverAlLobby = new JLabel("Volver al lobby?");
		lblVolverAlLobby.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				VolverLobby();
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblVolverAlLobby.setForeground(Color.BLUE);
			}
			public void mouseExited(MouseEvent arg0) {
				if(!blanco)
				lblVolverAlLobby.setForeground(null);
				else
					lblVolverAlLobby.setForeground(Color.BLACK);
        	}
		});
		
		
		lblVolverAlLobby.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblVolverAlLobby.setBounds(124, 352, 116, 16);
		contentPane.add(lblVolverAlLobby);
		
		lblOSuCorreo = new JLabel("o su correo electronico:");
		lblOSuCorreo.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblOSuCorreo.setBounds(126, 279, 288, 45);
		contentPane.add(lblOSuCorreo);
		
		label = new JLabel("Modo claro:");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(446, 50, 95, 16);
		contentPane.add(label);
		
		botonAnimacion_1 = new BotonAnimacion();
		botonAnimacion_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ColorFondo();
			}
		});
		botonAnimacion_1.setForeground(Color.WHITE);
		botonAnimacion_1.setBounds(471, 79, 40, 40);
		contentPane.add(botonAnimacion_1);
		avatarCircular.setVisible(true);
		
		setLocationRelativeTo(null);
		setResizable(false);
	}
	public void VolverLobby(){
		Lobby c = new Lobby();
		dispose();
		c.setVisible(true);
	}
	 public void Salir(){
		  int respuesta= JOptionPane.showConfirmDialog(null, "Desea Salir","Inversion Max", JOptionPane.YES_NO_OPTION);
		  
		  if(respuesta==JOptionPane.YES_OPTION){
			  dispose();
		  }
		  
	  }
	 public void ColorFondo(){
			if(!blanco){
				botonAnimacion_1.setBackground(Color.BLACK);
				label.setForeground(Color.BLACK);        			        		
				blanco=true;
				label.setText("Modo oscuro:");
				contentPane.setBackground(Color.WHITE);
				lblNewLabel_1.setForeground(Color.BLACK);
				lblNewLabel.setForeground(Color.BLACK);
				lblNewLabel_1.setForeground(Color.BLACK);
				lblOSuCorreo.setForeground(Color.BLACK);
				lblNewLabel_2.setForeground(Color.BLACK);
				lblVolverAlLobby.setForeground(Color.BLACK);

			}
			else{
				botonAnimacion_1.setBackground(Color.WHITE);
				label.setForeground(Color.WHITE);	
				blanco=false;
				label.setText("Modo claro:");
				contentPane.setBackground(null);
				lblNewLabel_1.setForeground(null);
				lblNewLabel.setForeground(null);
				lblNewLabel_1.setForeground(null);
				lblOSuCorreo.setForeground(null);
				lblNewLabel_2.setForeground(null);
				lblVolverAlLobby.setForeground(null);
			}


		}
	 public void VerificarExistencia(){	
		 boolean valido=false;
		 for(int i=0;i<elmain.banco.getUsuarios().size();i++){
	     if(elmain.banco.getUsuarios().get(i).getCorreoelectronico().equals(textField.getText()) || elmain.banco.getUsuarios().get(i).getIdU().equals(textField.getText())){
				valido=true; 
			 }
	     if(valido)
	     JOptionPane.showMessageDialog(contentPane,"Tu pista es:" + elmain.banco.getUsuarios().get(i).getDosPasos());
		 }
	 }
}

