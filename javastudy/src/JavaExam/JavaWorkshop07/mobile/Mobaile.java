package mobile;

public class Mobile {
    String code;
    String name;
    double price;

    public Mobile(String code, String name, double price) {
        this.code = code;
        this.name= name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String printInfo() {
        return code+" "+name + " "+price;
    }

    public String getCode() {
        return code;
    }
}