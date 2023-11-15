

public class Item {
    private Item Next;
    private TFigure Figure;

    public Item (Item Next, TFigure Figure) { this.Next = Next; this.Figure = Figure; }
    public Item GetNext ()  { return Next; }
    public TFigure GetFig () { return Figure ; }
    public void SetNext (Item Next) { this.Next = Next; }
    public void SetFig (TFigure altermative) { Figure = altermative; }
}
