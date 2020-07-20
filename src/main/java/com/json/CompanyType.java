package com.json;


public class CompanyType {

    private Long id;
    private String name_short;
    private String name_full;

    public Long getId() {
        return id;
    }

    public String getName_short() {
        return name_short;
    }

    public String getName_full() {
        return name_full;
    }

    @Override
    public String toString() {
        return "CompanyType{" +
                "id=" + id +
                ", name_short='" + name_short + '\'' +
                ", name_full='" + name_full + '\'' +
                '}';
    }
}
