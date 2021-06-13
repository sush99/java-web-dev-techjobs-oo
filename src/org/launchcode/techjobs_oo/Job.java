package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public String toString() {
        String tempName = name;
        String tempEmployer = employer.toString();
        String tempLocation = location.toString();
        String tempPositionType = positionType.toString();
        String tempCoreComp = coreCompetency.toString();
        if(tempEmployer.isEmpty() && tempLocation.isEmpty() && tempPositionType.isEmpty() && tempCoreComp.isEmpty()){
            return "OOPS! This job does not seem to exist.";
        }
        if(tempEmployer.isEmpty()) {
            tempEmployer = "Data not available";
        }
        if(tempLocation.isEmpty()){
            tempLocation = "Data not available";
        }
        if(tempPositionType.isEmpty()){
            tempPositionType = "Data not available";
        }
        if(tempCoreComp.isEmpty()){
            tempCoreComp = "Data not available";;
        }

        return  "\nID: " + id +
                "\nName: " + tempName +
                "\nEmployer: " + tempEmployer +
                "\nLocation: " + tempLocation +
                "\nPosition Type: " + tempPositionType +
                "\nCore Competency: " + tempCoreComp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
