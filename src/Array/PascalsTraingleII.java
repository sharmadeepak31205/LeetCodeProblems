package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deepaksharma on 12/24/17.
 */
public class PascalsTraingleII {

    public static List<Integer> getRow(int rowIndex) {

        List<Integer> row = new ArrayList<>();

        row.add(0,1);

        for(int i = 0; i < rowIndex; i++){
            row.add(0,1);
            for(int j = 1; j < row.size() - 1; j++){
                row.set(j, row.get(j) + row.get(j+1));
            }
        }

        return row;
    }

    public static void main(String[] args){
        int a = 3;
        getRow(a);
    }
}
