public class AnonymousClasses {
    public static void main(String[] args) {
        // Anonymous class= A class that doesnt have a name.. cannot be reused.
        //                  Add custom behaviour without having to create a new class.
        //                  Often used for one time uses (TimerTask, Runnable, callbacks)
        

        Dog3 dog1 = new Dog3(); 
        TalkingDog dog2 = new TalkingDog();
        Dog3 dog3 = new Dog3() {
            @Override
            void speak() {
                System.out.println("Woof Woof Woof");
            }
        };
        dog1.speak();
        dog2.speak();
        dog3.speak();
    }
    
}
