package data;

public class Array {

    /* Transverse means */
    public static void Transverse() {

    }

    /* Insertion */
    public static int[] InsertionViaIndex(int[] List, int index, int newItem) {
        int Temp[] = new int[List.length + 1];
       
        return Temp;
    }

    /* Deletion */
    public static void DeletionViaIndex(int[] List, int index) {

    }

    /* Search */
    public static int SearchViaLoop(int[] List, int key) {
        int index = 0;
        for (int i = 0; i < List.length; i++) {
            if (key == List[i]) {
                index = i;
            }
        }
        return index;
    }

    /* Min and Max of A List */
    public static void MinMax(int[] List) {
        int Max = List[0];
        int Min = List[0];
        for (int i = 0; i < List.length; i++) {
            if (Max < List[i]) {
                Max = List[i];
            } else if (Min > List[i]) {
                Min = List[i];
            }
        }
        System.out.println("The Max is:" + Max);
        System.out.println("The Min is: " + Min);
    }

    /* Adding A Particular Element at First */
    public static int[] InsertAtFirst(int[] List, int newItem) {
        /* Creating new Array Because Array has fixed size so we don't Expend it */
        int[] temp = new int[List.length + 1];
        for (int i = 0; i < temp.length; i++) {
            /* Checking if i is first palce of List */
            if (i == 0) {
                /* Adding Element at List's First Index */
                temp[i] = newItem;
            } else {
                /*
                 * copying List file
                 * First Appended the First Element So remained are copied to temp from List
                 */
                temp[i] = List[i - 1];
            }
        }
        return temp;
    }

    /* Adding A Particular Element at Last */
    public static int[] InsertAtLast(int[] List, int newItem) {
        int temp[] = new int[List.length + 1];
        for (int i = 0; i < temp.length; i++) {
            /*
             * if index i is not equal to lenght of temp (length of temp +1 ) and
             * subtracting it with 1 because of we are adding the new item in last
             */
            if (i != temp.length - 1) {
                temp[i] = List[i];
            } else {
                temp[i] = newItem;
            }
        }
        return temp;
    }
}
