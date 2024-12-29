package ocp1Z0_829.question7;

public class Question7 {
    public static void main(String[] args) {
        System.out.println(Forecast.SUNNY.ordinal()+" ");
        Forecast sunny = Forecast.valueOf("SUNNY");
        System.out.println(Forecast.valueOf("rainy".toUpperCase()));
    }

    public enum Forecast{
        SUNNY,
        CLOUDY,
        RAINY;
        @Override
        public String toString() {
            return "SNOWY";
        }
    }
}
