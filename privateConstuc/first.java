package build;

import build.preFirst;

public class first {
    public first() {
        System.out.println("hello from frisr !");
    };

    private class innerfirst {
        private innerfirst(){
            System.out.println("hello first methodFrstinner");
            first.add(); 
        }
        
        private  void frominer(){
            System.out.println("hello first fromInner");
        }     
        
        public class innerwithINinner{
            public void innerwthiner(){
                System.out.println("inner with innerwithinner");
            }
        }
    }

    private static void add() {
        System.out.println("hello first first add !");
    }

    public void acctoInerClass() {
        innerfirst ifc=new innerfirst();
        //innerwithINinner innerwithinner=new innerfirst().getMethod().innerwithINinner();
         
        ifc.frominer();
    }
}
