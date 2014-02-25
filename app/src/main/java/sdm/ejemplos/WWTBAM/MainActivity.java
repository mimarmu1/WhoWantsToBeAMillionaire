package sdm.ejemplos.WWTBAM;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button buttonPlay;
    Button buttonScores;
    Button buttonSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonPlay = (Button) findViewById(R.id.buttonPlay);
        buttonScores = (Button) findViewById(R.id.buttonScores);
        buttonSettings = (Button) findViewById(R.id.buttonSettings);

       buttonPlay.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               mostrarActivity(buttonPlay);

           }
       });

        buttonSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarActivity(buttonSettings);

            }
        });

        buttonScores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarActivity(buttonScores);

            }
        });
    }



    public void mostrarActivity(View v){
        int id = v.getId();
        if(id == R.id.buttonPlay){
            Intent i = new Intent(this, PlayActivity.class);
            startActivity(i);
        }else if (id == R.id.buttonScores){
            Intent i = new Intent(this, ScoresActivity.class);
            startActivity(i);
        }else if( id == R.id.buttonSettings){
            Intent i = new Intent(this, SettingsActivity.class);
            startActivity(i);
        }
    }



}
