public interface ActorBehaviour {

    /**
     * Устанавливает статус, сделал ли Actor заказ.
     * @param makeOrder true, если заказ сделан; иначе false
     */
    void setMakeOrder(boolean makeOrder);

    /**
     * Устанавливает статус, взял ли Actor заказ.
     * @param takeOrder true, если заказ взят; иначе false
     */
    void setTakeOrder(boolean takeOrder);

    /**
     * Проверяет, сделал ли Actor заказ.
     * @return true, если заказ сделан; иначе false
     */
    boolean isMakeOrder();

    /**
     * Проверяет, взял ли Actor заказ.
     * @return true, если заказ взят; иначе false
     */
    boolean isTakeOrder();
}