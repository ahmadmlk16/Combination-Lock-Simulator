public class CombinationLock {
    int cl1;
    int cl2;
    int cl3;
    int dial;
    public CombinationLock()
    {
        cl1 = 0;
        cl2 = 0;
        cl3 = 0;
        dial = 0;
    }
    public CombinationLock(int comb1, int comb2, int comb3, int dial)
    {
        this.cl1 = comb1;
        this.cl2 = comb2;
        this.cl3 = comb3;
        this.dial = dial;
    }
    public int getCl1()
    {
        return cl1;
    }
    public void setCl1(int comb1)
    {
        this.cl1 = comb1;
    }
    public int getCl2()
    {
        return cl2;
    }
    public void setCl2(int comb2)
    {
        this.cl2 = comb2;
    }
    public int getCl3()
    {
        return cl3;
    }
    public void setCl3(int comb3)
    {
        this.cl3 = comb3;
    }
    public int getDial()
    {
        return dial;
    }
    public void setDial(int dial)
    {
        this.dial = dial;
    }
    public void resetDial()
    {
        dial = 0;
    }
    public void turnLeft(int ticks)
    {
        dial += ticks;
    }
    public void turnRight(int ticks)
    {
        dial += ticks;
    }
    public boolean openLock(int c1, int c2, int c3)
    {
        return cl1 == c1 && cl2 == c2 && cl3 == c3;
    }
    @Override
    public String toString()
    {
        return "combination: " + cl1 + ":" + cl2 + ":" + cl3;
    }
    public void printCombination()
    {
        System.out.println(toString());
    }
}
