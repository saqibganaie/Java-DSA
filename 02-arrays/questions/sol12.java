public class sol12 {
    // Q: There is a biker going on a road trip. The road trip consists of n + 1
    // points at different altitudes. The biker starts his trip on point 0 with
    // altitude equal 0.

    // You are given an integer array gain of length n where gain[i] is the net gain
    // in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the
    // highest altitude of a point.
    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        int maxAlt = 0;
        int currAlt = gain[0];
        for (int i = 1; i <= gain.length; i++) {
            if (currAlt > maxAlt)
                maxAlt = currAlt;
            if (i == gain.length)
                break;
            currAlt += gain[i];
        }
        return maxAlt;
    }

}