public class arraySMax {
    public static void main(String[] args) {
        int[]arr={4,5,7,8,0,1,-1};
        int max=Integer.MIN_VALUE,sMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                sMax=max;
                max=arr[i];

            }
            else if(arr[i]>sMax && arr[i]!=max)sMax=arr[i];
        }
        System.out.println(max+"->"+sMax);
    }
}
