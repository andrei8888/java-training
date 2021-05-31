package code._4_student_effort.ch3;

public class RealEstateAgentProxy {
    Apartment[] apartments;

    public RealEstateAgentProxy(){
        apartments=new Apartment[0];
    }

    public void represent(Apartment apartment){
        Apartment[] dummy=apartments;
        apartments=new Apartment[dummy.length+1];
        for(int i=0;i<dummy.length;i++)
            apartments[i]=dummy[i];
        apartments[dummy.length]=apartment;
    }

    public Apartment rent(Student student){
        if(student.getName().charAt(0)!='P')
            return apartments[apartments.length-1];
        else
            return null;
    }
}
