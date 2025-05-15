public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String results = "";

        String[] array = name.split(" ");

        for(int i = 0; i < array.length; i++) {
            results += array[i].charAt(0);
        }

        String firstName = String.valueOf(results.charAt(0));
        String lastName = String.valueOf(results.charAt(1));

        return firstName + '.' + lastName;
    }
}
