public class koko_eating_bananas_875 {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;
        int mid;

        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > high) {
                high = piles[i];
            }
        }
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (isFinished(piles, mid, h)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean isFinished(int[] piles, int mid, int h) {
        int hours = 0;
        for (int i = 0; i < piles.length; i++) {
            hours += Math.ceil((double)piles[i] / mid);
            //hours += (piles[i] + k - 1) / k;  // 等同於 ceil(p / k)
            if (hours > h) return false;
        }
        return true;
    }
}
