package bo.upb.programacion3.codelabpokedex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import bo.upb.programacion3.codelabpokedex.Objects.Users;

public class UsersListViewAdapter extends BaseAdapter {
    private Context context;
    private List<Users> usersList;

    public UsersListViewAdapter(Context context, List<Users> usersList) {
        this.context = context;
        this.usersList = usersList;
    }


    @Override
    public int getCount() {
        return this.usersList.size();
    }

    @Override
    public Users getItem(int position) {
        return this.usersList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.usersList.get(position).getId();
    }

    @Override
    public View getView(int position, View vista, ViewGroup parent) {
        ViewHolder viewHolder;
        if (vista == null) { //No se puede reciclar
            viewHolder = new ViewHolder();

            //Inflater nos permite usar un layout dentro de un componente
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            vista = inflater.inflate(R.layout.pokemon_list_item_horizontal, null); //Cual layout y principal o no.

            viewHolder.imageView = vista.findViewById(R.id.imageViewPokemon);
            viewHolder.textViewName = vista.findViewById(R.id.textViewName);
            viewHolder.textViewType = vista.findViewById(R.id.textViewType);
            vista.setTag(viewHolder); //Guardar para reciclar
        } else {
            viewHolder = (ViewHolder) vista.getTag(); //Obtener el dato reciclado
        }

        Users user = this.usersList.get(position);
        viewHolder.imageView.setImageResource(user.getImage());
        viewHolder.textViewName.setText(user.getName());
        viewHolder.textViewType.setText(user.getType());
        return vista;
    }

    static class ViewHolder {
        ImageView imageView;
        TextView textViewName;
        TextView textViewType;
    }
}
