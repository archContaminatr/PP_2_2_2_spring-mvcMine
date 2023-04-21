package web.model;

public class Car {

    private String model;
    private String series;
    private int mileage;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Car(String model, String series, int mileage) {
        this.model = model;
        this.series = series;
        this.mileage = mileage;
    }
}
