/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Magnus Brandt Sløgedal
 */
public class ControlPanel extends JPanel
{
    //layout helpers
    
    
    //variables
    private JLabel[] labels = new JLabel[6];
    private JLabel effektLabel = new JLabel("P\u2091\u2097");
    private JLabel timeLabel = new JLabel("t");
    
    
    private JTextField[] dataFields = new JTextField[6];
    
    private JTextField effekt = new JTextField();
    private JTextField time = new JTextField();
    
    
    //buttons
    private JRadioButton realTimeToggle = new JRadioButton();
    
    
    public ControlPanel()
    {
        
        
        
        this.setPreferredSize(new Dimension(800, 200));
        
        labels[0] = new JLabel("T\u2080");
        labels[1] = new JLabel("C\u209c\u2095");
        labels[2] = new JLabel("T\u2090");
        labels[3] = new JLabel("R\u209c\u2095");
        labels[4] = new JLabel("A");
        labels[5] = new JLabel("\u03b5");
        
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        for (int i = 0; i < labels.length; i++)
        {
            labels[i].setFont(new Font("Monospaced", Font.PLAIN, 25));
            this.add(labels[i], c);
            this.add(dataFields[i] = new JTextField("test"),c);
            
        }
        
    }
    
    
}
