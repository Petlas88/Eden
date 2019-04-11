package Eden;

import java.time.LocalDate;
import java.util.Scanner;

public class Intro {


    Scanner myScanner = new Scanner(System.in);

    Character mainChar = new MainCharacter("", "", 0, 5, 5, 5, 5);
    Character stranger = new Stranger("Stranger", 5, 5, 5, 5);




    public void printDialogue(String message, int sleep) {
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                // DO NOTHING
            }
        }
    }

    public void namePrefix(String name) {
        System.out.print("\n" + name + ": ");
    }

    void IntroStart() {
        Graphics silouette1 = new Graphics();
        silouette1.stranger1();
        namePrefix(stranger.name);
        String wakeUp = "Wake up...\n";
        printDialogue(wakeUp, 220);
        System.out.println("\n********************\nHit enter to continue\n********************");
        myScanner.nextLine();


        namePrefix(stranger.name);
        String wakeUp2 = "Wake up!\n";
        printDialogue(wakeUp2, 160);
        System.out.println("\n********************\nHit enter to continue\n********************");
        myScanner.nextLine();

        namePrefix(stranger.name);
        String wakeUp3 = "WAKE UP!\n";
        printDialogue(wakeUp3, 90);
        System.out.println("\n********************\nHit enter to continue\n********************");
        myScanner.nextLine();
        introPt2();
    }

    void introPt2() {
        namePrefix(stranger.name);
        String yourName = "What's your name?";
        printDialogue(yourName, 50);

        mainChar.name = myScanner.next();

        if (mainChar.name.equals("Mona") || mainChar.name.equals("mona")) {
            Graphics easterEgg = new Graphics();
            easterEgg.heart();
            System.out.print("\n" + stranger.name + ": ");
            String beautifulName = mainChar.name + ", that's a beautiful name! So, " + mainChar.name + ", how old are you?";
            printDialogue(beautifulName, 50);

            easterEggAge();
        } else {
            System.out.print("\n" + stranger.name + ": ");
            String nameRepeat = mainChar.name + ", huh? What a weird name! So, " + mainChar.name + ", how old are you?";
            printDialogue(nameRepeat, 50);

            easterEggSkipped();
        }
    }

    void easterEggSkipped() {
        mainChar.age = myScanner.nextInt();

        namePrefix(stranger.name);
        String ageFrom = mainChar.age + "?! You don't look your age!\n\nOk, " + mainChar.name + ", where are you from?";
        printDialogue(ageFrom, 50);


        mainChar.origin = myScanner.next();
        namePrefix(stranger.name);
        String summary = "Oh... " + mainChar.origin + "... sounds familiar... anyways let me see if I got the correct info on you.";
        printDialogue(summary, 50);

        correctOrNot();
    }

    void easterEggAge() {
        LocalDate localDate = LocalDate.now();

        mainChar.age = myScanner.nextInt();
        int monaAge = mainChar.age;
        if (localDate.minusYears(monaAge).equals(LocalDate.of(1989, 03, 21)) ||
                (localDate.minusYears(monaAge).isAfter(LocalDate.of(1988, 03, 21))
                        && localDate.minusYears(monaAge).isBefore(LocalDate.of(1989, 03, 21)))) {
            namePrefix(stranger.name);
            String alwaysBeautiful = mainChar.age + "?! You don't look your age, but let me tell you, you look beautiful, and I bet you always will! So, " + mainChar.name + ", where are you from?";
            printDialogue(alwaysBeautiful, 50);
        } else {
            String realMona = "Hmmm, I'm not sure you're the real Mona... well, anyways, where are you from?";
            printDialogue(realMona, 50);
        }

        mainChar.origin = myScanner.next();

        String summary = "Oh... " + mainChar.origin + "... sounds familiar... anyways let me see if I got the correct info on you.";
        printDialogue(summary, 50);

        correctOrNot();
    }


    void correctOrNot() {
        System.out.println("\n");
        mainChar.display();
        namePrefix(stranger.name);
        String thisCorrect = "Is this correct? y/n";
        printDialogue(thisCorrect, 50);

        yayOrNay();
    }


    void yayOrNay() {
        String answerInput = myScanner.next();

        if (answerInput.equals("y")) {

            introPt3();


        } else if (answerInput.equals("n")) {
            namePrefix(stranger.name);
            String changeWhat = "What would you like to change?";
            printDialogue(changeWhat, 50);

            whatToChange();
        }
    }

    void whatToChange() {

        System.out.println("\n1. Name.\n2. Age.\n3. Origin.\n4. Nothing, all good!");
        String changeInput = myScanner.next();

        if (changeInput.equals("1")) {
            namePrefix(stranger.name);
            String ohReally = "Oh really? So what IS your name then?";
            printDialogue(ohReally, 50);

            mainChar.name = myScanner.next();
            namePrefix(stranger.name);
            String anythingElse = "Anything else you would like to change?";
            printDialogue(anythingElse, 50);

            whatToChange();

        } else if (changeInput.equals("2")) {
            namePrefix(stranger.name);
            String okThen = "Ok then, how old are you really?";
            printDialogue(okThen, 50);


            mainChar.age = myScanner.nextInt();
            namePrefix(stranger.name);
            String anythingElse = "Anything else you would like to change?";
            printDialogue(anythingElse, 50);

            whatToChange();


        } else if (changeInput.equals("3")) {
            namePrefix(stranger.name);
            String tellMe = "Tell me then, where are you really from?";
            printDialogue(tellMe, 50);


            mainChar.origin = myScanner.next();
            namePrefix(stranger.name);
            String anythingElse = "Anything else you would like to change?";
            printDialogue(anythingElse, 50);

            whatToChange();

        } else if (changeInput.equals("4")) {

            correctOrNot();

        } else {
            namePrefix(stranger.name);
            String understand = "I didn't understand what you said";
            printDialogue(understand, 50);

            whatToChange();
        }
    }


    void introPt3() {
        namePrefix(stranger.name);
        String thatPlace = "That place... " + mainChar.origin + ", I'm sure I've heard of it...";
        printDialogue(thatPlace, 50);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            //DO NOTHING
        }
        System.out.println("\n.");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            //DO NOTHING
        }
        System.out.println(".");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            //DO NOTHING
        }
        System.out.println(".");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            //DO NOTHING
        }
        namePrefix(stranger.name);
        String nowIKnow = "I remember now! " + mainChar.origin + " was one of the last places to get destroyed in the great war, but that would make you at least... Wait, what year do you think this is?";
        printDialogue(nowIKnow, 50);

        int thinkYear = myScanner.nextInt();

        namePrefix(stranger.name);
        String actually = "Actually, it's " + (thinkYear + 500) + ", which makes you " + (mainChar.age + 500) + " years old, but that can't be right, which makes the only logical explanation... " +
                "Yes, yes I get it now! When I found you in the marshlands 3 days ago you were laying face down in this circle of light, " + mainChar.name +
                "... I'm pretty sure that you've been sent to your future!";
        printDialogue(actually, 50);

        theFuture();
    }

    String how = "\n1. How the hell did I end up in the future?";
    String who = "\n2. Who are you?";
    String what = "\n3. What is this place?";

    String timeTravel = "Ever since the world got destroyed in the great war, scientists have been working on a way to travel to the past to warn people of what's coming. " +
            "But it seems they made a mistake and sent you to the future instead...";

    String iAm = "Well, since the world fell apart, people have been getting by doing whatever they can... I am a man of few skills, so I've been collecting scraps to sell, so people around these parts " +
            "call me Scrapper, but if you want you can call me... uh...";

    String theNewWorld = "Since the great war, most of the old world is inhabitable. What little is left is known as Eden. Look " + mainChar.name + ", this world is extremely " +
            "different from what you're used to, you need to be careful when venturing here... ";

    String manyQuestions = "I just told you that you've been sent to the future. Surely you must have some questions?";

    public boolean answered1 = false;
    public boolean answered2 = false;
    public boolean answered3 = false;

    void theFuture() {
        System.out.println("\n");
        System.out.println("\nThe future?!");

        System.out.println(how + who + what);
        String howWhoWhat = myScanner.next();

        if (howWhoWhat.equals("1")) {
            answered1 = true;
            namePrefix(stranger.name);
            printDialogue(timeTravel, 50);
            checkTrue1();


        } else if (howWhoWhat.equals("2")) {
            answered2 = true;
            namePrefix(stranger.name);
            printDialogue(iAm, 50);
            stranger.name = myScanner.next();

            namePrefix(stranger.name);
            String theNewName = stranger.name + "! Nice to meet you " + mainChar.name;
            printDialogue(theNewName, 50);

            checkTrue1();

        } else if (howWhoWhat.equals("3")) {
            answered3 = true;
            namePrefix(stranger.name);
            printDialogue(theNewWorld, 50);

            checkTrue1();

        } else {
            namePrefix(stranger.name);
            printDialogue(manyQuestions, 50);

            theFuture();
        }

    }

    void checkTrue1() {

        if (answered1) {
            nextQuestion1();

        } else if (answered2) {
            nextQuestion2();

        } else if (answered3) {
            nextQuestion3();
        }
    }

    void nextQuestion1() {
        System.out.println("\n" + who + what);
        String howWhoWhat = myScanner.next();

        if (howWhoWhat.equals("2")) {
            answered2 = true;
            namePrefix(stranger.name);
            printDialogue(iAm, 50);

            stranger.name = myScanner.next();

            namePrefix(stranger.name);
            String theNewName = stranger.name + "! Nice to meet you " + mainChar.name;
            printDialogue(theNewName, 50);


        } else if (howWhoWhat.equals("3")) {
            answered3 = true;
            namePrefix(stranger.name);
            printDialogue(theNewWorld, 50);

        } else {
            namePrefix(stranger.name);
            printDialogue(manyQuestions, 50);
            nextQuestion1();
        }
        checkTrue2();
    }

    void nextQuestion2() {
        System.out.println("\n" + how + what);
        String howWhoWhat = myScanner.next();

        if (howWhoWhat.equals("1")) {
            answered1 = true;
            namePrefix(stranger.name);
            printDialogue(timeTravel, 50);

            checkTrue2();


        } else if (howWhoWhat.equals("3")) {
            answered3 = true;
            namePrefix(stranger.name);
            printDialogue(theNewWorld, 50);

            checkTrue2();

        } else {
            namePrefix(stranger.name);
            printDialogue(manyQuestions, 50);
            nextQuestion2();
        }

    }

    void nextQuestion3() {
        System.out.println("\n" + how + who);
        String howWhoWhat = myScanner.next();

        if (howWhoWhat.equals("1")) {
            answered1 = true;
            namePrefix(stranger.name);
            printDialogue(timeTravel, 50);

            checkTrue2();


        } else if (howWhoWhat.equals("2")) {
            answered2 = true;
            namePrefix(stranger.name);
            printDialogue(iAm, 50);

            stranger.name = myScanner.next();

            namePrefix(stranger.name);
            String theNewName = stranger.name + "! Nice to meet you " + mainChar.name;
            printDialogue(theNewName, 50);

            checkTrue2();

        } else {
            namePrefix(stranger.name);
            printDialogue(manyQuestions, 50);
            nextQuestion3();
        }
    }


    void checkTrue2() {

        if ((answered1) && (answered2)) {
            nextQuestion4();

        } else if ((answered1) && (answered3)) {
            nextQuestion5();

        } else if ((answered2) && (answered3)) {
            nextQuestion6();

        }
    }

    void nextQuestion4() {
        System.out.println("\n" + what);
        String howWhoWhat = myScanner.next();

        if (howWhoWhat.equals("3")) {
            namePrefix(stranger.name);
            printDialogue(theNewWorld, 50);

            introPt4();

        } else {
            namePrefix(stranger.name);
            printDialogue(manyQuestions, 50);

            nextQuestion4();
        }

    }

    void nextQuestion5() {
        System.out.println("\n" + who);
        String howWhoWhat = myScanner.next();

        if (howWhoWhat.equals("2")) {
            namePrefix(stranger.name);
            printDialogue(iAm, 50);

            introPt4();
        } else {
            namePrefix(stranger.name);
            printDialogue(manyQuestions, 50);

            nextQuestion5();
        }

    }

    void nextQuestion6() {
        System.out.println("\n" + how);
        String howWhoWhat = myScanner.next();

        if (howWhoWhat.equals("1")) {
            namePrefix(stranger.name);
            printDialogue(timeTravel, 50);

            introPt4();

        } else {
            namePrefix(stranger.name);
            printDialogue(manyQuestions, 50);

            nextQuestion6();
        }

    }


    void introPt4() {
        System.out.println("\nTO BE CONTINUED...");
    }
}


