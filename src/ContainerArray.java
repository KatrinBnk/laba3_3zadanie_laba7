import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ContainerArray {

    private static ArrayList<TFigure> Figure = new ArrayList();
    private int iMass, x,y,r,w,h;
    private int figureKey;
    private int indexINmassive;

    void action(int actionKey){
        if (actionKey == 1) {
            indexINmassive = 15 + (int) (Math.random()*10);
            for (int j = 0; j < indexINmassive; j++ ) {
                figureKey = 1 + (int) (Math.random() * 5);
                creator(figureKey, j);
            }
        }
        else if (actionKey == 2){
            x = -30 + (int) (Math.random() * 100);
            y = -30 + (int) (Math.random() * 100);
            for (int j = 0; j < iMass; j++) {
                Figure.get(j).MoveTo(x, y);
            }
        }
        else if (actionKey == 3){
            for (iMass=0; iMass<indexINmassive; iMass++) {
                Figure.get(iMass).Show(true);
            }
        }
        else if (actionKey == 4){
            iMass = 0;
        }
        else if (actionKey == 5){
            iMass = 0;
            Figure = null;
            indexINmassive = 0;
        }
        else if (actionKey == 6){
            figureKey = 1 + (int) (Math.random() * 5);
            creator(figureKey, indexINmassive);
            indexINmassive++;
        }
    }

    private void creator(int figureKey, int index){
        x = (int) (Math.random() * 500);
        y = (int) (Math.random() * 500);
        //Окружность
        if (figureKey == 1) {
            System.out.println("Фигура Контейнера-Массива №" + (index+1) + " - Окружность");
            r = (int) (Math.random() * 200);
            Figure.add(index, new Circle(x, y, r, Color.BLACK));
        }
        //Эллипс
        if (figureKey == 2) {
            System.out.println("Фигура Контейнера-Массива №" + (index+1) + " - Эллипс");
            w = (int) (Math.random() * 200);
            h = (int) (Math.random() * 100);
            Figure.add(index, new Ellipse(x, y, w, h, Color.RED));
        }
        //Прямоугольник
        if (figureKey == 3) {
            System.out.println("Фигура Контейнера-Массива №" + (index+1) + " - Квадрат");
            w = 100 + (int) (Math.random() * 500);
            h = 100 + (int) (Math.random() * 250);
            Figure.add(index, new Square(x, y, w, Color.YELLOW));
        }
        //Прямоугольник
        if (figureKey == 4) {
            System.out.println("Фигура Контейнера-Массива №" + (index+1) + " - Прямоугольник");
            w = 100 + (int) (Math.random() * 500);
            h = 100 + (int) (Math.random() * 250);
            Figure.add(index, new Rectangle(x, y, w, h, Color.BLUE));
        }
        //Ромб
        if (figureKey == 5) {
            System.out.println("Фигура Контейнера-Массива №" + (index+1) + " - Ромб");
            w = 100 + (int) (Math.random() * 500);
            h = 100 + (int) (Math.random() * 250);
            Figure.add(index, new Romb(x, y, w, h, Color.CYAN));
        }
    }

    int getCount() { return this.indexINmassive; }

    int getIMass() { return this.iMass; }

    void setIMass(int iMass) { this.iMass = iMass;}

    JPanel getFigureFromContainerArray(int iMass) { return Figure.get(iMass); }
}
