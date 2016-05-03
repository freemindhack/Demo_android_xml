package entity;

/**
 * Created by llw on 2016/5/3.
 */
public class Student {
    private String id;
    private String name;
    private int age;
    private String sex;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public int getAge() {
        return age;
    }


    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }
}

