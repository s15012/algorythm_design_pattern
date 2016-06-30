public class Zeus {
    public static void main(String...args) {
        int i, j, k;
        double d, e;
        double a[][] = {
            {2, 3, -4, 4},
            {3, -5, 3, 2},
            {-4, 9, -2, 8}
        };

        for (i = 0; i < a.length; i++) {
            d = a[i][i];
            for (j = 0; j < a.length + 1; j++) {
                a[i][j] /= d;
            }

            for (k = i + 1; k < a.length; k++) {
                e = a[k][i];
                for (j = 0; j < a.length + 1; j++) {
                    a[k][j] -= a[i][j] * e;
                }
            }
        }


        for (j = a.length - 1; j > 0; j--) {
            for (i = j - 1; i >= 0; i--) {
                a[i][a.length] -= a[i][j] * a[j][a.length];
            }
        }

        System.out.printf("x = %f\n", a[0][a.length]);
        System.out.printf("y = %f\n", a[1][a.length]);
        System.out.printf("z = %f\n", a[2][a.length]);

    }
}
