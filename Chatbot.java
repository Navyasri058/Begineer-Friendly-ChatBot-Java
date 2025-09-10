import java.util.*;
    /*CHATBOT- it is same as like chatGPt , it will replays to the questions asked by the user and it will works on offline
    but it can only respond to the questions that are predefined in the program only,
    if the user askes anything new to the bot which is not mention in the program it will replay as i don't understand ,
    so it can not answer by it's own .
    */
class chatbot
{  public static void main(String args[])
   {
     Scanner sc =new Scanner(System.in);
        HashMap<String,String> obj= new HashMap<>(); //it will stores the both the responses of chstbot and user
        obj.put("hi","How can i help you today..?");//when the user enter "Hi" the bot will responds with the given value
        obj.put("upcoming movie lists","1. OG  2.Rajasaab 3.Pushpa-3 4.Kalki-2 and so on");//the user respoce/question shold be match to the given keys inthe hashmap
        obj.put("thank you","Yeah..It's my responsibility to guide you....do you have any questions i will answer you ,when i am trained with that...!");
        obj.put("what is java","Java is one of the Programming Language, That is used for developing wedsites, Games, or any other secure applications.");
        obj.put("tell about yourself","yeah... I am ChatBot and developed with java Programming , I am not a Ai but i can give answers when the questions are already predifed , Users are chat with me in Offline");
        obj.put("bye","Have a nice day.... Bye");

        System.out.println("Bot : "+"Hello ! I'm ChatBot ");//here after running the code this statement will be executes first
        while(true)
        {
            for(int i=1;i<=20;i++)
            {
                System.out.print("You : ");
                String a=sc.nextLine().toLowerCase().trim();//so this line will reads the enter msg from user and converts into lowercase and trims it.
                //that means wheater the user enters in any case the input convert into loercase to match th key in the map
                //and trim is used to cut the extraa spaces enteered in by the user , so it is more helpfull to overcome come mistakes by user
                if(obj.containsKey(a))
                {
                    System.out.println("Bot : "+obj.get(a));
                    if(a.equals("bye"))
                   { 
                       System.exit(0);//
                    }
                }
                else
               {
                 System.out.println("Bot : "+"I can't Understand what you are saying ...");
               }
            }
        }
    }
}