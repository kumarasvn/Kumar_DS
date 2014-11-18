package com.interview.indeed;

import java.util.Iterator;
import java.util.List;

public class ExecutorClass {

    public static void main(String [] args) {

        GetJobsAndMetaData jobsObj = new GetJobsAndMetaData();
        List<Job> jobsList = jobsObj.getAllJobs();
        Iterator<Job> jobs = jobsList.iterator();

        System.out.println("Following are the meta data of Jobs");
        while (jobs.hasNext()) {
            Job j = jobs.next();
            j.printJobMetaData();
        }
        System.out.println("Following are the questions on each job application");
        jobs = jobsList.iterator();
        while (jobs.hasNext()) {
            Job j = jobs.next();
            j.printQAForJob();
        }

    }

}
