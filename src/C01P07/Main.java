package C01P07;

// PI can be computed using the following formula: 4*(1-(1/3)+(1/5)-(1/7)+(1/9)-(1/13)...)
// Approximate PI

public class Main {

    public static void main(String[] args) {
	    double trailer = 0;
        int counter = 0;

        for (int index = 1; index <= 1000000000; index += 2) {
            if (counter % 2 == 0)
                trailer += 1.0/index;
            else
                trailer -= 1.0/index;

            counter++;
        }

        double pi = 4 * (trailer);

        System.out.println(pi);
    }
}
