import com.sun.org.apache.xalan.internal.xsltc.cmdline.getopt.GetOpt;

public class Main {
    public static void main(String[] args) {
      Colorable[] objects = new Colorable[2];
      objects[0] = new Square(5);
      objects[1] = new Circle(5);


        for (int i = 0; i < objects.length; i++) {
              if(objects[i] instanceof  Colorable){
                  objects[i].howToColor();
                  System.out.println("In ra diện tích : "   + objects[i].getArea());
                }

        }


    }
}