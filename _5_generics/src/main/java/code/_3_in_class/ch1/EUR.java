package code._3_in_class.ch1;

public class EUR extends Currency {
    {
        super.setName("EURO");
    }

    public EUR(){
    }

    public EUR(float value){
        super.setValue(value);
    }
}
