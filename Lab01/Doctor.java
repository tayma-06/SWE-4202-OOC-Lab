public class Doctor {
    private String name;
    private String designation;
    private String weekend;
    private Boolean vacancy;
    private String dutyTime;
    private String qualification;

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getWeekend() {
        return weekend;
    }

    public Boolean getVacancy() {
        return vacancy;
    }

    public String getDutyTime() {
        return dutyTime;
    }

    public String getQualification() {
        return qualification;
    }

    public void setName(String n) {
        name = n;
    }

    public void setDesignation(String d) {
        designation = d;
    }

    public void setVacancy(Boolean v) {
        vacancy = v;
    }

    public void setDutyTime(String t) {
        dutyTime = t;
    }

    public void setQualification(String q) {
        qualification = q;
    }

}
