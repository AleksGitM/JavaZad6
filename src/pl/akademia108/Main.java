package pl.akademia108;

public class Main {

    public static void main(String[] args) {
	byte a = 127;
    byte b = 2;
    short dodawanie = (short) (a + b);
    byte odejmowanie = (byte) (a - b);
    float dzielenie = (float) (a / b);
    short mnozenie = (short) (a * b);
        System.out.println("a wynosi:" + a);
        System.out.println("a+2:" + dodawanie);
        System.out.println("a-2:" + odejmowanie);
        System.out.println("a/2:" + dzielenie);
        System.out.println("a*2:" + mnozenie);
    }
}
