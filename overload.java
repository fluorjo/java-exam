public class overload {
    public static void main(String[] args) {
        overload hd=new overload();
        hd.cat();
        hd.cat("4");
    }
    public void cat()
    {
        System.out.print("1234");
    }
    public void cat(int c)
    {
        System.out.print(++c);
    }
    public void cat(String c)
    {
        System.out.print("문자");
    }
}
