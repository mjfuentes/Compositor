import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import listener.NotaButtonClickedListener;
 
public class GuiJava{
 
    JButton blanca,claveSol,corchea,fusa,negra,redonda,semiCorchea,semiFusa,A,B,C,D,E,F,G;
 
    public GuiJava(){
 
        JFrame frame = new JFrame("Compositor de melod�as");
        frame.setLayout(new FlowLayout());
        Dimension d = new Dimension();
 
        ImageIcon iBlanca = new ImageIcon("bin/blanca.png");
        ImageIcon iClaveSol = new ImageIcon("bin/clavesol.png");
        ImageIcon iCorchea = new ImageIcon("bin/corchea.png");
        ImageIcon iFusa = new ImageIcon("bin/fusa.png");
        ImageIcon iNegra = new ImageIcon("bin/negra.png");
        ImageIcon iRedonda = new ImageIcon("bin/redonda.png");
        ImageIcon iSemiCorchea = new ImageIcon("bin/semicorchea.png");
        ImageIcon iSemiFusa = new ImageIcon("bin/semifusa.png");
        
    
        blanca = new JButton(iBlanca);
        claveSol = new JButton(iClaveSol);
        corchea = new JButton(iCorchea);
        fusa = new JButton(iFusa);
        negra = new JButton(iNegra);
        redonda = new JButton(iRedonda);
        semiCorchea = new JButton(iSemiCorchea);
        semiFusa = new JButton(iSemiFusa);
        A = new JButton("LA");
        B = new JButton("SI");
        C = new JButton("DO");
        D = new JButton("RE");
        E = new JButton("MI");
        F = new JButton("FA");
        G = new JButton("SOL");
        
        
        //a�adiendo el listener a los botones para manipular los eventos del click
        blanca.addActionListener(new NotaButtonClickedListener());
        blanca.setActionCommand("blanca");
        corchea.addActionListener(new NotaButtonClickedListener());
        corchea.setActionCommand("corchea");
        fusa.addActionListener(new NotaButtonClickedListener());
        fusa.setActionCommand("fusa");
        negra.addActionListener(new NotaButtonClickedListener());
        negra.setActionCommand("negra");
        redonda.addActionListener(new NotaButtonClickedListener());
        redonda.setActionCommand("redonda");
        semiCorchea.addActionListener(new NotaButtonClickedListener());
        semiCorchea.setActionCommand("semiCorchea");
        semiFusa.addActionListener(new NotaButtonClickedListener());
        semiFusa.setActionCommand("semiFusa");
        A.addActionListener(new NotaButtonClickedListener());
        A.setActionCommand("A");
        B.addActionListener(new NotaButtonClickedListener());
        B.setActionCommand("B");
        C.addActionListener(new NotaButtonClickedListener());
        C.setActionCommand("C");
        D.addActionListener(new NotaButtonClickedListener());
        D.setActionCommand("D");
        E.addActionListener(new NotaButtonClickedListener());
        E.setActionCommand("E");
        F.addActionListener(new NotaButtonClickedListener());
        F.setActionCommand("F");
        G.addActionListener(new NotaButtonClickedListener());
        G.setActionCommand("G");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        //frame.setResizable(false);
        frame.setLocation((int) ((d.getWidth()/2)+290), 50);//para ubicar inicialmente donde se muestra el frame (x, y)
        frame.setSize(700,500);//configurando tama�o del frame (ancho, alto)
        frame.setVisible(true);//configurando visualizaci�n del frame
        frame.setLayout(new FlowLayout());
        
        JPanel panel = new JPanel(new FlowLayout());
        panel.setSize(new Dimension(700, 350));
        panel.setBackground(Color.ORANGE);
        panel.setPreferredSize(new Dimension(700, 350));
        frame.add(panel);
        
        panel.add(blanca);
        panel.add(negra);
        panel.add(corchea);
        panel.add(fusa);
        panel.add(semiCorchea);
        panel.add(semiFusa);
        panel.add(redonda);
     
        
        frame.add(C);
        frame.add(D);
        frame.add(E);
        frame.add(F);
        frame.add(G);
        frame.add(A);
        frame.add(B);
    }
 
    public static void main(String[] args) {
 
        GuiJava gj = new GuiJava();
    }

	

}