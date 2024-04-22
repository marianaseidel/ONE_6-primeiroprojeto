public class Conversor {
    public static void main (String[] args) {

        double temperaturaCelsius = 30.2;
        double temperaturaFahrebheit = (temperaturaCelsius * 1.8) +32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit.", temperaturaCelsius, temperaturaFahrebheit);

        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaFahrebheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);

    }
}
