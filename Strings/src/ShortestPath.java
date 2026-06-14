public class ShortestPath {
    public static String path(String str){
        int len = str.length();
        String str1 = "",a="", b="",c="",last= ""+str.charAt(0);

        for(int i=0; i<len-2; i=i+2) {
            a= last;
            b= ""+str.charAt(i+1);
            c= ""+str.charAt(i+2);
            //System.out.println("a: "+a+"b: "+b+"c: "+c);
            if (!a.equals(b) && !b.equals(c) && !c.equals(a)) {
                str1 += b;
                //System.out.println(str1);
                last = b;
            }
            else{
                str1 += b + c;
                last = c;
                //System.out.println(str1);
            }
        }
        return str1;
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println("Shortest path: "  +path(str));
    }
}
