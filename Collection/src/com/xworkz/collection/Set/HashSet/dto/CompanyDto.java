package com.xworkz.collection.Set.HashSet.dto;

import java.io.Serializable;
import java.util.Objects;

public class CompanyDto implements Serializable {

    private String companyName;
    private String ocation;
    private String ceoName;

    public CompanyDto(){

    }

    public CompanyDto(String companyName, String location, String ceoName) {
        this.companyName = companyName;
        this.ocation = location;
        this.ceoName = ceoName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getOcation() {
        return ocation;
    }

    public void setOcation(String ocation) {
        this.ocation = ocation;
    }

    public String getCeoName() {
        return ceoName;
    }

    public void setCeoName(String ceoName) {
        this.ceoName = ceoName;
    }

    @Override
    public String toString() {
        return
                "companyName='" + companyName + '\'' +
                ", ocation='" + ocation + '\'' +
                ", ceoName='" + ceoName + '\''
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyDto that = (CompanyDto) o;
        return Objects.equals(companyName, that.companyName) && Objects.equals(ocation, that.ocation) && Objects.equals(ceoName, that.ceoName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, ocation, ceoName);
    }
}
