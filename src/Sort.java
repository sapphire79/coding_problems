import java.util.ArrayList;

public class Sort {
    public static ArrayList sortArrayList(ArrayList<Integer> arrayToSort) {
        ArrayList sortedArrayList = new ArrayList();
        int initialArrayList = arrayToSort.size();
        for (int x = 0; x < initialArrayList; x++) {
            int smallestSoFar = arrayToSort.get(0);
            for (int i = 0; i < arrayToSort.size(); i++) {
                if (arrayToSort.get(i) <= smallestSoFar) {
                    smallestSoFar = arrayToSort.get(i);
                }
            }
            sortedArrayList.add(smallestSoFar);
            int indexSmall = arrayToSort.indexOf(smallestSoFar);
            arrayToSort.remove(indexSmall);
            System.out.println("After we remove the smallest our list looks like this: " + arrayToSort);
        }
        return sortedArrayList;

    }
}
