public class A1_HowToMove extends World {

    public void go() {

        System.out.println("Chicken joe");
        plane.pausetime = 0;
        plane.startingAngle(0);
        plane.trailWidth = (int) (Math.random() * 10) + 1;

        plane.isTrail = true;
        plane.trailWidth = 1;

        for (int y = 0; y < 700; y = y + 1) {
            for (int x = 0; x < 800; x = x + 1) {
                plane.teleport(x, y);
                plane.setColor(y / 2, 0, x / 5);
                System.out.println("x: " + x);
                plane.square(1);
            }

        }
    }

    public void square() {
        plane.startingAngle(0);
        plane.move(1);
        plane.turn(90);
        plane.move(1);
        plane.turn(90);
        plane.move(1);
        plane.turn(90);
        plane.move(1);

        plane.turn(90);
    }
        public void house (int size) {
            plane.setColor((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
            plane.startingAngle(0);
            plane.move(size);
            plane.turn((int) (Math.random() * 360));
            plane.move(size);
            plane.turn(90);
            plane.move(size);
            plane.turn(90);
            plane.move(size);
            plane.turn(90);
            plane.turn(90);
            plane.move(size);
            plane.turn(270);
            plane.turn(60);
            plane.move(size);
            plane.turn(-120);
            plane.move(100);
            plane.turn(330);
            plane.move(100);
            plane.turn(90);
            plane.move(size);

        }
        public void rowOfSquares(int y){
            for(int x=0;x<800; x=x+1) {
                plane.teleport(x, y);
                plane.setColor(y/5, 0, x/5);
               // plane.setColor(y*2, y*3, y*2);
                System.out.println("x: "+ x);
                plane.square(1);
                }


            }
    }










