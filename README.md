# ObserverPattern
观察者模式                               
2、用Guava API实现GPer社区提问通知的业务场景。                               
                               
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



