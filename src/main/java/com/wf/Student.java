package com.wf;

/**
 * Created by Administrator on 2019/10/24.
 */
class Student {// 学生类
    private String name;
    private double score;// 成绩

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
