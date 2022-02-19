public class Program {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            //input [6] to get correct answer
            a[0]=5; a[1]=6; a[2]=3; a[3]=5; a[4]=6; a[5]=4;
            for(int i=0;i<5;i++){
                System.out.println(a[i]);
            }
        }
        catch(Exception e) {
            System.out.println("an error occured");
        }
    }
}