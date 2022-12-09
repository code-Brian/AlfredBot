import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

class AlfredQuotes {
    public String getFormattedTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("HH:mm");
        return formattedTime.format(now).toString();
    }

    public String greetWorld() {
        return "Hello, world!";
    }

    public String basicGreeting() {
        return "Hello! Lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        return "Hello, "+ name + "." + "lovely to see you.";
    }

    // Sensei bonus overloaded guestGreeting
    
    public String guestGreeting(String name, String now) {
        int timeInt = Integer.parseInt(now.toString());
        if (timeInt < 1159) {
            return "Good morning, " + name + "!" + "Lovely to see you.";
        } else if (timeInt > 1159) {
            return "Good afternoon," + name + "!" + "Let's have some lunch, soon!";
        } else if (timeInt > 459) {
            return "Good evening, " + name + "!" + "What would you like for dinner?";
        } else if (timeInt < 900) {
            return "Hello, " + name + "." + "The time is: " + now + "."  + "Alred has retired for the evening.";
        } else {
            return "There was a problem getting the time, " + name + "." + "Contact your system administrator for support.";
        }
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