package com.virtusa.District;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class District {
    private int id;
    private String name;
    private String secretory;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecretory() {
        return secretory;
    }

    public void setSecretory(String secretoy) {
        this.secretory = secretoy;
    }

    public District(){
    }
    public District(int id, String name, String secretory){
        super();
        this.id = id;
        this.name = name;
        this.secretory = secretory;
    }
}
