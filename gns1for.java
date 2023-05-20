import java.util.Scanner;
public class gns1for {
    public static void main(String[]args) {
    String str;
    int i, sum=0;
    System.out.println("input:");
    
    try (
     //키보드 입력받은 (System.in) 새로운(new) 내용을 scan이란 객체에 담아라.     
    Scanner scan = new Scanner(System.in)) {
    //scan에 입력받은 내용을 문자열로 변환하여 str에 넣는다.

        str=scan.next();
        for(i=1; i<=Integer.parseInt(str); i++)
        //1부터 입력한 숫자까지의 합.
        sum+=i;
        System.out.printf("result: %d",sum);
        scan.close();
    } catch (NumberFormatException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
}