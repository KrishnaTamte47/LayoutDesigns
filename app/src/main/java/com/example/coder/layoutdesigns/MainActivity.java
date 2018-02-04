package com.example.coder.layoutdesigns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTextView,mcount;
    String s1="";
    int linecount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mcount=(TextView)findViewById(R.id.count);
        mTextView=(TextView)findViewById(R.id.data);

        mTextView.setText("import java.util.*;\\n\" +\n" +
                "                \"class demo19\\n\" +\n" +
                "                \"{\\n\" +\n" +
                "                \"public static void main(String a[])\\n\" +\n" +
                "                \"{\\n\" +\n" +
                "                \"\\tStringBuffer sb=new StringBuffer(\\\"object language\\\");\\n\" +\n" +
                "                \"\\tSystem.out.println(\\\"original string\\\"+sb);\\n\" +\n" +
                "                \"\\tSystem.out.println(\\\"Length of the string=\\\"+sb.length());\\n\" +\n" +
                "                \"for(int i=0;i<sb.length();i++)\\n\" +\n" +
                "                \"{\\n\" +\n" +
                "                \"\\tint p=i+1;\\n\" +\n" +
                "                \"\\tSystem.out.println(\\\"character at positin:\\\"+p+\\\" is \\\"+sb.charAt(i));\\n\" +\n" +
                "                \"}\\n\" +\n" +
                "                \"String str=new String(sb.toString());\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\tsb.insert(7,\\\"oriented \\\");\\n\" +\n" +
                "                \"\\tSystem.out.println(\\\"mdified string=\\\"+sb);\\n\" +\n" +
                "                \"\\tsb.append(\\\" improved security\\\");\\n\" +\n" +
                "                \"System.out.println(sb);\\n\" +\n" +
                "                \"}\\n\" +\n" +
                "                \"}\\n\" +\n" +
                "                \"o/p:\\n\" +\n" +
                "                \"original stringobject language\\n\" +\n" +
                "                \"Length of the string=15\\n\" +\n" +
                "                \"character at positin:1 is o\\n\" +\n" +
                "                \"character at positin:2 is b\\n\" +\n" +
                "                \"character at positin:3 is j\\n\" +\n" +
                "                \"character at positin:4 is e\\n\" +\n" +
                "                \"character at positin:5 is c\\n\" +\n" +
                "                \"character at positin:6 is t\\n\" +\n" +
                "                \"character at positin:7 is\\n\" +\n" +
                "                \"character at positin:8 is l\\n\" +\n" +
                "                \"character at positin:9 is a\\n\" +\n" +
                "                \"character at positin:10 is n\\n\" +\n" +
                "                \"character at positin:11 is g\\n\" +\n" +
                "                \"character at positin:12 is u\\n\" +\n" +
                "                \"character at positin:13 is a\\n\" +\n" +
                "                \"character at positin:14 is g\\n\" +\n" +
                "                \"character at positin:15 is e\\n\" +\n" +
                "                \"mdified string=object oriented language\\n\" +\n" +
                "                \"object oriented language improved security");


               mTextView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                   @Override
                   public void onGlobalLayout() {
                       linecount=mTextView.getLineCount();

                       for(int i=1;i<=linecount;i++)
                       {
                           s1=s1+" "+i+"\n";
                       }
                       mcount.setText(s1);
                   }
               });


    }
}
