public class forLoopNew {
    //like for each
    public static void main(String[] args){
        int numbers[]={1,2,3,4,5};
        for(int number : numbers){
            System.out.println(number);
        }
        int sum=0;
        for(int number: numbers){
            sum+=number;
        }
        System.out.println(sum);
    }
}
