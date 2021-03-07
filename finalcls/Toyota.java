package buildc;

import buildA.*;
public class Toyota extends Bike {
   public void run() {
    System.out.println("running safely with toyota");
  }

  public void testStop() {
    stop();
    // Honda.stop();
  }
}
