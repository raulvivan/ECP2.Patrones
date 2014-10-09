package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NumberEnCreator extends NumberCreator{

    @Override
    public NaturalNumber createNumber(int value) {
        return new NaturalNumberEn(value);
    }

}
