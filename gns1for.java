import java.util.Scanner;
public class gns1for {
    public static void main(String[]args) {
    String str;
    int i, sum=0;
    System.out.println("input:");
    
    try (
     //Ű���� �Է¹��� (System.in) ���ο�(new) ������ scan�̶� ��ü�� ��ƶ�.     
    Scanner scan = new Scanner(System.in)) {
    //scan�� �Է¹��� ������ ���ڿ��� ��ȯ�Ͽ� str�� �ִ´�.

        str=scan.next();
        for(i=1; i<=Integer.parseInt(str); i++)
        //1���� �Է��� ���ڱ����� ��.
        sum+=i;
        System.out.printf("result: %d",sum);
        scan.close();
    } catch (NumberFormatException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
}