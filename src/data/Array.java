package data;

public class Array {

    /* Transverse */
    public static void Transverse() {

    }

    /* Insertion */
    public static void InsertionViaIndex(int[] List, int index) {

    }

    /* Deletion */
    public static void DeletionViaIndex(int[] List, int index) {

    }

    /* Search */
    public static  int SearchViaLoop(int[] List, int key){
        int index=0;
        for (int i = 0; i < List.length; i++) {
            if (key==List[i]) {
                index=i;
            }
        }
        return index;
    }

}
