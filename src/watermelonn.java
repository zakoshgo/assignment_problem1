public class watermelonn {

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
