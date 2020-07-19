package task1;

public class Guest implements Runnable {
    private Card card;

    public Guest(Card card)
    {
        this.card = card;
    }

    @Override
    public void run() {

        String name = Thread.currentThread().getName();
        synchronized (card) {
            try {
                while (card.getCount() >= 4)
//                  if(card.getCount() >= 4)
                    card.wait();
                card.setName(name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
