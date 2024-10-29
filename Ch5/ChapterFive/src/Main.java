public class Main {
    public static void main(String[] args) {
        User user = new User("j@nths.net", "ASBUBIU12313");

        int n = 0;
        String text = "";
        while(n < 10)
        {
            n+=1 + n%3;
        }
        System.out.println(2%3);

        int x = 95;
        if((int) 'd' < x++ && !(x++ > 100) || false)
        {
            x+=5;
        }
        System.out.println(x);

        int y = 0;
        if(true && 9/1 ==5)
        {
            System.out.println("works");
        }
        else {
            System.out.println("false");
        }

        int a = "abc".compareTo("ABC");
        System.out.println(a);


    }
}