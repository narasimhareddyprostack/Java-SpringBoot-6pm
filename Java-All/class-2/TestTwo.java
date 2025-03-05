public class TestTwo {
    public static void main(String[] args) {
        //create
        boolean discout = false;
        long phone_Number = 9591619191l;
        float esal = 45000.45f;
        //read
        System.out.println(discout);
        System.out.println(phone_Number);
        System.out.println(esal);
    }
}
//Incompatble type: unable to convert int type to boolean
/*
 * TestTwo.java:3: error: incompatible types: int cannot be converted to boolean
        boolean discout = 0;
                          ^
    1 error
 * 
 */
