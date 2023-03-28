public class Generics{

   public <M extends Comparable > M maximum(M a, M b, M c , M d){
        M max = a;

        if(b.compareTo(a) > 0){
            max = b;
        }else if (c.compareTo(max) > 0){
            max = c;
        }else if (d.compareTo(max) > 0){
            max = d;
        }
        return max;
    }
}
