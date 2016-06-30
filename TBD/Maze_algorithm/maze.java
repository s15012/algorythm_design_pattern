public class maze {
    public static void main(String...args) {
        int V_START = 1;
        int H_START = 1;

        int MAZE[][] = {
            {3, 3, 3, 3, 3, 3, 3, 3, 3},
            {3, 0, 0, 0, 0, 3, 0, 0, 3},
            {3, 3, 3, 3, 0, 3, 3, 0, 3},
            {3, 0, 0, 0, 0, 0, 0, 0, 3},
            {3, 0, 3, 0, 3, 3, 3, 3, 3},
            {3, 0, 3, 0, 3, 0, 0, 0, 3},
            {3, 3, 3, 0, 3, 0, 3, 0, 3},
            {3, 0, 0, 0, 0, 0, 3, 0, 3},
            {3, 3, 3, 3, 3, 3, 3, 3, 3}
        };

        int vCurrent = V_START;
        int hCurrent = H_START;

        int vStack[64];
        int hStack[64];
        int sp = 0;

        void showMaze() {
            int v, h;
            for (v = 0; v < MAZE.length; v++) {
                for(h = 0; h < MAZE.length; h++) {
                    if (v == vCurrent && h == hCurrent) {
                        System.out.printf("@");
                    }
                    else if (MAZE[v][h] == 0) {
                        System.out.printf(" ");
                    }
                    else if (MAZE[v][h] == 1) {
                        System.out.printf("・");
                    }
                    else if (MAZE[v][h] == 2) {
                        System.out.printf("✖");
                    }
                    else if (MAZE[v][h] == 3) {
                        System.out.printf("■");
                    }
                }
            System.out.printf("\n");
            }
        }

        void push() {
            vStack[sp] = vCurrent;
            hStack[sp] = hCurrent;
            sp++;
        }

        void move() {
            MAZE[vCurrent][hCurrent] = 1;
            if (MAZE[vCurrent - 1][hCurrent] == 0) {
                push();
                vCurrent--;
            }
            else if (MAZE[vCurrent + 1][hCurrent] == 0) {
                push();
                vCurrent++;
            }
            else if (MAZE[vCurrent][hCurrent - 1] == 0) {
                push();
                hCurrent--;
            }
            else if (MAZE[vCurrent][hCurrent + 1] == 0) {
                push();
                hCurrent++;
            }
            else {
                MAZE[vCUrrent][hCurrent] = 2;
                sp--;
                vCurrent = vStack[sp];
                hCurrent = hStack[sp];
            }
        }


    }

}
//未完成！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！１









