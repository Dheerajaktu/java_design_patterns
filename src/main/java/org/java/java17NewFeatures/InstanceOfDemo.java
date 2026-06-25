package org.java.java17NewFeatures;

public class InstanceOfDemo {

    public static void main(String[] args) {

        /* Old way: Before Java 16 */
        Object o1 = "Hello";
        if(o1 instanceof String){
            String str = (String) o1; /* type casting here */
            System.out.println(str.length());
        }
        /*
        * In above demo code, we're doing two thing
        * 1 - type checking
        * 2 - type casting
        * */

        /* New way: After Java 16 */
        Object o2 = "Dheeraj ji";
        if(o2 instanceof String str1){
            System.out.println(str1.length());
        }
        /*
            obj instanceof String str1
            Java khud check bhi kar rha hai
            Java khud cast bhi kar rha hai
            str1 variable automatically available ho jayega.
        */
           /* Benefits
                ✅ Explicit casting nahi karna padta.
                ✅ Code chhota ho jata hai.
                ✅ Readability improve hoti hai.
                ✅ Type-safe code milta hai.
                ✅ Boilerplate kam hota hai.
           */
    }
}
