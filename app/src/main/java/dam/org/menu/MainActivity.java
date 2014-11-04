//JAVIER GARCIA TARIN
package dam.org.menu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends Activity {

    TextView tvMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMensaje = (TextView) findViewById(R.id.tvMensaje);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()){
            case R.id.menuOp1:
                tvMensaje.setText("Opción 1 pulsada!");
                break;
            case R.id.menuOp2:
                tvMensaje.setText("Opción 2 pulsada!");
                break;
            case R.id.subMenuOp1:
                tvMensaje.setText("Opción 3.1 pulsada!");
                break;
            case R.id.subMenuOp2:
                tvMensaje.setText("Opción 3.2 pulsada!");
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
