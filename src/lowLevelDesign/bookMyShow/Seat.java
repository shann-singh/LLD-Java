package lowLevelDesign.bookMyShow;

import lowLevelDesign.bookMyShow.enums.CategorySeat;

public class Seat {
    private int id;
    private int row;
    private CategorySeat category;

    public Seat(int id, int row, CategorySeat category, boolean isReserved) {
        this.id = id;
        this.row = row;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public CategorySeat getCategory() {
        return category;
    }

    public void setCategory(CategorySeat category) {
        this.category = category;
    }
}
