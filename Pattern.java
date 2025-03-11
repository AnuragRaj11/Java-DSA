import java.util.*;

class Pattern {
    public static void main(String[] args) {
        p1(4);
    }

    /*
     * static void p1(int n) {
     * for (int rows = 1; rows <= n; rows++) {
     * 
     * for (int cols = 1; cols <= rows; cols++) {
     * System.out.print(" *");
     * }
     * System.out.println();
     * }
     * }
     */
    /*
     * static void p1(int n) {
     * for (int rows = 1; rows <= n; rows++) {
     * 
     * for (int cols = 1; cols <= n; cols++) {
     * System.out.print(" *");
     * }
     * System.out.println();
     * }
     * }
     */

    /*
     * static void p1(int n) {
     * for (int rows = 1; rows <= n; rows++) {
     * 
     * for (int cols = 1; cols <= n-rows+1; cols++) {
     * System.out.print(" *");
     * }
     * System.out.println();
     * }
     * }
     */

    /*
     * static void p1(int n) {
     * for (int rows = 1; rows <= n; rows++) {
     * 
     * for (int cols = 1; cols <= rows; cols++) {
     * System.out.print(cols + " ");
     * }
     * System.out.println();
     * }
     * }
     */
    /*
     * static void p1(int n) {
     * for (int rows = 1; rows <= n; rows++) {
     * 
     * for (int cols = 1; cols <= rows; cols++) {
     * System.out.print(n-cols+1 + " ");
     * }
     * System.out.println();
     * }
     * }
     */

    /*
     * static void p1(int n) {
     * for (int rows = 0; rows <= 2 * n; rows++) {
     * int tc = rows > n ? 2 * n - rows : rows;
     * for (int cols = 0; cols <= tc; cols++) {
     * System.out.print(" *");
     * }
     * System.out.println();
     * }
     * }
     */

    /*
     * static void p1(int n) {
     * for (int rows = 0; rows <= 2 * n; rows++) {
     * int tc = rows > n ? 2 * n - rows : rows;
     * int sp = n - tc;
     * for (int s = 0; s < sp; s++) {
     * System.out.print(" ");
     * }
     * for (int cols = 0; cols <= tc; cols++) {
     * System.out.print(" *");
     * }
     * System.out.println();
     * }
     * }
     */
    /*
     * static void p1(int n) {
     * for (int rows = 1; rows <= n; rows++) {
     * 
     * for (int s = 0; s < n-rows; s++) {
     * System.out.print(" ");
     * }
     * for (int cols = rows; cols >= 1; cols--) {
     * System.out.print(cols);
     * }
     * for (int cols = 2; cols <= rows; cols++) {
     * System.out.print(cols);
     * }
     * System.out.println();
     * }
     * }
     */

    /*
     * static void p1(int n) {
     * for (int rows = 0; rows <= 2 * n; rows++) {
     * int tc = rows > n ? 2 * n - rows : rows;
     * for (int s = 0; s < n - tc; s++) {
     * System.out.print(" ");
     * }
     * for (int cols = tc; cols >= 1; cols--) {
     * System.out.print(cols);
     * }
     * for (int cols = 2; cols <= tc; cols++) {
     * System.out.print(cols);
     * }
     * System.out.println();
     * }
     * }
     */

    static void p1(int n) {
        int on = n;
        n = 2 * n;

        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n; cols++) {
                int i = on - (int)Math.min(Math.min(rows, cols), Math.min(n - rows - 1, n - cols - 1));
                System.out.print(+i);
            }
            System.out.println();
        }
      

    }

}