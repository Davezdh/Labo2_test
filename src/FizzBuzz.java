public class FizzBuzz {


        public static void main(String[] args) {
            String u = "fizz";

            for ( int i =0; i<= 100; i++){
                if(i % 3 == 0){
                    System.out.print("fizz");
                }
                if(i % 5 == 0){
                    System.out.print("buzz");
                }
                if(i % 3 ==0 && i % 5 == 0){
                    System.out.print("fizzBuzz");
                }

                System.out.println(":"+ i);


            }
        }
    }


