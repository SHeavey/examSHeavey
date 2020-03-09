package ie.gmit;
//Shane Heavey
//Employee class generating variables and creating arguments that will be tested for pass/fail
//g00325970@gmit.ie
//09/03/2020
public class Employee {
    private String title;
    private String name;
    private String pps;
    private String phone;
    private String employmentStatus;
    private int age;

    public Employee(String title, String name, String pps, String phone, String employmentStatus, int age) {
        //this.title = title;
        //this.name = name;
        //this.pps = pps;
        //this.phone = phone;
        //this.employmentStatus = employmentStatus;
        //this.age = age;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        System.out.println("Title: " + title);
        if (title.equals("Mr") || title.equals("Mrs") || title.equals("Ms")){
            this.title = title;
        }else
            throw new IllegalArgumentException("The title you entered is invalid");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Name: " + name);
        if(name.length()>= 5 && name.length() <= 22){
            this.name = name;
        }else
            throw new IllegalArgumentException("The name entered is either too long or too short");
    }

    public String getPps() {
        return pps;
    }

    public void setPps(String pps) {
        System.out.println("PPS Number: " + pps);
        if(pps.length() == 6)
            this.pps = pps;
        else
            throw new IllegalArgumentException("Invalid characters entered in for PPS Number");
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        System.out.println("Phone Number: " + phone);
        if(phone.length() == 7)
            this.phone = phone;
        else
            throw new IllegalArgumentException("Invalid phone number");

    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        System.out.println("Employment status: " + employmentStatus);
        if(employmentStatus.equals("Part-time") || employmentStatus.equals("Full-time"))
            this.employmentStatus = employmentStatus;
        else
            throw new IllegalArgumentException("Employment status incorrect");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Age: " + age);
        if(age >= 18)
            this.age = age;
        else
            throw new IllegalArgumentException("You are too young!");
    }
}
