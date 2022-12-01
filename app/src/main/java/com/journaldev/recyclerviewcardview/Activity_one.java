package com.journaldev.recyclerviewcardview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_one extends AppCompatActivity {

    ImageView image;
    TextView tv1;
    TextView tv2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        image = findViewById(R.id.imageViewOne);
        tv1 = findViewById(R.id.textViewOne);
        tv2 = findViewById(R.id.textViewTwo);
        Intent intent = getIntent();
        String name = intent.getExtras().getString("name");
        int id = intent.getExtras().getInt("id");

        tv1.setText(name);

        switch (id) {
            case 0:
                tv2.setText("A clumsy yellow sea sponge who lives in a furnished pineapple house with his pet snail Gary." +
                        " He works as a fry cook at a fast-food restaurant called the Krusty Krab and diligently attends Mrs. Puff's Boating School." +
                        " He is relentlessly optimistic and cheerful.");
                image.setImageResource(R.drawable.spongebob2);
                break;
            case 1:
                tv2.setText("SpongeBob's best friend," +
                        " a pink starfish who wears green flowered swim trunks." +
                        " He lives under a rock and is known for being dimwitted and foolish." +
                        " Despite his low intelligence, he is loyal and occasionally insightful.");
                image.setImageResource(R.drawable.patrick2);
                break;
            case 2:
                tv2.setText("SpongeBob's next-door neighbor and coworker at the Krusty Krab," +
                        " who lives in an Easter Island Head." +
                        " He is an arrogant and pessimistic turquoise octopus who fancies himself a talented artist and musician.");
                image.setImageResource(R.drawable.squidward2);
                break;
            case 3:
                tv2.setText("A red cheapskate crab who is SpongeBob's boss and the owner of the Krusty Krab." +
                        " He is a single father who lives in an anchor with his teenage whale daughter, Pearl." +
                        " He is obsessed with collecting money.");
                image.setImageResource(R.drawable.krubs2);
                break;
            case 4:
                tv2.setText("A squirrel from Texas who wears a diving suit and lives in an air-filled glass Treedome to breathe underwater." +
                        " She is a good friend of SpongeBob and works as an explorer, thrill-seeker, and scientist.");
                image.setImageResource(R.drawable.sandy2);
                break;
            case 5:
                tv2.setText("SpongeBob's pet sea snail who does not speak but instead communicates through cat-like meows." +
                        " He is surprisingly smart and often serves a voice of reason for his owner.");
                image.setImageResource(R.drawable.gary2);
                break;
            case 6:
                tv2.setText("Mr. Krabs' arch-nemesis," +
                        " a tiny green copepod who is a skilled inventor with a Napoleon complex." +
                        " He runs a failed rival restaurant to the Krusty Krab called the Chum Bucket alongside his talking computer Karen, which he built himself.");
                image.setImageResource(R.drawable.sheldon2);
                break;
        }
    }
}