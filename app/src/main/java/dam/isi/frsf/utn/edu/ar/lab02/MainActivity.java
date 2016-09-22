package dam.isi.frsf.utn.edu.ar.lab02;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;



public class MainActivity extends AppCompatActivity implements
        android.widget.CompoundButton.OnCheckedChangeListener {

    DecimalFormat f = new DecimalFormat("##.00");

    ElementoMenu[] listaBebidas;
    ElementoMenu[] listaPlatos;
    ElementoMenu[] listaPostre;
    MiAdapter alimentos;
    int idf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.hora, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        RadioGroup radioGroup;
        radioGroup = (RadioGroup) findViewById(R.id.grupock);

        iniciarListas();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {



            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected
                ListView lv = (ListView) findViewById(R.id.listView);

                if(checkedId == R.id.ckbebida) {

                    Toast.makeText(getApplicationContext(), "choice:bebida",Toast.LENGTH_SHORT).show();
                    MiAdapter a = new MiAdapter(getApplicationContext(), Arrays.asList(listaBebidas));
                    lv.setAdapter(a);

                } else if(checkedId == R.id.ckplato) {

                    Toast.makeText(getApplicationContext(), "choice: plato", Toast.LENGTH_SHORT).show();
                    MiAdapter a = new MiAdapter(getApplicationContext(), Arrays.asList(listaPlatos));
                    lv.setAdapter(a);

                } else {

                    Toast.makeText(getApplicationContext(), "choice: postre",Toast.LENGTH_SHORT).show();
                    MiAdapter a = new MiAdapter(getApplicationContext(), Arrays.asList(listaPostre));
                    lv.setAdapter(a);

                }

            }

        });



        }



        private void iniciarListas(){
            // inicia lista de bebidas
            listaBebidas = new ElementoMenu[7];
            listaBebidas[0]= new ElementoMenu(1,"Coca");
            listaBebidas[1]=new ElementoMenu(4,"Jugo");
            listaBebidas[2]=new ElementoMenu(6,"Agua");
            listaBebidas[3]=new ElementoMenu(8,"Soda");
            listaBebidas[4]=new ElementoMenu(9,"Fernet");
            listaBebidas[5]=new ElementoMenu(10,"Vino");
            listaBebidas[6]=new ElementoMenu(11,"Cerveza");
            // inicia lista de platos
            listaPlatos= new ElementoMenu[14];
            listaPlatos[0]=new ElementoMenu(1,"Ravioles");
            listaPlatos[1]=new ElementoMenu(2,"Gnocchi");
            listaPlatos[2]=new ElementoMenu(3,"Tallarines");
            listaPlatos[3]=new ElementoMenu(4,"Lomo");
            listaPlatos[4]=new ElementoMenu(5,"Entrecot");
            listaPlatos[5]=new ElementoMenu(6,"Pollo");
            listaPlatos[6]=new ElementoMenu(7,"Pechuga");
            listaPlatos[7]=new ElementoMenu(8,"Pizza");
            listaPlatos[8]=new ElementoMenu(9,"Empanadas");
            listaPlatos[9]=new ElementoMenu(10,"Milanesas");
            listaPlatos[10]=new ElementoMenu(11,"Picada 1");
            listaPlatos[11]=new ElementoMenu(12,"Picada 2");
            listaPlatos[12]=new ElementoMenu(13,"Hamburguesa");
            listaPlatos[12]=new ElementoMenu(14,"Calamares");
            // inicia lista de postres
            listaPostre= new ElementoMenu[15];
            listaPostre[0]=new ElementoMenu(1,"Helado");
            listaPostre[1]=new ElementoMenu(2,"Ensalada de Frutas");
            listaPostre[2]=new ElementoMenu(3,"Macedonia");
            listaPostre[3]=new ElementoMenu(4,"Brownie");
            listaPostre[4]=new ElementoMenu(5,"Cheescake");
            listaPostre[5]=new ElementoMenu(6,"Tiramisu");
            listaPostre[6]=new ElementoMenu(7,"Mousse");
            listaPostre[7]=new ElementoMenu(8,"Fondue");
            listaPostre[8]=new ElementoMenu(9,"Profiterol");
            listaPostre[9]=new ElementoMenu(10,"Selva Negra");
            listaPostre[10]=new ElementoMenu(11,"Lemon Pie");
            listaPostre[11]=new ElementoMenu(12,"KitKat");
            listaPostre[12]=new ElementoMenu(13,"IceCreamSandwich");
            listaPostre[13]=new ElementoMenu(14,"Frozen Yougurth");
            listaPostre[14]=new ElementoMenu(15,"Queso y Batata");

        }
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        ListView lv = (ListView) findViewById(R.id.listView);
        int pos = lv.getPositionForView(buttonView);
        if (pos != ListView.INVALID_POSITION) {

            ;
                Toast.makeText(
                        this,
                        "Clicked on Planet: " + pos + ". State: is "
                                + isChecked, Toast.LENGTH_SHORT).show();



        }
    }




}
