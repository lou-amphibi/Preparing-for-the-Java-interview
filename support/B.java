package support;

public class B {
    @Weight(10)
    void method1() {
        System.out.println("method1");
    }

    @Weight(3)
    void method2() {
        System.out.println("method2");
    }

    @Weight(21)
    void method3() {
        System.out.println("method3");
    }
    
    void method4() {
        System.out.println("method4");
    }

}
