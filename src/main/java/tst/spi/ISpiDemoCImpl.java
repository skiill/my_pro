package tst.spi;

public class ISpiDemoCImpl implements ISpiDemo {


    public void out() {
        System.out.println("Hello world " + this.getClass().getName());
    }
}