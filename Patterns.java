class Patterns {
    public static void main(String[] args) {
        int n = 5;
        // pattern1(5);
        // pattern2(5);
        // pattern3(5);
        // pattern4(5);
        // pattern5(5);
        // pattern6(5);
        // pattern7(5);
        // pattern8(5);
        // pattern9(5);
        // pattern10(5);
        // pattern11(5);
        // pattern13(5);
        // pattern16(n);
        // pattern17(n);
        pattern18(n);

    }

    static void pattern1(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= 5; cols++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void pattern2(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {

        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= n - rows + 1; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int rows = 0; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        // For Upper triangle
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        // For Bottom Triangle
        for (int rows = n - 1; rows >= 1; rows--) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void pattern6(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = n - 1; cols >= rows; cols--) {
                System.out.print(" ");
            }
            for (int acols = 1; acols <= rows; acols++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n - i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i) - 1; k++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }

    static void pattern9(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }

            System.out.println("");

        }
    }

    static void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }

            System.out.println("");

        }
    }

    static void pattern11(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern13(int n) {

        for (int i = 1; i <= n; i++) {
            // Print spaces before the asterisks
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print the leftmost asterisk
            System.out.print("*");

            // Print spaces or asterisks between the edges
            for (int k = 2; k < (2 * i) - 1; k++) {
                if (k == (2 * i) - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Print the rightmost asterisk
            if (i != 1) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }

    static void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = n; k < (2 * i) - 1; k--) {
                if (k == (2 * i) - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    static void pattern16(int n) {
        int[][] triangle = new int[n][];
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
        }

        // Fill the triangle with values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                // Calculate the value using the binomial coefficient formula
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
        }

        // Print Pascal's Triangle
        for (int i = 0; i < n; i++) {
            // Print spaces to align the triangle
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print values of each row
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }

            System.out.println();

        }
    }

    static void pattern17(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();

        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();

        }
    }

    static void pattern18(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(" ");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(" ");
            }
            // for (int m = n; m <= 2 * n - 1; m++) {
            //     System.out.print("*");
            // }

            System.out.println();

        }
        
    }
}