package dam.isi.frsf.utn.edu.ar.lab02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;



import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;



public class MainActivity extends AppCompatActivity {

    DecimalFormat f = new DecimalFormat("##.00");

    ElementoMenu[] listaBebidas;
    ElementoMenu[] listaPlatos;
    ElementoMenu[] listaPostre;

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
        RadioGroup rdGroup = (RadioGroup) findViewById(R.id.rdbGp1);
        rdGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub

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

}
