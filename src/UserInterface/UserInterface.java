package UserInterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;

/**
 *
 * @author Magnus Brandt Sløgedal
 */
public class UserInterface extends JFrame implements ActionListener, KeyListener
{
    public UserInterface(int width, int height)
    {
        //init
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
	this.setSize(width, height);
	this.setPreferredSize(new Dimension(width, height));
        this.setVisible(true);
        
        //create controls
        ControlPanel controlPanel = new ControlPanel();
        this.add(controlPanel, BorderLayout.SOUTH);
        
        
        //create series area
        SeriesPanel seriesPanel = new SeriesPanel();
        seriesPanel.setBackground(Color.yellow);
        this.add(seriesPanel, BorderLayout.WEST);
        
        
        //create drawing area
        DrawPanel drawPanel = new DrawPanel();
        this.add(drawPanel, BorderLayout.CENTER);
        this.pack();
        
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
