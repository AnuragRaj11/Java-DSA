class Pattern {
    public static void main(String[] args) {
        p1(2);
    }

    static void p1(int n) {
        for (int rows = 1; rows <= n; rows++) {

            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}