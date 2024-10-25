public class GradedPicture extends World {

    public int red;
    public int blue;
    public int green;


    public void go() {
        plane.loadBackGround("landscape.jpg");
        plane.showBackGround();
        for (int y = 0; y < 600; y = y + 1) {
            for (int x = 0; x < 1000; x = x + 1) {
                plane.teleport(x, y);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red < 255 && red > 120 && green < 120 && blue < 80) {
                    plane.setPixelColor(red/4 , green, blue);


                }

            }
        }
        plane.teleport(100, 400);
        plane.pausetime = 0;
        plane.isTrail = true;
        plane.trailWidth = 10;

        for (int x = 1; x < 6; x = x + 1) {
            person();
            plane.setColor(x*30, 0, x*30);
        }

    }

    public void person() {
        plane.isTrail = true;
        plane.turn(315);
        plane.move(100);
        plane.turn(180);
        plane.move(100);
        plane.turn(270);
        plane.move(100);
        plane.turn(180);
        plane.move(100);
        plane.turn(315);
        plane.move(100);
        plane.turn(270);
        plane.move(25);
        plane.turn(90);
        plane.move(50);
        plane.turn(90);
        plane.move(50);
        plane.turn(90);
        plane.move(50);
        plane.turn(90);
        plane.move(25);
        plane.turn(270);
        plane.move(45);
        plane.turn(90);
        plane.move(75);
        plane.turn(180);
        plane.move(150);
        plane.isTrail = false;
        plane.turn(180);
        plane.move(250);
        plane.turn(270);
        plane.move(55);



    }
}