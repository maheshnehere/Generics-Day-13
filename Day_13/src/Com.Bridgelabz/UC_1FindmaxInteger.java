public class UC_1FindmaxInteger {
    public Integer maxInt(Integer a, Integer b, Integer c){
        Integer max = a;
  
        if(b.compareTo(a) > 0){
            max = b;
        }else if (c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }
}
