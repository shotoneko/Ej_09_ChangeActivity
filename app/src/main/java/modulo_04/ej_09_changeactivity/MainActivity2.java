package modulo_04.ej_09_changeactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private ImageView img_mostrar;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        img_mostrar = (ImageView) findViewById(R.id.img_mostrar);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int idImagen = extras.getInt("esta_imagen");
            img_mostrar.setImageResource(idImagen);
        }

    }
    public void btn_volver(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}