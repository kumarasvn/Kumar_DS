package com.interview.indeed;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/*class representing the Job
 * */
 class Job {

    String title;
    String organizationName;
    String location;
    String jobURL;
    String jobType;
    String applyURL;

    Job(String title, String organizationName, String jobType, String location, String jobURL, String applyURL) {
        this.title = title;
        this.organizationName = organizationName;
        this.jobType = jobType;
        this.location = location;
        this.jobURL = jobURL;
        this.applyURL = applyURL;

    }

    String getTitle() {
        return title;
    }

    String getOrganizationName() {
        return organizationName;
    }

    String getLocation() {
        return location;
    }

    String getJobType() {
        return jobType;
    }

    String getJobURL() {
        return jobURL;
    }

    String getApplyURL() {
        return applyURL;
    }

    void printJobMetaData() {
        System.out.println("Job URL is : " + getJobURL());
        System.out.println("Job Title is : " + getTitle());
        System.out.println("Job Organization Name : " + getOrganizationName());
        System.out.println("Job Type : " + getJobType());
        System.out.println("Job Location : " + getLocation());
        System.out.println("Apply here if interested : " + getApplyURL());
        System.out.println();
    }

    void printQAForJob() {
        try {
            Properties keyStoreProps=new Properties();
            FileInputStream configFile=new FileInputStream("config.properties");
            keyStoreProps.load(configFile);
            System.setProperty("javax.net.ssl.trustStore", keyStoreProps.getProperty("keyStoreLocation"));
            System.out.println("URL to apply for this Job :" + getApplyURL());
            Document doc = Jsoup.connect(getApplyURL()).timeout(0).get();
            Element additionalInformation = doc.getElementById("user_user_form_group_additional_information");
            Elements questions = additionalInformation.select("label");
            System.out.println("first question is :" + questions.get(0).ownText());
            Elements options = doc.getElementsByAttributeValue("name", "field_source[und]").get(0).children();
            System.out.println("available options for first question are: ");
            for (Element option : options)
                System.out.println(option.ownText());
            System.out.println();
            System.out.println("Second question is :" + questions.get(1).ownText());
            options = doc.getElementsByAttributeValue("name", "field_hear[und]").get(0).children();
            System.out.println("available options for second question are: ");
            for (Element option : options)
                System.out.println(option.ownText());

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
