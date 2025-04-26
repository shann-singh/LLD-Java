package designPatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Resume implements Prototype<Resume> {
    BasicInfo basicInfo;
    List<WorkExpirence> workExpirences;

    Resume(BasicInfo basicInfo, List<WorkExpirence> workExpirences2) {
        this.basicInfo = basicInfo;
        this.workExpirences = workExpirences2;
    }

    public BasicInfo getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(BasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    public List<WorkExpirence> getWorkExpirences() {
        return workExpirences;
    }

    public void addWorkExpirence(WorkExpirence workExpirence) {
        this.workExpirences.add(workExpirence);
    }

    public Resume clone() {
        Resume clonedResume = new Resume(basicInfo.clone(), new ArrayList<WorkExpirence>());
        for(WorkExpirence workExpirence: workExpirences) {
            clonedResume.addWorkExpirence(workExpirence.clone());
        }
        return clonedResume;
    }

    public String toString() {
        return "Resume{" +
            "basicInfo=" + basicInfo +
            ", workExpirences=" + workExpirences +
            '}';
    }
}
