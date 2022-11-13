package aselab_3;

public class TrignometricFunctions {
	public static final double pi = 3.14159265358979323846;

    public static double convertDegreeToRad(double x)
    {
        return (2 * x * pi)/ 360 ;
    }

    public static double functionofSine(double angle) {

        double sin=0;
        double rad = angle % (pi * 2);

        for(int i=1; i <= 10; i++) {

            sin = sin + (power(-1, i-1) * power(rad, (2*i)-1) / factorial((2*i)-1));
        }

        return sin;
    }


    public static double functionofCos(double angle)
    {
        double cos=0;
        double rad = angle % (pi * 2);

        for(int i=1;i<=11;i++) {

            cos = cos + (power(-1, i-1) * power(rad, 2*(i-1)) / factorial(2*(i-1)));
        }

        return cos;
    }


    public static double functionofTan(double angle) {

        double tan = functionofSine(angle)/ functionofCos(angle);
        return tan;
    }


    public static long factorial(int x) {

        long result=1;
        if(x >=0) {

            for(int i=1; i<=x; i++)
            {
                result = result*i;
            }
        }

        return result;
    }

    public static double power(double x, int y) {

        double result=1;

        if(y == 0)
            return result;

        for(int i = 1; i <= y; i++)
            result = result * x;

        return result;

    }
}

