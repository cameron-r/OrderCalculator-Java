public class Item {
    public enum ItemType {
        NORMAL, FOOD, BOOK
    }
    public final ItemType type;
    public final double unitPrice;

    public Item(ItemType type, double unitPrice) {
        this.type = type;
        this.unitPrice = unitPrice;
    }
}
