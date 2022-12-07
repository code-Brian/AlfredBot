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
        // Your code here
        return "for snarky response return string";
    }

    // NINJA BONUS
    // See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the string methods you have learned!
}