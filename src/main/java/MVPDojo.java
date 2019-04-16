import java.util.Scanner;

public class MVPDojo {
    public static void main(String [] args) {


        View view = new View(new PresenterImpl(new RepositoryImpl()));

        System.out.println("Available command: teacher, student");
        System.out.print("Enter command: ");
        Scanner in = new Scanner(System.in);
        String receivedCommand = in.nextLine();

        if(receivedCommand.equals("student")){

            System.out.println("\nSorted students: ");
            for(int j = 0; j < view.getStudentSize(); j++){
                System.out.println(view.getStudentFormattedData(j));
            }

        }
        else if(receivedCommand.equals("teacher")){

            System.out.println("\nSorted instructor: ");
            for(int l = 0; l < view.getInstructorSize(); l++){
                System.out.println(view.getInstructorFormattedData(l));
            }
        }
        else{
            System.out.println("Wrong command. Please restart the program and type the command carefully");
        }


    }
}
