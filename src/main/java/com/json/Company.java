package com.json;

import java.time.LocalDate;
import java.util.List;

public class Company {

    private Long id;
    private String code;
    private String name_full;
    private String name_short;
    private Long inn;
    private String ogrn;
    private LocalDate egrul_date;
    private String fio_head;
    private String address;
    private String phone;
    private String e_mail;
    private String www;
    private Boolean is_resident;
    private CompanyType companyType;
    private List<CompanySecurities> securities = null;

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName_full() {
        return name_full;
    }

    public String getName_short() {
        return name_short;
    }

    public Long getInn() {
        return inn;
    }

    public String getOgrn() {
        return ogrn;
    }

    public LocalDate getEgrul_date() {
        return egrul_date;
    }

    public String getFio_head() {
        return fio_head;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getE_mail() {
        return e_mail;
    }

    public String getWww() {
        return www;
    }

    public Boolean getIs_resident() {
        return is_resident;
    }

    public CompanyType getCompanyType() {
        return companyType;
    }

    public List<CompanySecurities> getSecurities() {
        return securities;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name_full='" + name_full + '\'' +
                ", name_short='" + name_short + '\'' +
                ", inn=" + inn +
                ", ogrn='" + ogrn + '\'' +
                ", egrul_date=" + egrul_date +
                ", fio_head='" + fio_head + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", e_mail='" + e_mail + '\'' +
                ", www='" + www + '\'' +
                ", is_resident=" + is_resident +
                ", companyType=" + companyType +
                ", securities=" + securities +
                '}';
    }
}
