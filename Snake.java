public class Snake {
    private String name = "Snake1";
    private int x = 10;
    private int y = 1;
    
    

    public void moveRight() {
        if (this.x <= 10) {
            x = x+1;
            y = y+0;
            System.out.println(printLocation());
        }
        else {
            System.out.println("Invalid move");
        }
    }
    public void moveLeft() {
        if (this.x >= 1) {   
            x = x-1;
            y = y+0;
            System.out.println(printLocation());
        }
        else {
            System.out.println("Invalid move");
        }
    }

    public void moveUp() {
        if (this.y <= 10) {
            x = x+0;
            y = y+1;
            System.out.println(printLocation());
        }
        else {
            System.out.println("Invalid move");
        }
    }
    public void moveDown() {
        if (this.y >= 1) {
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
        return ("I am the evil " + name + 
        ", i am now standing on square " + getLocation());
    }
    public void killRabbit() {
        System.out.println("Die Rabbit die!!!!");
    }
}