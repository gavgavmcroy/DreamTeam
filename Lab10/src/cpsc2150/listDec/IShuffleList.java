package cpsc2150.listDec;

import java.util.List;
import java.util.Random;

public interface IShuffleList<T> extends List<T> {

    /**
     *
     * @param swaps
     */
    default void shuffle(int swaps){
        for (int i=0; i<swaps; i++) {
            Random pos1 = new Random();
            Random pos2 = new Random();
            swap(pos1, pos2);
        }
    }

    /**
     *
     */
    default void swap(int i, int j){

    }

}
