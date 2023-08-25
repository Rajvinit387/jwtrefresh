package com.example.jwtnew.model;

public class Refreshtokenrequest {

    private String refreshtoken;

    public Refreshtokenrequest(String refreshtoken) {
        this.refreshtoken = refreshtoken;
    }

    public Refreshtokenrequest() {



    }

    public String getRefreshtoken() {
        return refreshtoken;
    }

    public void setRefreshtoken(String refreshtoken) {
        this.refreshtoken = refreshtoken;
    }
}
