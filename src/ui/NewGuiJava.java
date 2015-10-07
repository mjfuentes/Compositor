package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listener.NotaButtonClickedListener;
import listener.SimboloButtonClickedListener;
import model.Melodia;
import model.Texto;
import java.awt.Canvas;
import java.awt.Label;

public class NewGuiJava {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewGuiJava window = new NewGuiJava();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NewGuiJava() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JFrame frame = new JFrame("Compositor de melod�as");
        frame.getContentPane().setLayout(new FlowLayout());
        Dimension d = new Dimension();
 
        ImageIcon iBlanca = new ImageIcon(this.getClass().getResource("/Img/blanca.png"));
        ImageIcon iCorchea = new ImageIcon(this.getClass().getResource("/Img/corchea.png"));
        ImageIcon iFusa = new ImageIcon(this.getClass().getResource("/Img/fusa.png"));
        ImageIcon iNegra = new ImageIcon(this.getClass().getResource("/Img/negra.png"));
        ImageIcon iRedonda = new ImageIcon(this.getClass().getResource("/Img/redonda.png"));
        ImageIcon iSemiCorchea = new ImageIcon(this.getClass().getResource("/Img/semicorchea.png"));
        ImageIcon iSemiFusa = new ImageIcon(this.getClass().getResource("/Img/semifusa.png"));
        ImageIcon iClaveSol = new ImageIcon(this.getClass().getResource("/Img/clavesol.png"));
    
        JButton blanca = new JButton(new ImageIcon(NewGuiJava.class.getResource("/ui/blanca.png")));
        JButton corchea = new JButton(new ImageIcon(NewGuiJava.class.getResource("/ui/corchea.png")));
        JButton fusa = new JButton(new ImageIcon(NewGuiJava.class.getResource("/ui/fusa.png")));
        JButton negra = new JButton(new ImageIcon(NewGuiJava.class.getResource("/ui/negra.png")));
        JButton redonda = new JButton(new ImageIcon(NewGuiJava.class.getResource("/ui/redonda.png")));
        JButton semiCorchea = new JButton(new ImageIcon(NewGuiJava.class.getResource("/ui/semicorchea.png")));
        JButton semiFusa = new JButton(new ImageIcon(NewGuiJava.class.getResource("/ui/semifusa.png")));
        JButton A = new JButton("LA");
        JButton B = new JButton("SI");
        JButton C = new JButton("DO");
        JButton D = new JButton("RE");
        JButton E = new JButton("MI");
        JButton F = new JButton("FA");
        JButton G = new JButton("SOL");
        
        
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
        frame.getContentPane().setLayout(new FlowLayout());
        
        
        JPanel panel = new JPanel(new FlowLayout());
        panel.setBackground(Color.ORANGE);
        panel.setPreferredSize(new Dimension(700, 100));
        frame.getContentPane().add(panel);
        
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
        frame.getContentPane().add(panel2);
        
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
        frame.getContentPane().add(melodyPanel);
        
        Texto texto = new Texto(Melodia.getInstance().getString(), 50);
        texto.setEditable(false);
        melodyPanel.add(texto);
        Melodia.getInstance().addObserver(texto);
        
        JButton play = new JButton("Play!");
        play.addActionListener(new SimboloButtonClickedListener());
        play.setActionCommand("play");
        melodyPanel.add(play);
        

        JPanel panelPentagrama = new JPanel();
        panelPentagrama.setBackground(Color.WHITE);
        panelPentagrama.setPreferredSize(new Dimension(600, 100));
        panelPentagrama.setLayout(null);
        frame.getContentPane().add(panelPentagrama);                                                                                                                                                 
        notaListener.addPentagrama(panelPentagrama);
        
        Canvas canvas = new Canvas();
        canvas.setBounds(10, 0, 100, 100);
        panelPentagrama.add(canvas);
        
        JLabel picLabel = new JLabel(iClaveSol);
        panelPentagrama.add(picLabel);
        Dimension size = picLabel.getPreferredSize();
        picLabel.setBounds(100, 100, size.width, size.height);
        

        
        frame.setVisible(true);//configurando visualizaci�n del frame
	}
}
