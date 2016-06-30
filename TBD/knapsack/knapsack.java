import static java.lang.System.out;
//java.util.Random;

public class knapsack {
    public static void main(String...args) {

    //int price[] = {100,200,300,400,500,600,700,800,900,1000};
    //int R = (int)(Math.random() * 10);

    int knap_size = 5; //Weight = 5kg
    int a_knapsack = 1; //100yen
    int b_knapsack = 2; //300yen
    int c_knapsack = 3; //700yen
    int a_price = 100;
    int b_price = 300;
    int c_price = 700;
    int price_tmp = 0;
    int tmp = 0;
    for (int i = 0; i < knap_size; i++) {
        tmp = tmp + a_knapsack;
        price_tmp = price_tmp + a_price;

        out.print(tmp + "  ");
        out.print(price_tmp + "  \n");
    }

    out.println();

    for (int i = 5; i > 0 ; i--) {
        if (i - b_price >= 0)  {
            i -= 2;
            price_tmp = price_tmp + b_price;
            out.print()
            out.print(price_tmp);
        }
    }

    }
}
