public class reverse {
    public static void main(String[] args) {
        String str="*abcde*";
        int n = str.length();
        // 문자열 형태의 (char *) 배열 []
        char[]arr = new char[n];
        System.out.println(n);
        n--;
        System.out.println(n);
        for (int k=n; k>=0; k--)
        //toCharArray=String 문자열을 char형 배열로 바꿔서 반환
            arr[n-k] = str.toCharArray()[k];
        for (int k=0; k<=6; k++)
            System.out.printf("%c",arr[k]);       

    }
}
