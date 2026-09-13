package oops;

public class StringPractice {
    public static void main(String[]args){

        String name = "Ragini";
        String sameName = "Ragini";

        String str = new String("Ragini");
        String str1 = new String("Ragini");
        String str2 = new String("RAGINI");

        System.out.println(name);
        System.out.println(sameName);
        System.out.println(str);
        System.out.println(str1);

        System.out.println(name == sameName);  // true
        System.out.println(sameName.equals(name)); // true
        System.out.println(name == str);        //  false
        System.out.println(name.equals(str));    // true
        System.out.println(str == str1);       // false
        System.out.println(str.equals(str1)); // true
        System.out.println(str1.equalsIgnoreCase(str2)); // true



    }

    /*

For Non-Primitive datatype == operator checks references points to the same address.
if they point to the same address it returns ture otherwise false .
  equals() method of String class checks their values not references .
  equalsIgnoreCase() ignores case sensitive .
     */
}
