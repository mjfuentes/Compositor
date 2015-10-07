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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import listener.NotaButtonClickedListener;
import listener.SimboloButtonClickedListener;
import model.Melodia;
import model.Texto;
 
public class GuiJava{
 
    JButton blanca,claveSol,corchea,fusa,negra,redonda,semiCorchea,semiFusa,A,B,C,D,E,F,G,play;
 
    public GuiJava(){
 
        JFrame frame = new JFrame("Compositor de melod�as");
        frame.setLayout(new FlowLayout());
        Dimension d = new Dimension();
 
        ImageIcon iBlanca = new ImageIcon(this.getClass().getResource("/Img/blanca.png"));
        ImageIcon iCorchea = new ImageIcon(this.getClass().getResource("/Img/corchea.png"));
        ImageIcon iFusa = new ImageIcon(this.getClass().getResource("/Img/fusa.png"));
        ImageIcon iNegra = new ImageIcon(this.getClass().getResource("/Img/negra.png"));
        ImageIcon iRedonda = new ImageIcon(this.getClass().getResource("/Img/redonda.png"));
        ImageIcon iSemiCorchea = new ImageIcon(this.getClass().getResource("/Img/semicorchea.png"));
        ImageIcon iSemiFusa = new ImageIcon(this.getClass().getResource("/Img/semifusa.png"));
        ImageIcon iClaveSol = new ImageIcon(this.getClass().getResource("/Img/clavesol.png"));
    
        blanca = new JButton(iBlanca);
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
        SimboloButtonClickedListener simboloListener = new SimboloButtonClickedListener();
        NotaButtonClickedListener notaListener = new NotaButtonClickedListener();
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
        A.addActionListener(notaListener);
        A.setActionCommand("A");
        B.addActionListener(notaListener);
        B.setActionCommand("B");
        C.addActionListener(notaListener);
        C.setActionCommand("C");
        D.addActionListener(notaListener);
        D.setActionCommand("D");
        E.addActionListener(notaListener);
        E.setActionCommand("E");
        F.addActionListener(notaListener);
        F.setActionCommand("F");
        G.addActionListener(notaListener);
        G.setActionCommand("G");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        frame.setLocation((int) ((d.getWidth()/2)+290), 50);//para ubicar inicialmente donde se muestra el frame (x, y)
        frame.setSize(700,450);//configurando tama�o del frame (ancho, alto)
        frame.setLayout(new FlowLayout());
        
        
        JPanel panel = new JPanel(new FlowLayout());
        panel.setBackground(Color.ORANGE);
        panel.setPreferredSize(new Dimension(700, 100));
        frame.add(panel);
        
        panel.add(blanca);
        panel.add(negra);
        panel.add(corchea);
        panel.add(fusa);
        panel.add(semiCorchea);
        panel.add(semiFusa);
        panel.add(redonda);
     
        JPanel panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(Color.GREEN);
        panel2.setPreferredSize(new Dimension(700, 50));
        frame.add(panel2);
        
        panel2.add(C);
        panel2.add(D);
        panel2.add(E);
        panel2.add(F);
        panel2.add(G);
        panel2.add(A);
        panel2.add(B);
       
        
        JPanel melodyPanel = new JPanel(new FlowLayout());
        melodyPanel.setBackground(Color.BLUE);
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
        

        JPanel panelPentagrama = new JPanel();
        panelPentagrama.setBackground(Color.WHITE);
        panelPentagrama.setPreferredSize(new Dimension(600, 100));
        panelPentagrama.setLayout(null);
        frame.add(panelPentagrama);                                                                                                                                                 
        notaListener.addPentagrama(panelPentagrama);
        
        
        JLabel picLabel = new JLabel(iClaveSol);
        panelPentagrama.add(picLabel);
        Dimension size = picLabel.getPreferredSize();
        picLabel.setBounds(100, 100, size.width, size.height);
        

        
        frame.setVisible(true);//configurando visualizaci�n del frame
    }
 
    public static void main(String[] args) {
        GuiJava gj = new GuiJava();
    }

	

}