import javax.swing.*;
import java.awt.*;


public class ContainerList {

    private Item First = null;
    private int iList, x,y,w,h;
    private int figureKey;
    private int counterList;


    public ContainerList() { First = null; }

    public void action(int actionKey) {
        if (actionKey == 1) {
            counterList = 10 + (int) (Math.random()*3);
            System.out.println("counterList = " + counterList);
            for (int j = 0; j < counterList; j++ ) {
                figureKey = 1 + (int) (Math.random() * 5);
                creator(figureKey, counterList-j-1);
            }
        }
        else if (actionKey == 2){
            x = -30 + (int) (Math.random() * 100);
            y = -30 + (int) (Math.random() * 100);
            Item Current = First;
            while (Current != null) {
                Current.GetFig( ).MoveTo(x,y);
                Current = Current.GetNext( );
            }
        }
        else if (actionKey == 3){
            Item Current = First;
            while (Current != null) {
                Current.GetFig( ).Show(true);
                Current = Current.GetNext( );
            }
        }
        else if (actionKey == 4){
            iList = 0;
        }
        else if (actionKey == 5){
            iList = 0;
            First = null;
            counterList = 0;
            Item Current = First;
            while (Current != null) {
                Current = null;
                Current = Current.GetNext( );
            }
        }
        else if (actionKey == 6){
            figureKey = 1 + (int) (Math.random() * 5);
            creator(figureKey, counterList);
            counterList++;
        }
    }

    public void add(TFigure aFig) {
        First = new Item(First, aFig);
    }

    private void creator(int figureKey, int j){
        x = (int) (Math.random() * 500);
        y = (int) (Math.random() * 500);
        //Окружность
        if (figureKey == 1) {
            System.out.println("Фигура Контейнера-Списка №" + (j + 1) + " - Окружность");
            w = (int) (Math.random() * 200);
            add(new Circle(x, y, w, Color.BLACK));
        }
        else if (figureKey == 2) {
            System.out.println("Фигура Контейнера-Списка №" + (j+1) + " - Эллипс");
            w = (int) (Math.random() * 200);
            h = (int) (Math.random() * 100);
            add(new Ellipse(x, y, w, h, Color.RED));
        }
        else if (figureKey == 3) {
            System.out.println("Фигура Контейнера-Списка №" + (j+1) + " - Прямоугольник");
            w = 100 + (int) (Math.random() * 500);
            h = 100 + (int) (Math.random() * 250);
            add(new Square(x, y, w, Color.YELLOW));
        }
        //Прямоугольник
        else if (figureKey == 4) {
            System.out.println("Фигура Контейнера-Списка №" + (j+1) + " - Прямоугольник");
            w = 100 + (int) (Math.random() * 500);
            h = 100 + (int) (Math.random() * 250);
            add(new Rectangle(x, y, w, h, Color.BLUE));
        }
        //Ромб
        if (figureKey == 5) {
            System.out.println("Фигура Контейнера-Списка №" + (j+1) + " - Ромб");
            w = 100 + (int) (Math.random() * 500);
            h = 100 + (int) (Math.random() * 250);
            add(new Romb(x, y, w, h, Color.CYAN));
        }
    }


    private Item iterator(int index) {
        if (index <= counterList) {
            Item a = First;
            for (int i = 0; i < index; i++) {
                a = a.GetNext();
            }
            return a;
        }  else { return null; }
    }

    JPanel getFigureFromItemList(int i) {
        Item a = iterator(i);
        return a.GetFig();
    }

    int getCount() { return this.counterList; }

    int getIList() { return this.iList; }

    void setIList(int iList) { this.iList = iList;}

}
