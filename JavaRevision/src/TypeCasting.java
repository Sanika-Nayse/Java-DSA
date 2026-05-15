public class TypeCasting {
    public static void main(String[] args) {
        long a= 334L;
        float b= a+7;
        String str = "3.5e38";
        String t = "TruE";
        // Java does not allow converting boolean to any numeric type or vice versa.
        int d = (int) a +'4';
        System.out.println("sum = "+ b);
        System.out.println("sum = "+ d);
        System.out.println("Sum = "+ (3+Float.parseFloat(str)));
        System.out.println(Boolean.parseBoolean(t));
    }
}

/*
Situation             	            Result
-----------------------------------------------------------
Fits exactly in float	            parsed normally
Needs more precision than float	    rounded
Too large for float	                Infinity
Invalid format	                    NumberFormatException
*
 */
