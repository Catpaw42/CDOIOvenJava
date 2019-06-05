/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturemodel;

/**
 *
 * @author Magnus Brandt Sløgedal
 */
public class TemperatureModel
{
    final double StefanBoltzmann = 0.0000000567; //     Wm^-2*K^-4
    double thermalCap = 0; //                      J/K
    double startTemp = 0;//                      K
    double addedElectricEffect = 0;//                   W
    double surroundingTemp = 0;//                       K
    double thermalKonvectionResistance = 0;//           K/W
    double emmisionArea = 0; //                         m^2
    double emmissitivity = 0;
    
    
    double ovenTemp = 0;
    
    double test = 0;
    
    public TemperatureModel(double thermalCapacity, 
                            double startTemperature, 
                            double surroundingTemp, 
                            double thermalKonvectionResistance, 
                            double emmisionArea,
                            double emmissitivity,
                            double addedElectricEffect)
    {
        this.thermalCap = thermalCapacity;
        this.startTemp = startTemperature + 273;        //celcius to kelvin
        this.surroundingTemp = surroundingTemp + 273;   //celcius to kelvin
        this.thermalKonvectionResistance = thermalKonvectionResistance;
        this.emmisionArea = emmisionArea;
        this.emmissitivity = emmissitivity;
        this.addedElectricEffect = addedElectricEffect;
    }
    
    private double konvektionLoss()
    {
        
        return 1.0 / thermalKonvectionResistance *(ovenTemp - surroundingTemp);
    }
    
    private double radiationLoss()
    {
        return emmisionArea * emmissitivity * StefanBoltzmann *( Math.pow(ovenTemp, 4) - Math.pow(surroundingTemp, 4));
    }
    
    public double getTemperature()
    {
        
        return this.ovenTemp - 273;
    }
    
    public void calculateTemp()
    {
        this.test = this.test + (addedElectricEffect - konvektionLoss() - radiationLoss());
        this.ovenTemp = startTemp + (1.0/thermalCap) * this.test;
    }
}
