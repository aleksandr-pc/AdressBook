package com.example.aleksandr.adressbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/*
* главный класс в котором содержится интерфейс activity_main
* в котором распологаются:
* 1. имя приложения
* 2. поисковик по адресной книге
* 3. кнопка перехода в окно CreateNewContactClass в котором записываются данные в SQLite
* 4. три текстовых поля для отображения имени, тлф. и эмейла на главном экране
* 5. согласно materialDesign создана иконка в правом нижнем углу для вызова какого-либо действия (задание ей реализации)
* 6.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /*
       поля класса, инициализируем переменные
        */
    private static final int NUMBER_DB = 1;
    TextView textViewNameMainActitivity, textViewLastNameMainActitivity, textViewTelephoneNumberMainActivity;
    Button buttonCreateMainActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*
        определяем текстовые поля который показывают список контактов
         */
        textViewNameMainActitivity = (TextView) findViewById(R.id.textViewNameMainActitivity);
        textViewLastNameMainActitivity = (TextView) findViewById(R.id.textViewLastNameMainActitivity);
        textViewTelephoneNumberMainActivity = (TextView) findViewById(R.id.textViewTelephoneNumberMainActivity);

       /*
        определяем кнопку buttonCreateMainActivity и присваиваем ей обработчик
         */
        buttonCreateMainActivity = (Button) findViewById(R.id.buttonCreateMainActivity);
        buttonCreateMainActivity.setOnClickListener(this);

        /*
        новая иконка внизу справа, при нажатии на которую может происходить событие
         */
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        /*
        прописывам обработчик кнопки. если будет нажата кнопка с каким либо Id.
         то будет она обрабатываться в блоке case
         */
        switch (v.getId()) {
            case (R.id.buttonCreateMainActivity):
                Intent intentCreateNewContact = new Intent(this, CreateNewContactClass.class);
                startActivityForResult(intentCreateNewContact, NUMBER_DB);
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (data == null) {
            return;
        }
    }
}
