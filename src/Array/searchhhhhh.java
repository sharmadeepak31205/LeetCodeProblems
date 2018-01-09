package Array;

/**
 * Created by deepaksharma on 1/5/18.
 */
public class searchhhhhh {


    public static void main(String[] args) {
        //This code will not compile correctly until you fix it.
        //
        //We are trying to count the number of times the word
        //dog appears in some input text, but we can't seem to
        //remember the appropriate method call in the String class,
        //and are not sure our approach will work.
        //task: Use the JDK documentation to help us finish the code,
        //then discuss the ambiguity in the problem description, and
        //reword it to remove the ambiguity in the space provided below.

    /*
	The ambiguity in the question is that it is not mentioned properly
	that we should only consider a word "dog" or we should consider those
	words as well which have prefix as dog or have dog anywhere in between
	the word. That's why index of method see dog in hotdogs which is not just
	word "dog" but still it got counted as it matches the word dog. So I fell
	this requirement need to be get cleared properly.

    */

        String input = new String("The Dogman was no ordinary dog, nor man, but rather a peculiar dog-like man who barked like a dog, and panted like a dog, he even ate like a dog.  He owned a dog named Doglips, and interestingly enough, his favorite food was hotdogs.");
        System.out.println(input);
        int index = -1;
        int count = 0;
        System.out.print("Counting dogs: ");

	/*
	indexOf method gives you the index of that particular matching string from
	the input string.
	*/
        index = input.indexOf("dog");

        while (index != -1){
            if(index != -1) {
                count++;
                input = input.substring(index + 1);
                index = input.indexOf("dog");
                System.out.print(count+" ");
            }
        }

        System.out.println("The word \"dog\" appears " + count + " times.");

    }
}
