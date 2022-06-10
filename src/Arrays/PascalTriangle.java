package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(5));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();

        //adding first row
        numList.add(1);
        list.add(numList);

        if (numRows == 1)
            return list;

        //adding second row
        numList = new ArrayList<>();
        numList.add(1);
        numList.add(1);
        list.add(numList);

        while(numRows-- > 2){
            newList = new ArrayList<>();
            newList.add(1);
            for(int i = 0; i < numList.size() - 1; i++) {
                newList.add(numList.get(i) + numList.get(i + 1));
            }
            newList.add(1);
            numList = newList;
            list.add(newList);
        }

        return list;
    }
}
