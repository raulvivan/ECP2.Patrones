package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NumberEsCreator extends NumberCreator{

    @Override
    public NaturalNumber createNumber(int value) {
        return new NaturalNumberEs(value);
    }

}
