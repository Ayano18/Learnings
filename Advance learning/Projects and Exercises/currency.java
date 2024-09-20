import java.util.*;

public class currency{
    public enum Money{
        PESO, DOLLAR, EURO, YEN, YUAN, RUPEE, BITCOIN;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose money to convert");
        for(Money all : Money.values()){
            System.out.println(all);
        }
        
        try{
            System.out.print("Ans: ");
            String choice1 = s.nextLine().toUpperCase();
            Money mny = Money.valueOf(choice1);
            double input;
            double exchangeRate;
            switch (mny) {
                case PESO:
                System.out.print("Enter money you want to exchange: ");
                String peso = s.nextLine().toUpperCase();
                Money ph = Money.valueOf(peso);
                switch (ph) {
                    case DOLLAR:
                        
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 0.017;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                        break;
                    case EURO:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 0.016;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                        break;
                    case YEN:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 2.73;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                        break;
                    case YUAN:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 0.12;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                        break;
                    case RUPEE:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 1.43;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                        break;
                    case BITCOIN:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input / 3393450.91;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate + "PHP");
                        System.out.println();
                        break;
                    default:
                        break;
                }
                break;
                case DOLLAR:
                System.out.print("Enter money you want to exchange: ");
                String $ = s.nextLine().toUpperCase();
                Money usd = Money.valueOf($);
                switch(usd){
                    case PESO:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 57.0;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    case EURO:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 0.92;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    case YEN:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 159.17;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    case YUAN:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 7.26;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    case RUPEE:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 83.54;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    case BITCOIN:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 0.000017;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    default:
                    System.out.println();
                }
                break;
                case EURO:
                System.out.print("Enter money you want to exchange: ");
                String eu = s.nextLine().toUpperCase();
                Money eur = Money.valueOf(eu);
                switch(eur){
                    case PESO:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 63.0;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    case DOLLAR:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 1.10;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    case YEN:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 173.23;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    case YUAN:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 7.90;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    case RUPEE:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 90.90;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    case BITCOIN:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 0.000019;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    default:
                    System.out.println();
                }
                break;
                case YEN:
                System.out.print("Enter money you want to exchange: ");
                String blurd = s.nextLine().toUpperCase();
                Money jpy = Money.valueOf(blurd);
                switch(jpy){
                    case PESO:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 0.37;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    case DOLLAR:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 0.0063;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    case EURO:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 0.0058;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    case YUAN:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 0.046;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    case RUPEE:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 0.52;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    case BITCOIN:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 9223687.0;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate + "JPY");
                        System.out.println();
                    break;
                    default:
                    System.out.println();
                }
                break;
                case YUAN:
                System.out.print("Enter money you want to exchange: ");
                String tsino = s.nextLine().toUpperCase();
                Money chi = Money.valueOf(tsino);
                switch(chi){
                    case PESO:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 8.04;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    case DOLLAR:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 0.14;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    case EURO:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 0.13;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    case YEN:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 21.92;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    case RUPEE:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 11.51;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    case BITCOIN:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 0.0000024;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    default:
                    System.out.println();
                }
                break;
                case RUPEE:
                System.out.print("Enter money you want to exchange: ");
                String paybsix = s.nextLine().toUpperCase();
                Money bombay = Money.valueOf(paybsix);
                switch(bombay){
                    case PESO:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 0.70;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    case DOLLAR:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 0.012;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    case EURO:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 0.011;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    case YEN:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 1.90;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    case YUAN:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 0.087;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate);
                        System.out.println();
                    break;
                    case BITCOIN:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 6426440.11;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate + "INR");
                        System.out.println();
                    break;
                    default:
                    System.out.println();
                }
                break;
                case BITCOIN:
                System.out.print("Enter money you want to exchange: ");
                String coin = s.nextLine().toUpperCase();
                Money coins = Money.valueOf(coin);
                switch(coins){
                    case PESO:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 3393450.91;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate + "PHP");
                        System.out.println();
                    break;
                    case DOLLAR:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 57252.00;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate + "USD");
                        System.out.println();
                    break;
                    case EURO:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 52589.40;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate + "EUR");
                        System.out.println();
                    break;
                    case YEN:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 9107190.14;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate + "JPY");
                        System.out.println();
                    break;
                    case YUAN:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 414963.85;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate +"CNY");
                        System.out.println();
                    break;
                    case RUPEE:
                        System.out.print("Enter an amount want to exchange: ");
                        input = s.nextDouble();
                        exchangeRate = input * 4776337.05;
                        System.out.println("The amount of: "+input+" is "+ exchangeRate +"INR");
                        System.out.println();
                    break;
                    default:
                    System.out.println();
                }
                break;
                default:
                System.out.println("mismatch");
            }
        } catch (IllegalArgumentException e){
            System.out.println("wrong");
        }
        
        
        
    }
}