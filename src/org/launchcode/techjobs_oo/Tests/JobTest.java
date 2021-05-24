package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    private Job job1;
    private Job job2;

    @Before
    public void createJobObjects(){
        job1 = new Job();
        job2 = new Job();
    }

    @Test
    public void testSettingJobId(){
        assertNotEquals(job1, job2);

    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job fullJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(fullJob.getName(), "Product tester");
        assertEquals(fullJob.getEmployer().toString(), "ACME");
        assertEquals(fullJob.getLocation().toString(), "Desert");
        assertEquals(fullJob.getPositionType().toString(), "Quality control");
        assertEquals(fullJob.getCoreCompetency().toString(), "Persistence");
    }
    @Test
    public void testJobsForEquality(){
        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1 == job2);
    }

    @Test
    public void testToStringForEmpty(){
        String expectedString = "OOPS! This job does not seem to exist.";
        Job job3 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertEquals(job3.toString(), expectedString);
    }

    @Test
    public void testToStringForFull(){
        Job job3 = new Job("Ice cream taster", new Employer("Hawaii"), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
        String expectedString = "\nID: 3\n" +//3 because its the third to be initialized in this context
                "Name: Ice cream taster\n" +
                "Employer: Hawaii\n" +
                "Location: Home\n" +
                "Position Type: UX\n" +
                "Core Competency: Taste";
        assertEquals(expectedString, job3.toString());
    }

    @Test
    public void testToStringForNonChar(){
        Job job3 = new Job("Ice cream taster", new Employer("123"), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
        String expectedString = "\nID: 3\n" +//3 because its the third to be initialized in this context
                "Name: Ice cream taster\n" +
                "Employer: 123\n" +
                "Location: Home\n" +
                "Position Type: UX\n" +
                "Core Competency: Taste";
        assertEquals(expectedString, job3.toString());
    }
}
