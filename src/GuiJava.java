import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
 
public class GuiJava implements ActionListener{
 
    JButton blanca,claveSol,corchea,fusa,negra,redonda,semiCorchea,semiFusa;
 
    public GuiJava(){
 
        JFrame frame = new JFrame("Compositor de melodías");
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
        
 
        frame.add(blanca); 
        frame.add(claveSol); 
        frame.add(corchea);
        frame.add(fusa);
        frame.add(negra);
        frame.add(redonda);
        frame.add(semiCorchea);
        frame.add(semiFusa);
        
        //añadiendo el listener a los botones para manipular los eventos del click
        blanca.addActionListener(this);
        claveSol.addActionListener(this);
        corchea.addActionListener(this);
        fusa.addActionListener(this);
        negra.addActionListener(this);
        redonda.addActionListener(this);
        semiCorchea.addActionListener(this);
        semiFusa.addActionListener(this);
  
 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        //frame.setResizable(false);
        frame.setLocation((int) ((d.getWidth()/2)+290), 50);//para ubicar inicialmente donde se muestra el frame (x, y)
        frame.setSize(800, 500);//configurando tamaño del frame (ancho, alto)
        frame.setVisible(true);//configurando visualización del frame
    }
 
    public static void main(String[] args) {
 
        GuiJava gj = new GuiJava();
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
 
        if(e.getActionCommand().equals("Hola")){//podemos comparar por el contenido del boton
            JOptionPane.showMessageDialog(null, e.getActionCommand());
        }
        if(e.getSource()==blanca){//podemos comparar por el nombre del objeto del boton
            JOptionPane.showMessageDialog(null, e.getActionCommand());
        }
        if(e.getSource()==redonda){//podemos comparar por el nombre del objeto del boton
            JOptionPane.showMessageDialog(null, e.getActionCommand());
        }
    }
}