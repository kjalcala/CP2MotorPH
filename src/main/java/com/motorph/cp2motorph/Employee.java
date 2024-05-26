package MotorPH;

public class Employee {
	
	int id;
    String lastName;
    String firstName;
    String dateOfBirth;
    String address;
    String phoneNumber;
    String sssNumber;
    String philHealthNumber;
    String tin;
    String pagIbigNumber;
    String employmentStatus;
    String jobTitle;
    String supervisor;
    String remarks;
    double basicSalary;
    double riceSubsidy;
    double phoneAllowance;
    double clothingAllowance;
    double semiMonthlyRate;
    double hourlyRate;
    
    public Employee(int id, String lastName, String firstName, String dateOfBirth, String address, String phoneNumber,
            String sssNumber, String philHealthNumber, String tin, String pagIbigNumber, String employmentStatus,
            String jobTitle, String supervisor, String remarks, double basicSalary, double riceSubsidy,
            double phoneAllowance, double clothingAllowance, double semiMonthlyRate, double hourlyRate) {
this.id = id;
this.lastName = lastName;
this.firstName = firstName;
this.dateOfBirth = dateOfBirth;
this.address = address;
this.phoneNumber = phoneNumber;
this.sssNumber = sssNumber;
this.philHealthNumber = philHealthNumber;
this.tin = tin;
this.pagIbigNumber = pagIbigNumber;
this.employmentStatus = employmentStatus;
this.jobTitle = jobTitle;
this.supervisor = supervisor;
this.remarks = remarks;
this.basicSalary = basicSalary;
this.riceSubsidy = riceSubsidy;
this.phoneAllowance = phoneAllowance;
this.clothingAllowance = clothingAllowance;
this.semiMonthlyRate = semiMonthlyRate;
this.hourlyRate = hourlyRate;

}
    public String[] toArray() {
        return new String[]{
                String.valueOf(id), lastName, firstName, dateOfBirth, address, phoneNumber, sssNumber,
                philHealthNumber, tin, pagIbigNumber, employmentStatus, jobTitle, supervisor, remarks,
                String.valueOf(basicSalary), String.valueOf(riceSubsidy), String.valueOf(phoneAllowance),
                String.valueOf(clothingAllowance), String.valueOf(semiMonthlyRate), String.valueOf(hourlyRate)
        };
    }
}
