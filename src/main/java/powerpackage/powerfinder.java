package powerpackage;

public class powerfinder {
    public static int OF(int index, int power) {
        int p = 1;
        for (int i = 0; i<power; i++) {
            p *= index;
        }
        return p;
    }
}
