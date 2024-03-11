package consultation.cons_15.consultationCode;

class WeatherData {
    private int temp;
    private String description;

    public WeatherData(int temperature, String description) {
        this.temp = temperature;
        this.description = description;
    }

    public int getTemp() {
        return temp;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "temperature=" + temp +
                ", description='" + description + '\'' +
                '}';
    }
}