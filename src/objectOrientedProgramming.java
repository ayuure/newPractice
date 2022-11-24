import java.time.LocalDate;

public class objectOrientedProgramming {
    public static void main(String[] args){
        userOOP youngerUser = new userOOP();

        youngerUser.name ="Ayuure Bertina";
        youngerUser.birthDay = LocalDate.parse("2000-05-07");

        System.out.printf("%s wa born on %s",youngerUser.name,youngerUser.birthDay.toString());

    }
}
