package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;

    int mStoryIndex;
    int mEndingIndex;

    private Destinition[] mStoryArray = new Destinition[] {
            new Destinition(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
            new Destinition(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2),
            new Destinition(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2)
    };

    private int[] mStoryEndings = new int[] {
            R.string.T4_End,
            R.string.T5_End,
            R.string.T6_End
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = findViewById(R.id.storyTextView);
        mButtonTop = findViewById(R.id.buttonTop);
        mButtonBottom = findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 0 || mStoryIndex == 1) {
                    mStoryIndex = 2;
                    setTextViews();
                } else {
                    mEndingIndex = 2;
                    setEndStoryTextViews();
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 0) {
                    mStoryIndex = 1;
                    setTextViews();
                } else if (mStoryIndex == 1){
                    mEndingIndex = 0;
                    setEndStoryTextViews();
                } else {
                    mEndingIndex = 1;
                    setEndStoryTextViews();
                }
            }
        });
    }

    private void setTextViews() {
        mStoryTextView.setText(mStoryArray[mStoryIndex].getStoryID());
        mButtonTop.setText(mStoryArray[mStoryIndex].getAnswer1ID());
        mButtonBottom.setText(mStoryArray[mStoryIndex].getAnswer2ID());
    }

    private void setEndStoryTextViews() {
        mStoryTextView.setText(mStoryEndings[mEndingIndex]);
        mButtonTop.setVisibility(View.GONE);
        mButtonBottom.setVisibility(View.GONE);
    }
}
