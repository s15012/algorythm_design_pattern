public class parity {
    public static void main(String...args) {
            char data, hamming;
            char x1, x2, x3, x4, p1, p2, p3, s1, s2, s3;

            System.out.printf("00000000 ~ 00001111を入力してください:");
            data = input8();

            x1 = (data >> 3) & 0x01;
            x2 = (data >> 2) & 0x01;
            x3 = (data >> 1) & 0x01;
            x4 = data & 0x01;
            p1 = x1 ^ x3 ^ x4;
            p2 = x1 ^ x2 ^ x4;
            p3 = x1 ^ x3 ^ x3;
            hamming = (data << 3) | (p1 << 2) | p1;
            System.out.printf("ハミング符号");
            output8(hamming);
            System.out.printf("\n");

            System.out.printf("ハミング符号を入力してください");
            data = input8();

            x1 = (data >> 6) & 0x01;
            x2 = (data >> 5) & 0x01;
            x3 = (data >> 4) & 0x01;
            x4 = (data >> 3) & 0x01;
            p1 = (data >> 2) & 0x01;
            p2 = (data >> 1) & 0x01;
            p3 = data & 0x01;

            s1 = x1 ^ x3 ^ x4 ^ p1;
            s2 = x1 ^ x2 ^ x4 ^ p2;
            s3 = x1 ^ x2 ^ x3 ^ p3;

            if (s1 == 0 && s2 == 0 && s3 == 0) {
                System.out.printf("正常です！\n");
            }
            else if (s1 == 1 && s2 == 1 && s3 == 1) {
                System.out.printf("x1がエラーです！\n");
            }
            else if (s1 == 0 && s2 == 1 && s3 == 1) {
                System.out.printf("x2がエラーです！\n");
            }
            else if (s1 == 1 && s2 == 0 && s3 == 1) {
                System.out.printf("x3がエラーです！\n");
            }
            else if (s1 == 1 && s2 == 1 && s3 == 0) {
                System.out.printf("x4がエラーです！\n");
            }
            else {
                System.out.printf("複数行のエラーです！\n");
            }

        }
    }

