public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.loadBackGround("resize.jpeg");
        plane.showBackGround();

        for (int y = 0; y < 500; y = y + 1) {
            for (int x = 0; x < 700; x = x + 1) {
                plane.teleport(x, y);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red < 130 && green < 110 && blue < 110) {
 //               if (red < 270 && green < 250 && blue < 250) {
                    plane.setPixelColor(red /2, green /2 , blue );
//                plane.teleport(x, 488 - y);
                }
            }
        }
    }
}

