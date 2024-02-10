import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;

public class richestcustomer {

    public static void main(String[] args) {
        int[][] list={{1,5},{7,3},{3,5}};
        rich(list);
    }
    static void rich(int[][] list){
        int n=0;
        for (int i = 0; i < list.length; i++) {
            int k=0;
            for (int j = 0; j < list[i].length; j++) {
                k=list[i][j]+k;
                while (k>n) {
                    n=k;
                }
            }
        }
        System.out.println(n);
    }
}    