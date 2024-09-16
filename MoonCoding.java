public class MoonCoding {

    public static void main(String[] args) {
      
        
        double distanceToMoonKm = 380000;
        double rocketSpeedKmPerSec = 10; 

   
        double timeInSeconds = distanceToMoonKm / rocketSpeedKmPerSec;

  
        double timeInHours = timeInSeconds / 3600;

        
        System.out.printf("Time to reach the Moon without gravity: %.2f hours%n", timeInHours);
        

               

           

            

                    double horizontalSpeedChange = 2000; 
        double verticalSpeedChange = 3000;

              double totalSpeedChange = Math.sqrt(Math.pow(horizontalSpeedChange, 2) + Math.pow(verticalSpeedChange, 2));

        
        System.out.printf("Total speed change needed to enter Lunar Transfer Orbit: %.2f m/s%n", totalSpeedChange);
       

              
       
        

  
       
        

              

       
       
   
        double moonRadiusKm = 1731; // in kilometers
        double moonRadiusM = moonRadiusKm * 1000; // Convert to meters
        double layerThicknessM = 0.001; // 1 millimeter = 0.001 meters
        double densityRegolith = 3000; // in kilograms per cubic meter

              double surfaceArea = 4 * Math.PI * Math.pow(moonRadiusM, 2);

              double surfaceVolume = surfaceArea * layerThicknessM;

              System.out.printf("Surface volume in a 1 mm thick layer: %.2f cubic meters%n", surfaceVolume);

             double regolithMass = surfaceVolume * densityRegolith;

            double regolithMassTons = regolithMass / 1000;

             System.out.printf("Mass of the regolith in the 1 mm surface layer: %.2f metric tons%n", regolithMassTons);

              double waterRecoverableKg = regolithMass * 0.25;

            double waterRecoverableLiters = waterRecoverableKg;

       
        System.out.printf("Liters of water recoverable from the 1 mm surface layer: %.2f liters%n", waterRecoverableLiters);








    }
}
