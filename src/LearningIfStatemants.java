public class LearningIfStatemants {

    public static void main(String[] args) {
        
    // if statement = performs a block of code if it's codition evaluates to be true

    int age = 10; 

        // if is True this (age>=75) true, print this:
        if(age==75) {
            System.out.println("Ok Boomer!");
        }

        else if(age>=18) {
            System.out.println("You are an adult!");
        }

        else if (age>=13) {
            System.out.println("You are a teenager!");
        }

        // If False, print this:
        else {
            System.out.println("You are not an adult!");
        }
    }
}
