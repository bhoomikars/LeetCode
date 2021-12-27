import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PascalsTriangle
{
    public static void main (String[] args)
    {
        System.out.println(generate(5));

    }
    public static List<List<Integer>> generate(int numRows) {
      List<List<Integer>> l1 = new ArrayList<>();
      List<Integer> row = null,prev=null;
      for(int i =0;i<numRows;i++)
      {
          row = new ArrayList<Integer>();
          for(int j=0;j<=i;j++)
          {
              if(j==0 || j==i)
                  row.add(1);
              else
                  row.add(prev.get(j)+prev.get(j-1));
          }
          prev=row;
          l1.add(row);
      }
        return l1;


    }

}
