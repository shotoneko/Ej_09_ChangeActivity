package modulo_04.ej_09_changeactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    ImageView img_1;
    ImageView img_2;
    ImageView img_3;
    ImageView img_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        img_1 = (ImageView) findViewById(R.id.img_1);
//        img_2 = (ImageView) findViewById(R.id.img_2);
//        img_3 = (ImageView) findViewById(R.id.img_3);
    }

    public void imgClick(View v) {
        ImageView img = (ImageView) v;
        Intent intent = new Intent(this, MainActivity2.class);
        if (img.getId() == R.id.img_1) {
            intent.putExtra("esta_imagen", R.drawable.img_1);
            startActivity(intent);
        }
        if (img.getId() == R.id.img_2) {
            intent.putExtra("esta_imagen", R.drawable.img_2);
            startActivity(intent);
        }
        if (img.getId() == R.id.img_3) {
            intent.putExtra("esta_imagen", R.drawable.img_3);
            startActivity(intent);
        }
        if (img.getId() == R.id.img_4) {
            intent.putExtra("esta_imagen", R.drawable.img_4);
            startActivity(intent);
        }
    }
    public void btn_cerrar(){
        finishAffinity();
    }
}