public class Child extends first{
    static int val=1;
    public void add(){
        System.out.println("hello From Child");
    }
    
    public void machinDesplay(){
        super.add();
        this.add();
    }

    public static void main(String[] args) {

        Child[] childs={new Child(),new Child()}; 

        for (Child child : childs) {
            child.machinDesplay();

        }
        
    }

}
