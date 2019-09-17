package RepeatingKey;

import java.util.*;
import java.io.*;

public class RepeatingKey {

    public static void main(String[] args)
    {

        int[] key = {3, 1, 7, 4, 2, 5};
        Integer keyValue;
        String message = "All programmers are playwrights and all" +
                "computers are lousy actors.";
        String encoded = "", decoded = "";

        /*
        public void inputMessage(String message)
        {
            this.message = message;
        }
        */


        Queue<Integer> encodingQueue = new LinkedList<Integer>();
        Queue<Integer> decodingQueue = new LinkedList<Integer>();

            for(
        int scan = 0;
        scan<key.length;scan++)

        {
            encodingQueue.add(key[scan]);
            decodingQueue.add(key[scan]);
        }

            for(
        int scan = 0;
        scan<message.length();scan++)

        {
            keyValue = encodingQueue.remove();
            encoded += (char) (message.charAt(scan) + keyValue);
            encodingQueue.add(keyValue);
        }

            System.out.println("Encoded Message:\n"+encoded +"\n");

            for(
        int scan = 0; scan<encoded.length();scan++)

        {
            keyValue = decodingQueue.remove();
            decoded += (char) (encoded.charAt(scan) - keyValue);
            decodingQueue.add(keyValue);
        }

            System.out.println("Decoded Message:\n"+decoded);
    }
}
