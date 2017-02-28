// import java.util.Random;

public class Rabbit {
    private String name = "Rabbit";
    private int x = 1;
    private int y = 10;
    // private int x;
    // private int y;
    
    // Random start generator
    // Random generator = new Random(); 

    // public void setRandomStart() {
    //     this.x = generator.nextInt(10) + 1;
    //     this.y = generator.nextInt(10) + 1;
    // }

    public void moveRight() {
        if (this.x <= 9) {
            x = x+1;
            y = y+0;
            System.out.println(printLocation());
        }
        else {
            System.out.println("Invalid move");
        }
    }
    public void moveLeft() {
        if (this.x >= 2) {
            x = x-1;
            y = y+0;
            System.out.println(printLocation());
        }
        else {
            System.out.println("Invalid move");
        }
    }
    public void moveUp() {
        if (this.y <= 9) {
            x = x+0;
            y = y+1;
            System.out.println(printLocation());
        }
        else {
            System.out.println("Invalid move");
        }
    }
    public void moveDown() {
        if (this.y >= 2) {       
            x = x+0;
            y = y-1;
            System.out.println(printLocation());
        }
        else {
            System.out.println("Invalid move");
        }      
    }
    public String getLocation() {
        return this.x + "," + this.y;
    }
    public String printLocation() {
       return ("I am the nice " + name +
         ", i am now standing on square " + getLocation());
    }
    public void askForMercy() {
        System.out.println("Pleaese don't kill me evil Snake!!!");
    }
}