package com.cn.study.observerpattern.gperadvice;

import java.util.Observable;

/**
 * JDK提供的一种观察者的实现方法
 */
public class GPer extends Observable {

    private String name = "GPer生态圈";
    private static GPer gper = null;

    private GPer(){

    }

    public String getName() {
        return name;
    }

    public static GPer getInstance(){
        if(gper == null){
            gper = new GPer();
        }
        return gper;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUserName() + "在"
                + this.name + "上提交了一个问题。");
        setChanged();
        notifyObservers(question);
    }

}
