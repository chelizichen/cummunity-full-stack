package com.example.project.pojo;


class Person{
    public String name;
    public char sex;
    public String id;
    public String email;
    public String phone;

    Person(String name,char sex,String id){
        this.name = name;
        this.sex = sex;
        this.id = id;
    }
    void setEmail(String email){
        this.email = email;
    }

    void setPhone(String phone){
        this.phone = phone;
    }

    public String toStirng(){
        return "姓名是"+this.name+" \n" +
                " 性别为" + this.sex + " \n" +
                " 邮箱为" + this.email  + "\n"+
                " 电话为" + this.phone + "\n" +
                " 身份证号为" + this.id;
    }
}

public class TestPerson {
    public static void main(String[] args) {
        Person aPerson = new Person("张三",'男',"21234213123");
        aPerson.setEmail("zhangsan@163.com");
        aPerson.setPhone("13956578888");
        System.out.println(aPerson.toStirng());
    }
}
