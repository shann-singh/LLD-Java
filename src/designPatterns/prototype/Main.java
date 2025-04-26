package designPatterns.prototype;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BasicInfo basicInfo = new BasicInfo("Ramesh", "ramesh@gmail.com");
        List<WorkExpirence> workExperiences = new ArrayList<>();

        Calendar startDate1 = Calendar.getInstance();
        startDate1.set(2017, 6, 21);
        Calendar endDate1 = Calendar.getInstance();
        endDate1.set(2021, 04, 24);
        Calendar startDate2 = Calendar.getInstance();
        startDate2.set(2021, 04, 25);

        workExperiences.add(new WorkExpirence("infosys", "system engineer", startDate1.getTime(), endDate1.getTime()));
        workExperiences.add(new WorkExpirence("oracle", "sde 2", startDate2.getTime(), null));
        System.out.println("--------------------------------");

        Resume resume = new Resume(basicInfo, workExperiences);
        System.out.println("original resume");
        System.out.println(resume);

        Resume clonedResume = resume.clone();
        System.out.println();

        clonedResume.basicInfo.setName("Suresh");
        clonedResume.basicInfo.setEmail("suresh@gmail.com");
        System.out.println("Cloned resume");
        System.out.println(clonedResume);
    }

}
