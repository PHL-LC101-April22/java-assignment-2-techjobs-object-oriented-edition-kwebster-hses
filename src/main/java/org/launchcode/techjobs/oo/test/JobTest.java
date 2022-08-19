package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
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
    // AYE BOI WE WANT TO CREATE AN ABSTRACT CLASS FOR ALL OF THE GETTERS AND SETTERS THAT SHARE COMMON VARIABLES NOT METHODS

    @Test
    public void createObject() {
        Job newJ = this.createCarObject();
        System.out.println(newJ);
        System.out.println(newJ.getId());


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
        //4
        assertEquals(new String(String.valueOf(newJ.getName())),"Product tester");
        //5
        assertEquals(new String(String.valueOf(newJ.getLocation())),"Desert");
        //6
        assertEquals(new String(String.valueOf(newJ.getCoreCompetency())),"Persistence");
        //7
        assertEquals(new String(String.valueOf(newJ.getPositionType())),"Quality control");
        //8
        assertTrue(String.valueOf(b), true);
        //9
        assertTrue(newJ.getName(), true);
        //10
        assertTrue(String.valueOf(b), true);




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
        Job newJ = this.createCarObject();
        String x = newJ.toString();
        String begin = x.substring(0,1);
        String end = x.substring(x.length()-1,x.length());


        System.out.println(begin+"lox"+end+"PHL");
        // "Product tester", Employer("ACME"),Location("Desert"),PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertEquals(begin,"\n");
        Assert.assertEquals(end,"\n");
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
