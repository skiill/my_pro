package tst.spi;

public class ISpiDemoAImpl implements ISpiDemo {


    public void out() {
        System.out.println("Hello world " + this.getClass().getName());
    }
}
