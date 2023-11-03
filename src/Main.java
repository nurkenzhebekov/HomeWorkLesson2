public class Main {
    public static void main(String[] args) {

        System.out.println(ageAndTemperature(40, 29));
        System.out.println(ageAndTemperature(18, 5));
        System.out.println(ageAndTemperature(55, 26));
        System.out.println(ageAndTemperature(30, -15));
        System.out.println(ageAndTemperature(20, -25));

        System.out.println(ageAndTemperature(generateRandomAge(), 6));
        System.out.println(ageAndTemperature(generateRandomAge(), 33));
        System.out.println(ageAndTemperature(generateRandomAge(), -9));
        System.out.println(ageAndTemperature(generateRandomAge(), -22));
        System.out.println(ageAndTemperature(generateRandomAge(), 30));

    }

    public static String ageAndTemperature (int personAge, int temperature) {
        if (personAge >= 20 && personAge <= 45 && temperature >= -20 && temperature <=30) {
            return "Можно идти гулять";
        } else if (personAge < 20 && temperature >= 0 && temperature <=28) {
            return "Можно идти гулять";
        } else if (personAge > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        int r = (int) (Math.random() * 90);
        return r;
    }
}