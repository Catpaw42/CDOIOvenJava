package temperaturemodel;

import UserInterface.UserInterface;
import javax.swing.SwingUtilities;

/**
 *
 * @author Magnus Brandt Sløgedal
 */
public class Main
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				//Do everything in here, this means everything is on the EDT-thread
				//if large tasks are required they should be dispatched in another thread
				//to not block the EDT (Blocked EDT = frozen GUI).
				new UserInterface(800,600);
			}
		});
        
        //                                        Cth   T0    Ta     Rth  overflade   emmisitivitet    Pek
//        TemperatureModel t = new TemperatureModel(99,   24.9,   24.9,  10,  0.0036,     0.2,             23);
//        for (int i = 0; i < 1000; i++)
//        {
//            t.calculateTemp();
//            System.out.println(""+(t.getTemperature()));
//        }
//        t.addedElectricEffect = 12;
//        for (int i = 0; i < 1000; i++)
//        {
//            t.calculateTemp();
//            System.out.println(""+(t.getTemperature()));
//        }
    }
}
