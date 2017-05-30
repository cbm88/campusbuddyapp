package mrustad.campusbuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.view.View.OnClickListener;

public class gpaCalculator extends AppCompatActivity implements OnClickListener{

    private Button calculate;
    private EditText gradeOne;
    private EditText gradeTwo;
    private EditText gradeThree;
    private EditText gradeFour;
    private EditText gradeFive;
    private EditText gradeSix;
    private EditText creditOne;
    private EditText creditTwo;
    private EditText creditThree;
    private EditText creditFour;
    private EditText creditFive;
    private EditText creditSix;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa_calculator);
        calculate = (Button)findViewById(R.id.calculateButton);
        gradeOne = (EditText)findViewById(R.id.gradeOne);
        gradeTwo = (EditText)findViewById(R.id.gradeTwo);
        gradeThree = (EditText)findViewById(R.id.gradeThree);
        gradeFour = (EditText)findViewById(R.id.gradeFour);
        gradeFive = (EditText)findViewById(R.id.gradeFive);
        gradeSix = (EditText)findViewById(R.id.gradeSix);
        creditOne = (EditText)findViewById(R.id.creditOne);
        creditTwo = (EditText)findViewById(R.id.creditTwo);
        creditThree = (EditText)findViewById(R.id.creditThree);
        creditFour = (EditText)findViewById(R.id.creditFour);
        creditFive = (EditText)findViewById(R.id.creditFive);
        creditSix = (EditText)findViewById(R.id.creditSix);
        resultView = (TextView)findViewById(R.id.resultField);
        calculate.setOnClickListener(this);

    }

    Credit grade = new Credit();

    @Override
    public void onClick(View v) {

        grade.setGradeOne(Double.parseDouble(gradeOne.getText().toString()));
        grade.setGradeTwo(Double.parseDouble(gradeTwo.getText().toString()));
        grade.setGradeThree(Double.parseDouble(gradeThree.getText().toString()));
        grade.setGradeFour(Double.parseDouble(gradeFour.getText().toString()));
        grade.setGradeFive(Double.parseDouble(gradeFive.getText().toString()));
        grade.setGradeSix(Double.parseDouble(gradeSix.getText().toString()));
        grade.setCreditOne(Double.parseDouble(creditOne.getText().toString()));
        grade.setGradeTwo(Double.parseDouble(creditTwo.getText().toString()));
        grade.setCreditThree(Double.parseDouble(creditThree.getText().toString()));
        grade.setGradeFour(Double.parseDouble(creditFour.getText().toString()));
        grade.setGradeFive(Double.parseDouble(creditFive.getText().toString()));
        grade.setCreditSix(Double.parseDouble(creditSix.getText().toString()));
        resultView.setText("Your Semester GPA Is: " + Double.toString(grade.getGPA()));

    }
}
