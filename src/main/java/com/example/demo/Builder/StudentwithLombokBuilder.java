package com.example.demo.Builder;

import lombok.Builder;

@Builder
public class StudentwithLombokBuilder {

    private int id;
    private  String name;
    private String address;
    private String mobno;

    @Override
    public String toString() {
        return "StudentwithLombokBuilder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobno='" + mobno + '\'' +
                '}';
    }
}
