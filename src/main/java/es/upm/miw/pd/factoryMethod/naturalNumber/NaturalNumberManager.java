package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberManager {
    
    private NaturalNumber number;
    private NumberCreator creator;
    
    public void createNumber(int value){
        creator.createNumber(value);
    }
    
    public void setNumberCreator(NumberCreator creator){
        this.creator = creator;
    }
    
    public NaturalNumber getNaturalNumber(){
        return number;
    }

}
