import java.util.Scanner;
import java.util.regex.Pattern;



class userinfo{

    
    private String  name;
    private String num;

    public userinfo() {
    }
    public void  setusername(String name){
        this.name=name;

    }
    
    public void  setuserphone(String  num){
        this.num=num;

    }
     public String getUsername() {
        return name;
    }

    public String getUserphone() {
        return num;
    }

}
class Products{
    void productavailable(){
        System.out.println("PRODUCTS AVAILABLE-------------- \n \n 1.elctronics \n 2. DRESS \n 3. Ornaments ");
        
                        

    }

}
class electronics extends Products{
    void electronic(int choices){
        
      
        
     switch (choices) {


    case 1:
        System.out.println("\n MOBILE PHONES SELECTED");
        break;

    case 2:
        System.out.println("\n TELEVISION SELECTED");
        break;

    case 3:
        System.out.println("\n SMART WATCHES AND EARBUDS SELECTED");
        break;

    default:
        System.out.println("Invalid choice");
}
 
    }
}
   class dress extends Products{
    void  dresse(int choices){

       System.out.println("1.MENS WEAR  \n 2.WOMENS WEAR \n 3.KIDS SECTION ");
    
     switch (choices) {


    case 1:
        System.out.println("\n mens wear selected");
        break;

    case 2:
        System.out.println("\n womens wear selected ");
        break;

    case 3:
        System.out.println("\n kids sction ");
        break;

    default:
        System.out.println("\n Invalid choice");
}
 
    }
 

}
class orna extends Products{
    void Ornaments(int choices){
        System.out.println("1. WATHCHES AND CLUTCHES  \n 2.MAKEUP PRODUCTS AND SELFCARE  \n 3.OTHER ACCESORIES ");
               
     switch (choices) {


    case 1:
        System.out.println(" \n watches & clutches");
        break;

    case 2:
        System.out.println("\n makeup products & selfcare ");
        break;

    case 3:
        System.out.println("\n other accesories  ");
        break;

    default:
        System.out.println("Invalid choice");
}
 


    }
}


public class Macrshoping {
    public static void main(String[] args) {
        System.out.println("WELCOME TO FLIPKART \n \n      ENJOY YOUR SHOOPING  ");
          System.out.println("\n-----------------------------------------------");
        System.out.println("\n \nFor Register Enter Your Details");
        try (Scanner sc = new Scanner(System.in)) {


            System.out.print("enter your name :");
            String name=sc.nextLine();


            System.out.print("\n enter your number :");
            String num= sc.nextLine();



            
            
            
            String useri="^[a-zA-Z]+$";
            boolean username=Pattern.matches(useri,name);

             String phonei="^[6-9]\\d{9}$";
            boolean userphone=Pattern.matches(phonei,num);
            
            userinfo u = new userinfo();
            
         if(username && userphone){
                  u.setusername(name);
                u.setuserphone(num);
               System.out.println("\n********** You registered successfully ********** \n \n ");
           }else{
           System.out.println("Registration failed. Check details.");
    
            }




           orna o =new orna();
                   electronics e=new electronics();
           dress d=new dress();
           
            Products p=new  Products();
            p.productavailable();
           
           
           System.out.print(" \n Enter Your  Product  :");
           int choice =sc.nextInt();
           
           
           if(choice==1){
            System.out.println("\n \n 1.MOBILE PHONES  \n 2.TELEVISION \n 3.SMART WATCHES AND EARBUDS  ");
            System.out.print("\n \n ENTER YOUR PREFERENCES   ");
            int choices=sc.nextInt();
             e.electronic(choices);
             System.out.println(" \n YOUR PRODUCT HAS SUCCESSFULLY ORDERD ");


           }else if(choice==2){
             System.out.println(" \n 1.MENS WEAR  \n 2.WOMENS WEAR \n 3.KIDS SECTION ");

             System.out.print("\n \n ENTER YOUR PREFERENCES  : " );
              int choices=sc.nextInt();
              d.dresse(choice);
                System.out.println(" \n \n YOUR PRODUCT HAS SUCCESSFULLY ORDERD ");
                
           }else if(choice==3){
               System.out.println("\n \n 1. WATHCHES AND CLUTCHES  \n 2.MAKEUP PRODUCTS AND SELFCARE  \n 3.OTHER ACCESORIES ");
            System.out.print(" \n \n ENTER YOUR PREFERENCES : ");
              int choices=sc.nextInt();
            o.Ornaments(choices);
            System.out.println(" YOUR PRODUCT HAS SUCCESSFULLY ORDERD  !!!!!!!    \n\n\n");


           }
           else{
               System.out.println("YOUR CART IS EMPTY ");
               System.out.println(" \n SORRY FOR YOUR INCONVIANCE \n WE ENHANCE OUR SERVICES ");
           
          
          
          

        }
        
            System.out.println("\n THANKS FOR YOUR SHOOPING    ");
            System.out.println(" \n RATE US YOUR EXPERIENCES     \n"); 
    }
    
  }
 }