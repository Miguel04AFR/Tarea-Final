package interfaz;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Dialog.ModalityType;
import java.awt.Frame;

import LogicaClases.*;
import interfaz.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import componentesVisuales.BotonAnimacion;
import componentesVisuales.NotificacionesModernas;
import componentesVisuales.NotificacionesModernas.Tipo;

import java.awt.Color;
import java.awt.Font;

import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTable;
import javax.swing.JToggleButton;

import java.awt.Canvas;

import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import logica.utilidades.logica.Validaciones;
import componentes.JHora;
import componentes.JFecha;

public class Cajero extends JDialog {
	private JPanel panel;
	private BotonAnimacion btnmcnExtraer;
	private BotonAnimacion btnmcnSalir;
	private JTable table;
	private DefaultTableModel tablaCajero=new DefaultTableModel();
	private DefaultTableModel tablaUsuario;
	private DefaultTableModel ultiTabla;
	private DefaultTableCellRenderer cellRenderer;//para darle bordes a las columnas de las tabla
	private JTextField textField;
	private JLabel lblMontoAExtraer;
	private JLabel lblAgencia;
	private int monto=0;//el monto a extraer
	private Agencia agenciaE;
	private int caj=0;//el cajero usado
	private int cambioPos=0;//la posicion de la cuenta elegida
	private Usuario usuarioC;
	private JHora hora;
	private JFecha fecha;


	/**
	 * Create the dialog.
	 */
	public Cajero(DefaultTableModel miTabla,Agencia agencia,Usuario usuario,DefaultTableModel ultiOpeTabla,int cajero) {

		getRootPane().setBorder(new LineBorder(Color.BLACK, 3));//poner bordes al Jdialog

		setResizable(false);//para que no sea responsiva
		setUndecorated(true);//esto es lo de quitar la cruz de cerrar
		setLocation(40, 50);
		setModalityType(ModalityType.APPLICATION_MODAL);//esto es lo que hace que solo puedas interactuar con esta ventana
		setBounds(100, 100, 657, 388);
		getContentPane().setLayout(null);
		
		ultiTabla=ultiOpeTabla;
		usuarioC=usuario;
		caj=cajero;
		agenciaE=agencia;
		tablaUsuario=miTabla;

		tablaCajero=new DefaultTableModel(){
			public boolean isCellEditable(int row, int column) {
				return false; // Todas las celdas no son editables
			}

		};

		cellRenderer=new DefaultTableCellRenderer(){
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
				Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
				((JComponent) c).setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, new Color(192, 192, 192)));//BorderFactory es para personalizar los bordes de las columnas
				return c;
			}
		};

		{
			panel = new JPanel();
			panel.setBounds(0, 334, 656, 54);
			panel.setLayout(null);
			getContentPane().add(panel);
			{
				btnmcnExtraer = new BotonAnimacion();
				btnmcnExtraer.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if (table.getSelectedRow()!= -1){
						if(Validar()){
							if(Sepuede()){
								if(SaldoSuficiente()){
									if(agenciaE.getCajeros().get(caj).Extraer(monto)){
										float saldo=Float.parseFloat(tablaCajero.getValueAt(cambioPos, 1).toString());
										tablaUsuario.setValueAt(saldo-monto, cambioPos, 1);
										if(usuarioC.getCuentas().get(cambioPos) instanceof Corriente)
											((Corriente)usuarioC.getCuentas().get(cambioPos)).setCup(saldo-monto);
										else if(usuarioC.getCuentas().get(cambioPos) instanceof Fondo){
											if(Menu.extraerFondo<4){
											((Fondo)usuarioC.getCuentas().get(cambioPos)).setCup(saldo-monto);
											Menu.extraerFondo++;
											}
										}
										else if(usuarioC.getCuentas().get(cambioPos) instanceof PlazoFijo)
											((PlazoFijo)usuarioC.getCuentas().get(cambioPos)).setCup(saldo-monto);
										else if(usuarioC.getCuentas().get(cambioPos) instanceof Ahorro)
											((Ahorro)usuarioC.getCuentas().get(cambioPos)).setCup(saldo-monto);
										if(usuarioC.getCuentas().get(cambioPos) instanceof Fondo){
										if(Menu.extraerFondo<4){
										ultiTabla.addRow(new Object[]{"Extraccion por cajero",tablaCajero.getValueAt(cambioPos,0).toString(),monto,hora.getText(),fecha.getText()});
										tablaCajero.setValueAt(saldo-monto, cambioPos, 1);
										textField.setText("");
										table.clearSelection();
										JOptionPane.showMessageDialog(null, "La extraccion ha sido un exito");
										}
										else
											JOptionPane.showMessageDialog(null, "Ya no puede extraer mas en la cuenta de fondo hasta el proximo año");
									}
										else{
											ultiTabla.addRow(new Object[]{"Extraccion por cajero",tablaCajero.getValueAt(cambioPos,0).toString(),monto,hora.getText(),fecha.getText()});
											tablaCajero.setValueAt(saldo-monto, cambioPos, 1);
											textField.setText("");
											table.clearSelection();
											JOptionPane.showMessageDialog(null, "La extraccion a sido un exito");
										}
									}
									else
										JOptionPane.showMessageDialog(null, "Ahora mismo no contamos con billetes para el monto requerido,vuelva mas tarde o pida otro monto");
								}
								else
									JOptionPane.showMessageDialog(null, "Su saldo es inferior al monto que desea extraer");
							}
							else
								JOptionPane.showMessageDialog(null, "El cajero no tiene suficiente dinero,vuelva mas tarde");
						}
						else
							JOptionPane.showMessageDialog(null, "No existen billetes de kilos");
					}
						else
							JOptionPane.showMessageDialog(null, "Por favor,elija una cuenta en la tabla");
					}
				});
				btnmcnExtraer.setText("Extraer");
				btnmcnExtraer.setForeground(Color.BLACK);
				btnmcnExtraer.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
				btnmcnExtraer.setColorEfecto(Color.GREEN);
				btnmcnExtraer.setBorder(new CompoundBorder(null, new LineBorder(new Color(25, 25, 112), 6)));
				btnmcnExtraer.setBackground(new Color(25, 25, 112));
				btnmcnExtraer.setBounds(49, 6, 197, 40);
				panel.add(btnmcnExtraer);
			}
			{
				btnmcnSalir = new BotonAnimacion();
				btnmcnSalir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						textField.setText("");
						table.clearSelection();
						dispose();
					}
				});
				btnmcnSalir.setText("Salir");
				btnmcnSalir.setForeground(Color.BLACK);
				btnmcnSalir.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
				btnmcnSalir.setColorEfecto(Color.GREEN);
				btnmcnSalir.setBorder(new CompoundBorder(null, new LineBorder(new Color(25, 25, 112), 6)));
				btnmcnSalir.setBackground(new Color(25, 25, 112));
				btnmcnSalir.setBounds(400, 6, 197, 40);
				panel.add(btnmcnSalir);
			}
		}

		tablaCajero.addColumn("Cuenta");
		tablaCajero.addColumn("Saldo");
		tablaCajero.addColumn("Moneda");
		tablaCajero.addColumn("#Cuenta");


		table = new JTable(tablaCajero);
		table.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		table.setBounds(1, 215, 631, 0);
		getContentPane().add(table);
		table.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		table.setFillsViewportHeight(true);

		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {

				if (table.getSelectedRow()!= -1) {
					String moneda = tablaCajero.getValueAt(table.getSelectedRow(), 2).toString();
					if (moneda.equalsIgnoreCase("mlc")) {
						table.clearSelection(); //si su moneda es mlc no se puede extraer
					}
					else{
						cambioPos=table.getSelectedRow();
					}
				}
			}
		});

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 55, 635, 190);
		getContentPane().add(scrollPane);

		JLabel lblElijaCuentaA = new JLabel("Elija cuenta a extraer:");
		lblElijaCuentaA.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblElijaCuentaA.setBounds(14, 13, 206, 43);
		getContentPane().add(lblElijaCuentaA);

		JLabel lbllasDeMoneda = new JLabel("(Las de moneda mlc no se les puede extraer)");
		lbllasDeMoneda.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lbllasDeMoneda.setBounds(220, 13, 425, 43);
		getContentPane().add(lbllasDeMoneda);

		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(textField.getText().length()>5){
					e.consume();
				}
			}
		});
		textField.setBounds(177, 264, 138, 38);
		getContentPane().add(textField);
		textField.setColumns(10);

		lblMontoAExtraer = new JLabel("Monto a extraer:");
		lblMontoAExtraer.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblMontoAExtraer.setBounds(14, 258, 206, 43);
		getContentPane().add(lblMontoAExtraer);

		lblAgencia = new JLabel("Agencia:" + agencia.getIdAgencia());
		lblAgencia.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblAgencia.setBounds(1, 313, 315, 27);
		getContentPane().add(lblAgencia);
		
		hora = new JHora(0);
		hora.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		hora.setBounds(560, 315, 96, 16);
		getContentPane().add(hora);
		
		fecha = new JFecha();
		fecha.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		fecha.setBounds(560, 295, 93, 16);
		getContentPane().add(fecha);
		AñadirTabla();


		setLocationRelativeTo(null); // //esto es lo que hace que se centre

	}


	public void AñadirTabla(){

		for(int i=0;i<tablaUsuario.getRowCount();i++){
			tablaCajero.addRow(new Object[]{tablaUsuario.getValueAt(i, 0),tablaUsuario.getValueAt(i, 1),tablaUsuario.getValueAt(i, 2),tablaUsuario.getValueAt(i, 10)});

		}
		for (int i = 0; i < table.getColumnCount(); i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);//para aplicar los bordes
		}

	}
	public boolean Validar(){
		return Validaciones.validarStringTodoDigito(textField.getText())==true ? true : false;
	}
	public boolean Sepuede(){
		monto=Integer.parseInt(textField.getText());
		return monto>agenciaE.getCajeros().get(caj).TotalBilletes() ? false : true; 

	}
	public boolean SaldoSuficiente(){
		return monto<=Float.parseFloat(tablaCajero.getValueAt(cambioPos, 1).toString()) ? true : false;
	}
	
}
