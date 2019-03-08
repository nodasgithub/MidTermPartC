package testuserprofile;
import java.util.Scanner;

/**
 *
 * @author Shin
 */
public class TestUserprofile {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter your name");
        String name = in.nextLine();
        
        System.out.println("Enter your id");
        String id = in.nextLine();
        
        String genre = inputFavoriteGenre();
        
        UserProfile userProfile = new UserProfile(name, id, genre);
        
        System.out.println("Your user profile was created");
        
        System.out.println(userProfile);
        
    }
    
    public static String inputFavoriteGenre() {
        Scanner in = new Scanner(System.in);
        
        UserProfile up = new UserProfile();
        
        boolean flag = true;
        String s = "";
        
        while (flag) {
            System.out.println("Enter a number corresponding to your favorite genre from the following genre");
            System.out.println("1: Comedy, 2: Drama, 3: Action, 4: Mystery");
        
             int n = in.nextInt();
             
             switch(n) {
                 case 1: 
                     s = "Comedy";
                     flag = false;
                     break;
                     
                 case 2: 
                     s = "Drama";
                     flag = false;
                     break;
                     
                 case 3:
                     s = "Action";
                     flag = false;
                     break;
                     
                 case 4:
                     s = "Mystery";
                     flag = false;
                     break;
                
                 default:
                     System.out.println("The input number should be 1, 2, 3, or 4\n");
             }
             
        }
        
        return s;
    }
}
