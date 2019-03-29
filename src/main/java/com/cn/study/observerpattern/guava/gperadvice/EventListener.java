package com.cn.study.observerpattern.guava.gperadvice;

import com.cn.study.observerpattern.gperadvice.GPer;
import com.cn.study.observerpattern.gperadvice.Question;
import com.google.common.eventbus.Subscribe;

public class EventListener {

    private String name;

    public EventListener(String name) {
        this.name = name;
    }

    @Subscribe
    public void subscribe(Event event){
        GPer gper = event.getGper();
        Question question = event.getQuestion();
        gper.publishQuestion(question);
        System.out.println("=====================================");
        System.out.println(this.name + "老师，您好！\n" + "您收到了一个来自“"
                + gper.getName() + "”的提问，希望您解答，问题内容如下：\n" +
                question.getContent() + "\n" + "提问者：" + question.getUserName());
    }

}
