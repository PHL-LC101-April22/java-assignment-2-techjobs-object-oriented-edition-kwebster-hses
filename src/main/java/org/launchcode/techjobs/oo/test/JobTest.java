package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {


    public Job createCarObject() {
      Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        System.out.println(test_job.getPositionType());
       return test_job;

    }

    @Test
    public void createObject() {
        Job newJ = this.createCarObject();
        System.out.println(newJ.getPositionType());


    }
    @Test
    public void testSettingJobId() {
        Job newJ = this.createCarObject();
        Job oldJ = new Job();
       // System.out.println(newJ.getPositionType());
        assertNotEquals(oldJ,newJ);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job newJ = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job oldJ = new Job();
        // System.out.println(newJ.getPositionType());
        // Test to see if Job
        boolean b = newJ instanceof Job;
        //Testing to see that values declared in Job class match input
        //1
        assertEquals(new String(String.valueOf(newJ.getEmployer())),"ACME");
        //2
        assertTrue(String.valueOf(b), true);
        //3
        assertTrue(newJ.getName(), true);
        assertEquals(new String(String.valueOf(newJ.getName())),"Product tester");
        //4
        assertEquals(new String(String.valueOf(newJ.getLocation())),"Desert");
        //5
        assertEquals(new String(String.valueOf(newJ.getCoreCompetency())),"Persistence");

    }

    @Test
    public void testJobsForEquality() {
        Job newJ = this.createCarObject();
        var refJob = newJ;
        Job jobT = new Job();
      System.out.println(new String(String.valueOf(jobT.getName())));

        assertTrue(newJ.equals(refJob));
        assertFalse(newJ.equals(jobT));

        System.out.println(newJ.toString());
        System.out.println(jobT.toString());

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine () {
        Job newJ = new Job();
        // "Product tester", Employer("ACME"),Location("Desert"),PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(newJ.toString(),"\n Name: Data Not Available \n Employer: Data Not Available \n Location: Data Not Available \n ID: 1 \n Corecompetency: Data Not Available \n PositionType: Data Not Available \n Job does not exist");
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job newJ = this.createCarObject();
        // "Product tester", Employer("ACME"),Location("Desert"),PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(newJ.toString(),"\n Name: Product tester \n Employer: ACME \n Location: Desert \n ID: 1 \n Corecompetency: Persistence \n PositionType: Quality control \n ");
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job newJ = this.createCarObject();
        // "Product tester", Employer("ACME"),Location("Desert"),PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(newJ.toString(),"\n Name: Product tester \n Employer: ACME \n Location: Desert \n ID: 1 \n Corecompetency: Persistence \n PositionType: Quality control \n ");
    }





  /*  @Test
    public PositionType testCarException() {
        Job newjob = this.createCarObject();

        System.out.println(newjob.getPositionType());
        return newjob.getPositionType();






    }*/

   /* @Test
    public void testHasNoArgConstructor() throws ClassNotFoundException {
        Class jobClass = getClassByName("Job");
        Constructor<Job> noArgConstructor = null;
        try {
            noArgConstructor = jobClass.getConstructor();
        } catch (NoSuchMethodException e) {
            fail("Job does not have a default/no-arg constructor");
        }

    } */



}
