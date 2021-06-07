package code._3_in_class.ch1;

public class USD extends Currency {
    {
        super.setName("US dollar");
    }

    public USD(){
    }

    public USD(float value) {
        super.setValue(value);
    }
}
