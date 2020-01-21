package com.example.new_auction_android_client;

public enum Url {

    SERVER("http://10.102.61.109:8080"),
    LOGIN(SERVER.url + "/user/login")
    ;

    private final String url;

    Url(String url){
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
