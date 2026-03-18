public class HelloApp {
    public static void main(String[] args) {
        // Check if no arguments were provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder names = new StringBuilder();
            boolean isFirst = true; // This flag helps us place commas correctly
            
            // The Enhanced For Loop (For-Each)
            for (String arg : args) {
                // If it's not the first name, add the comma and space BEFORE appending
                if (!isFirst) {
                    names.append(", ");
                }
                
                names.append(arg);
                isFirst = false; // After the first loop, this stays false
            }
            
            System.out.println("Hello, " + names.toString() + "!");
        }
    }
}