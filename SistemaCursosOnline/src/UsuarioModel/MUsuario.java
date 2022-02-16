
package UsuarioModel;

import UsuarioCodigos.UsuarioMetodos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

public class MUsuario extends JFrame implements ActionListener {
    private JLabel dni, nombre, email, telefono,formaCompra,contrasenia;
    private JButton altaUsuario, buscarUsuario;
    private JTextField textdni, textnombre, textemail, texttelefono,textformaCompra,
            textcontrasenia, textBuscarUsuario,textResultados;

    public MUsuario() {
        this.setLayout(null);

        this.setTitle("Usuario");

        dni = new JLabel("DNI");
        dni.setBounds(100, 10, 200, 30);
        add(dni);
        textdni = new JTextField();
        textdni.setBounds(140, 10, 120, 30);
        add(textdni);
        
        nombre = new JLabel("Nombre");
        nombre.setBounds(80, 40, 200, 30);
        add(nombre);
        textnombre = new JTextField();
        textnombre.setBounds(140,40, 120, 30);
        add(textnombre);
        
        email = new JLabel("Email");
        email.setBounds(80, 70, 200, 30);
        add(email);
        textemail = new JTextField();
        textemail.setBounds(140,70, 120, 30);
        add(textemail);
        
        telefono = new JLabel("Telefono");
        telefono.setBounds(70, 100, 200, 30);
        add(telefono);
        texttelefono = new JTextField();
        texttelefono.setBounds(140, 100, 120, 30);
        add(texttelefono);
        
        formaCompra = new JLabel("Forma de compra");
        formaCompra.setBounds(30, 130, 200, 30);
        add(formaCompra);
        textformaCompra = new JTextField();
        textformaCompra.setBounds(140, 130, 120, 30);
        add(textformaCompra);
        
        contrasenia = new JLabel("Contraseña");
        contrasenia.setBounds(50, 160, 200, 30);
        add(contrasenia);
        textcontrasenia = new JTextField();
        textcontrasenia.setBounds(140, 160, 120, 30);
        add(textcontrasenia);
        
        altaUsuario = new JButton("Dar de alta");
        altaUsuario.setBounds(270, 90, 100, 30);
        add(altaUsuario);
        altaUsuario.addActionListener(this);
        
        buscarUsuario = new JButton("Buscar usuario");
        buscarUsuario.setBounds(20, 200, 130, 30);
        add(buscarUsuario);
        buscarUsuario.addActionListener(this);
        textBuscarUsuario=new JTextField();
        textBuscarUsuario.setBounds(160, 200, 100, 30);
        add(textBuscarUsuario);
        
        textResultados = new JTextField();
        textResultados.setBounds(10, 240, 365, 120);
        add(textResultados);
        
        
        
/*
        adivinaPalabra = new JLabel(String.valueOf(palabraCodificada));
        adivinaPalabra.setBounds(100, 40, 190, 30);
        add(adivinaPalabra);

        letra = new JLabel("Elige letra :");
        letra.setBounds(30, 90, 150, 30);
        add(letra);

        elegirPalabra = new JLabel("Elegir la palabra :");
        elegirPalabra.setBounds(30, 130, 120, 30);
        add(elegirPalabra);

        textLetra = new JTextField();
        textLetra.setBounds(140, 90, 80, 30);
        add(textLetra);

        textPalabra = new JTextField();
        textPalabra.setBounds(140, 130, 80, 30);
        add(textPalabra);

        comprobarLetra = new JButton("Comprobar");
        comprobarLetra.setBounds(230, 90, 100, 30);
        add(comprobarLetra);
        comprobarLetra.addActionListener(this);
        
        comprobarPalabra = new JButton("Comprobar");
        comprobarPalabra.setBounds(230, 130, 100, 30);
        add(comprobarPalabra);
        comprobarPalabra.addActionListener(this);
*/
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==buscarUsuario){
           UsuarioMetodos metodos=new UsuarioMetodos();
           textResultados.setText(metodos.buscarUsuarioPorDNI(Integer
                   .valueOf(textBuscarUsuario.getText())).toString());
           
       }

       
}
}