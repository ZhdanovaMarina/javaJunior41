package lesson8.Homework;

public class Tour {

    private String country;
    private String day;
    private String transport;
    private int price;


    public void setCountry(String country) {
        this.country = country;
    }
    public void setDay(String day) {
        this.day = day;
    }
    public void setTransport(String transport) {
        this.transport = transport;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getCountry() {
        return country;
    }
    public String getDay() {
        return day;
    }
    public String getTransport() {
        return transport;
    }
    public int getPrice() {
        return price;
    }
    public Tour(String country, String day, String transport, int price) {

    }
}