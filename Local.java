public class Local{
    private int x,y;
    public Local(){}; // Construtor 1.
    public Local(int x,int y){ // Construtor 2.
        this.x=x;this.y=y;
    }
    public int getX(){return x;}
    public int getY(){return y;}
    public void setX(int X){x=X;}
    public void setY(int Y){y=Y;}
    public void showLoc(){System.out.print("("+x+","+y+")");} 
}