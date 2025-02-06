import java.lang.*;
public class Person{
	
    private  String userName;
    private  String MobileNumber;
    private  String Email;
    private  String Pass;
    
     
    public Person( String MobileNumber, String Pass)
    {
        // this.userName=userName;
        this.MobileNumber=MobileNumber;
        // this.Email=Email;
        this.Pass=Pass;
        System.out.println(Pass);

    }
    public Person(String MobileNumber, String Pass, String userName, String Email){

        this.MobileNumber=MobileNumber; 
        this.Pass=Pass;
        this.userName=userName;
        this.Email=Email; 

    }

    public Person() {
    }
    public void setuserName(String userName){
        this.userName=userName;
    }
    public String getuserName(){
        return userName;
    }    
	
   
    public void setMobileNumber(String MobileNumber){
        this.MobileNumber=MobileNumber;
    }
    public String getMobileNumber(){
        return MobileNumber;
    }
    public void setEmail(String Email){
        this.Email=Email;;
    }
    public String getEmail(){
        return Email;
    }
    public void setPass(String  Pass){
        this.Pass=Pass;
    }
    public String getPass(){
        return Pass;
    }



     
    public void ShowPersonInfo(){
    System.out.println("Name : "+userName);
    System.out.println("Mobile Number : "+MobileNumber);
    System.out.println("Email : "+Email);
    System.out.println("Pass : "+Pass);
     
    }

         
public static void main(String[] args) {
   Person p= new Person("asjk","as");
   p.ShowPersonInfo();
}

}
