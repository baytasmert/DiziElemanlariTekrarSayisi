public class Main {

   static void tekrarBul(int [] dizi){
        int []uniq= new int [dizi.length];
        int eleman=0;
       for (int k : dizi) {
           int brk = 0;
           for (int a : uniq) {
               if (k == a) {
                   brk = 1;
               }
           }

           if (brk == 0) {
               uniq[eleman++] = k;
           }
       }

       for(int i : uniq){
           int tekrar=0;
           if(i==0){
               continue;
           }
           for (int j: dizi){
               if(i==j){
                   tekrar++;
               }
           }

           System.out.println(i+" sayisi "+tekrar+" kez tekrar etmistir.");
       }

    }
    public static void main(String[] args) {


        int [] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

         tekrarBul(dizi);




    }
}