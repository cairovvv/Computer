public class Main {
    public static void main(String[] args) {

        //objects
        User techUser = new User("Alex_99");
        Computer myPC = new Computer("Zenith Pro", "Intel i9", techUser);

        String output = "! --- IDENTITY CHECKS --- !\n";
        output += techUser.getRole();
        output += myPC.getRole();

        output += "Note: Processor class is managed internally by Computer.\n";
        
        output += "\n--- SYSTEM LOG ---\n";
        output += myPC.powerOn();

        System.out.println(output);
    
    }
}
