package com.afeiluo.sevice;

public class HelloService {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String sayHello() {
        return "hello, " + content;
    }

}
