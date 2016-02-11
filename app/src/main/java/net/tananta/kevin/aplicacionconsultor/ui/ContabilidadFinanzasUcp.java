package net.tananta.kevin.aplicacionconsultor.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.tananta.kevin.aplicacionconsultor.ContabilidadUcp;
import net.tananta.kevin.aplicacionconsultor.DerechoUcpClase;
import net.tananta.kevin.aplicacionconsultor.R;

public class ContabilidadFinanzasUcp extends AppCompatActivity {

    private Button costociclo;
    private Button costoanual;
    private Button costo5años;
    private TextView ciclo;
    private TextView año;
    private TextView años5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contabilidad_finanzas_ucp);

        costociclo = (Button)findViewById(R.id.costociclo);
        costoanual = (Button)findViewById(R.id.costoanual);
        costo5años = (Button)findViewById(R.id.costo5años);
        ciclo = (TextView)findViewById(R.id.ciclo);
        año = (TextView)findViewById(R.id.año);
        años5 = (TextView)findViewById(R.id.años5);

        costociclo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                ContabilidadUcp contabilidad = new ContabilidadUcp();
                ciclo.setText(" S/ " + contabilidad.costoCiclo());
            }
        });

        costoanual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ContabilidadUcp contabilidad = new ContabilidadUcp();
                año.setText(" S/ " + contabilidad.costoAnual());
            }
        });

        costo5años.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ContabilidadUcp contabilidad = new ContabilidadUcp();
                años5.setText(" S/ " + contabilidad.costo5Años());
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_contabilidad_finanzas_ucp, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
