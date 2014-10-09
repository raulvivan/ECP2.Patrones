package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NumberFrCreator extends NumberCreator{

    @Override
    public NaturalNumber createNumber(int value) {
        return new NaturalNumberFr(value);
    }

}
