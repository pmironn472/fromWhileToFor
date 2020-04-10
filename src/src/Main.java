//public class Main {
//
//
//    public static void main(String[] args){
//
//
//        showPretty(1000, 3);
//
//
//
//    }
//
//            static void showPretty(int value, int qty){
//               System.out.println("////////////////////////////////////");
//
//                while(qty-- > 0)
//                    System.out.println(value);
//
//
//               System.out.println("////////////////////////////////////");
//
//            }
//
//}



public class Main {

    public static void main(String[] args){

        showPretty(1000,10);

    }

    static void showPretty(int value, int qty){

        System.out.println("////////////////////////////////////");

        for(  ; qty > 0 ; qty--){

            System.out.println(value);
        }

        System.out.println("////////////////////////////////////");

    }

}
