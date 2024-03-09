class Solution {
    public int function(int arr[],int hour){
            int th =0;
            for(int i=0;i<arr.length;i++){
            th +=Math.ceil((double) arr[i] / hour);
            }
            return th;
        }
    public int minEatingSpeed(int[] piles, int h) {
       int s=1;
       Arrays.sort(piles);
       int e=piles[piles.length-1];
       int mans=0;
       while(s<=e){
           int mid=s+(e-s)/2;
           int tothr=function(piles,mid);
           if(tothr<=h){
             mans=mid;
               e=mid-1;
           }
           else{
               s=mid+1;
           }
       }return s;
    }
}
