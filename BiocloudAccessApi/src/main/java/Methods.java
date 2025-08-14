public class Methods {
    public void createPattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public void createleftangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    public void createRightangle(int n) {

        for (int i = n; i >= 1; i--) {
            for(int k=1; k<i; k++)
            {
                System.out.print(" _");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
