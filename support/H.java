package support;

public class H {
    @BotRequestMapping("hello")
    void methodH1() {
        System.out.println("hello world!!!");
    }

    @BotRequestMapping("goodbye")
    void methodH2() {
        System.out.println("goodbye my friend!!!");
    }

    public void methodH3() {
        System.out.println("bad call!!");
    }
}