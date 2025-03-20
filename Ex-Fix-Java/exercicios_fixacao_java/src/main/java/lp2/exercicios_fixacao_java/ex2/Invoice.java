package lp2.exercicios_fixacao_java.ex2;

public class Invoice {

    public int id;
    public int item_id;
    public String item_description;
    public int quantity;
    public double unity_price;

    public Invoice (int id, int item_id, String Item_description, int quantity, double unity_price) {
        this.id = id;
        this.item_id = item_id;
        this.item_description = Item_description;
        this.quantity = quantity;
        this.unity_price = unity_price;
    }

    public void SetItem(int item_id){
        this.item_id = item_id;
    }

    public void SetItemDescription(String Item_description){
        this.item_description = Item_description;
    }

    public void SetQuantity(int quantity){

        this.quantity = Math.max(quantity, 0);

    }

    public void SetUnityPrice(double unity_price){

        this.unity_price = Math.max(unity_price, 0);

    }

    public int getId() {
        return id;
    }

    public int getItem_id() { return item_id; }

    public String getItem_description() { return item_description; }

    public int getQuantity() { return quantity; }

    public double getUnity_price() { return unity_price; }

    public double getInvoiceAmount(){
        return quantity*unity_price;
    }

}
