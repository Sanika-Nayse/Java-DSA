public class ForEach {
    public static void main(String[] args) {
        //we use for each loop to iterate over arrays or collections
        String[] animals = {"Dog", "Cow", "Cat", "Snake", "Rabbit", "Lion", "Tiger"};
        for(String animal : animals){
            System.out.println("Hello, I am "+ animal);
        }
        // Limitations: it is a forward only loop cannot iterate in reverse
    }
}
