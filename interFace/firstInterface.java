interface firstInterface {
    // intern interface >> class attributes
    int intval = 10;
    int vlaStati = 10;
    
    // abstract
    void addInteface();

    private static void interMethod() {
        System.out.println("Hello from private interMethod  : " + intval);
    }

    // if not override in class then : >>
    // add by default to any class whch implimentes this interface
    default void defaultMethod() {
        System.out.println("the att vlaue in intval  :  " + intval);
        firstInterface.interMethod();
    }
}

class impfirstInterface implements firstInterface {
    // static int intval = 125;

    public void addInteface() {
        System.out.println("Hello from addInterface in firstinterface   :  " +this.getObject());
    }

    public void defaultMethod() {
        System.out.println("the att vlaue in intval  :  " + intval);
    }

    public void addExtrac() {
        System.out.println("vlaStati : " + vlaStati);
    }

    public static void main(String[] args) {
        impfirstInterface objInterface;
        objInterface = new impfirstInterface();
        objInterface.defaultMethod();
        objInterface.addInteface();
        objInterface.addExtrac();
    }
}
