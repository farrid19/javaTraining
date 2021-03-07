package buildd;

import buildA.*;
public class Honda extends Bike {
  
  public int val_Bike;
  //Bika.run=Honda.run
  //Only default and private not accissibal  because cant acess in extrnel package member 
  protected Honda(int vl){
        val_Bike=vl;
  }
  public Honda(){
    this(25444);

  }
  public void run() {
    System.out.println("running safely with 100kmph   "+val_Bike);
  }

  /*private void testStop() {
     Honda.stop();
  }*/
}
