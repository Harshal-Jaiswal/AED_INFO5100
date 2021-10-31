package Model;

public class City {
    private String cityName;
    
    public City(String c ){
        cityName = c;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
