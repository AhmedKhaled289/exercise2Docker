package com.example.servicelayer;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Company")
public class Company implements Serializable {



    @Id
    @Column(name = "company_Id")
    public Long company_Id;
    @Column(name = "name")
    public String name;
    @Column(name = "catchPhrase")
    public String catchPhrase;
    @Column(name = "bs")
    public String bs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    public Long getCompany_Id() {
        return company_Id;
    }

    public void setCompany_Id(Long company_Id) {
        this.company_Id = company_Id;
    }
}
