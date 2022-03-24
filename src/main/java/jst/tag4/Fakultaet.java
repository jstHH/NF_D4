package jst.tag4;

public class Fakultaet {

    public long faculty(long number) {
        long fac = 1;
        if (number >= 1) {
            for (int n = 1; n <= number; n++) {
                fac = fac * n;
            }
        }
        return fac;
    }
}
