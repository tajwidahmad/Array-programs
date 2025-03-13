public class binarysearch {
   
   
    public static int binser(int marks[],int key){
        int start =0;
        int end = marks.length-1;
        
        while(start<=end){
            int mid= (start+end)/2;
            if (marks[mid]==key) {
                return mid;
            }
            if(marks[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
        
    }
   
     
    public static void main(String[] args) {
        int marks[]={1,2,3,4,5,6};
        int key = 5;
        
        System.out.println("the index of search is: "+binser(marks, key));
    }
}
