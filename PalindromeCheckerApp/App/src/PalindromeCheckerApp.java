public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1: Welcome Message
        System.out.println("=================================");
        System.out.println("  Welcome to Palindrome Checker  ");
        System.out.println("=================================");

        // UC2: Hardcoded Palindrome Check
        String word = "racecar";
        boolean isPalindrome = true;

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        // UC3: User Input - Reverse String Method
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter text: ");
        String input = scanner.next();
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        if (input.equals(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        scanner.close();

        // UC4: Two Pointer Method
        java.util.Scanner scanner2 = new java.util.Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner2.next();
        char[] chars = text.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean result = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                result = false;
                break;
            }
            start++;
            end--;
        }

        if (result) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }

        scanner2.close();

        // UC5: Stack-Based Palindrome Check
        java.util.Scanner scanner3 = new java.util.Scanner(System.in);
        System.out.print("Enter text: ");
        String stackWord = scanner3.next();
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : stackWord.toCharArray()) {
            stack.push(c);
        }

        boolean stackResult = true;
        for (char c : stackWord.toCharArray()) {
            if (c != stack.pop()) {
                stackResult = false;
                break;
            }
        }

        if (stackResult) {
            System.out.println(stackWord + " is a palindrome.");
        } else {
            System.out.println(stackWord + " is not a palindrome.");
        }

        scanner3.close();

        // UC6: Queue + Stack Based Palindrome Check
        String qsInput = "civic";
        java.util.Queue<Character> queue = new java.util.LinkedList<>();
        java.util.Stack<Character> qsStack = new java.util.Stack<>();

        for (char c : qsInput.toCharArray()) {
            queue.add(c);
            qsStack.push(c);
        }

        boolean qsResult = true;
        while (!queue.isEmpty()) {
            if (queue.poll() != qsStack.pop()) {
                qsResult = false;
                break;
            }
        }

        System.out.println("Input : " + qsInput);
        System.out.println("Is Palindrome? : " + qsResult);

        // UC7: Deque-Based Optimized Palindrome Check
        String dequeInput = "madam";
        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

        // Insert each character into the deque
        for (char c : dequeInput.toCharArray()) {
            deque.addLast(c);
        }

        boolean dequeResult = true;

        // Compare front and rear until deque has one or zero elements
        while (deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) {
                dequeResult = false;
                break;
            }
        }

        System.out.println("Input : " + dequeInput);
        System.out.println("Is Palindrome? : " + dequeResult);

    }

}