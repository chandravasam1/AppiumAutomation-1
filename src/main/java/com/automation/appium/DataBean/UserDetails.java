package com.automation.appium.DataBean;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

public class UserDetails {

    String firstName;
    String lastName;
    String email;
    String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void generateRandomData() {
        Faker faker = new Faker();
        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
        email = faker.internet().emailAddress();
        password = RandomStringUtils.randomAlphanumeric(9) + "!";
    }

    public static void main(String[] args) {
       UserDetails userDetails = new UserDetails();
       userDetails.generateRandomData();
        System.out.println(userDetails.getEmail());
        System.out.println(userDetails.getFirstName());
    }
}
