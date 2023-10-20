public class Detailbill {
    String idProduct;
    int quantity;
    float total;

    public Detailbill(){
        this.idProduct="";
        this.quantity=0;
        this.total=0;
    }

    public Detailbill(String idProduct, int quantity, float total){
        this.idProduct=idProduct;
        this.quantity=quantity;
        this.total=total;
    }
}
