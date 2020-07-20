package com.json;

import java.time.LocalDate;

public class CompanySecurities {

    private int id;
    private String code;
    private String name_full;
    private String cfi;
    private LocalDate date_to;
    private LocalDate state_reg_date;
    private State state;
    private Currency currency;

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName_full() {
        return name_full;
    }

    public String getCfi() {
        return cfi;
    }

    public LocalDate getDate_to() {
        return date_to;
    }

    public LocalDate getState_reg_date() {
        return state_reg_date;
    }

    public State getState() {
        return state;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "CompanySecurities{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name_full='" + name_full + '\'' +
                ", cfi='" + cfi + '\'' +
                ", date_to=" + date_to +
                ", state_reg_date=" + state_reg_date +
                ", state=" + state +
                ", currency=" + currency +
                '}';
    }
}
