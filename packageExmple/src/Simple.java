package build.mypack;

import build.externalpackge.send;

public class Simple {
   public static void main(String args[]) {
       send sender=new send();
       sender.add(5);
       System.out.println("Welcome to package");
   }
}


