package code._4_student_effort.ch6;

public class MatrixSpiral {
    enum Direction{
        Right,
        Down,
        Left,
        Up,
    }
    public static void main(String[] args) {
        int[][] matrix=new int[][]{
                {1, 2, 3, 4},
                {12,13,14,5},
                {11,16,15,6},
                {10,9, 8, 7},
        };
        int n=matrix.length;
        int i=0,j=0;
        int delimUp=0,delimDown=0,delimLeft=0,delimRight=0;
        Direction direction=Direction.Left;
        boolean k=true;
        do {
            switch (direction) {
                case Left -> {
                    delimUp++;
                    while (j < n - delimRight - 1) {
                        System.out.print(matrix[i][j] + " ");
                        j++;
                    }
                    if (i == n - delimDown)
                        k = false;
                    else
                        direction = Direction.Down;
                }
                case Down -> {
                    delimRight++;
                    while (i < n - delimDown - 1) {
                        i++;
                        System.out.print(matrix[i][j] + " ");
                    }
                    if (j == delimLeft)
                        k = false;
                    else
                        direction = Direction.Right;
                }
                case Right -> {
                    delimDown++;
                    while (j >= delimLeft + 1) {
                        j--;
                        System.out.print(matrix[i][j] + " ");
                    }
                    if (i == delimUp)
                        k = false;
                    else
                        direction = Direction.Up;
                }
                case Up -> {
                    delimLeft++;
                    while (i >= delimUp + 1) {
                        i--;
                        System.out.print(matrix[i][j] + " ");
                    }
                    if (j == n - delimRight)
                        k = false;
                    else
                        direction = Direction.Left;
                }
            }
        }while(k);
    }
}
