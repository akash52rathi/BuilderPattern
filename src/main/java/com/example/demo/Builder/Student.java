package com.example.demo.Builder;

public class Student {
    private int id;
    private  String name;
    private String address;
    private String mobno;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobno='" + mobno + '\'' +
                '}';
    }

    private Student()
    {

    }

    public static class Builder{
        private int id;
        private  String name;
        private String address;
        private String mobno;

        public Builder(int id)
        {
            this.id =id;
        }

       public Builder withname(String name)
       {
           this.name=name;
           return this;
       }
       public Builder withaddress(String address)
       {
           this.address=address;
           return this;
       }
        public Builder withmobno(String mobno)
        {
            this.mobno=mobno;
            return this;
        }

        public Student build()
        {
            Student s1 = new Student();
            s1.name=this.name;
            s1.address=this.address;
            s1.id=this.id;
            s1.mobno=this.mobno;
            return s1;
        }

    }

}
