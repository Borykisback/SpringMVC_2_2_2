package web.model;

public class Car {
    private int id;
    private String name;
    private String series;

    public Car() {}

    public Car(int id, String name, String series) {
        this.id = id;
        this.name = name;
        this.series = series;
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

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
}
