package in.sruj.weather;

public class WeatherRunner {
    public static void main(String[] args){

        Weather weather= new Weather();
        Temperature temperature=new Temperature(weather);
        Temperature.winter();
    }
}
