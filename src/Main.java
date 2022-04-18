import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int w = sc.nextInt();
        watermelonn g3an = new watermelonn(w);
        System.out.println(g3an.checkDevide());


    }


}
 class watermelonn {


    private int w;

    public watermelonn(int w) {
        this.w = w;
    }
    public String checkDevide(){
        if(w>100 || w<0) return "ERROR";
        else if(w%2 ==0&& w > 2) return "YES";
        else
            return "NO";

    }
}