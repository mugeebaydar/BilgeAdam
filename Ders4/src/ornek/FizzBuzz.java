package ornek;

public class FizzBuzz {
    public static void main(String[] args) {

        //100'e kadar olan sayılar 3'bölündüğünde ekrana "fizz" yazacak
        // 5'e bölündüğünde "buzz" yazacak
        // 15'e bölündüğünde "fizz-bazz" yazacak
        // Diğer durumlarda sayıyı yazacak

        int i;
        for (i=1; i<=100; i++){
            if (i%3==0 && i%5==0){
                System.out.println("fizzbuzz "+i);
            }
            else if(i%3==0){
                System.out.println("fizz "+i);
            }
            else if (i%5==0){
                System.out.println("buzz "+i);
            }
            else{
                System.out.println(i);
            }

        }

    }
}
