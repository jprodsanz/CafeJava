public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double oatMilkLattePrice = 4.95;
        double soyMilkLattePrice = 5.65;
        double cappucinoPrice = 6.65;

    
        // Customer name variables (add yours below)
        String customer1 = "Tom Brady";
        String customer2 = "Elon Musk";
        String customer3 = "Dua Lipa";
        String customer4 = "Drake";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Tom Brady"
        
        System.out.println(customer1 + readyMessage + displayTotalMessage + mochaPrice); 

        if(isReadyOrder4){
            System.out.println(customer4 + readyMessage + displayTotalMessage + cappucinoPrice);
        } else {
            System.out.println(customer4 + pendingMessage);
        }
        isReadyOrder2 = true;
        if (isReadyOrder2){
            System.out.println(customer2 + readyMessage + displayTotalMessage + (oatMilkLattePrice*2));
        } else {
            System.out.println(customer2 + pendingMessage);
        }
        isReadyOrder3 = true;
        if (isReadyOrder3){
            System.out.println(customer3 + readyMessage + displayTotalMessage + (soyMilkLattePrice - mochaPrice));
        } else {
            System.out.println(customer3 + pendingMessage);
        }
    }
}
