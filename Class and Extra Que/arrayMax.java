public class arrayMax {
    public static void main(String[] args) {
        int[]arr={4,5,7,8,0,9};



        int max=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max)max=i;
        }
        System.out.println("maximum element is "+max);
    }
}
