public class Nameapp {
    public static void main(String[] args) {

    
        String message = "World";

        
        if (args.length > 0) {
            message = "";

            
            for (int i = 0; i < args.length; i++) {
                message += args[i];

            
                if (i < args.length - 1) {
                    message += " ";
                }
            }
        }

        System.out.println("Hello, " + message + "!");
    }
}