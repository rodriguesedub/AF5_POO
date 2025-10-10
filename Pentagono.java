public class Pentagono extends Ponto{
    private float R;
    private double lado=0;
    public Pentagono(int x,int y,float R){
        super(x,y); // Construtor da superclasse Local.
        this.R=R;
        area=(5.0 / 2.0) * Math.pow(R, 2) * Math.sin((2 * Math.PI) / 5);; // area redefinida para circulo.
        lado=2 * R * Math.sin(Math.PI / 5);
        per = 5 * lado;
    }

    @Override
    public void hide(){
        visible=false;
        System.out.print("Pentagono de lados "+R+" visivel em  ");showLoc();
        System.out.println(". ");
    }

    @Override
    public void show(){
        visible=true;
        System.out.print("Pentagono de lados "+R+" invisivel em  ");showLoc();
        System.out.println(". ");
    }

    @Override
    public double getArea(){return area;}
    @Override
    public double getPer(){return per;}
}