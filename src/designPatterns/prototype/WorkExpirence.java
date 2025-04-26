package designPatterns.prototype;

import java.util.Date;

public class WorkExpirence implements Prototype<WorkExpirence> {
    private String companyName;
    private String designation;
    private Date fromDate;
    private Date toDate;

    WorkExpirence(String companyName, String designation, Date fromDate, Date toDate) {
        this.companyName = companyName;
        this.designation = designation;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    @Override
    public WorkExpirence clone() {
        return new WorkExpirence(companyName, designation, fromDate, toDate);
    }

    public String toString() {
        return "WorkExpirence{" +
                "companyName='" + companyName + '\'' +
                ", designation='" + designation + '\'' +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                '}';
    }
}
