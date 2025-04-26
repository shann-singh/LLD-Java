package lowLevelDesign.bookMyShow;

import lowLevelDesign.bookMyShow.enums.City;

import java.util.List;

public class Theatre {
    private int id;
    private String name;
    private Address address;
    private List<Screen> screens;
    private List<Show> shows;

    public Theatre(int id, String name, Address address, List<Screen> screens, List<Show> shows) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.screens = screens;
        this.shows = shows;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}
