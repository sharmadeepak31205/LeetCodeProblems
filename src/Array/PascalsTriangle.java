package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deepaksharma on 12/24/17.
 */
public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        for(int i=0;i<numRows;i++)
        {
            row.add(0, 1);
            for(int j=1;j<row.size()-1;j++){
                row.set(j, row.get(j)+row.get(j+1));
            }

            allrows.add(new ArrayList<Integer>(row));
        }
        return allrows;

    }

    public static void main(String[] args){
        List<List<Integer>> allrows = generate(4);


        for(List<Integer> l : allrows){
            System.out.println(l);
        }
    }
}
