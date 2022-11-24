public class addFromOneToTen {
    public static void main(String[] args){
        int number[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for(int i=0; i<=number.length-1; i++){
            sum+=number[i];

        }
        System.out.println(sum);

        // 5 times table
        int mul =5;
        for(int i=0; i<number.length; i++){
            int answer= mul*number[i];

            System.out.println(mul +"*"+number[i]+"="+answer);
        }
    }
}
