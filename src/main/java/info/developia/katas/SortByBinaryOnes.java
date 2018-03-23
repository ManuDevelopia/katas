package info.developia.katas;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

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
        Map<Integer, Integer> numbBinRepLen = new HashMap<>();

        for (Integer number : list) {
            String binRep = Integer.toBinaryString(number);
            int binRepNoZeroLen = binRep.replaceAll("0", "").length();

            numbBinRepLen.put(number, binRepNoZeroLen);
        }

        numbBinRepLen = numbBinRepLen.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .sorted(SortByBinaryOnes::compare)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (integer, integer2) -> integer, LinkedHashMap::new));

        return numbBinRepLen.keySet().toArray(new Integer[numbBinRepLen.keySet().size()]);
    }

    private static int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        if (o1.getValue() == o2.getValue()) {
            return o1.getKey() < o2.getKey() ? o1.getKey() : o2.getKey();
        } else {
            return o1.getValue() < o2.getValue() ? o1.getValue() : o2.getValue();
        }
    }

}

