public class Ponto extends Local{
    protected boolean visible;
    protected double area; // Atributo redefinido nas classes filhas.
    public Ponto(int x,int y){
        super(x,y); // Construtor da superclasse Local.
        area=0; // Classes filhas deve redefinir esse atributo.
        visible=false;
    }

    public boolean isVisible(){
        return visible;
    }

    public void hide(){
        visible=false;
        System.out.print("Ponto invisivel em ");
        showLoc();
        System.out.println(". ");
    }

    public void show(){
        visible=true;
        System.out.print("Ponto visivel em ");
        showLoc();
        System.out.println(". ");
    }

    public void moveto(int x,int y){
        hide(); // Método polimórfico.
        setX(x); setY(y);
        show(); // Método polimórfico.
    }

    // getArea() será herdado com área redefinida:
    // cada subclasse estabelece seu valor.
    public double getArea(){return area;}
}