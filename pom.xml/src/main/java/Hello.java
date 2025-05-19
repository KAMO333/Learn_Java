public class Hello {
    public String sayHello(String [] name, String city, String state){
        String convertArrayToString = String.join(" ", name);
        return "Hello, " + convertArrayToString + "! " + "Welcome to " + city + ", " + state + "!";
    }
}
