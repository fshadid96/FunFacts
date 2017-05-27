package fshadid.funfacts;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {


    /*
    declare our View variables
     */
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private TextView mFactTextView;
    private Button mShowFactButton;
    private ConstraintLayout mConstraintLayout;
    FactBook newFact = new FactBook();
    ColorWheel newColorWheel = new ColorWheel();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the views from the layout file to the corresponding variables
        mFactTextView = (TextView) findViewById(R.id.theFactText);
        mShowFactButton = (Button) findViewById(R.id.button);
        System.out.print("hellow");
        mConstraintLayout = (ConstraintLayout) findViewById(R.id.reltiveLayout);


        View.OnClickListener listenr = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = newColorWheel.getColor();


                mFactTextView.setText(newFact.getFact());
                mConstraintLayout.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);


            }
        };

        mShowFactButton.setOnClickListener(listenr);
        //Toast.makeText(FunFactsActivity.this, "Hey this app work fine ", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "we are running the app on the come up");


    }
}
