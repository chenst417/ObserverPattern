package com.cn.study.observerpattern.guava.gperadvice;

import com.cn.study.observerpattern.gperadvice.GPer;
import com.cn.study.observerpattern.gperadvice.Question;

public class Event {

    private GPer gper;
    private Question question;

    public Event(GPer gper, Question question) {
        this.gper = gper;
        this.question = question;
    }

    public GPer getGper() {
        return gper;
    }

    public Question getQuestion() {
        return question;
    }

}
