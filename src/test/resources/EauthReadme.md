Project : EAuth ( E-Authorization)

OOPS
abstraction : showing only essencial functionality to end user.. password

    class User{
    
    private String uname;
    private char[] password;
    private String accountStatus;  // active/inactive/expire
    getUname(){}
    
    setUname(){}
    
    setPassword(){}
//overloading
    public void expireUser(String uname,long durationInMS){
     }
    public void expireUser(String uname,String accountStatus){
    }

      //overriding
     public String getUserDetailsAsString(){ 
          return "Uname :: " + uname + accountStatus;
      }
      
  }

encapsulation : wrapping data members and functions

inheritance :
AgencyUser extends User{
string agencyName;
string agencyAddress;

      //overriding
     public String getUserDetailsAsString(){ 
          return "Uname :: " + uname + accountStatus + agencyName + agencyAddress;
      }

}


