package com.meetup.memcached;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: wouter
 * Date: Jun 11, 2010
 * Time: 1:14:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Continuum {
    /*
    upper = ary.size - 1
    lower = 0
    idx = 0

    while(lower <= upper) do
      idx = (lower + upper) / 2
      comp = ary[idx].value <=> value

      if comp == 0
        return idx
      elsif comp > 0
        upper = idx - 1
      else
        lower = idx + 1
      end
    end
    return upper*/

    public static int binarySearch(ArrayList<ContinuumEntry> buckets, long value) {
        int upper = buckets.size() - 1;
        int lower = 0;
        int idx = 0;
        while(lower <= upper){
            idx = (lower + upper) / 2;

            long bucket_value = buckets.get(idx).getValue();

            if(bucket_value == value){
              return idx;
            } else if(bucket_value > value){
              upper = idx - 1;
            } else {
              lower = idx + 1;
            }
        }
        if(upper == -1){
            return buckets.size() - 1;
        }
        return upper;  //To change body of created methods use File | Settings | File Templates.
    }
}
