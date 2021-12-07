package alg.Searching;

public class AllSearching {
    /* BINARY SEARCH */
    public static int BinarySearch(int key, int[] list) {
        int result = 0;
        for (int j = 0; j < list.length; j++) {
            if (key == list[j]) {
                result = j;
            }
        }

        return result;
    }

    /* BREADHTFIRST SEARCH */
    public static int BreadthFirstSearch() { 
        return 0;
    }

    /* DEPTHFIRST SEARCH */
    public static int DepthFirstSearch() {
        return 0;
    }

    /* LINEAR SEARCH */
    public static int LinearSearch() {
        return 0;
    }
}
