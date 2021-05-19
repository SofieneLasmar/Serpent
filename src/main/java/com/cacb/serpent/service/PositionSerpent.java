package com.cacb.serpent.service;

import java.util.ArrayList;
import java.util.List;

public class PositionSerpent {

    public void moveTail(float x, float y, int tail) {

        List<String> direction_list = new ArrayList<>(tail);

        float direct_x = 0, direct_y = 0;

        for( String dl : direction_list) {

            if (dl.equals('D')) {
                direct_x = +1;
            } else if (dl.equals('B')) {
                direct_x = +-1;
            } else {
                direct_y = +1;
            }
        };
        x =+ direct_x ;
        y =+direct_y ;
        System.out.print("the snake head position is:"+(x+","+y));
    }
}