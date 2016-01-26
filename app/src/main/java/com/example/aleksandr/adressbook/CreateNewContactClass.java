package com.example.aleksandr.adressbook;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by aleksandr on 26.01.2016.
 */

        /*
        * класс в котором содержатся поля с вводом текста
        * создается база данных и записываются данные в нее
        * содержится ссылка на .xml интерфейс
        * при нажатии на кнопку ОК возвращаемся в главный экран со втавленными данными
        * на 26.01.16
        */
public class CreateNewContactClass extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.createnewcontactclass);

    }


    @Override
    public void onClick(View v) {

    }
}