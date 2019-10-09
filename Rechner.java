
public class Rechner
{
    int aZahl1, aZahl2;
    int aErgebnis;

    public Rechner()
    {
        aZahl1 = aZahl2 = aErgebnis=0;
    }
    
    public int add(int pSum1, int pSum2)
    {
        return pSum1 +pSum2;
    }
    
    public int diff(int pMin, int pSub)
    {
        return pMin-pSub;
    }
    public int mult(int pFaktor1, int pFaktor2)
    {
        return pFaktor1*pFaktor2;
    }
}
