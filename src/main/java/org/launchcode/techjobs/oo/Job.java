package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String nam, Employer employe, Location locate, PositionType pos, CoreCompetency core){
    this();
    this.name = nam;
    this.employer = employe;
    this.location = locate;
    this.positionType = pos;
    this.coreCompetency = core;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job newJ = (Job) o;
        return getId() == newJ.getId();
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


   /* public void setId(int id) {
        this.id = id;
    } */

    public static void setNextId(int nextId) {
        Job.nextId = nextId;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override

    public String toString(){

        int counter = 0;
        Location gotNull = new Location("Data Not Available");
        Employer gotNul = new Employer("Data Not Available");
        CoreCompetency otNull = new CoreCompetency("Data Not Available");
        PositionType Nulli = new PositionType("Data Not Available");
        String exist="";

        //setvalue kept giving me nullpointing errors even though it initially worked
        // I can wrap this inside of a while loop based on a new counter I define and want it be less than job.length
        //still tryna figure out how to have my int become an integer otherwise I'll have to do this via other means
        do {
           if (this.getName() == null) {
                counter++;
                this.name = "Data Not Available";
            }
            if (this.getEmployer() == null) {
                counter++;
                this.employer = gotNul;
            }
            if((this.getId() < 0)){
            this.id = 11111;
            }
            if (this.getCoreCompetency() == null) {
                counter++;
                this.coreCompetency = otNull;
            }
            if (this.getLocation() == null) {
                counter++;
                //this.location.setValue("ask");
                this.location = gotNull;
            }
            if (this.getPositionType() == null) {
                counter++;
                //this.location.setValue("ask");
                this.positionType = Nulli;
            }
            if(counter >= 5){
                exist = "Job does not exist";
            }

            else{
                break;
            }
            }
            while(counter < 1);

        String x = String.valueOf((counter));
       // System.out.println(x);
        String studentReport = String.format("\n Name: %s \n Employer: %s \n Location: %s \n ID: %d \n Corecompetency: %s \n PositionType: %s \n %s", this.getName(), this.getEmployer(),this.getLocation(), this.getId(), this.getCoreCompetency(), this.getPositionType(), exist);
        return studentReport;

        }


    }



