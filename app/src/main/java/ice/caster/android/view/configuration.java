package ice.caster.android.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import ice.caster.android.R;
import ice.caster.android.fragment.BroadcastFragment;

public class configuration extends AppCompatActivity {
    EditText serveur;
    EditText port;
    EditText mount;
    EditText user;
    EditText password;
    Button save ;
    Button renitialise;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);
        serveur = (EditText) findViewById(R.id.serveur);
        port = (EditText) findViewById(R.id.port);
        mount = (EditText) findViewById(R.id.mount);
        user = (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.password);
        renitialise = (Button) findViewById(R.id.renitialiser);
        save = (Button) findViewById(R.id.save);
        ///initialisation des champ
        serveur.setText(BroadcastFragment.ICE_HOST);
        port.setText(""+BroadcastFragment.ICE_PORT);
        mount.setText(BroadcastFragment.ICE_MOUNT);
        user.setText(BroadcastFragment.ICE_USER);
        password.setText(BroadcastFragment.ICE_PASS);

        renitialise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                serveur.setText("192.168.137.1");
                port.setText(""+8000);
                mount.setText("/icecast.ogg");
                user.setText("source");
                password.setText("ayyoub");
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("serveur",serveur.getText().toString());
                intent.putExtra("port",port.getText().toString());
                intent.putExtra("mount",mount.getText().toString());
                intent.putExtra("user",user.getText().toString());
                intent.putExtra("password",password.getText().toString());
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
