import java.util.Date;
class AlfredQuotes {
    public String greetWorld() {
        return "Hello, world!";
    }

    public String basicGreeting() {
        return "Hello! Lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        return "Hello, "+ name + "." + "lovely to see you.";
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date;
    }

    public String respondBeforeAlexis(String conversation) {
        String alfredRetort = "Bloody hell, Bruce! She can't even remote control the Batmobile! Why the hell would you trust her with that sort of thing?";
        String alfredHumble = "Of course, Mister Wayne.";
        String nada = "Right. With that, I shall retire.";
        // Your code here
        if(conversation.contains("Alexis")) {
            return alfredRetort;
        } else if(conversation.contains("Alfred")) {
            return alfredHumble;
        } else {
            return nada;
        }
    }

    // NINJA BONUS
    // See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the string methods you have learned!
}