package chapter8;

public class Box {
   private double widht;
   private double height;
   private double depth;

    Box(Box ob) {
        widht = ob.widht;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        widht = w;
        height = h;
        depth = d;
    }

    Box() {
        widht = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        widht = height = depth = len;
    }

    double volume() {
        return widht * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(BoxWeight ob){
        super(ob);
        weight=ob.weight;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w,h,d);
//        widht = w;
//        height = h;
//        depth = d;
        weight = m;
    }
    BoxWeight(){
        super();
        weight=-1;
    }
    BoxWeight(double len,double m){
        super(len);
        weight=m;
    }
}

class ColorBox extends Box{
    int color;

    ColorBox(double w,double h,double d,int c){
        super(w,h,d);
//        widht=w;
//        height=h;
//        depth=d;
        color=c;

    }

}