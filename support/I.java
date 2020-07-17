package support;

public class I {
	@BotRequestMapping("adam")
    public void methodI1() {
        System.out.println("madam I'm adam");
    }

    @BotRequestMapping("cat and king")
    public void methodI2() {
        System.out.println("A cat may look at a king");
    }

    @BotRequestMapping("dog bites")
    public void methodI3() {
        System.out.println("A barking dog never bites");
    }

}
