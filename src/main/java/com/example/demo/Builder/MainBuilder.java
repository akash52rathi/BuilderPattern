package com.example.demo.Builder;



public class MainBuilder {
    public static void main(String[] args) {
        Student student = new Student.Builder(1234)
                .withname("AKash")
                .withaddress("barmer")
                .withmobno("9799001653")
                .build();
        System.out.println(student.toString());

       StudentwithLombokBuilder student2 =new StudentwithLombokBuilder.StudentwithLombokBuilderBuilder()
               .id(12345)
               .address("Jaipur")
               .mobno("288282")
               .build();

        System.out.println(student2.toString());
    }
}
