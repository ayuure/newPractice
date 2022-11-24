import java.util.ArrayList;
import java.util.Comparator;

public class arrayList {
    public static void main(String[] args){
        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(6);
        numbers.add(7);
        numbers.add(6);
        numbers.add(0);
        numbers.add(9);
        System.out.println(numbers.toString());
        System.out.println(numbers.get(1));

        //numbers.remove(2);
        numbers.remove(Integer.valueOf(7));
                System.out.println(numbers);
                //clears entire arrayList
       // numbers.clear();
        System.out.println(numbers);
        //setting
        numbers.set(2,Integer.valueOf(30));
        System.out.println(numbers);

        //sorting a list
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers.size());

        System.out.println(numbers.contains(Integer.valueOf(13)));

        //isEmpty method
        //for Each doesn't change the original arrayList
        numbers.forEach(number->{
           System.out.print((number*2));
        });
        numbers.forEach(num->{
            numbers.set(numbers.indexOf(num),num*3);
        });
        System.out.println(numbers.toString());




    }
}

