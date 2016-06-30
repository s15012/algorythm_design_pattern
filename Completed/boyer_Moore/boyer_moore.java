public class boyer_moore {
    public static void main(String...args) {
            int len1, len2, n, i, inc;
            String pos;
            String s1 = "I like Nikkei-software.";
            String s2 = "like";


            n = s1.length() - s2.length();
            pos = s1;

            i = 0;
            while (i <= n) {
                System.out.println("while");
                if(!s2.equals(pos.substring(i, i+4))) {
                    System.out.println(pos.substring(i, i+4));
                    /*
                    switch () {
                        case 'N':
                            inc = 5;
                            break;
                        case 'i':
                            inc = 4;
                            break;
                        case 'k':
                            inc = 2;
                            break;
                        case 'e':
                            inc = 1;
                            break;
                        default:
                            inc = 6;
                            break;
                    }
                    */
                    inc = s2.length();
                    for (int j = 0; j < s2.length(); j++) {
                        if (pos.charAt(i + s2.length() - 1) == s2.charAt(j)) {
                            inc = j + 1;
                        }
                    }

                    i += inc;

                }
                else {
                    System.out.println("else");
                    System.out.printf("%d\n", i);
                    break;
                }
            }

    }
}
