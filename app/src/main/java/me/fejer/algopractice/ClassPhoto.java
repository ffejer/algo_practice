package me.fejer.algopractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ClassPhoto {

    public static void main(String[] args) {
        System.out.println(new ClassPhoto().classPhotos(new ArrayList<>(Arrays.asList(5, 8, 1, 3, 4)), new ArrayList<>(Arrays.asList(6, 9, 2, 4, 5))));
    }


    public boolean classPhotos(
            ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {

        redShirtHeights.sort(Collections.reverseOrder());
        blueShirtHeights.sort(Collections.reverseOrder());
        if(redShirtHeights.get(0).equals(blueShirtHeights.get(0))) return false;
        boolean order = redShirtHeights.get(0) > blueShirtHeights.get(0);

        for(int i = 1; i < redShirtHeights.size(); i++) {
            if(redShirtHeights.get(i).equals(blueShirtHeights.get(i))) return false;
            if(redShirtHeights.get(i) > blueShirtHeights.get(i) != order) return false;
        }

        return true;
    }


}
