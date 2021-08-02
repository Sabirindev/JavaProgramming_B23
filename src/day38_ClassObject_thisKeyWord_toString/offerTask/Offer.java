package day38_ClassObject_thisKeyWord_toString.offerTask;

public class Offer {
    public String state, city, jobTitle;
    public double salary;
    public boolean hasBenefits, isWFH, hasPTO,isFullTime;

    public void setInfo(String state, String city, String jobTitle, double salary, boolean hasBenefits, boolean isWFH, boolean hasPTO, boolean isFullTime) {
        this.state = state;
        this.city = city;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefits = hasBenefits;
        this.isWFH = isWFH;
        this.hasPTO = hasPTO;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Offer{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefits=" + hasBenefits +
                ", isWFH=" + isWFH +
                ", hasPTO=" + hasPTO +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
/*
Offer:
	    Attributes:
	       state, hasBenifit(boolean), salary, WFH(boolean), JobTitle

	    Actions:
	        SetInfo, toString
 */
