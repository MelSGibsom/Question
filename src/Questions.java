import java.util.Random;

/**
 * Created by Alexander on 09.07.2015.
 */
enum Answers{YES,NO,MABY,LATER,SOON,NEVER}
public class Questions {
    Random rand =new Random();
    Answers ask(){
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 15)
            return Answers.MABY; // 15%
        else if (prob < 30)
            return Answers.NO; // 15%
        else if (prob < 60)
            return Answers.YES; // 30%
        else if (prob < 75)
            return Answers.LATER; // 15%
        else if (prob < 98)
            return Answers.SOON;
        else
        return Answers.NEVER;
       
    }
}
class AskMe {
    static void answer(Answers result ) {
        switch (result) {
            case NO:
                System.out.println("HeT");
                break;
            case YES:
                System.out.println("да");
                break;
            case MABY:
                System.out.println("Возможно");
                break;
            case LATER:
                System.out.println("Позднее");
                break;
            case SOON:
                System.out.println("BcKope");
                break;
            case NEVER:
                System.out.println("Никоrда");
                break;
        }
    }

    public static void main(String args[]) {


        Questions q = new Questions();
    for (Answers a : Answers.values())
        answer(q.ask());




    }
}
