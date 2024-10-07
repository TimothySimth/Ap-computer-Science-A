package Q1.prog52aCl;

public class progcl52a {
    private int myLen;
    private int myWid;
    private int myArea;
    private int myPerim;

    public progcl52a(int len, int wid) {
        myLen = len;
        myWid = wid;
        myArea = 0;
        myPerim = 0;

    }
    public void calc() {
        myArea = myLen * myWid;
        myPerim = myLen * 2 + myWid * 2;
    }

    public int getArea()  {return myArea; }
    public int getPerim() {return myPerim; }

}
