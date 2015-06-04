package ru.korotkov.work4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

interface  Figura {
   void Plochad();


}



public class Main {



    public static ArrayList list = new ArrayList<Geom>();




    public static double S;
    public static String s;
    public static String scut;
    public static Scanner sc;
    public static File file = new File("C://Users//User//IdeaProjects//Work4//src//ru//korotkov//work4//file.txt");
    public static void main(String[] args) {
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int count = sc.nextInt();
        s = sc.nextLine();
        for (int i=0; i<count; i++ ){

            s = sc.nextLine();
            System.out.println(s);
            String name =s.substring(0,s.indexOf(' '));
            scut = s.substring(s.indexOf(' '));
            System.out.println(name);
            if (name.equals("CIRCLE")){
                Circle circle = new Circle();
                circle.Plochad();
                System.out.println(circle.S);
                list.add(circle);
            }
            else if (name.equals("RECT")){
                Rectangle circle = new Rectangle();
                circle.Plochad();
                System.out.println(circle.S);
                list.add(circle);

            }
            else if (name.equals("TRIANGLE")){
                Triangle circle = new Triangle();
                circle.Plochad();
                System.out.println(circle.S);
                list.add(circle);
            }
            else {
                System.out.println("4to ZA BRED??");
            }
        }
        Collections.sort(list);
        Geom x = (Geom)list.get(0);
        System.out.println(x.S);
    }
}
class Circle extends Geom  implements Figura {


    int R = new Scanner(Main.scut).nextInt();
    @Override
    public void Plochad() {
     S =   R*R*Math.PI;
    }

}

class Triangle extends Geom implements Figura {

    int P = new Scanner(Main.scut).nextInt();
    int H = new Scanner(Main.scut).nextInt();

    @Override
    public void Plochad() {
        S =   P*H/2;
    }

}
class Rectangle extends Geom  implements Figura {

     int A = new Scanner(Main.scut).nextInt();
     int B = new Scanner(Main.scut).nextInt();
    public void Plochad() {
        S =   A*B;
    }
}


