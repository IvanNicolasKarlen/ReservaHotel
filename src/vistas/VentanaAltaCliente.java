package vistas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;
import sistemaReserva.SistemaReserva;
public class VentanaAltaCliente extends JFrame {

  private JPanel contentPane;
  private JTextField tfNombre;
  private JTextField tfApellido;
  private JTextField tfNumeroDocumento;
  private JTextField tfDireccion;
  private JTextField tfTelefono;
  private JTextField tfEmail;
  private JButton btnAceptar;
  private JButton btnNewButton;
  private JComboBox boxTipoDoc;

  /**
   * Launch the application.
   */
  
  /*
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          AltaCliente frame = new AltaCliente();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }*/

  /**
   * Create the frame.
   */
  public VentanaAltaCliente(SistemaReserva sistema) {
    setTitle("Alta Cliente");
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setBounds(100, 100, 700, 480);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel lblNombre = new JLabel("Nombre:");
    lblNombre.setBounds(200, 93, 130, 14);
    contentPane.add(lblNombre);
    
    tfNombre = new JTextField();
    tfNombre.setBounds(337, 90, 150, 20);
    contentPane.add(tfNombre);
    tfNombre.setColumns(10);
    
    JLabel lblApellido = new JLabel("Apellido:");
    lblApellido.setBounds(200, 118, 130, 14);
    contentPane.add(lblApellido);
    
    tfApellido = new JTextField();
    tfApellido.setBounds(337, 115, 150, 20);
    contentPane.add(tfApellido);
    tfApellido.setColumns(10);
    
    JLabel lblTipoDoc = new JLabel("Tipo de Documento:");
    lblTipoDoc.setBounds(200, 143, 130, 14);
    contentPane.add(lblTipoDoc);
    
    boxTipoDoc = new JComboBox();
    boxTipoDoc.setModel(new DefaultComboBoxModel(new String[] {"TipoDoc"}));
    boxTipoDoc.setBounds(337, 140, 150, 20);
    contentPane.add(boxTipoDoc);
    
    JLabel lblNumeroDocumento = new JLabel("Numero de Documento");
    lblNumeroDocumento.setBounds(200, 168, 130, 14);
    contentPane.add(lblNumeroDocumento);
    
    tfNumeroDocumento = new JTextField();
    tfNumeroDocumento.setBounds(337, 165, 150, 20);
    contentPane.add(tfNumeroDocumento);
    tfNumeroDocumento.setColumns(10);
    
    JLabel lblDireccion = new JLabel("Direccion:");
    lblDireccion.setBounds(200, 193, 130, 14);
    contentPane.add(lblDireccion);
    
    tfDireccion = new JTextField();
    tfDireccion.setBounds(337, 190, 150, 20);
    contentPane.add(tfDireccion);
    tfDireccion.setColumns(10);
    
    JLabel lblTelefono = new JLabel("Telefono:");
    lblTelefono.setBounds(200, 218, 130, 14);
    contentPane.add(lblTelefono);
    
    tfTelefono = new JTextField();
    tfTelefono.setBounds(337, 215, 150, 20);
    contentPane.add(tfTelefono);
    tfTelefono.setColumns(10);
    
    JLabel lblEmail = new JLabel("Email:");
    lblEmail.setBounds(200, 243, 130, 14);
    contentPane.add(lblEmail);
    
    tfEmail = new JTextField();
    tfEmail.setBounds(337, 240, 150, 20);
    contentPane.add(tfEmail);
    tfEmail.setColumns(10);
    
    btnAceptar = new JButton("Aceptar");
    btnAceptar.addActionListener(new ActionListener() {
      
      public void actionPerformed(ActionEvent e) {
        
        String nombre = tfNombre.getText();
        String apellido = tfApellido.getText();
        String tipodoc = (String)boxTipoDoc.getSelectedItem();
        String documento = tfNumeroDocumento.getText();
        String direccion = tfDireccion.getText();
        String telefono = tfTelefono.getText();
        String email = tfEmail.getText();
        
        
        if (nombre.equals("") || apellido.equals("") || documento.equals("") || direccion.equals("") || telefono.equals("") || email.equals(""))
        {
          JOptionPane.showMessageDialog(contentPane, "Faltan ingresar datos.");
        }
        
        
        
      }
    });
    btnAceptar.setBounds(200, 296, 89, 23);
    contentPane.add(btnAceptar);
    
    btnNewButton = new JButton("Cancelar");
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        dispose();
      }
    });
    btnNewButton.setBounds(398, 296, 89, 23);
    contentPane.add(btnNewButton);
  }
}