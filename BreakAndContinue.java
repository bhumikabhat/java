public class BreakAndContinue {
    public static void main(String[] args) {
        // break = break out of a loop(SKIP)
        // continue = skip current iteration of a loop(SKIP)
        for(int i = 1; i <= 10; i++){
            if(i == 4){
                continue; // skip the number 4
            }
            System.out.println(i);
        }
        for(int i = 1; i <= 10; i++){
            if(i == 4){
                break; // stop the loop at number 4
            }
            System.out.println(i);
        }
    }
    
    
}
