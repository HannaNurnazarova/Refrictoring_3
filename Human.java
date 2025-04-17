public class Human extends Actor {

    public Human(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name; // Можно оставить так, так как name в базовом классе
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