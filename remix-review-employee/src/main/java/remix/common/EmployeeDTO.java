package remix.common;

public class EmployeeDTO {

    String id;
    String name;
    String no;
    String email;
    String phone;
    String departmentCode;
    String jobCode;
    String salaryLevel;
    Integer salary;
    Double bonus;
    String managerID;
    java.util.Date hireDate;
    java.util.Date entDate;
    String entYn;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String id, String name, String no, String email, String phone, String departmentCode, String jobCode, String salaryLevel, Integer salary, Double bonus, String managerID, java.util.Date hireDate, java.util.Date entDate, String entYn) {
        this.id = id;
        this.name = name;
        this.no = no;
        this.email = email;
        this.phone = phone;
        this.departmentCode = departmentCode;
        this.jobCode = jobCode;
        this.salaryLevel = salaryLevel;
        this.salary = salary;
        this.bonus = bonus;
        this.managerID = managerID;
        this.hireDate = hireDate;
        this.entDate = entDate;
        this.entYn = entYn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getSalaryLevel() {
        return salaryLevel;
    }

    public void setSalaryLevel(String salaryLevel) {
        this.salaryLevel = salaryLevel;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public String getManagerID() {
        return managerID;
    }

    public void setManagerID(String managerID) {
        this.managerID = managerID;
    }

    public java.util.Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(java.util.Date hireDate) {
        this.hireDate = hireDate;
    }

    public java.util.Date getEntDate() {
        return entDate;
    }

    public void setEntDate(java.util.Date entDate) {
        this.entDate = entDate;
    }

    public String getEntYn() {
        return entYn;
    }

    public void setEntYn(String entYn) {
        this.entYn = entYn;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", no='" + no + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                ", jobCode='" + jobCode + '\'' +
                ", salaryLevel='" + salaryLevel + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", managerID=" + managerID +
                ", hireDate='" + hireDate + '\'' +
                ", entDate='" + entDate + '\'' +
                ", entYn='" + entYn + '\'' +
                '}';
    }
}
