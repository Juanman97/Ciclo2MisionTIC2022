/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author JuanManuel
 */
public class myFrame extends JFrame implements ActionListener {

    String texto_en_pantalla = "";//14 espacios
    //String texto_en_pantalla = "00000000000000";//14 espacios
    JPanel panel1;
    JPanel panel2;
    JLabel pantalla;

    JButton bot1;
    JButton bot2;
    JButton bot3;
    JButton bot4;
    JButton bot5;
    JButton bot6;
    JButton bot7;
    JButton bot8;
    JButton bot9;
    JButton bot10;
    JButton bot11;
    JButton bot12;
    JButton bot13;
    JButton bot14;
    JButton bot15;
    JButton bot16;

    public static String agregarTexto(String a, String texto) {
        String salida;
        //salida = texto.replaceFirst(" ", "");
        salida = texto + a;
        return salida;
    }

    public static String resolverOp(String texto) {
        boolean signo = false;
        char op = 'p';
        String operadores = "/x-+";
        String strPrim = "";
        String strSeg = "";
        int prim = 1;
        int seg = 1;
        double resultado;
        for (char i : texto.toCharArray()) {
            if (operadores.indexOf(i) == -1 && signo == false) {
                strPrim += i;
            } else if (operadores.indexOf(i) != -1) {
                prim = Integer.parseInt(strPrim);
                signo = true;
                op = i;
            } else if (operadores.indexOf(i) == -1 && signo == true) {
                strSeg += i;
            }
        }
        seg = Integer.parseInt(strSeg);
        switch (op) {
            case '/':
                resultado = prim / seg;
                break;
            case 'x':
                resultado = prim * seg;
                break;
            case '-':
                resultado = prim - seg;
                break;
            default:
                resultado = prim + seg;
                break;
        }
        String salida = Double.toString(resultado);
        return salida;
    }

    myFrame() {

        //icono
        ImageIcon logo = new ImageIcon("C:\\Users\\juanm\\Documents\\NetBeansProjects\\Calculadora\\calculadora2.png");
        
        //se crea el frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
        this.setResizable(false);
        this.setSize(500, 750);
        this.getContentPane().setBackground(new java.awt.Color(228, 244, 253));
        this.setTitle("Calculadora de Juanman");
        this.setIconImage(logo.getImage());
        this.setLocation(700, 150);

        //se crea un borde
        javax.swing.border.Border border = BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230), 10);

        //se crea el panel arriba de pantalla
        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(500, 5));
        panel1.setBackground(new java.awt.Color(228, 244, 253));

        //panel de botones
        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(400, 500));
        panel2.setBackground(new java.awt.Color(173, 216, 230));
        panel2.setLayout(new GridLayout(4,4,10,10));
        panel2.setBorder(BorderFactory.createEtchedBorder());

        //se crea el label pantalla
        pantalla = new JLabel();
        pantalla.setText(texto_en_pantalla);
        pantalla.setForeground(new java.awt.Color(82, 138, 174));
        pantalla.setHorizontalAlignment(JLabel.RIGHT);
        pantalla.setFont(new Font("Arial", Font.ROMAN_BASELINE, 50));
        pantalla.setBackground(Color.white);
        pantalla.setOpaque(true);
        pantalla.setBorder(border);
        pantalla.setMinimumSize(new Dimension(400, 100));
        pantalla.setPreferredSize(new Dimension(400, 100));
        pantalla.setMaximumSize(new Dimension(400, 100));

        //se crean los botones
        bot1 = new JButton();
        bot1.setText("7");
        bot1.setForeground(new java.awt.Color(82, 138, 174));
        bot1.setFont(new Font("Arial", Font.ROMAN_BASELINE, 50));
        bot1.setFocusable(false);
        bot1.setPreferredSize(new Dimension(70, 80));
        bot1.addActionListener(this);
        bot1.setBorder(BorderFactory.createRaisedBevelBorder());

        bot2 = new JButton();
        bot2.setText("8");
        bot2.setForeground(new java.awt.Color(82, 138, 174));
        bot2.setFont(new Font("Arial", Font.ROMAN_BASELINE, 50));
        bot2.setFocusable(false);
        bot2.setPreferredSize(new Dimension(70, 80));
        bot2.addActionListener(this);
        bot2.setBorder(BorderFactory.createRaisedBevelBorder());

        bot3 = new JButton();
        bot3.setText("9");
        bot3.setForeground(new java.awt.Color(82, 138, 174));
        bot3.setFont(new Font("Arial", Font.ROMAN_BASELINE, 50));
        bot3.setFocusable(false);
        bot3.setPreferredSize(new Dimension(70, 80));
        bot3.addActionListener(this);
        bot3.setBorder(BorderFactory.createRaisedBevelBorder());

        bot4 = new JButton();
        bot4.setText("/");
        bot4.setForeground(new java.awt.Color(82, 138, 174));
        bot4.setFont(new Font("Arial", Font.ROMAN_BASELINE, 50));
        bot4.setFocusable(false);
        bot4.setPreferredSize(new Dimension(70, 80));
        bot4.addActionListener(this);
        bot4.setBorder(BorderFactory.createRaisedBevelBorder());

        bot5 = new JButton();
        bot5.setText("4");
        bot5.setForeground(new java.awt.Color(82, 138, 174));
        bot5.setFont(new Font("Arial", Font.ROMAN_BASELINE, 50));
        bot5.setFocusable(false);
        bot5.setPreferredSize(new Dimension(70, 80));
        bot5.addActionListener(this);
        bot5.setBorder(BorderFactory.createRaisedBevelBorder());

        bot6 = new JButton();
        bot6.setText("5");
        bot6.setForeground(new java.awt.Color(82, 138, 174));
        bot6.setFont(new Font("Arial", Font.ROMAN_BASELINE, 50));
        bot6.setFocusable(false);
        bot6.setPreferredSize(new Dimension(70, 80));
        bot6.addActionListener(this);
        bot6.setBorder(BorderFactory.createRaisedBevelBorder());

        bot7 = new JButton();
        bot7.setText("6");
        bot7.setForeground(new java.awt.Color(82, 138, 174));
        bot7.setFont(new Font("Arial", Font.ROMAN_BASELINE, 50));
        bot7.setFocusable(false);
        bot7.setPreferredSize(new Dimension(70, 80));
        bot7.addActionListener(this);
        bot7.setBorder(BorderFactory.createRaisedBevelBorder());

        bot8 = new JButton();
        bot8.setText("x");
        bot8.setForeground(new java.awt.Color(82, 138, 174));
        bot8.setFont(new Font("Arial", Font.ROMAN_BASELINE, 50));
        bot8.setFocusable(false);
        bot8.setPreferredSize(new Dimension(70, 80));
        bot8.addActionListener(this);
        bot8.setBorder(BorderFactory.createRaisedBevelBorder());

        bot9 = new JButton();
        bot9.setText("1");
        bot9.setForeground(new java.awt.Color(82, 138, 174));
        bot9.setFont(new Font("Arial", Font.ROMAN_BASELINE, 50));
        bot9.setFocusable(false);
        bot9.setPreferredSize(new Dimension(70, 80));
        bot9.addActionListener(this);
        bot9.setBorder(BorderFactory.createRaisedBevelBorder());

        bot10 = new JButton();
        bot10.setText("2");
        bot10.setForeground(new java.awt.Color(82, 138, 174));
        bot10.setFont(new Font("Arial", Font.ROMAN_BASELINE, 50));
        bot10.setFocusable(false);
        bot10.setPreferredSize(new Dimension(70, 80));
        bot10.addActionListener(this);
        bot10.setBorder(BorderFactory.createRaisedBevelBorder());

        bot11 = new JButton();
        bot11.setText("3");
        bot11.setForeground(new java.awt.Color(82, 138, 174));
        bot11.setFont(new Font("Arial", Font.ROMAN_BASELINE, 50));
        bot11.setFocusable(false);
        bot11.setPreferredSize(new Dimension(70, 80));
        bot11.addActionListener(this);
        bot11.setBorder(BorderFactory.createRaisedBevelBorder());

        bot12 = new JButton();
        bot12.setText("-");
        bot12.setForeground(new java.awt.Color(82, 138, 174));
        bot12.setFont(new Font("Arial", Font.ROMAN_BASELINE, 50));
        bot12.setFocusable(false);
        bot12.setPreferredSize(new Dimension(70, 80));
        bot12.addActionListener(this);
        bot12.setBorder(BorderFactory.createRaisedBevelBorder());

        bot13 = new JButton();
        bot13.setText("C");
        bot13.setForeground(new java.awt.Color(82, 138, 174));
        bot13.setFont(new Font("Arial", Font.ROMAN_BASELINE, 50));
        bot13.setFocusable(false);
        bot13.setPreferredSize(new Dimension(70, 80));
        bot13.addActionListener(this);
        bot13.setBorder(BorderFactory.createRaisedBevelBorder());

        bot14 = new JButton();
        bot14.setText("0");
        bot14.setForeground(new java.awt.Color(82, 138, 174));
        bot14.setFont(new Font("Arial", Font.ROMAN_BASELINE, 50));
        bot14.setFocusable(false);
        bot14.setPreferredSize(new Dimension(70, 80));
        bot14.addActionListener(this);
        bot14.setBorder(BorderFactory.createRaisedBevelBorder());

        bot15 = new JButton();
        bot15.setText("=");
        bot15.setForeground(new java.awt.Color(82, 138, 174));
        bot15.setFont(new Font("Arial", Font.ROMAN_BASELINE, 50));
        bot15.setFocusable(false);
        bot15.setPreferredSize(new Dimension(70, 80));
        bot15.addActionListener(this);
        bot15.setBorder(BorderFactory.createRaisedBevelBorder());

        bot16 = new JButton();
        bot16.setText("+");
        bot16.setForeground(new java.awt.Color(82, 138, 174));
        bot16.setFont(new Font("Arial", Font.ROMAN_BASELINE, 50));
        bot16.setFocusable(false);
        bot16.setPreferredSize(new Dimension(70, 80));
        bot16.addActionListener(this);
        bot16.setBorder(BorderFactory.createRaisedBevelBorder());

        //se agregan los elementos
        this.add(panel1);
        this.add(pantalla);
        this.add(panel2);
        panel2.add(bot1);
        panel2.add(bot2);
        panel2.add(bot3);
        panel2.add(bot4);
        panel2.add(bot5);
        panel2.add(bot6);
        panel2.add(bot7);
        panel2.add(bot8);
        panel2.add(bot9);
        panel2.add(bot10);
        panel2.add(bot11);
        panel2.add(bot12);
        panel2.add(bot13);
        panel2.add(bot14);
        panel2.add(bot15);
        panel2.add(bot16);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bot1) {
            texto_en_pantalla = agregarTexto(bot1.getText(), texto_en_pantalla);
            pantalla.setText(texto_en_pantalla);
        } else if (ae.getSource() == bot2) {
            texto_en_pantalla = agregarTexto(bot2.getText(), texto_en_pantalla);
            pantalla.setText(texto_en_pantalla);
        } else if (ae.getSource() == bot3) {
            texto_en_pantalla = agregarTexto(bot3.getText(), texto_en_pantalla);
            pantalla.setText(texto_en_pantalla);
        } else if (ae.getSource() == bot4) {
            texto_en_pantalla = agregarTexto(bot4.getText(), texto_en_pantalla);
            pantalla.setText(texto_en_pantalla);
        } else if (ae.getSource() == bot5) {
            texto_en_pantalla = agregarTexto(bot5.getText(), texto_en_pantalla);
            pantalla.setText(texto_en_pantalla);
        } else if (ae.getSource() == bot6) {
            texto_en_pantalla = agregarTexto(bot6.getText(), texto_en_pantalla);
            pantalla.setText(texto_en_pantalla);
        } else if (ae.getSource() == bot7) {
            texto_en_pantalla = agregarTexto(bot7.getText(), texto_en_pantalla);
            pantalla.setText(texto_en_pantalla);
        } else if (ae.getSource() == bot8) {
            texto_en_pantalla = agregarTexto(bot8.getText(), texto_en_pantalla);
            pantalla.setText(texto_en_pantalla);
        } else if (ae.getSource() == bot9) {
            texto_en_pantalla = agregarTexto(bot9.getText(), texto_en_pantalla);
            pantalla.setText(texto_en_pantalla);
        } else if (ae.getSource() == bot10) {
            texto_en_pantalla = agregarTexto(bot10.getText(), texto_en_pantalla);
            pantalla.setText(texto_en_pantalla);
        } else if (ae.getSource() == bot11) {
            texto_en_pantalla = agregarTexto(bot11.getText(), texto_en_pantalla);
            pantalla.setText(texto_en_pantalla);
        } else if (ae.getSource() == bot12) {
            texto_en_pantalla = agregarTexto(bot12.getText(), texto_en_pantalla);
            pantalla.setText(texto_en_pantalla);
        } else if (ae.getSource() == bot14) {
            texto_en_pantalla = agregarTexto(bot14.getText(), texto_en_pantalla);
            pantalla.setText(texto_en_pantalla);
        } else if (ae.getSource() == bot16) {
            texto_en_pantalla = agregarTexto(bot16.getText(), texto_en_pantalla);
            pantalla.setText(texto_en_pantalla);
        } else if (ae.getSource() == bot13) {
            texto_en_pantalla = "";
            pantalla.setText(texto_en_pantalla);
        } else if (ae.getSource() == bot15) {
            texto_en_pantalla = resolverOp(pantalla.getText());
            pantalla.setText(texto_en_pantalla);
        }
    }

}
