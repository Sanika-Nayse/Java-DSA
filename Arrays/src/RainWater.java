public class RainWater {

    public static int maxIndex(int strt, int end, int ht[]){
        int max = Integer.MIN_VALUE;
        int r=strt;
        for(int i= strt; i<=end; i++){
            if (max<ht[i]){
                max=ht[i];
                r=i;
            }
        }
        return r;
    }
    public static int volumeOfWater(int ht[], int w){
        int maxE=maxIndex(0,ht.length-1,ht);
        //System.out.println("Max ele ="+ht[maxE]);
        int areaL=0, areaR=0;
        int max= maxE;
        while(max>0) { //left side
            int maxL = maxIndex(0,max-1,ht);
            //System.out.println("Max L = "+ht[maxL]);
            for(int i= maxL+1; i<max; i++){
                areaL += Math.max((ht[maxL]-ht[i]),0)*w*w;
            }
            //System.out.println("Area left = "+areaL);
            max=maxL;
        }
       max= maxE;
        while(max<ht.length-1){ // right side
            int maxR = maxIndex(max+1,ht.length-1,ht);
            //System.out.println("Max R = "+maxR);
            for(int i= max+1; i<maxR; i++){
                areaR += Math.max((ht[maxR]-ht[i]),0)*w*w;
            }
            //System.out.println("Area right = "+areaR);
            max=maxR;
        }
        return areaL+areaR;
    }

    public static void main(String[] args) {
        int ht[] = {1,2,3,4,3,1,0,2,1,3};
        int w=1;
        System.out.println("Volume of trapped water = "+ volumeOfWater(ht,w));
    }
}
