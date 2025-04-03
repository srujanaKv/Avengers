package in.sruj.weather;


    public class Temperature{
        public Temperature(Weather weather){
            System.out.println("running constructor in temperature");
            weather.rain();
        }
        public static void winter(){
            System.out.println("running in winter method in temperature");
        }
    }

