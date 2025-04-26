package lowLevelDesign.bookMyShow;

import lowLevelDesign.bookMyShow.enums.City;

public class Address {
    private int id;
    private String plotNo;
    private String street;
    private City city;
    private String pincode;
    
    public Address(int id, String plotNo, String street, City city, String pincode) {
        this.id = id;
        this.plotNo = plotNo;
        this.street = street;
        this.city = city;
        this.pincode = pincode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlotNo() {
        return plotNo;
    }

    public void setPlotNo(String plotNo) {
        this.plotNo = plotNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
