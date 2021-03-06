package examples;

import drones.*;

/**
 * A drone that traces the enemy movements crudely
 * 
 * @author Baykam Say
 * @version 12.5.19
 */

public class TracingDrone extends Drone {

   private double enemyAngle;
   private boolean droneScanned;
   private int turnAmount;

   public TracingDrone(int x, int y) {
      super(x, y, "src/resources/drone.png");
      droneScanned = false;
      turnAmount = 1;
   }

   /**
    * This method is repeated throughout the battle
    */
   @Override
   public void run() {
      
      while (!droneScanned) {
         turn(2);
      }
      
      droneScanned = false;
      
      while (true) {
         
         while (!droneScanned) {
            turn(turnAmount);
            turn(-turnAmount);
            turnAmount *= 2;
         }
         
         turn((int) (enemyAngle - this.getAngle()));
         droneScanned = false;
      }
   }

   /**
    * Determine how your drone will react when it scans an enemy drone.
    */
   @Override
   public void onScannedDrone() {
      fire();
      enemyAngle = Math.toDegrees(this.getAngle());
      droneScanned = true;
   }

   /**
    * Determine how your drone will react when it hits to the wall.
    */
   @Override
   public void onHitBorder() {
      turn(180);
      move(100);
   }
}
