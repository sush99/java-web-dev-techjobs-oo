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

}
