package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.testng.Assert.assertNotEquals;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job jobFull = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertEquals("Product tester",  jobFull.getName());
        assertEquals("ACME", jobFull.getEmployer().getValue());
        assertEquals("Desert",jobFull.getLocation().getValue());
        assertEquals("Quality control", jobFull.getPositionType().getValue());
        assertEquals("Persistence", jobFull.getCoreCompetency().getValue());

        assertTrue(jobFull instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        job2.setId(2);
        assertFalse(job1.equals(job2));
    }

}
