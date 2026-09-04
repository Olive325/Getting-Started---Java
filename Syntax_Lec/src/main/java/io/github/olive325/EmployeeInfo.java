package io.github.olive325;

public class EmployeeInfo {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private String email;
    private String phoneNumber;
    private String street;
    private String state;
    private String city;
    private String zipCode;

    public EmployeeInfo(
            String firstName,
            String lastName,
            int birthYear,
            int birthMonth,
            int birthDay,
            String email,
            String phoneNumber,
            String street,
            String city,
            String state,
            String zipCode
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String firstName() {
        return firstName;
    }
    public String lastName() {
        return lastName;
    }
    public int birthYear() {
        return birthYear;
    }
    public int birthMonth() {
        return birthMonth;
    }
    public int birthDay() {
        return birthDay;
    }
    public String email() {
        return email;
    }
    public String phoneNumber() {
        return phoneNumber;
    }
    public String street() {
        return street;
    }
    public String city() {
        return city;
    }
    public String state() {
        return state;
    }
    public String zipCode() {
        return zipCode;
    }
}
