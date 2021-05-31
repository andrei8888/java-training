package code._4_student_effort.ch6;

import java.util.Arrays;

public class Person {
    String name;
    Job job;
    University university;
    Licenses drivingLicense;
    boolean isMarried;

    Person(String name){
        this.name=name;
    }

    public Person(String name, Job job) {
        this.name = name;
        this.job = job;
    }

    public Person(String name, Job job, University university, Licenses drivingLicense, boolean isMarried) {
        this.name = name;
        this.job = job;
        this.university = university;
        this.drivingLicense = drivingLicense;
        this.isMarried = isMarried;
    }

    public Person(String name, University university) {
        this.name = name;
        this.university = university;
    }

    public Person(String name, Job job, University university, Licenses drivingLicense) {
        this.name = name;
        this.job = job;
        this.university = university;
        this.drivingLicense = drivingLicense;
    }

    @Override
    public String toString(){
        String ret=this.name+": ";
        if(this.job!=null)
            ret+=" | works as "+this.job.jobTitle;
        if(this.university!=null)
            ret+=" | studies at "+this.university.universityTitle;
        if(this.drivingLicense!=null)
            ret+=" | has licenses for "+ Arrays.toString(this.drivingLicense.licenses);
        if(this.isMarried)
            ret+=" | is married";
        else
            ret+=" | no information or isn\'t married";
        return ret;
    }
}
