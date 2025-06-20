package com.xworkz.marriage.constant;

public enum MAProperties {
    SRUJANA,
    URL("jdbc:mysql://localhost:3306/marriage"),
    USER_NAME("root"),
    SECRET("Srujana#2001"),
    VERSION_8;

    private String prop;

    private  MAProperties(String prop)
    {
        this.prop=prop;
    }
    private MAProperties()
    {

    }

    public String getProp() {
        return prop;
    }
}

