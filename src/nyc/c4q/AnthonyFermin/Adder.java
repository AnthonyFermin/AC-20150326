package nyc.c4q.AnthonyFermin;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        int sum = 0;

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList();

        System.out.println("Give me some numbers to add: ");
        while(true) {
            int num = in.nextInt();
            if (num == -2) {
                break;
            }else if(num == -1){
                numbers.clear();
            }
            numbers.add(num);
        }

        for(int n : numbers){
            sum += n;
        }

        System.out.println("Thanks! Your sum is " + sum);

        Iterator<Integer> numsIter = numbers.iterator();
        while (numsIter.hasNext()){
            sum += numsIter.next();
        }



    }
}
