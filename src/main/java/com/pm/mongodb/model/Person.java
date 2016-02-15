package com.pm.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by pmackiewicz on 2016-02-10.
 */
@Document(collection = "persons")
public class Person {

    @Id
    private String id;

    private String firstname;

    private String lastname;

    private Integer age;

    private Address address;

    private List<Answer> answer;

    private LocalDate birthDate;

    @Version
    Long version;

    public Person(String firstname, String lastname, Integer age, Address address, List<Answer> answer, LocalDate birthDate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
        this.answer = answer;
        this.birthDate = birthDate;
    }

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", answer=" + answer +
                ", birthDate=" + birthDate +
                ", version=" + version +
                '}';
    }
}