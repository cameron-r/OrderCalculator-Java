import java.util.List;


public class SalesTaxCalculator {

    public int addTwoNumbers(int number1, int number2) {
        return number1 + number2;
    }


    public double calculateTax(List<Item> itemList) {
        double totalTax = 0;

        for (Item item: itemList) {
            double tax = 0;
            if (item.type == Item.ItemType.NORMAL) {
                tax = 0.1;
            } else if (item.type == Item.ItemType.BOOK) {
                tax = 0.05;
            }
            totalTax += tax * item.unitPrice;
        }
        return totalTax;
    }
}
