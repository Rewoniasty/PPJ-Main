import java.awt.*;

public class PPJ_task21 {

    static int[][] bubbles = new int[50][5];

    public static void main(String[] args) {

        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i][0] = (int) (Math.random() * 640);
            bubbles[i][1] = (int) (Math.random() * 480);
            bubbles[i][2] = (int) (Math.random() * 255);
            bubbles[i][3] = (int) (Math.random() * 255);
            bubbles[i][4] = (int) (Math.random() * 255);
        }

        new Frame() {
            /**
             *
             */
            private static final long serialVersionUID = 1L;

            {
                setSize(640, 480);
                setVisible(true);
            }

            public void paint(Graphics g) {
                int xp = 50, yp = 300;
                int xk = 600, yk = 300;

                g.setColor(Color.GREEN);
                drawTree(g, xp, yp, xk, yk, 5);

                boolean drawn = false;
                if (bubbles != null && !drawn) {
                    drawBubles(g, bubbles);
                    drawn = true;
                }
            }

            public void drawBubles(Graphics g, int[][] bubles) {
                for (int i = 0; i < bubles.length; i++) {
                    g.setColor(new Color(bubles[i][2], bubles[i][3], bubles[i][4]));
                    g.fillOval(bubles[i][0], bubles[i][1], 20, 20);
                }
            }

            public void drawTree(Graphics g, double xp, double yp, double xk, double yk, int level) {
                if (level == 0) {
                    g.drawLine((int) xp, (int) yp, (int) xk, (int) yk);
                    return;
                }

                double x2 = xp + (xk - xp) / 3;
                double y2 = yp + (yk - yp) / 3;

                double x3 = xp + 2 * (xk - xp) / 3;
                double y3 = yp + 2 * (yk - yp) / 3;

                double mx = x2 + (x3 - x2) / 2 - Math.sqrt(3) * (y3 - y2) / 2;
                double my = y2 + (y3 - y2) / 2 - Math.sqrt(3) * (x3 - x2) / 2;

                drawTree(g, xp, yp, x2, y2, level - 1);
                drawTree(g, x2, y2, mx, my, level - 1);
                drawTree(g, mx, my, x3, y3, level - 1);
                drawTree(g, x3, y3, xk, yk, level - 1);
            }
        };
    }
}
