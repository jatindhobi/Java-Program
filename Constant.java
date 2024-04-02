public class Constant {
    public static void main(String... args) {
        final double START_TIME = 7.30;
        final double END_TIME = 2.30;
        System.out.println(START_TIME);

    }
}




class Parent {
    final void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    // Cannot override a final method
    
    // void display(){
    //     System.out.println("Child class method");
    // }
}





final class Men{
    //class implementation
}
//Cannot inherit from a class

/*
class Child extends Men{
    //class implementation
}
 */