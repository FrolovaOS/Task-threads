package task1 ;

public class App
{
    public static void main( String[] args )
    {
        Card card = new Card();
        Operator operator = new Operator(card);
        Guest guest = new Guest(card);

        new Thread(operator).start();
        for(int i = 0;i < 100; i++)
            new Thread(guest).start();
    }
}
