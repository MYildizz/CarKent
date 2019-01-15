package Common_Classes;


public class Personality {
   
    public  String name;
    public  String surname;
    public  String IdentityNo;
    public  String Profession;
    public  String Gender;

    public Personality(String name, String surname, String TC, String Profession, String Gender) 
    {
        this.name = name;
        this.surname = surname;
        this.IdentityNo = TC;
        this.Profession = Profession;
        this.Gender = Gender;
    }
     
    @Override
    public String toString() {
        return "\n Name : " + name + "\n Surname : " + surname + "\n TC : " + IdentityNo + "\n Labour :" + Profession+ "\n Gender : " + Gender;
    }
    
}
