public class Temperatura {
    public static void main(String[] args) {
        double C, K, F, Re, Ra;
        C = 27;

        F = C * 1.8 + 32;
        K = C + 273.15;
        Ra = C * 1.8 + 32 + 459.67;
        Re = C * 0.8;

        System.out.println("A temperatura de uma cidade é de: "+C+"°C");
        System.out.println("Convertendo essa temperatura para outras medidas teremos:");
        System.out.println("Em Fahrenheit: "+F);
        System.out.println("Em Kelvin: " + K);
        System.out.println("Em Reaumur: " + Ra);
        System.out.println("Em Rankine: " + Re);
    }
}