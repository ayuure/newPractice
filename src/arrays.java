import java.lang.reflect.Array;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args){
        char vowels[]={'c','b','a','o','p','d'};

        Arrays.sort(vowels);
        int start = 1;
        int end = 3;
        char key = 'o';
        int find = Arrays.binarySearch(vowels,start,end, key);



        System.out.println(Arrays.toString(vowels));
        System.out.println(find);

        System.out.println(vowels);
        char copy[]= Arrays.copyOf(vowels, vowels.length);
        char coppy2[]=Arrays.copyOfRange(vowels,start,end);
        Arrays.fill(vowels,'x');
        System.out.println(copy);
        System.out.println(coppy2);
        System.out.println(vowels);


    }
}
