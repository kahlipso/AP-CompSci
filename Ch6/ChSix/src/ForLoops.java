public class ForLoops {

    public static void main(String[] args) {
        backwardsName("david");

        String x = "David";
        System.out.println(x.substring(4));
    }
    public static void backwardsName(String someName)
    {
        String newName = "";
        newName += someName.substring(someName.length()-1);
        for(int i = someName.length() -1; i > 0; i--)
        {
            newName += someName.substring(i-1, i);
        }
        System.out.println(newName);
    }

}
