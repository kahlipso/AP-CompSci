public class Main {
    public static void main(String[] args) {
        int data[] = new int[20];
        for(int k = 0;k<20;k++)
        {
            data[k] = k+k % 3 + k % 2;
        }
        System.out.println(data[0]);
        System.out.println(data[4]);
        System.out.println(data[19]);
    }
}