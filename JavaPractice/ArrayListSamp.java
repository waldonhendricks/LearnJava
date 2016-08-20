import java.io.*;
import java.util.*;

public class ArrayListSamp
{
    public static void main(String[] args)
    {
        ArrayList<Integer> intArrList = new ArrayList<>();
        intArrList.add(1);
        intArrList.add(2);
        intArrList.add(3);
        intArrList.add(4);

        for (int i : intArrList)
        {
            System.out.println("Num: " + i);
        }
    }
}
