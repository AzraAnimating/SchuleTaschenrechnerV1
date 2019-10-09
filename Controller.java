public class Controller
{
    Rechner meinRechner;
    GUI_project oberFlaeche;

    // Konstruktor
    public Controller()
    {
        meinRechner = new Rechner();
        oberFlaeche = new GUI_project(this);
    }
    
    public void addiere(int pZahl1, int pZahl2)
    {
        oberFlaeche.printText(Integer.toString(meinRechner.add(pZahl1,pZahl2)));
    }
    public void multipliziere(int pZahl1, int pZahl2)
    {
        oberFlaeche.printText(Integer.toString(meinRechner.mult(pZahl1,pZahl2)));
    }
    public void differenziere(int pZahl1, int pZahl2)
    {
        oberFlaeche.printText(Integer.toString(meinRechner.diff(pZahl1,pZahl2)));
    }
}
