package com.interview.indeed;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/*class responsible to crawl the jobs site and populate all job objects
 * @author  Bhavani Namburi
* * */
public class GetJobsAndMetaData {

    
  /*method to populate and return all the jobs
   * */
    List<Job> getAllJobs() {
        Document doc;
        String title;
        String organizationName;
        String positionType;
        String location;
        String jobURL;
        String applyURL;

        try {

            doc = Jsoup.connect("http://www.besmith.com/candidates/search").timeout(0).get();
            List<Job> jobsList = new ArrayList<Job>();
            for (Element jobOpportunityTable : doc.select("table[id=job-opportunity]")) {
                for (Element row : jobOpportunityTable.select("tr")) {
                    Elements tds = row.select("td");
                    if (tds == null || tds.size() == 0)
                        continue;

                    Elements links = tds.get(0).select("a[href]");
                    jobURL = links.first().attr("abs:href");
                    applyURL = GettheApplicationURL(jobURL);
                    title = tds.get(0).text();
                    organizationName = tds.get(1).text();
                    positionType = tds.get(2).text();
                    location = tds.get(3).text();
                    Job newJob = new Job(title, organizationName, positionType, location, jobURL, applyURL);
                    jobsList.add(newJob);

                }
            }
            return jobsList;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
    /*Method to get the url to apply for a job using job url
     * */
    private String GettheApplicationURL(String jobURL) {
        try {
            Document doc = Jsoup.connect(jobURL).timeout(0).get();
            Element applyNowclass = doc.getElementsByClass("apply-now").first();
            String urlToApplyJob = applyNowclass.attr("abs:href");
            return urlToApplyJob;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "";
    }

}
