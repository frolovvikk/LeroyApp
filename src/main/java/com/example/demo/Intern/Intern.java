package com.example.demo.Intern;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Intern")
public class Intern {

    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String education;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEducation(){
        return education;
    }

    public void setEducation(String education){
        this.education = education;
    }
}

/*
curl -i -X POST -H "Content-type:application/json" -d "{ \"id\" : \"1\", \"firstName\" : \"Viktor\" , \"lastName\" : \"Frolov\", \"education\" : \"HSE\"}" localhost:8080/addIntern
 */