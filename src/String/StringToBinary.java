package String;

/**
 * Created by deepaksharma on 1/2/18.
 */
public class StringToBinary {

    public boolean stringToBinary(String s){

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();

        for(int i = 0; i < s.length(); i++){

            int ascii = s.charAt(i);
            sb3.append(Integer.toBinaryString(ascii));

            for(int j = 0; j < 8; j++){
                sb1.append(ascii % 2);
                ascii /= 2;
            }

            sb2.append(sb1.reverse());
            sb1.delete(0, sb1.length());
        }

        System.out.println(sb2.toString());
        System.out.println(sb3.toString());

        System.out.println(sb2.toString().equals("0110000101100010011000110110010001100101"));
        return sb2.toString().equals(sb3.toString());
    }

    public static void main(String[] args){
        StringToBinary s = new StringToBinary();
        boolean res = s.stringToBinary("abcde");

        System.out.print(res);

    }
}
