import java.util.Arrays;
import javax.swing.JOptionPane;
public class Student {
    public static void main(String[] args) {
        int Number[];
        String amount = JOptionPane.showInputDialog("Enter the amount of students: ");
        int num = Integer.parseInt(amount);
        Number = new int[num];
        System.out.println("Student Details, Department of ILT");
        getInfo(num);
    }
    static void getInfo(int num){
        String FirstName;
        String LastName;
        String PeopleSoft;
        int PS;
        String ClassStandings;
        String Email;
        String Address;
        String City;
        String State;
        String Zip;
        int Z;
        String Names="^[A-Za-z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
        String ID="^[0-9]{7}";
        String Emails="^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";
        String Addr="^(?:[Pp][Oo]\\s[Bb][Oo][Xx]|[0-9]+)\\s(?:[0-9A-Za-z\\.'#]|[^\\S\\r\\n])+";
        String Cities="^[a-zA-Z]+$";
        String States="^(?:(A[KLRZ]|C[AOT]|D[CE]|FL|GA|HI|I[ADLN]|K[SY]|LA|M[ADEINOST]|N[CDEHJMVY]|O[HKR]|P[AR]|RI|S[CD]|T[NX]|UT|V[AIT]|W[AIVY]))$";
        String Zips="^[0-9]{5}(?:-[0-9]{4})?$";
        String[] CS=new String[]{"freshman","sophomore","junior","senior","Freshman","Sophomore","Junior","Senior"};
        System.out.println("Amount of Students: "+num);
        for(int a = 0; a < num; a++){
            FirstName=JOptionPane.showInputDialog("Enter your first name:");
            while(!(FirstName.matches(Names))){
                FirstName=JOptionPane.showInputDialog("INVALID! Enter your first name:");
            }
            LastName=JOptionPane.showInputDialog("Enter your last name:");
            while(!(LastName.matches(Names))){
                LastName=JOptionPane.showInputDialog("INVALID! Enter your last name:");
            }
            PeopleSoft=JOptionPane.showInputDialog("Enter your PeopleSoft ID:");
            PS = Integer.parseInt(PeopleSoft);
            while(!(PeopleSoft.matches(ID))){
                PeopleSoft=JOptionPane.showInputDialog("INVALID! Enter your PeopleSoft ID: ");
            }
            ClassStandings=JOptionPane.showInputDialog("Are you a freshman, sophomore, junior or a senior?");
            while(!(Arrays.asList(CS).contains(ClassStandings))){
                ClassStandings=JOptionPane.showInputDialog("INVALID! Are you a freshman, sophomore, junior or a senior?");
            }
            Email=JOptionPane.showInputDialog("Enter your email:");
            while(!(Email.matches(Emails))){
                Email=JOptionPane.showInputDialog("INVALID! Enter your email:");
            }
            Address=JOptionPane.showInputDialog("Enter your address:");
            while(!(Address.matches(Addr))){
                Address=JOptionPane.showInputDialog("INVALID! Enter your address:");
            }
            City=JOptionPane.showInputDialog("Enter your city:");
            while(!(City.matches(Cities))){
                City=JOptionPane.showInputDialog("INVALID! Enter your city:");
            }
            State=JOptionPane.showInputDialog("Enter your state:");
            while(!(State.matches(States))){
                State=JOptionPane.showInputDialog("INVALID! Enter your state:");
            }
            Zip=JOptionPane.showInputDialog("Enter your zip code:");
            Z = Integer.parseInt(Zip);
            while(!(Zip.matches(Zips))){
                Zip=JOptionPane.showInputDialog("INVALID! Enter your zip code:");
            }
            displayInfo(FirstName, LastName, PeopleSoft, ClassStandings, Email, Address, City, State, Zip, num);
        }

    }
    static void displayInfo(String FirstName, String LastName, String PeopleSoft, String ClassStandings, String Email, String Address, String City, String State, String Zip, int num){
        String F = FirstName;
        String L = LastName;
        String Pe = PeopleSoft;
        String Cla = ClassStandings;
        String E = Email;
        String A = Address;
        String Ci = City;
        String S = State;
        String Zi = Zip;
        int NU = num;
        String[] BOB=new String[]{F,L,Pe,Cla,E,A,Ci,S,Zi};
        System.out.print(BOB[0]+"\t");
        System.out.print(BOB[1]+"\t");
        System.out.print(BOB[2]+"\t");
        System.out.print(BOB[3]+"\t");
        System.out.print(BOB[4]+"\t");
        System.out.print(BOB[5]+"\t");
        System.out.print(BOB[6]+"\t");
        System.out.print(BOB[7]+"\t");
        System.out.println();
    }
}