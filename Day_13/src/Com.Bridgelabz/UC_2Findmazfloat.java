public class UC_2Findmazfloat {
    public Float maximum(Float a, Float b, Float c){
        Float max = a;
  
        if(b.compareTo(a) > 0){
            max = b;
        }else if (c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }
}
