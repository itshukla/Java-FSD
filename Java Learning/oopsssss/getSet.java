package oopsssss;
public class getSet {
    public static void main(String[] args) {

        Pen p = new Pen();

        p.setColor("blue");
        p.setTip(5);

        System.out.println(p.getColor());
        System.out.println(p.getTip());

    }
}

class Pen{
    // properties
    private String color;
    private int tip; 
 
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    // methods
    void setColor(String newColor){
        color = newColor;

    }
    void setTip(int newTip){
        tip = newTip;
    }
}