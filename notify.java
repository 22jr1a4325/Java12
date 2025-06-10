import java.util.Scanner;
class Notification{
    void notifyUser(){
        System.out.println(" Sending a general Notification");
    }
}
class EmailNotification extends Notification{
    void notifyUser(){
        System.out.println(" Sending E-Mail notification to abc@example.com");
    }
}

class SMSNotification extends Notification{
    void notifyUser(){
        System.out.println(" Sending SMS Notification to +91 9876543210");
    }
}
class PushNotification extends Notification{
    void notifyUser(){
        System.out.println("Sending Push Notification to mobile app - whatsApp");
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Notification notify;
        System.out.println("Select Notification Type: ");
        System.out.println("1.Email");
        System.out.println("2.SMS");
        System.out.println("3.WHATSAPP");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                notify = new EmailNotification();
                break;
            case 2:
                notify = new SMSNotification();
                break;
            case 3:
                notify = new PushNotification();
                break;
            default:
            notify = new Notification();
        }
        notify.notifyUser();
    }
}