import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class BasicComparison {

    private int goodPix = 0;
    private int badPix = 0;

    BasicComparison() {
        String filePath = new File("").getAbsolutePath() + "/ImageCompare/src/main/resources/";
        String sImage1 = filePath.concat("wallwithoutpostit.png");
        String sImage2 = filePath.concat("wallwithpostit.png");

        BufferedImage testImage1, testImage2;

        try {
            testImage1 = ImageIO.read(new File(sImage1));
            testImage2 = ImageIO.read((new File(sImage2)));
            int tImage1W = testImage1.getWidth();
            int tImage1H = testImage1.getHeight();
            int tImage2W = testImage2.getWidth();
            int tImage2H = testImage2.getHeight();

            int[][] pixels = new int[tImage1H * tImage1W][3];
            int[] rgb;

            if ((tImage1W != tImage2W) || (tImage1H != tImage2H)) {
                System.out.println("Images are not of the same dimensions so cannot main...");
            } else {
                System.out.println("Images are of the same dimensions, comparing now...");

                int counter = 0;
                for (int i = 0; i < tImage1H; i++) {
                    for (int j = 0; j < tImage1W; j++) {
                        rgb = CompareAndOutputPixelValues(testImage1, testImage2, i, j);
                        System.arraycopy(rgb, 0, pixels[counter], 0, rgb.length);
                        counter++;
                    }
                }

                int totalPixels = badPix + goodPix;
                double similarity = (goodPix / totalPixels) * 100;
                System.out.println("\nTotal Pixels = " + totalPixels);
                System.out.println("Matching Pixels = " + goodPix);
                System.out.println("Non-matching Pixels = " + badPix);
                System.out.println("Image similarity = " + similarity + "%");

                final long endTime = System.currentTimeMillis();
                long startTime = System.currentTimeMillis();
                System.out.println("Total execution time: " + (endTime - startTime) + "ms");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int[] CompareAndOutputPixelValues(BufferedImage tImage1, BufferedImage tImage2, int x, int y) {

        int argb1 = tImage1.getRGB(y, x);
        int argb2 = tImage2.getRGB(y, x);

        if (argb1 != argb2) {
            System.out.println("\nrow: " + (x + 1) + " " + "column: " + (y + 1) + " ARE NOT EQUAL");
            counter(false);
        } else {
            System.out.println("\nrow: " + (x + 1) + " " + "column: " + (y + 1) + " are equal");
            counter(true);
        }

        int rgb[] = new int[]{
                (argb1 >> 16) & 0xff,
                (argb1 >> 8) & 0xff,
                (argb1) & 0xff
        };

        System.out.println("rgb for pixel = " + rgb[0] + " " + rgb[1] + " " + rgb[2]);
        return rgb;
    }

    private void counter(Boolean x) {
        if (x) {
            goodPix++;
        } else {
            badPix++;
        }
    }
}