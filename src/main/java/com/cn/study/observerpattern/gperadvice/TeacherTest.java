package com.cn.study.observerpattern.gperadvice;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("LiMing");

        GPer gper = GPer.getInstance();
        gper.addObserver(teacher);
        Question question = new Question();
        question.setUserName("张三");
        question.setContent("什么是观察者设计模式？");
        gper.publishQuestion(question);
    }

}
