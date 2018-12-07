
public class Personality {
   
    String name;
    String surname;
    String TC;
    String Profession;
    String Gender;

    public Personality(String name, String surname, String TC, String Profession, String Gender) 
    {
        this.name = name;
        this.surname = surname;
        this.TC = TC;
        this.Profession = Profession;
        this.Gender = Gender;
    }
     
    @Override
    public String toString() {
        return "\nName : " + name + "\nSurname : " + surname + "\nTC : " + TC + "\nLabour :" + Profession+ "\nGender : " + Gender;
    }
    
}
