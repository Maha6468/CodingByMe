package Practice;

import java.util.Scanner;

public class StringBuilderExample {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
                // StringBuilder তৈরি
                StringBuilder sb = new StringBuilder("Hello");
                // 1. স্ট্রিং যুক্ত করা (append)
                sb.append(" World");
                System.out.println("After append: " + sb);
                // 2. নির্দিষ্ট স্থানে অক্ষর যোগ করা (insert)
                sb.insert(5, ",");
                System.out.println("After insert: " + sb);
                // 3. নির্দিষ্ট অংশ মুছে ফেলা (delete)
                sb.delete(5, 6);
                System.out.println("After delete: " + sb);
                // 4. নির্দিষ্ট অক্ষর পরিবর্তন করা (replace)
                sb.replace(6, 11, "Java");
                System.out.println("After replace: " + sb);
                // 5. উল্টো করা (reverse)
                sb.reverse();
                System.out.println("After reverse: " + sb);
                // 6. স্ট্রিং এর দৈর্ঘ্য বের করা (length)
                System.out.println("Length of StringBuilder: " + sb.length());
                // 7. স্ট্রিং ক্লিয়ার করা
                sb.setLength(0);
                System.out.println("After clearing: \"" + sb + "\"");




    }
}
