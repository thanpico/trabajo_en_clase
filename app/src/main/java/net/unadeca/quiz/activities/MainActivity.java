package net.unadeca.quiz.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import net.unadeca.quiz.R;
import net.unadeca.quiz.database.Testdatabase;
import net.unadeca.quiz.database.models.TestModel;

import org.sufficientlysecure.htmltextview.HtmlHttpImageGetter;
import org.sufficientlysecure.htmltextview.HtmlTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejemplo);
        HtmlTextView htmlview = findViewById(R.id.htmlText);


        TestModel t1 = new TestModel();
        t1.name ="pedrito";
        t1.last_name="sanchez";
        t1.save();

        htmlview.setHtml("<h2>Hello wold</h2><img src=\"http://www.example.com/cat_pic.png\"/>",
                new HtmlHttpImageGetter(htmlview));



    }
}
