public class Hexagono extends Ponto{
    private float R;
    private double lado;
    public Hexagono(int x,int y,float R){
        super(x,y); // Construtor da superclasse Local.
        this.R=R;
        area=(3 * Math.sqrt(3) / 2) * Math.pow(R, 2);; // area redefinida para circulo.
        lado=2 * R * Math.sin(Math.PI / 6);
        per = 6*lado;
    }

    @Override
    public void hide(){
        visible=false;
        System.out.print("Hexagono de lados "+R+" visivel em  ");showLoc();
        System.out.println(". ");
    }

    @Override
    public void show(){
        visible=true;
        System.out.print("Hexagono de lados "+R+" invisivel em  ");showLoc();
        System.out.println(". ");
    }

    @Override
    public double getArea(){return area;}
    @Override
    public double getPer(){return per;}
}