public class array {
    public static void main(String[] args) {
        // array = a collection of values of the same data type
        //         *think of it as a variable that can store more than 1 value*
        String[] fruits = {"apple", "banana", "orange"};
        fruits[0] = "kiwi";
        int numOFFruits = fruits.length;
        System.out.println("Number of fruits: " + numOFFruits);
        System.out.println(fruits[0]);
        /*for (int i = 0; i < numOFFruits; i++) {
            System.out.println(fruits[i]);
        }*/
        //Arrays.sort(fruits);
        //Arrays.fill(fruits, "pineapple");
        for (String fruit : fruits) {
            System.out.println(fruit);
        
    }
    
}
