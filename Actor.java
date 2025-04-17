public abstract class Actor implements ActorBehaviour {
    protected boolean isTakeOrder;   // Указывает, взял ли Actor заказ
    protected boolean isMakeOrder;   // Указывает, делает ли Actor заказ
    protected final String name;     // Имя Actor

    // Конструктор  инициализации  Actor
    public Actor(String name) {
        this.name = name;
    }

    // Геттер для получения  Actor
    public String getName() {
        return name;
    }
}