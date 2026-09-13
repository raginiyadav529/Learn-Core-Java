package oops;

public class Learn_StringBuilderAndBuffer {

    public static void main(String[]args) throws InterruptedException{

       
        // Thread Safety Concept
//        StringBuilder sb = new StringBuilder(); // Not thread safe
        StringBuffer sb = new StringBuffer(); // thread safe
        Thread t1 = new Thread(()->{

            for (int i =0 ; i<1000;i++){
                sb.append('a');
            }
        });
        Thread t2 = new Thread(()->{

            for (int i =0 ; i<1000;i++){
                sb.append('a');
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final length : "+sb.length());

        /*
        String s1 = "Hello";
        String s4 = "Hello";

        s1.concat("World");

        StringBuilder s2 = new StringBuilder("Hello");
        s2.append("World");

        StringBuffer s3 = new StringBuffer("Hello");
        s3.append("World");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String str1 = new String("Hello");
        String str2 = new String("Hello");

        StringBuilder str3 = new StringBuilder("Hello");
        StringBuilder str4 = new StringBuilder("Hello");

        StringBuffer str5 = new StringBuffer("Hello");
        StringBuffer str6 = new StringBuffer("Hello");

        System.out.println(str1 == str2); // false
        System.out.println(str3 == str4);//  false
        System.out.println(str5 == str6);// false

        System.out.println(str1.equals(str2)); // true
        System.out.println(str3.equals(str4)); // false
        System.out.println(str5.equals(str6)); // false

        System.out.println("String literal !!!");
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));

       String s5 = s1.concat("World");
        System.out.println(s5);

         */
    }
}
