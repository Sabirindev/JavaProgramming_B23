package V.Loops;

public class UtopianTree_forLoop {
    public static void main(String[] args) {
        int high =0, size = 0;
        for (int i = 1; i <=10 ; i++) {
            if (i > 3){
                high+=2;
            }else{
                high++;
            }
            size+=high;
            if (i==3){
                System.out.println("year "+i+"  - growth "+high+" cm");
                System.out.println("tree size: "+size+"cm");
            }else{
                System.out.println("year "+i+" - growth "+high+" cm");
                System.out.println("tree size: "+size+"cm");
            }
            high = 0;
        }
    }
}
/*
The Utopian Tree grows exactly 1 cm for the first three years,
and after that it grows by 2 cm every year.
Show 10 years of growth of the Utopian Tree.

year 1 - growth 1 cm
tree size: 1cm

year 2 - growth 1 cm
tree size: 2cm

year 3  - growth 1 cm
tree size:3cm

year 4 - growth 2 cm
tree size: 5cm

year 5 - growth 2 cm
tree size: 7cm

year 6 - growth 2 cm
tree size: 9cm

... until you reach year 10
 */
