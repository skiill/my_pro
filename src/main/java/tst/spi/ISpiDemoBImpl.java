package tst.spi;

public class ISpiDemoBImpl implements ISpiDemo {


    public void out() {
        System.out.println("Hello world " + this.getClass().getName());
    }
}