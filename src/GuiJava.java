import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import listener.PentagramaClickedListener;
import listener.SimboloButtonClickedListener;
import model.Melodia;
import model.Texto;
 
public class GuiJava{
 
    JButton blanca,claveSol,corchea,fusa,negra,redonda,semiCorchea,semiFusa,A,B,C,D,E,F,G,play;
 
    public GuiJava(){
 
        JFrame frame = new JFrame("Compositor de melod�as");
        frame.setLayout(new FlowLayout());
        Dimension d = new Dimension();
 
        ImageIcon iBlanca = new ImageIcon(this.getClass().getResource("/ui/blanca.png"));
        ImageIcon iCorchea = new ImageIcon(this.getClass().getResource("/ui/corchea.png"));
        ImageIcon iFusa = new ImageIcon(this.getClass().getResource("/ui/fusa.png"));
        ImageIcon iNegra = new ImageIcon(this.getClass().getResource("/ui/negra.png"));
        ImageIcon iRedonda = new ImageIcon(this.getClass().getResource("/ui/redonda.png"));
        ImageIcon iSemiCorchea = new ImageIcon(this.getClass().getResource("/ui/semicorchea.png"));
        ImageIcon iSemiFusa = new ImageIcon(this.getClass().getResource("/ui/semifusa.png"));
        ImageIcon iClaveSol = new ImageIcon(this.getClass().getResource("/ui/clavesol.png"));
    
        blanca = new JButton(iBlanca);
        corchea = new JButton(iCorchea);
        fusa = new JButton(iFusa);
        negra = new JButton(iNegra);
        redonda = new JButton(iRedonda);
        semiCorchea = new JButton(iSemiCorchea);
        semiFusa = new JButton(iSemiFusa);
        
        
        //a�adiendo el listener a los botones para manipular los eventos del click
        SimboloButtonClickedListener simboloListener = new SimboloButtonClickedListener();
        PentagramaClickedListener pentagramaListener = new PentagramaClickedListener();
        blanca.addActionListener(simboloListener);
        blanca.setActionCommand("blanca");
        corchea.addActionListener(simboloListener);
        corchea.setActionCommand("corchea");
        fusa.addActionListener(simboloListener);
        fusa.setActionCommand("fusa");
        negra.addActionListener(simboloListener);
        negra.setActionCommand("negra");
        redonda.addActionListener(simboloListener);
        redonda.setActionCommand("redonda");
        semiCorchea.addActionListener(simboloListener);
        semiCorchea.setActionCommand("semiCorchea");
        semiFusa.addActionListener(simboloListener);
        semiFusa.setActionCommand("semiFusa");
        

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        frame.setLocation((int) ((d.getWidth()/2)+290), 50);//para ubicar inicialmente donde se muestra el frame (x, y)
        frame.setSize(700,450);//configurando tama�o del frame (ancho, alto)
        frame.setLayout(new FlowLayout());
        
        
        JPanel panel = new JPanel(new FlowLayout());
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(700, 100));
        frame.add(panel);
        
        panel.add(blanca);
        panel.add(negra);
        panel.add(corchea);
        panel.add(fusa);
        panel.add(semiCorchea);
        panel.add(semiFusa);
        panel.add(redonda);
        
        JPanel melodyPanel = new JPanel(new FlowLayout());
        melodyPanel.setBackground(Color.WHITE);
        melodyPanel.setPreferredSize(new Dimension(700, 100));
        frame.add(melodyPanel);
        
        Texto texto = new Texto(Melodia.getInstance().getString(), 50);
        texto.setEditable(false);
        melodyPanel.add(texto);
        Melodia.getInstance().addObserver(texto);
        
        play = new JButton("Play!");
        play.addActionListener(new SimboloButtonClickedListener());
        play.setActionCommand("play");
        melodyPanel.add(play);

        JPanel panelPentagrama = new JPanel(null);
        panelPentagrama.setBackground(Color.WHITE);
        panelPentagrama.setPreferredSize(new Dimension(600, 100));
        panelPentagrama.setLayout(null);
        frame.add(panelPentagrama);      
        panelPentagrama.addMouseListener(pentagramaListener);
        pentagramaListener.addPentagrama(panelPentagrama);
        
        

        JLabel clave = new JLabel(iClaveSol);
        clave.setBounds(10,0,50,100); 
        panelPentagrama.add(clave);
        
        ImageIcon iLinea = new ImageIcon(this.getClass().getResource("/ui/linea.png"));
        JLabel linea1 = new JLabel(iLinea);
        JLabel linea2 = new JLabel(iLinea);
        JLabel linea3 = new JLabel(iLinea);
        JLabel linea4 = new JLabel(iLinea);
        JLabel linea5 = new JLabel(iLinea);
        linea1.setBounds(0,20,600,100); 
        panelPentagrama.add(linea1);
        linea2.setBounds(0,10,600,100); 
        panelPentagrama.add(linea2);
        linea3.setBounds(0,0,600,100); 
        panelPentagrama.add(linea3);
        linea4.setBounds(0,-10,600,100); 
        panelPentagrama.add(linea4);
        linea5.setBounds(0,-20,600,100); 
        panelPentagrama.add(linea5);
        
        frame.setVisible(true);//configurando visualizaci�n del frame
    }
 
    public static void main(String[] args) {
        GuiJava gj = new GuiJava();
    }

	

}