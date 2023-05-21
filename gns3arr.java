public class gns3arr {
        public static void main(String[]args) {
        int arr[]=new int[]{1,2,3,4,5};
        int arr2[]={2,2,2,2,2};//이렇게만 써줘도 됨.
        
        int i;
        for(i=0; i<arr.length;i++)
            System.out.println(arr[i]);
        
        String str="12345";
        System.out.println(str.charAt(3));
        System.out.println(str.indexOf('3'));
        System.out.println(str.substring(2,4));
        
    }
    
}
