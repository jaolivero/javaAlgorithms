import java.util.TreeMap;

public class HandsOfCard {
    public boolean isNStraightHand(int[] hand, int W) {
        if (hand.length % W != 0) return false;

        TreeMap<Integer, Integer> card_counts = new TreeMap();
        for (int card : hand) {
            if(!card_counts.containsKey(card)) {
                card_counts.put(card, 1);
            } else {
                card_counts.replace(card, card_counts.get(card) + 1)
            }
        }

        while (card_counts.size() > 0) {
            int min_val = card_counts.firstKey();
            for (int card = min_val; card< min_val + W; card++) {
                if(!card_counts.containsKey(card)) return false;
                int count = card_counts.get(card);
                if(count == 1) card_counts.remove(card);
                else card_counts.replace(card, count-1);
            }
        }
        return true;
    }
}

// tree map... allows to store key value pairs in sorted ordered.