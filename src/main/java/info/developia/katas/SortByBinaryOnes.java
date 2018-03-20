package info.developia.katas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
In this example you need to implement a function that sort a list of integers based on it's binary representation.

    The rules are simple:

    sort the list based on the amount of 1's in the binary representation of each number.

    if two numbers have the same amount of 1's, the shorter string goes first.
        (ex: "11" goes before "101" when sorting 3 and 5 respectively)

    if the amount of 1's is same, lower decimal number goes first.
        (ex: 21 = "10101" and 25 = "11001", then 21 goes first as is lower)

    Examples:

    Input: [1,15,5,7,3]
    ( in binary strings is: ["1", "1111", "101", "111", "11"])

    Output: [15, 7, 3, 5, 1]
    (and after sortByBinaryOnes is: ["1111", "111", "11", "101", "1"])
*/

public class SortByBinaryOnes {

    public static Integer[] sort(Integer list[]) {
        List<Integer> result = new ArrayList<>();

        // Hashmap<Integer,... does make the order by number
        Map<Integer, Integer> numbBin = new HashMap<>();

        for (Integer number : list){
            String binRep = Integer.toBinaryString(number);
            int binRepNoZeroLen = binRep.replaceAll("0","").length();

            numbBin.put(number, binRepNoZeroLen);
        }

        return (list);
    }

}



