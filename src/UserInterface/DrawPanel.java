/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.JPanel;

/**
 *
 * @author Magnus Brandt Sløgedal
 */
public class DrawPanel extends JPanel implements ComponentListener
{
    
    private int bottomX = 0;
    private int bottomY = 0;
    private int width = 0;
    private int height = 0;
    private int yOffset = 0;
    private int xOffset = 0;
    private int xIncises = 0;
    private int xInciseOffset = 0;
    private int yIncises = 0;
    private int yInciseOffset = 0;
    

    public DrawPanel() {
        
        this.setGraphicsScale();
        
    }

    //called when the frame is drawn or resized
    private void setGraphicsScale()
    {
        
        //claculates usefull data for drawing the graphs
        this.bottomX = 0;
        this.bottomY = this.getSize().height;
        this.width = this.getSize().width;
        this.height = this.getSize().height;
        this.yOffset = ((this.height / 10) < 60) ? (this.height / 10) : 60;
        this.xOffset = ((this.width / 10) < 60) ? (this.width / 10) : 60;
        
        this.xIncises = 20;
        this.xInciseOffset = (this.width - (2 * xOffset))/xIncises;
        
        this.yIncises = 20;
        this.yInciseOffset = (this.height - (2 * yOffset))/yIncises;
        
    }
    
    public void drawPoint(int x, int y)
    {
        // scale point to frame
        
        //add point to list
        
        //redraw
    }
    
    //draws the X and Y axis, and all the indices for them
    private void drawAxis(Graphics2D g)
    {
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(3));
        
        g.drawLine(this.bottomX + xOffset, this.bottomY - yOffset, this.bottomX + this.width - xOffset, this.bottomY - yOffset);
        g.drawLine(this.bottomX + xOffset, this.bottomY - yOffset, this.bottomX + xOffset, this.bottomY + yOffset - this.height);
        
        g.setStroke(new BasicStroke(2));
        for (int i = 1; i <= xIncises; i++)
        {
            g.drawLine(xOffset + (i * xInciseOffset), this.bottomY - yOffset, xOffset + (i * xInciseOffset), this.bottomY - yOffset + 5);
            g.drawString(""+60*i, (int)(xOffset/1.2) + (i * xInciseOffset), this.bottomY - yOffset + 20);
        }
        g.drawString("Sec", this.width - xOffset, this.bottomY - yOffset + 30);
        
        for (int i = 1; i <= yIncises; i++)
        {
            g.drawLine(this.bottomX + xOffset, this.bottomY - yOffset - (i * yInciseOffset), this.bottomX + xOffset - 5, this.bottomY - yOffset - (i * yInciseOffset));
            g.drawString(""+10*i, this.bottomX + (int)(xOffset/2), this.bottomY -yOffset + 5 - (i * yInciseOffset));
        }
        g.drawString("Deg", this.bottomX + (int)(xOffset/3), this.bottomY + (int)(yOffset/1.5) - this.height); 
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setGraphicsScale();
        Graphics2D g2 = (Graphics2D) g;
        drawAxis(g2);  
    }

    @Override
    public void componentResized(ComponentEvent e)
    {
        this.setGraphicsScale();
    }

    
    
    
    
    @Override
    public void componentMoved(ComponentEvent e)
    {
    }

    @Override
    public void componentShown(ComponentEvent e)
    {
    }

    @Override
    public void componentHidden(ComponentEvent e)
    {
    }
    
    

}
