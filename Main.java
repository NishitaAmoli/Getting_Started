public class Main {
    public static void main(String[] args){
        int arr[]={10,30,20,40,30,10,60},target=30;
        int first_occ=0, last_occ=0;
        for(int idx=0;idx<arr.length;idx++){
            if(arr[idx]==target){
                if(first_occ==0){
                    first_occ=idx;
                }
                last_occ=idx;
            }
        }
        System.out.println("first occurance of target is:"+first_occ);
        System.out.println("last occurance of target is:"+last_occ);
    }
}
