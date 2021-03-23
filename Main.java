import java.util.Random;
public class Main{

    public static void main(String[] args){
        flipNPickleRicks(2);
        System.out.println();
        // flipNPickleRicks(2);
        // System.out.println();
        // flipNPickleRicks(3);
        // System.out.println();

        int dogCount = 2;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int penguinCount = 0;//sorry i hate cate but i love penguins 
        System.out.println("I own " + penguinCount + " " + pluralize("penguim", penguinCount) + ".");

        int pickleRickCount = 1;// yeah im pickle rick 
        System.out.println("I own " + pickleRickCount + " " + pluralize("Pickel Rick", pickleRickCount) + ".");

        

    }



     public static String pluralize (String wordPlural, int count)
    {
        char leterS = 's';// it makes sense in my head to use a character sense i just learned it
        if (count == 0 || count > 1)// if count is 0 or if count is less than 1 
        {
            wordPlural = wordPlural  + leterS;//adds the charcter s to the already designed word pluraler if thats even a word 
        }
        return wordPlural;// return wha pularilzation 
    
    }
    
    public static void flipNPickleRicks(int rickFlips){
        int flipTotal = 0;// this is the total that we iterate to get the flip count 
        Random randoliicous =  new Random();// we store our random number because thats what pickle rick needs but really its because we need
        //asign it to a var 
        int headNum = 0;// this the head number 
        double nxtRandoNum = randoliicous.nextDouble();// i guess my understanding of this is it boxes the numbers up so we can use it like objects
        String space =  "  ";// my space varible
        while(headNum < rickFlips){ // loop as the number of times when you flip and get head isnt 
        //bigger than the stopping point the you enter like if it said flip 3 times it will stoip when it gets 3 times 
            if (nxtRandoNum < 0.5){// this is how we decide what heads will be if random num is less than .5 then we know its not heads its tails 
                System.out.println("tails");
                headNum= 0;// make head 0 sop we can go until you get all consecutive heads for number desired 

            }
            else{
                System.out.println("heads");// if it dosnt meet the above condition then hey we are going to print heads 
                headNum++;// iterate the number 
            }
            nxtRandoNum = randoliicous.nextDouble();// we have to make it pick another number 
            flipTotal++;// iterate again 
        }
        /// this we first let rick talk then we print nxtRandoNum which is the randoim number tha we decalred with the double then 
        /// then we print flipTotal which is the total flips that we make then we call our handy dandy pularize methos and we print 
        // flip or flips depending the amount of rools kind of mut point when you have to flip three times in row but it looks kool
        System.out.println("I am pickle rick !!!!!!!! Morty look I am i took this randaom number from bird man"+ nxtRandoNum +"a PICKLE !!!! Pickel RICK !!!!!"
        +flipTotal+space+ "Morty I'm i have made " +pluralize("flip", flipTotal)+space +rickFlips+" PICKLE RICKS !!!!!!!!!!!!!!!!!");
        



    }





}


