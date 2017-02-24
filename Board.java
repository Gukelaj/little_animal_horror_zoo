public class Board {
    public static void main(String[] args){
 
        Rabbit r = new Rabbit();
        Snake s = new Snake();
      
        // Random Start Position
        // r.setRandomStart();
        // s.setRandomStart();
       
        // Demo
        r.moveDown();
        s.moveLeft();
        r.moveRight();
        s.moveUp();
        r.moveRight();
        s.moveUp();
        r.moveDown();
        s.moveLeft();
        r.moveRight();
        s.moveLeft();
    
    String getLocationR = r.getLocation();
    String getLocationS = s.getLocation();

    if (getLocationR.equals(getLocationS)) {
        r.askForMercy();
        s.killRabbit();
        }

        r.moveDown();
        s.moveLeft();
        r.moveDown();
        s.moveUp();
        r.moveDown();
        s.moveUp();
        r.moveRight();
        s.moveLeft();
    
    String getLocationR2 = r.getLocation();
    String getLocationS2 = s.getLocation();

    if (getLocationR2.equals(getLocationS2)) {
        r.askForMercy();
        s.killRabbit();
        }
    }
}