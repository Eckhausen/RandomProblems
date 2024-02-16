package Easy;

public class AddBinary {
//    AddBinary ab = new AddBinary();
//        System.out.println(ab.addBinary("11", "1")); //100
//        System.out.println(ab.addBinary("1010", "1011")); //10101
    public String addBinary(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }
}
