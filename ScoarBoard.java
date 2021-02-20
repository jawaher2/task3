public class ScoarBoard {
    private int numEntries=0;
    private GameEntry[] Board;

    public ScoarBoard(int capacity)
    {
        Board= new GameEntry[capacity];
    }
    public void add(GameEntry e)
    {
        int newScore=e.getScore();
        if (numEntries<Board.length || newScore> Board [numEntries-1].getScore())
        {
            if (numEntries<Board.length)
            numEntries++;
        }
        int j= numEntries-1;
        while (j>0 &&  Board [j-1].getScore()< newScore)
        {
            Board [j]= Board[j-1];
            j--;
        }
        Board [j]=e;
    }

    public GameEntry remove(int i) throws IndexOutOfBoundsException {
        if(i<0 || i>=numEntries)
            throw new IndexOutOfBoundsException("invalid index "+i);
        GameEntry temp=Board[i];
        int j;
        for (j=i ; j<numEntries-1; j++)
            Board [j]= Board[j+1];
        Board [numEntries-1]=null;
        numEntries--;
        return temp;
    }
}