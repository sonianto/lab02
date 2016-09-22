package dam.isi.frsf.utn.edu.ar.lab02;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by pato on 20/09/2016.
 */
public class MiAdapter extends ArrayAdapter<ElementoMenu> {
    //List<ElementoMenu> items6;
   // Context contex6t;
    LayoutInflater inflater;
    MiAdapter(Context context, List<ElementoMenu> items) {
        super(context, R.layout.row1, items);
         inflater = LayoutInflater.from(context);

    }







    public View getView(final int position, View convertView, ViewGroup parent) {
        View row=inflater.inflate(R.layout.row1, parent, false);

        TextView titAccion=(TextView) row.findViewById(R.id.alimento);
        titAccion.setText(this.getItem(position).toString());

        return (row);

    }




    }

