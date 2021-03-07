package build.prnt;

import build.chld.*;

public class parent {
    public child compChild;
    public static int valu;

    public void adds() {
        System.out.println(compChild + "again");
        compChild = new child();
        compChild.addChild();
        System.out.println(parent.valu + " " + "this is the value of this");
        valu = 20;
        System.out.println(valu + " " + "value of argment");
        parent pt=new parent();

        System.out.println(valu);

    }

    public void addwitharg(child instnceChild) {
        instnceChild.addChild();
    }
}
