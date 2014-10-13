package es.upm.miw.pd.visitor;

public class Visitor2 extends Visitor {

    private int numAs = 0;

    private int numBs = 0;

    @Override
    public void visitElementA(ElementA a) {
        numAs++;
    }

    @Override
    public void visitElementB(ElementB b) {
        numBs++;
    }

    public int getAs() {
        return numAs;
    }

    public int getBs() {
        return numBs;
    }

}
