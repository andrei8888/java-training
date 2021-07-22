package lab1.array;

public class App {
    public static void displayArray(){
        int[] a = new int[3];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }

    public static int[] copyArray(int[] b){
        int[] c=new int[3];
        System.arraycopy(b,2,c,0,2);
        return c;
    }

    public static void main(String[] args) throws Exception {
        /*char[] copyFrom = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
        char[] copyTo=new char[7];
        System.arraycopy(copyFrom,2,copyTo,0,7);
        displayArray();
        System.out.println(new String(copyTo));*/
        byte a1=12;
        byte a2=56;
        int a3= a1+a2;
        System.out.println(a3);
    }
}
