package com.cn.study.observerpattern.guava.gperadvice;

import com.cn.study.observerpattern.gperadvice.GPer;
import com.cn.study.observerpattern.gperadvice.Question;
import com.google.common.eventbus.EventBus;

public class Test {

    public static void main(String[] args) {
        //消息总线
        EventBus eventBus = new EventBus();

        EventListener listener = new EventListener("Tom");
        eventBus.register(listener);
        Question question = new Question();
        question.setUserName("小李");
        question.setContent("什么是观察者设计模式？");
        Event event = new Event(GPer.getInstance(), question);
        eventBus.post(event);
    }

}
