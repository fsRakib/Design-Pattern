
public class Samosa {
    private static Samosa samosa;

    // private constructor to prevent instantiation of the class from other classes
    private Samosa() {

    }

    // static method often manages access to the single instance of the class
    public static Samosa getSamosa() {
        if (samosa == null) {
            synchronized (Samosa.class) {
                if (samosa == null) {
                    samosa = new Samosa();
                }
            }

        }
        return samosa;
    }

}