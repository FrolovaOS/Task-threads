package task1;

import java.util.ArrayList;
import java.util.List;

public class Card {

    private List<String> guests;
    private int count;

    public Card()
    {
        guests = new ArrayList<String>();
        count = 0;
    }

    public void setName(String nameGuests)
    {
        guests.add(nameGuests);
        count++;
    }

    public int getCount()
    {
        return count;
    }

    public void clear()
    {
        count = 0;
        guests.clear();
    }

    public void display()
    {
        for(String name: guests)
        System.out.print(name.toString() + " ");
    }
}
