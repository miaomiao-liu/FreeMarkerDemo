package com.liuyiqing.FreeMarkerDemo.entities;

/**
 * Created by miaomiao on 18-3-1.
 */
public class Student {

    private int id;

    private String name;

    private int grade;

    private int cls;

    private int english;

    private int chinese;

    private int math;


    public Student(int id, String name, int grade, int cls, int english, int chinese, int math) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.cls = cls;
        this.english = english;
        this.chinese = chinese;
        this.math = math;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getCls() {
        return cls;
    }

    public void setCls(int cls) {
        this.cls = cls;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
}
