package com.json;

public class Currency {

    private Long id;
    private String code;
    private String name_short;
    private String name_full;

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName_short() {
        return name_short;
    }

    public String getName_full() {
        return name_full;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name_short='" + name_short + '\'' +
                ", name_full='" + name_full + '\'' +
                '}';
    }
}
