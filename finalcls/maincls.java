package build;

import buildd.*;
import buildc.*;
import buildA.*;
public class maincls {
  public static void main(String args[]) {
    Bike honda ;
    honda =new Honda();
    honda.run();
    honda.run();
    honda.stop();
    //honda.testStop();
  }
}
