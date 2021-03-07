package build.srcbmain;
import build.chld.*;
import build.prnt.*;  
public class compos {
    public static void main(String[] args) {
        child cld=new child();
        parent prt=new parent();
        prt.adds();
        //loading from internet and injected it 
        //cld=load from somewhere by sleep()
        prt.addwitharg(cld);
    }
}
