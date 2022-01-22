import java.util.Random;

public class RandomHello {

    public static void main(String[] args){
        RandomHello randomHello = new RandomHello();
        System.out.print(randomHello.sayHello());
    }

    /**
     * Randomly select 1 way to say hello world out of 5 options
     * @return A string that is 1 of the hello world options
     */
    public String sayHello(){
        //Create a Random type object that will set num to an int from 0-4
        Random randomGen = new Random();

        //num is the random index that will be used to select the hello world phrase
        int num = randomGen.nextInt(5);

        //Create an Array of size 5 and populate it will 5 different ways to say hello world
        String[] greetings = new String[5];
        greetings[0] = "Hello World";
        greetings[1] = "Bonjour Monde";
        greetings[2] = "你好世界";
        greetings[3] = "こんにちは世界";
        greetings[4] = "안녕하세요 세계";

        //return's the randomly selected hello world
        return greetings[num];
    }
}
