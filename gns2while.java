public class gns2while {
        public static void main(String[]args) {
        boolean a =true;
        int cnt=0;
        while(a){
            cnt+=1;
            System.out.println(cnt + "회 반복");
            if (cnt==10)
            {
                break;
            }
        }
        System.out.println("종료");
        }
}
