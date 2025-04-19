Обновленная структура кода с учетом SOLID
1. Интерфейсы поведения
public interface ActorBehaviour {
    void setMakeOrder(boolean makeOrder);
    void setTakeOrder(boolean takeOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();
}

2. Абстрактный класс Actor
public abstract class Actor implements ActorBehaviour {
    protected boolean isTakeOrder;   // Взял ли Actor заказ
    protected boolean isMakeOrder;   // Сделал ли Actor заказ
    protected final String name;     // Имя Actor

    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        this.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        this.isTakeOrder = takeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}

3. Класс Human, реализующий поведение
public class Human extends Actor {

    public Human(String name) {
        super(name);
    }
}

4. Основной класс Main
public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр Human
        Human human = new Human("Анна");

        // Проверка работы
        human.setMakeOrder(true);
        human.setTakeOrder(false);

        System.out.println("Actor: " + human.getName());
        System.out.println("Сделал заказ: " + human.isMakeOrder());
        System.out.println("Взял заказ: " + human.isTakeOrder());
    }
}
Изменения по принципам SOLID
1. Single Responsibility Principle (SRP)
Каждый класс и интерфейс отвечает за свою конкретную задачу:
ActorBehaviour — определяет контракт поведения.
Actor — реализует базовое поведение и хранит общие свойства.
Human — конкретный тип актера, который может быть расширен в будущем.
2. Open/Closed Principle (OCP)
Можно добавлять новые типы актеров (например, Robot, Animal и т.д.) без изменения существующего кода.
Поведение реализуется через интерфейсы, что позволяет нам расширять функциональность, создавая новые классы.
3. Liskov Substitution Principle (LSP)
Human — может быть использован вместо Actor без нарушения логики.
Новые классы, реализующие ActorBehaviour, можно добавлять без изменения существующего кода.
4. Interface Segregation Principle (ISP)
Интерфейс ActorBehaviour содержит только необходимые методы, связанные с поведением актера.
В случае необходимости, можно создавать дополнительные интерфейсы для разделения задач.
5. Dependency Inversion Principle (DIP)
Можно внедрять зависимости через интерфейсы, например, через внедрение поведения в другие компоненты системы.
