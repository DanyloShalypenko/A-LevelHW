package cw;

import javax.imageio.ImageTranscoder;

public class cw3 {
    public static void main(String[] args) {
        int[] heights = {-150, -140, 160, 155, 162, -145, 170, -148, 167, -155, -152, 165, 158, -148, -160, 170, 150, 155, 160, 152, 165, 158, 147, -145, -152};

        double averageBoysHeight = calculateAverageHeight(heights, "boys");
        double averageGirlsHeight = calculateAverageHeight(heights, "girls");

        System.out.println("Средний рост мальчиков: " + averageBoysHeight);
        System.out.println("Средний рост девочек: " + averageGirlsHeight);
    }

    public static double calculateAverageHeight(int[] heights, String gender) {
        double sum = 0;
        int count = 0;

        for (int height : heights) {
            if ((gender.equals("boys") && height < 0) || (gender.equals("girls") && height > 0)) {
                sum += Math.abs(height);
                count++;
            }
        }

        return count > 0 ? sum / count : 0;
    }
}

