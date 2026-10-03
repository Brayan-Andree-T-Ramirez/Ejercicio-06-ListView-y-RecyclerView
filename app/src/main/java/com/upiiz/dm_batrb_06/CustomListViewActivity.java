package com.upiiz.dm_batrb_06;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.upiiz.dm_batrb_06.Adapters.CustomAdapter;
import com.upiiz.dm_batrb_06.model.User;

import java.util.ArrayList;

public class CustomListViewActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {
    //Variables
    ListView lvUsuarios;
    ArrayList<User> listaUsuarios;
    CustomAdapter adapter;
    Button btnRegresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_custom_list_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Enlazar
        lvUsuarios = findViewById(R.id.lvCustom);
        btnRegresar = findViewById(R.id.btnRegresar);
        cargarUsuario();
        adapter = new CustomAdapter(this, listaUsuarios);
        lvUsuarios.setAdapter(adapter);
        btnRegresar.setOnClickListener(this);
        lvUsuarios.setOnItemClickListener(this);
        lvUsuarios.setOnItemLongClickListener(this);
        //
    }

    private void cargarUsuario() {

        //Memoria - Array
        //DB
        //API
        //Nube
        //Archivo
        listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new User((long) 1L,"Juan","Job se tardó demasiado (:","8:20",R.drawable.user));
        listaUsuarios.add(new User((long) 2L,"Job","Job se tardó demasiado (:","8:20",R.drawable.user));
        listaUsuarios.add(new User((long) 3L,"Luis","Job se tardó demasiado (:","8:20",R.drawable.user));
        listaUsuarios.add(new User((long) 4L,"Ana","Job se tardó demasiado (:","8:20",R.drawable.user));
        listaUsuarios.add(new User((long) 5L,"Luz","Job se tardó demasiado (:","8:20",R.drawable.user));
        listaUsuarios.add(new User((long) 6L,"Martin","Job se tardó demasiado (:","8:20",R.drawable.user));
        listaUsuarios.add(new User((long) 7L,"Miguel","Job se tardó demasiado (:","8:20",R.drawable.user));

        listaUsuarios.add(new User((long) 8L,"Adriana","Job se tardó demasiado (:","8:20",R.drawable.user));
        listaUsuarios.add(new User((long) 9L,"Enrique","Job se tardó demasiado (:","Ayer",R.drawable.user));
        listaUsuarios.add(new User((long) 10L,"Calzoski","Job se tardó demasiado (:","8:20",R.drawable.user));
        listaUsuarios.add(new User((long) 11L,"Jonas","Job se tardó demasiado (:","8:20",R.drawable.user));
        listaUsuarios.add(new User((long) 12L,"Teofilo","Job se tardó demasiado (:","8:20",R.drawable.user));
        listaUsuarios.add(new User((long) 13L,"Camacho","Job se tardó demasiado (:","8:20",R.drawable.user));
        listaUsuarios.add(new User((long) 14L,"Labubu","Job se tardó demasiado (:","8:20",R.drawable.user));
        listaUsuarios.add(new User((long) 15L,"Troncha","Job se tardó demasiado (:","8:20",R.drawable.user));
    }

    @Override
    public void onClick(View v) {
        Intent intentRegresar = new Intent(this, MainActivity.class);
        startActivity(intentRegresar);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //Click o touch sobre el listado
        Toast.makeText(this,"Diste click o touch", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        //Click o touch presionado durante cierto tiempo
        Toast.makeText(this,"Diste un click largo",Toast.LENGTH_LONG).show();
        return false;
    }
}