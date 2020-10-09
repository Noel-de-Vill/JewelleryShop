package product;

public class Rings extends Product{

    int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public Rings(String name, String type, int price, int size){
        super(name, type, price);
        this.size = size;
    }
}
