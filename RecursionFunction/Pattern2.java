public class Pattern2 {
    public static void main(String x[]) throws Exception 
	{
        pattern(5, 1);
    }

    public static void pattern(int x, int y) throws InterruptedException {
        if (x >= 1) {
            if (y <= x) {
                System.out.print("*");
                Thread.sleep(100); // Introducing a delay of 100ms
                pattern(x, y + 1);
            } else {
                System.out.println();
                pattern(x - 1, 1);
            }
        }
    }
}
