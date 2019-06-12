package space.dimas.cepek;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButtonA = (Button)findViewById(R.id.rollButtonA);
        Button rollButtonB = (Button)findViewById(R.id.rollButtonB);
        Button rollButtonC = (Button)findViewById(R.id.rollButtonC);
        Button rollButtonD = (Button)findViewById(R.id.rollButtonD);

        Button ejectButtonA = (Button) findViewById(R.id.ejectButtonA);
        Button ejectButtonB = (Button) findViewById(R.id.ejectButtonB);
        Button ejectButtonC = (Button) findViewById(R.id.ejectButtonC);
        Button ejectButtonD = (Button) findViewById(R.id.ejectButtonD);

        final ImageView imageCardA = (ImageView) findViewById(R.id.imageCardA);
        final ImageView imageCardB = (ImageView) findViewById(R.id.imageCardB);
        final ImageView imageCardC = (ImageView) findViewById(R.id.imageCardC);
        final ImageView imageCardD = (ImageView) findViewById(R.id.imageCardD);

        final int cardArray[] = {
                R.drawable.card1,
                R.drawable.card2,
                R.drawable.card3,
                R.drawable.card4,
                R.drawable.card5,
                R.drawable.card6,
                R.drawable.card7,
                R.drawable.card8,
                R.drawable.card9,
                R.drawable.card10,
                R.drawable.cardj,
                R.drawable.cardq,
                R.drawable.cardk,
                R.drawable.cardjo
        };

        rollButtonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d("cepek","Testing successful #1");

                Random randomNumberGenerator = (new Random());
                int number = randomNumberGenerator.nextInt(14);

                //Log.d("cepek","Testing successful #2:"+number);

                imageCardA.setImageResource(cardArray[number]);
            }
        });

        rollButtonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNumberGenerator = (new Random());
                int number = randomNumberGenerator.nextInt(14);

                imageCardB.setImageResource(cardArray[number]);
            }
        });

        rollButtonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNumberGenerator = (new Random());
                int number = randomNumberGenerator.nextInt(14);

                imageCardC.setImageResource(cardArray[number]);
            }
        });

        rollButtonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNumberGenerator = (new Random());
                int number = randomNumberGenerator.nextInt(14);

                imageCardD.setImageResource(cardArray[number]);
            }
        });

        ejectButtonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageCardA.setImageResource(R.drawable.cardx);
            }
        });

        ejectButtonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageCardB.setImageResource(R.drawable.cardx);
            }
        });

        ejectButtonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageCardC.setImageResource(R.drawable.cardx);
            }
        });

        ejectButtonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageCardD.setImageResource(R.drawable.cardx);
            }
        });

    }
}
