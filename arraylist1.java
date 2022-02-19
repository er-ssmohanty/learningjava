import java.util.ArrayList;
class home{
    public static void main(String[] arr){
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("fuchsia");
        colors.add("cyan");
        System.out.println(colors);
        colors.put(1,"Blue");
        System.out.println(colors);
    }
}