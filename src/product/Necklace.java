package product;

public class Necklace extends Product{

    int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public Necklace(String name, String type, int price, int length){
        super(name, type, price);
        this.length = length;
    }
}
